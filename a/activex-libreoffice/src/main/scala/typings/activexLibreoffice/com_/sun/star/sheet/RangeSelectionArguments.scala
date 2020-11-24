package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the arguments for starting the range selection.
  * @see com.sun.star.sheet.XRangeSelection
  */
@js.native
trait RangeSelectionArguments extends js.Object {
  
  /** specifies if the range selection is finished when the mouse button is released, after selecting cells. */
  var CloseOnMouseRelease: Boolean = js.native
  
  /** contains the initial value for the range descriptor. */
  var InitialValue: String = js.native
  
  /**
    * specifies if the range selection is limited to a single cell only.
    *
    * If `TRUE` , the selection is restricted to a single cell. If `FALSE` , multiple adjoining cells can be selected. The default value is `FALSE` .
    * @since OOo 2.0.3
    */
  var SingleCellMode: Boolean = js.native
  
  /** contains a title for the operation. */
  var Title: String = js.native
}
object RangeSelectionArguments {
  
  @scala.inline
  def apply(CloseOnMouseRelease: Boolean, InitialValue: String, SingleCellMode: Boolean, Title: String): RangeSelectionArguments = {
    val __obj = js.Dynamic.literal(CloseOnMouseRelease = CloseOnMouseRelease.asInstanceOf[js.Any], InitialValue = InitialValue.asInstanceOf[js.Any], SingleCellMode = SingleCellMode.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectionArguments]
  }
  
  @scala.inline
  implicit class RangeSelectionArgumentsOps[Self <: RangeSelectionArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloseOnMouseRelease(value: Boolean): Self = this.set("CloseOnMouseRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValue(value: String): Self = this.set("InitialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleCellMode(value: Boolean): Self = this.set("SingleCellMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
  }
}
