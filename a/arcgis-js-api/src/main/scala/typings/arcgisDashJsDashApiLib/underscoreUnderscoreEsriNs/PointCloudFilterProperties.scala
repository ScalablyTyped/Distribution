package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudFilterProperties extends js.Object {
  /**
    * The field used for applying the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html#field)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
}

object PointCloudFilterProperties {
  @scala.inline
  def apply(field: java.lang.String = null): PointCloudFilterProperties = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[PointCloudFilterProperties]
  }
}

