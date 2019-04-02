package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialViewPropertiesProperties extends js.Object {
  /**
    * The background color of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#background)
    *
    * @default null
    */
  var background: js.UndefOr[ColorBackgroundProperties] = js.undefined
  /**
    * The spatial reference of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html). This indicates the [Projected Coordinate System](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) or the [Geographic Coordinate System](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) used to locate geographic features in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * The initial viewpoint of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
}

object InitialViewPropertiesProperties {
  @scala.inline
  def apply(
    background: ColorBackgroundProperties = null,
    spatialReference: SpatialReferenceProperties = null,
    viewpoint: ViewpointProperties = null
  ): InitialViewPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (viewpoint != null) __obj.updateDynamic("viewpoint")(viewpoint)
    __obj.asInstanceOf[InitialViewPropertiesProperties]
  }
}

