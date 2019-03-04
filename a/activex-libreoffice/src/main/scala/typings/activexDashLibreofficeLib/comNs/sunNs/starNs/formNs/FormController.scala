package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is superseded by {@link com.sun.star.form.runtime.FormController} .
  * @deprecated Deprecated
  */
trait FormController
  extends XFormController
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProvider
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
     with XConfirmDeleteBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSQLErrorBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XRowSetApproveBroadcaster
     with XDatabaseParameterBroadcaster

object FormController {
  @scala.inline
  def apply(
    Container: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer,
    Controls: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    CurrentControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    ElementType: activexDashLibreofficeLib.`type`,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    acquire: js.Function0[scala.Unit],
    activateFirst: js.Function0[scala.Unit],
    activateLast: js.Function0[scala.Unit],
    activateTabOrder: js.Function0[scala.Unit],
    addActivateListener: js.Function1[XFormControllerListener, scala.Unit],
    addConfirmDeleteListener: js.Function1[XConfirmDeleteListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    addParameterListener: js.Function1[XDatabaseParameterListener, scala.Unit],
    addRowSetApproveListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XRowSetApproveListener, 
      scala.Unit
    ],
    addSQLErrorListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSQLErrorListener, scala.Unit],
    autoTabOrder: js.Function0[scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    dispose: js.Function0[scala.Unit],
    getContainer: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer],
    getControls: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl]
    ],
    getCurrentControl: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    hasElements: js.Function0[scala.Boolean],
    queryDispatch: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch
    ],
    queryDispatches: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchDescriptor], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeActivateListener: js.Function1[XFormControllerListener, scala.Unit],
    removeConfirmDeleteListener: js.Function1[XConfirmDeleteListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    removeParameterListener: js.Function1[XDatabaseParameterListener, scala.Unit],
    removeRowSetApproveListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XRowSetApproveListener, 
      scala.Unit
    ],
    removeSQLErrorListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSQLErrorListener, scala.Unit],
    setContainer: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer, scala.Unit],
    setModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): FormController = {
    val __obj = js.Dynamic.literal(Container = Container, Controls = Controls, CurrentControl = CurrentControl, ElementType = ElementType, Parent = Parent, acquire = acquire, activateFirst = activateFirst, activateLast = activateLast, activateTabOrder = activateTabOrder, addActivateListener = addActivateListener, addConfirmDeleteListener = addConfirmDeleteListener, addEventListener = addEventListener, addModifyListener = addModifyListener, addParameterListener = addParameterListener, addRowSetApproveListener = addRowSetApproveListener, addSQLErrorListener = addSQLErrorListener, autoTabOrder = autoTabOrder, createEnumeration = createEnumeration, dispose = dispose, getContainer = getContainer, getControls = getControls, getCurrentControl = getCurrentControl, getElementType = getElementType, getModel = getModel, getParent = getParent, hasElements = hasElements, queryDispatch = queryDispatch, queryDispatches = queryDispatches, queryInterface = queryInterface, release = release, removeActivateListener = removeActivateListener, removeConfirmDeleteListener = removeConfirmDeleteListener, removeEventListener = removeEventListener, removeModifyListener = removeModifyListener, removeParameterListener = removeParameterListener, removeRowSetApproveListener = removeRowSetApproveListener, removeSQLErrorListener = removeSQLErrorListener, setContainer = setContainer, setModel = setModel, setParent = setParent)
  
    __obj.asInstanceOf[FormController]
  }
}

