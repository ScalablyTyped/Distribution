package typings.amapDashJsDashApi.AMap.GeoJSON

import typings.amapDashJsDashApi.amapDashJsDashApiStrings.Feature
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.FeatureCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONObject extends js.Object {
  var features: js.UndefOr[js.Array[GeoJSONObject]] = js.undefined
  var geometry: js.UndefOr[Geometry] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[Feature | FeatureCollection] = js.undefined
}

object GeoJSONObject {
  @scala.inline
  def apply(
    features: js.Array[GeoJSONObject] = null,
    geometry: Geometry = null,
    properties: js.Any = null,
    `type`: Feature = null
  ): GeoJSONObject = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GeoJSONObject]
  }
}

