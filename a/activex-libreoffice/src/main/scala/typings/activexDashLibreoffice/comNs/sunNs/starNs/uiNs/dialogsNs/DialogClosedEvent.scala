package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.dialogsNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information of a closed dialog.
  *
  * The broadcaster who sends such event, must send the dialog as the source.
  * @see com.sun.star.lang.EventObject
  */
trait DialogClosedEvent extends EventObject {
  /**
    * @param DialogResult Identifies the result of a dialog.
    * @see ExecutableDialogResults
    */
  var DialogResult: Double
}

object DialogClosedEvent {
  @scala.inline
  def apply(DialogResult: Double, Source: XInterface): DialogClosedEvent = {
    val __obj = js.Dynamic.literal(DialogResult = DialogResult, Source = Source)
  
    __obj.asInstanceOf[DialogClosedEvent]
  }
}

