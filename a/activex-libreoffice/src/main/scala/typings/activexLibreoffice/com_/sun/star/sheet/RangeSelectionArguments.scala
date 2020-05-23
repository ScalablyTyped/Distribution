package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the arguments for starting the range selection.
  * @see com.sun.star.sheet.XRangeSelection
  */
trait RangeSelectionArguments extends js.Object {
  /** specifies if the range selection is finished when the mouse button is released, after selecting cells. */
  var CloseOnMouseRelease: Boolean
  /** contains the initial value for the range descriptor. */
  var InitialValue: String
  /**
    * specifies if the range selection is limited to a single cell only.
    *
    * If `TRUE` , the selection is restricted to a single cell. If `FALSE` , multiple adjoining cells can be selected. The default value is `FALSE` .
    * @since OOo 2.0.3
    */
  var SingleCellMode: Boolean
  /** contains a title for the operation. */
  var Title: String
}

object RangeSelectionArguments {
  @scala.inline
  def apply(CloseOnMouseRelease: Boolean, InitialValue: String, SingleCellMode: Boolean, Title: String): RangeSelectionArguments = {
    val __obj = js.Dynamic.literal(CloseOnMouseRelease = CloseOnMouseRelease.asInstanceOf[js.Any], InitialValue = InitialValue.asInstanceOf[js.Any], SingleCellMode = SingleCellMode.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectionArguments]
  }
}

