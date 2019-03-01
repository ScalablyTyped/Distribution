package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the auto show information of a {@link DataPilotField} .
  *
  * If enabled, only a number of items with the highest or lowest result values are shown. The other items are hidden automatically.
  * @see com.sun.star.sheet.DataPilotField
  */
trait DataPilotFieldAutoShowInfo extends js.Object {
  /** specifies the field where the values to show and select are taken from. */
  var DataField: java.lang.String
  /** specifies whether the AutoShow feature is enabled or not. */
  var IsEnabled: scala.Boolean
  /** specifies the number of the items to show. */
  var ItemCount: scala.Double
  /**
    * specifies the mode which items have to be shown.
    * @see com.sun.star.sheet.DataPilotFieldShowItemsMode
    */
  var ShowItemsMode: scala.Double
}

object DataPilotFieldAutoShowInfo {
  @scala.inline
  def apply(
    DataField: java.lang.String,
    IsEnabled: scala.Boolean,
    ItemCount: scala.Double,
    ShowItemsMode: scala.Double
  ): DataPilotFieldAutoShowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DataField")(DataField)
    __obj.updateDynamic("IsEnabled")(IsEnabled)
    __obj.updateDynamic("ItemCount")(ItemCount)
    __obj.updateDynamic("ShowItemsMode")(ShowItemsMode)
    __obj.asInstanceOf[DataPilotFieldAutoShowInfo]
  }
}

