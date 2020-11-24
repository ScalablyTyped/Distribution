package typings.atlaskitInlineEdit.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseProps extends js.Object {
  
  /** Sets whether the checkmark and cross are displayed in the bottom right fo the field. */
  var areActionButtonsHidden: js.UndefOr[Boolean] = js.native
  
  /** Set whether default stylings should be disabled when editing. */
  var disableEditViewFieldBase: js.UndefOr[Boolean] = js.native
  
  /** Component to be shown when editing. Should be an @atlaskit/input. */
  var editView: js.UndefOr[ReactElement] = js.native
  
  /** Component to be shown in an @atlaskit/inline-dialog when edit view is open. */
  var invalidMessage: js.UndefOr[ReactElement] = js.native
  
  /** Sets whether the confirm function is called when the input loses focus. */
  var isConfirmOnBlurDisabled: js.UndefOr[Boolean] = js.native
  
  /** Set whether the read view should fit width, most obvious when hovered. */
  var isFitContainerWidthReadView: js.UndefOr[Boolean] = js.native
  
  /** Sets yellow border with warning symbol at end of input. Removes confirm and cancel buttons. */
  var isInvalid: js.UndefOr[Boolean] = js.native
  
  /** Determine whether the label is shown. */
  var isLabelHidden: js.UndefOr[Boolean] = js.native
  
  /** Greys out text and shows spinner. Does not disable input. */
  var isWaiting: js.UndefOr[Boolean] = js.native
  
  /** Label above the input. */
  var label: js.UndefOr[String] = js.native
  
  /** html to pass down to the label htmlFor prop. */
  var labelHtmlFor: js.UndefOr[String] = js.native
  
  /** Handler called when the cross is clicked on. */
  def onCancel(): Unit = js.native
  
  /** Handler called when checkmark is clicked. Also by default called when the input loses focus. */
  def onConfirm(): Unit = js.native
  
  /** Component to be shown when reading only */
  var readView: ReactElement = js.native
  
  /** Set whether onConfirm is called on pressing enter. */
  var shouldConfirmOnEnter: js.UndefOr[Boolean] = js.native
}
object BaseProps {
  
  @scala.inline
  def apply(onCancel: () => Unit, onConfirm: () => Unit, readView: ReactElement): BaseProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onConfirm = js.Any.fromFunction0(onConfirm), readView = readView.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
  
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps] (val x: Self) extends AnyVal {
    
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
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnConfirm(value: () => Unit): Self = this.set("onConfirm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadView(value: ReactElement): Self = this.set("readView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreActionButtonsHidden(value: Boolean): Self = this.set("areActionButtonsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreActionButtonsHidden: Self = this.set("areActionButtonsHidden", js.undefined)
    
    @scala.inline
    def setDisableEditViewFieldBase(value: Boolean): Self = this.set("disableEditViewFieldBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableEditViewFieldBase: Self = this.set("disableEditViewFieldBase", js.undefined)
    
    @scala.inline
    def setEditView(value: ReactElement): Self = this.set("editView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditView: Self = this.set("editView", js.undefined)
    
    @scala.inline
    def setInvalidMessage(value: ReactElement): Self = this.set("invalidMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidMessage: Self = this.set("invalidMessage", js.undefined)
    
    @scala.inline
    def setIsConfirmOnBlurDisabled(value: Boolean): Self = this.set("isConfirmOnBlurDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsConfirmOnBlurDisabled: Self = this.set("isConfirmOnBlurDisabled", js.undefined)
    
    @scala.inline
    def setIsFitContainerWidthReadView(value: Boolean): Self = this.set("isFitContainerWidthReadView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFitContainerWidthReadView: Self = this.set("isFitContainerWidthReadView", js.undefined)
    
    @scala.inline
    def setIsInvalid(value: Boolean): Self = this.set("isInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInvalid: Self = this.set("isInvalid", js.undefined)
    
    @scala.inline
    def setIsLabelHidden(value: Boolean): Self = this.set("isLabelHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLabelHidden: Self = this.set("isLabelHidden", js.undefined)
    
    @scala.inline
    def setIsWaiting(value: Boolean): Self = this.set("isWaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWaiting: Self = this.set("isWaiting", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelHtmlFor(value: String): Self = this.set("labelHtmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHtmlFor: Self = this.set("labelHtmlFor", js.undefined)
    
    @scala.inline
    def setShouldConfirmOnEnter(value: Boolean): Self = this.set("shouldConfirmOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldConfirmOnEnter: Self = this.set("shouldConfirmOnEnter", js.undefined)
  }
}
