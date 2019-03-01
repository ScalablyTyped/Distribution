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

object XFormControllerListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    formActivated: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    formDeactivated: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFormControllerListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("formActivated")(formActivated)
    __obj.updateDynamic("formDeactivated")(formDeactivated)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XFormControllerListener]
  }
}

