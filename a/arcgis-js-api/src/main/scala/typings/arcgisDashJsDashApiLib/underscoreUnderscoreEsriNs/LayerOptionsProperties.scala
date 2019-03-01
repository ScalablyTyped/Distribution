package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerOptionsProperties extends js.Object {
  /**
    * Applicable to [Imagery Layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html). Indicates whether records without data should display within the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayerOptions.html#showNoDataRecords)
    *
    * @default true
    */
  var showNoDataRecords: js.UndefOr[scala.Boolean] = js.undefined
}

object LayerOptionsProperties {
  @scala.inline
  def apply(showNoDataRecords: js.UndefOr[scala.Boolean] = js.undefined): LayerOptionsProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showNoDataRecords)) __obj.updateDynamic("showNoDataRecords")(showNoDataRecords)
    __obj.asInstanceOf[LayerOptionsProperties]
  }
}

