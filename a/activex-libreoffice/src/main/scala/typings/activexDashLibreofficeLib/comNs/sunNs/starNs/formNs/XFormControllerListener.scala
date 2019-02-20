package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to be notified when the activation status of a {@link FormController} changes.
  *
  * A form controller is activated if a form control gains the focus and none of its controls currently owned the focus before.
  * @see XFormController
  */
trait XFormControllerListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when a control of the controller gained the focus and the controller was not previously activated.
    * @param rEvent the event happened.
    */
  def formActivated(rEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is invoked when a control of the "XFormController" lost the focus and no control of the controller received the focus. In other words, no control of
    * the controller owns the focus.
    * @param rEvent the event happened.
    */
  def formDeactivated(rEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

