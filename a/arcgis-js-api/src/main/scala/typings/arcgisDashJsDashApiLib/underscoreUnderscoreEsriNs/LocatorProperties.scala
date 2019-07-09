package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocatorProperties extends TaskProperties {
  /**
    * The spatial reference of the output geometries. If not specified, the output geometries are in the spatial reference of the input geometries when performing a reverse geocode and in the default spatial reference returned by the service if finding locations by address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
}

object LocatorProperties {
  @scala.inline
  def apply(
    outSpatialReference: SpatialReferenceProperties = null,
    requestOptions: js.Any = null,
    url: java.lang.String = null
  ): LocatorProperties = {
    val __obj = js.Dynamic.literal()
    if (outSpatialReference != null) __obj.updateDynamic("outSpatialReference")(outSpatialReference)
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[LocatorProperties]
  }
}

