package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the arguments for starting the range selection.
  * @see com.sun.star.sheet.XRangeSelection
  */
trait RangeSelectionArguments extends js.Object {
  /** specifies if the range selection is finished when the mouse button is released, after selecting cells. */
  var CloseOnMouseRelease: scala.Boolean
  /** contains the initial value for the range descriptor. */
  var InitialValue: java.lang.String
  /**
    * specifies if the range selection is limited to a single cell only.
    *
    * If `TRUE` , the selection is restricted to a single cell. If `FALSE` , multiple adjoining cells can be selected. The default value is `FALSE` .
    * @since OOo 2.0.3
    */
  var SingleCellMode: scala.Boolean
  /** contains a title for the operation. */
  var Title: java.lang.String
}

object RangeSelectionArguments {
  @scala.inline
  def apply(
    CloseOnMouseRelease: scala.Boolean,
    InitialValue: java.lang.String,
    SingleCellMode: scala.Boolean,
    Title: java.lang.String
  ): RangeSelectionArguments = {
    val __obj = js.Dynamic.literal(CloseOnMouseRelease = CloseOnMouseRelease, InitialValue = InitialValue, SingleCellMode = SingleCellMode, Title = Title)
  
    __obj.asInstanceOf[RangeSelectionArguments]
  }
}

