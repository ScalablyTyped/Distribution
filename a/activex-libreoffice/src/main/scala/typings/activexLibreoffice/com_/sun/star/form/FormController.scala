package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlContainer
import typings.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typings.activexLibreoffice.com_.sun.star.frame.XDispatch
import typings.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdb.XRowSetApproveBroadcaster
import typings.activexLibreoffice.com_.sun.star.sdb.XRowSetApproveListener
import typings.activexLibreoffice.com_.sun.star.sdb.XSQLErrorBroadcaster
import typings.activexLibreoffice.com_.sun.star.sdb.XSQLErrorListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is superseded by {@link com.sun.star.form.runtime.FormController} .
  * @deprecated Deprecated
  */
trait FormController
  extends StObject
     with XDispatchProvider
     with XFormController
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
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], CurrentControl = CurrentControl.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), addActivateListener = js.Any.fromFunction1(addActivateListener), addConfirmDeleteListener = js.Any.fromFunction1(addConfirmDeleteListener), addEventListener = js.Any.fromFunction1(addEventListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addParameterListener = js.Any.fromFunction1(addParameterListener), addRowSetApproveListener = js.Any.fromFunction1(addRowSetApproveListener), addSQLErrorListener = js.Any.fromFunction1(addSQLErrorListener), autoTabOrder = js.Any.fromFunction0(autoTabOrder), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getCurrentControl = js.Any.fromFunction0(getCurrentControl), getElementType = js.Any.fromFunction0(getElementType), getModel = js.Any.fromFunction0(getModel), getParent = js.Any.fromFunction0(getParent), hasElements = js.Any.fromFunction0(hasElements), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActivateListener = js.Any.fromFunction1(removeActivateListener), removeConfirmDeleteListener = js.Any.fromFunction1(removeConfirmDeleteListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removeParameterListener = js.Any.fromFunction1(removeParameterListener), removeRowSetApproveListener = js.Any.fromFunction1(removeRowSetApproveListener), removeSQLErrorListener = js.Any.fromFunction1(removeSQLErrorListener), setContainer = js.Any.fromFunction1(setContainer), setModel = js.Any.fromFunction1(setModel), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[FormController]
  }
}
