package typings.activexLibreoffice.com_.sun.star.ui.dialogs

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information of a closed dialog.
  *
  * The broadcaster who sends such event, must send the dialog as the source.
  * @see com.sun.star.lang.EventObject
  */
@js.native
trait DialogClosedEvent extends EventObject {
  /**
    * @param DialogResult Identifies the result of a dialog.
    * @see ExecutableDialogResults
    */
  var DialogResult: Double = js.native
}

object DialogClosedEvent {
  @scala.inline
  def apply(DialogResult: Double, Source: XInterface): DialogClosedEvent = {
    val __obj = js.Dynamic.literal(DialogResult = DialogResult.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogClosedEvent]
  }
  @scala.inline
  implicit class DialogClosedEventOps[Self <: DialogClosedEvent] (val x: Self) extends AnyVal {
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
    def setDialogResult(value: Double): Self = this.set("DialogResult", value.asInstanceOf[js.Any])
  }
  
}

