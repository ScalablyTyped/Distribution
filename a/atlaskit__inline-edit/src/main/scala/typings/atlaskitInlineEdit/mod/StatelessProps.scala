package typings.atlaskitInlineEdit.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatelessProps extends BaseProps {
  
  /** Whether the component shows the readView or the editView. */
  var isEditing: Boolean = js.native
  
  /** Handler called when the wrapper or the label are clicked. */
  def onEditRequested(): Unit = js.native
}
object StatelessProps {
  
  @scala.inline
  def apply(
    isEditing: Boolean,
    onCancel: () => Unit,
    onConfirm: () => Unit,
    onEditRequested: () => Unit,
    readView: ReactElement
  ): StatelessProps = {
    val __obj = js.Dynamic.literal(isEditing = isEditing.asInstanceOf[js.Any], onCancel = js.Any.fromFunction0(onCancel), onConfirm = js.Any.fromFunction0(onConfirm), onEditRequested = js.Any.fromFunction0(onEditRequested), readView = readView.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessProps]
  }
  
  @scala.inline
  implicit class StatelessPropsOps[Self <: StatelessProps] (val x: Self) extends AnyVal {
    
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
    def setIsEditing(value: Boolean): Self = this.set("isEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEditRequested(value: () => Unit): Self = this.set("onEditRequested", js.Any.fromFunction0(value))
  }
}
