package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialReferenceProperties extends js.Object {
  /**
    * The well-known ID of a spatial reference. See [Projected Coordinate Systems](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) and [Geographic Coordinate Systems](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) for the list of supported spatial references.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkid)
    */
  var wkid: js.UndefOr[scala.Double] = js.undefined
  /**
    * The well-known text that defines a spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkt)
    */
  var wkt: js.UndefOr[java.lang.String] = js.undefined
}

object SpatialReferenceProperties {
  @scala.inline
  def apply(wkid: scala.Int | scala.Double = null, wkt: java.lang.String = null): SpatialReferenceProperties = {
    val __obj = js.Dynamic.literal()
    if (wkid != null) __obj.updateDynamic("wkid")(wkid.asInstanceOf[js.Any])
    if (wkt != null) __obj.updateDynamic("wkt")(wkt)
    __obj.asInstanceOf[SpatialReferenceProperties]
  }
}

