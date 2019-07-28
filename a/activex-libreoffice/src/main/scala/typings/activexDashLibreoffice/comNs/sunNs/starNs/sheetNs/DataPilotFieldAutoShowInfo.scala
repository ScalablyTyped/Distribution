package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

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
  var DataField: String
  /** specifies whether the AutoShow feature is enabled or not. */
  var IsEnabled: Boolean
  /** specifies the number of the items to show. */
  var ItemCount: Double
  /**
    * specifies the mode which items have to be shown.
    * @see com.sun.star.sheet.DataPilotFieldShowItemsMode
    */
  var ShowItemsMode: Double
}

object DataPilotFieldAutoShowInfo {
  @scala.inline
  def apply(DataField: String, IsEnabled: Boolean, ItemCount: Double, ShowItemsMode: Double): DataPilotFieldAutoShowInfo = {
    val __obj = js.Dynamic.literal(DataField = DataField, IsEnabled = IsEnabled, ItemCount = ItemCount, ShowItemsMode = ShowItemsMode)
  
    __obj.asInstanceOf[DataPilotFieldAutoShowInfo]
  }
}

