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
    Controls: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    CurrentControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    ElementType: activexDashLibreofficeLib.`type`,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    acquire: () => scala.Unit,
    activateFirst: () => scala.Unit,
    activateLast: () => scala.Unit,
    activateTabOrder: () => scala.Unit,
    addActivateListener: XFormControllerListener => scala.Unit,
    addConfirmDeleteListener: XConfirmDeleteListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    addParameterListener: XDatabaseParameterListener => scala.Unit,
    addRowSetApproveListener: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XRowSetApproveListener => scala.Unit,
    addSQLErrorListener: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSQLErrorListener => scala.Unit,
    autoTabOrder: () => scala.Unit,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    dispose: () => scala.Unit,
    getContainer: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer,
    getControls: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    getCurrentControl: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    hasElements: () => scala.Boolean,
    queryDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, java.lang.String, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch,
    queryDispatches: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchDescriptor] => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeActivateListener: XFormControllerListener => scala.Unit,
    removeConfirmDeleteListener: XConfirmDeleteListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    removeParameterListener: XDatabaseParameterListener => scala.Unit,
    removeRowSetApproveListener: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XRowSetApproveListener => scala.Unit,
    removeSQLErrorListener: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSQLErrorListener => scala.Unit,
    setContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer => scala.Unit,
    setModel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit
  ): FormController = {
    val __obj = js.Dynamic.literal(Container = Container, Controls = Controls, CurrentControl = CurrentControl, ElementType = ElementType, Parent = Parent, acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), addActivateListener = js.Any.fromFunction1(addActivateListener), addConfirmDeleteListener = js.Any.fromFunction1(addConfirmDeleteListener), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addParameterListener = js.Any.fromFunction1(addParameterListener), addRowSetApproveListener = js.Any.fromFunction1(addRowSetApproveListener), addSQLErrorListener = js.Any.fromFunction1(addSQLErrorListener), autoTabOrder = js.Any.fromFunction0(autoTabOrder), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getCurrentControl = js.Any.fromFunction0(getCurrentControl), getElementType = js.Any.fromFunction0(getElementType), getModel = js.Any.fromFunction0(getModel), getParent = js.Any.fromFunction0(getParent), hasElements = js.Any.fromFunction0(hasElements), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActivateListener = js.Any.fromFunction1(removeActivateListener), removeConfirmDeleteListener = js.Any.fromFunction1(removeConfirmDeleteListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removeParameterListener = js.Any.fromFunction1(removeParameterListener), removeRowSetApproveListener = js.Any.fromFunction1(removeRowSetApproveListener), removeSQLErrorListener = js.Any.fromFunction1(removeSQLErrorListener), setContainer = js.Any.fromFunction1(setContainer), setModel = js.Any.fromFunction1(setModel), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[FormController]
  }
}

