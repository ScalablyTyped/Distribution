package typings.amapDashJsDashApi

import typings.amapDashJsDashApi.AMap.GeoJSON.GeoJSONObject
import typings.amapDashJsDashApi.AMap.GeoJSON.Geometry
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Feature extends GeoJSONObject {
  var geometry: Geometry
  var properties: js.Any
  var `type`: Feature
}

object Anon_Feature {
  @scala.inline
  def apply(geometry: Geometry, properties: js.Any, `type`: Feature): Anon_Feature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Feature]
  }
}

