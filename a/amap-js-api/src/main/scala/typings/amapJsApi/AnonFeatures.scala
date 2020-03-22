package typings.amapJsApi

import typings.amapJsApi.AMap.GeoJSON.GeoJSONObject
import typings.amapJsApi.amapJsApiStrings.FeatureCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFeatures extends GeoJSONObject {
  var features: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.GeoJSONObject */ js.Object
  ]
  var properties: js.Any
  var `type`: FeatureCollection
}

object AnonFeatures {
  @scala.inline
  def apply(
    features: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.GeoJSONObject */ js.Object
    ],
    properties: js.Any,
    `type`: FeatureCollection
  ): AnonFeatures = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeatures]
  }
}

