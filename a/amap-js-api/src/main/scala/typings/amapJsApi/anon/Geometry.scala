package typings.amapJsApi.anon

import typings.amapJsApi.AMap.GeoJSON.GeoJSONObject
import typings.amapJsApi.amapJsApiStrings.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends GeoJSONObject {
  var geometry: typings.amapJsApi.AMap.GeoJSON.Geometry
  var properties: js.Any
  var `type`: Feature
}

object Geometry {
  @scala.inline
  def apply(geometry: typings.amapJsApi.AMap.GeoJSON.Geometry, properties: js.Any, `type`: Feature): Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

