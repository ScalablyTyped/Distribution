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
    Controls: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    CurrentControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    acquire: js.Function0[scala.Unit],
    activateFirst: js.Function0[scala.Unit],
    activateLast: js.Function0[scala.Unit],
    activateTabOrder: js.Function0[scala.Unit],
    addActivateListener: js.Function1[XFormControllerListener, scala.Unit],
    autoTabOrder: js.Function0[scala.Unit],
    getContainer: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer],
    getControls: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl]
    ],
    getCurrentControl: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeActivateListener: js.Function1[XFormControllerListener, scala.Unit],
    setContainer: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer, scala.Unit],
    setModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel, scala.Unit]
  ): XFormController = {
    val __obj = js.Dynamic.literal(Container = Container, Controls = Controls, CurrentControl = CurrentControl, acquire = acquire, activateFirst = activateFirst, activateLast = activateLast, activateTabOrder = activateTabOrder, addActivateListener = addActivateListener, autoTabOrder = autoTabOrder, getContainer = getContainer, getControls = getControls, getCurrentControl = getCurrentControl, getModel = getModel, queryInterface = queryInterface, release = release, removeActivateListener = removeActivateListener, setContainer = setContainer, setModel = setModel)
  
    __obj.asInstanceOf[XFormController]
  }
}

