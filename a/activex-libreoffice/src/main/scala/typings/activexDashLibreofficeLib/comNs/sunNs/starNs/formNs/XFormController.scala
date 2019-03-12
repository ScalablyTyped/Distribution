package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is superseded by {@link com.sun.star.form.runtime.XFormController} .
  * @deprecated Deprecated
  */
trait XFormController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController {
  val CurrentControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl
  def addActivateListener(l: XFormControllerListener): scala.Unit
  def getCurrentControl(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl
  def removeActivateListener(l: XFormControllerListener): scala.Unit
}

object XFormController {
  @scala.inline
  def apply(
    Container: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer,
    Controls: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    CurrentControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    acquire: () => scala.Unit,
    activateFirst: () => scala.Unit,
    activateLast: () => scala.Unit,
    activateTabOrder: () => scala.Unit,
    addActivateListener: XFormControllerListener => scala.Unit,
    autoTabOrder: () => scala.Unit,
    getContainer: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer,
    getControls: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    getCurrentControl: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeActivateListener: XFormControllerListener => scala.Unit,
    setContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer => scala.Unit,
    setModel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel => scala.Unit
  ): XFormController = {
    val __obj = js.Dynamic.literal(Container = Container, Controls = Controls, CurrentControl = CurrentControl, acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), addActivateListener = js.Any.fromFunction1(addActivateListener), autoTabOrder = js.Any.fromFunction0(autoTabOrder), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getCurrentControl = js.Any.fromFunction0(getCurrentControl), getModel = js.Any.fromFunction0(getModel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActivateListener = js.Any.fromFunction1(removeActivateListener), setContainer = js.Any.fromFunction1(setContainer), setModel = js.Any.fromFunction1(setModel))
  
    __obj.asInstanceOf[XFormController]
  }
}

