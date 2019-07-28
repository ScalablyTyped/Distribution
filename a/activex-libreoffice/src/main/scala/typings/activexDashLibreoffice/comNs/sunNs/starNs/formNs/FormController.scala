package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControl
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControlContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XTabControllerModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XChild
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.DispatchDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XDispatch
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XDispatchProvider
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.XRowSetApproveBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.XRowSetApproveListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.XSQLErrorBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs.XSQLErrorListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is superseded by {@link com.sun.star.form.runtime.FormController} .
  * @deprecated Deprecated
  */
trait FormController
  extends XFormController
     with XDispatchProvider
     with XChild
     with XComponent
     with XEnumerationAccess
     with XModifyBroadcaster
     with XConfirmDeleteBroadcaster
     with XSQLErrorBroadcaster
     with XRowSetApproveBroadcaster
     with XDatabaseParameterBroadcaster

object FormController {
  @scala.inline
  def apply(
    Container: XControlContainer,
    Controls: SafeArray[XControl],
    CurrentControl: XControl,
    ElementType: `type`,
    Parent: XInterface,
    acquire: () => Unit,
    activateFirst: () => Unit,
    activateLast: () => Unit,
    activateTabOrder: () => Unit,
    addActivateListener: XFormControllerListener => Unit,
    addConfirmDeleteListener: XConfirmDeleteListener => Unit,
    addEventListener: XEventListener => Unit,
    addModifyListener: XModifyListener => Unit,
    addParameterListener: XDatabaseParameterListener => Unit,
    addRowSetApproveListener: XRowSetApproveListener => Unit,
    addSQLErrorListener: XSQLErrorListener => Unit,
    autoTabOrder: () => Unit,
    createEnumeration: () => XEnumeration,
    dispose: () => Unit,
    getContainer: () => XControlContainer,
    getControls: () => SafeArray[XControl],
    getCurrentControl: () => XControl,
    getElementType: () => `type`,
    getModel: () => XTabControllerModel,
    getParent: () => XInterface,
    hasElements: () => Boolean,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActivateListener: XFormControllerListener => Unit,
    removeConfirmDeleteListener: XConfirmDeleteListener => Unit,
    removeEventListener: XEventListener => Unit,
    removeModifyListener: XModifyListener => Unit,
    removeParameterListener: XDatabaseParameterListener => Unit,
    removeRowSetApproveListener: XRowSetApproveListener => Unit,
    removeSQLErrorListener: XSQLErrorListener => Unit,
    setContainer: XControlContainer => Unit,
    setModel: XTabControllerModel => Unit,
    setParent: XInterface => Unit
  ): FormController = {
    val __obj = js.Dynamic.literal(Container = Container, Controls = Controls, CurrentControl = CurrentControl, ElementType = ElementType, Parent = Parent, acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), addActivateListener = js.Any.fromFunction1(addActivateListener), addConfirmDeleteListener = js.Any.fromFunction1(addConfirmDeleteListener), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addParameterListener = js.Any.fromFunction1(addParameterListener), addRowSetApproveListener = js.Any.fromFunction1(addRowSetApproveListener), addSQLErrorListener = js.Any.fromFunction1(addSQLErrorListener), autoTabOrder = js.Any.fromFunction0(autoTabOrder), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getCurrentControl = js.Any.fromFunction0(getCurrentControl), getElementType = js.Any.fromFunction0(getElementType), getModel = js.Any.fromFunction0(getModel), getParent = js.Any.fromFunction0(getParent), hasElements = js.Any.fromFunction0(hasElements), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActivateListener = js.Any.fromFunction1(removeActivateListener), removeConfirmDeleteListener = js.Any.fromFunction1(removeConfirmDeleteListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removeParameterListener = js.Any.fromFunction1(removeParameterListener), removeRowSetApproveListener = js.Any.fromFunction1(removeRowSetApproveListener), removeSQLErrorListener = js.Any.fromFunction1(removeSQLErrorListener), setContainer = js.Any.fromFunction1(setContainer), setModel = js.Any.fromFunction1(setModel), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[FormController]
  }
}

