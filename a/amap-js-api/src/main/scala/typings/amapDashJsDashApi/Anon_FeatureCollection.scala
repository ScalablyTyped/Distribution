package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.GeoJSON.GeoJSONObject
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.FeatureCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FeatureCollection extends GeoJSONObject {
  var features: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.GeoJSONObject */ js.Object
  ]
  var properties: js.Any
  var `type`: FeatureCollection
}

object Anon_FeatureCollection {
  @scala.inline
  def apply(
    features: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.GeoJSONObject */ js.Object
    ],
    properties: js.Any,
    `type`: FeatureCollection
  ): Anon_FeatureCollection = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FeatureCollection]
  }
}

