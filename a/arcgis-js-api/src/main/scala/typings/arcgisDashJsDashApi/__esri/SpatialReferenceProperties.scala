package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialReferenceProperties extends js.Object {
  /**
    * The well-known ID of a spatial reference. See [Projected Coordinate Systems](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) and [Geographic Coordinate Systems](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) for the list of supported spatial references.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkid)
    */
  var wkid: js.UndefOr[Double] = js.undefined
  /**
    * The well-known text that defines a spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkt)
    */
  var wkt: js.UndefOr[String] = js.undefined
}

object SpatialReferenceProperties {
  @scala.inline
  def apply(wkid: Int | Double = null, wkt: String = null): SpatialReferenceProperties = {
    val __obj = js.Dynamic.literal()
    if (wkid != null) __obj.updateDynamic("wkid")(wkid.asInstanceOf[js.Any])
    if (wkt != null) __obj.updateDynamic("wkt")(wkt)
    __obj.asInstanceOf[SpatialReferenceProperties]
  }
}

