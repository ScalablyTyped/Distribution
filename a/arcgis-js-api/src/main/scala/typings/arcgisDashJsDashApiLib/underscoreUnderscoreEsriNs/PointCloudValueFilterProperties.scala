package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudValueFilterProperties extends PointCloudFilterProperties {
  /**
    * Whether points should be included or excluded from the filter.  **Possible values:** include | exclude
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#mode)
    *
    * @default "exclude"
    */
  var mode: js.UndefOr[
    arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.include | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.exclude
  ] = js.undefined
  /**
    * An array of numeric values representing the classification codes that the filter should apply.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#values)
    */
  var values: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object PointCloudValueFilterProperties {
  @scala.inline
  def apply(
    field: java.lang.String = null,
    mode: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.include | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.exclude = null,
    values: js.Array[scala.Double] = null
  ): PointCloudValueFilterProperties = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[PointCloudValueFilterProperties]
  }
}

