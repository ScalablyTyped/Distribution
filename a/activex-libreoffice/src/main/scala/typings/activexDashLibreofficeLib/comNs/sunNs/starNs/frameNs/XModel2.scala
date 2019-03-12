package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends interface {@link XModel} .
  *
  * The following functions are added:
  *
  * enumeration of all currently connected controller objects. (not {@link getCurrentController()} only, which depends on focus)establish new view
  * controller factory methods, which will make it possible to create new views for this model.
  */
trait XModel2 extends XModel {
  /**
    * provides the available names of the factory to be used to create views.
    *
    * The names are usually logical view names. The following names have a defined meaning, i.e. every concrete implementation which returns such a name
    * must ensure it has the same meaning, and if a concrete implementation has a view with the given meaning, it must give it the name as defined here:
    * **Default** specifies the default view of the document.**Preview** specifies a preview of the document. A minimal implementation of such a view is a
    * **Default** view which is read-only.**PrintPreview** specifies a print preview of the document.
    *
    * Implementations of this interface might decide to support additional view names, which then are documented in the respective service descriptions.
    * @returns a sequence of names of all supported views for this document.
    * @see createView
    */
  val AvailableViewControllerNames: stdLib.SafeArray[java.lang.String]
  /**
    * provides list of all currently connected controller objects.
    *
    * Please note: Because this interface will might be used inside multi threaded environments those list can contain still disposed items or it new added
    * controller will be missing (if they was added after this enumeration was created).
    * @returns list of controller objects. Enumeration can be empty but not NULL.
    */
  val Controllers: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
  /**
    * creates the default view instance for this model.
    *
    * Effectively, this method is equivalent to calling createView() with the `ViewName` being `"Default"` .
    * @param Frame used to place the new created view there
    * @returns the new view controller instance
    * @throws com::sun::star::lang::IllegalArgumentException if one of the given parameter was wrong
    * @throws com::sun::star::uno::Exception if creation of a new view failed by other reasons
    */
  def createDefaultViewController(Frame: XFrame): XController2
  /**
    * creates a new view instance classified by the specified name and arguments.
    *
    * The newly created controller must not be connected with the document and the frame. That is, you should neither call {@link XFrame.setComponent()} ,
    * nor {@link XController.attachFrame()} , nor {@link XController.attachModel()} , nor {@link XModel.connectController()} , not {@link
    * XModel.setCurrentController()} . All of this is the responsibility of the caller, which will do it in the proper order.
    * @param ViewName classified name of instance
    * @param Arguments arguments used for creation
    * @param Frame used to place the new created view there
    * @returns the new view controller instance
    * @throws com::sun::star::lang::IllegalArgumentException if one of the given parameter was wrong
    * @throws com::sun::star::uno::Exception if creation of a new view failed by other reasons
    */
  def createViewController(
    ViewName: java.lang.String,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Frame: XFrame
  ): XController2
  /**
    * provides the available names of the factory to be used to create views.
    *
    * The names are usually logical view names. The following names have a defined meaning, i.e. every concrete implementation which returns such a name
    * must ensure it has the same meaning, and if a concrete implementation has a view with the given meaning, it must give it the name as defined here:
    * **Default** specifies the default view of the document.**Preview** specifies a preview of the document. A minimal implementation of such a view is a
    * **Default** view which is read-only.**PrintPreview** specifies a print preview of the document.
    *
    * Implementations of this interface might decide to support additional view names, which then are documented in the respective service descriptions.
    * @returns a sequence of names of all supported views for this document.
    * @see createView
    */
  def getAvailableViewControllerNames(): stdLib.SafeArray[java.lang.String]
  /**
    * provides list of all currently connected controller objects.
    *
    * Please note: Because this interface will might be used inside multi threaded environments those list can contain still disposed items or it new added
    * controller will be missing (if they was added after this enumeration was created).
    * @returns list of controller objects. Enumeration can be empty but not NULL.
    */
  def getControllers(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration
}

object XModel2 {
  @scala.inline
  def apply(
    Args: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    AvailableViewControllerNames: stdLib.SafeArray[java.lang.String],
    Controllers: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    CurrentController: XController,
    CurrentSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    URL: java.lang.String,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    attachResource: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => scala.Boolean,
    connectController: XController => scala.Unit,
    createDefaultViewController: XFrame => XController2,
    createViewController: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], XFrame) => XController2,
    disconnectController: XController => scala.Unit,
    dispose: () => scala.Unit,
    getArgs: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getAvailableViewControllerNames: () => stdLib.SafeArray[java.lang.String],
    getControllers: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    getCurrentController: () => XController,
    getCurrentSelection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getURL: () => java.lang.String,
    hasControllersLocked: () => scala.Boolean,
    lockControllers: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setCurrentController: XController => scala.Unit,
    unlockControllers: () => scala.Unit
  ): XModel2 = {
    val __obj = js.Dynamic.literal(Args = Args, AvailableViewControllerNames = AvailableViewControllerNames, Controllers = Controllers, CurrentController = CurrentController, CurrentSelection = CurrentSelection, URL = URL, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), createDefaultViewController = js.Any.fromFunction1(createDefaultViewController), createViewController = js.Any.fromFunction3(createViewController), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArgs = js.Any.fromFunction0(getArgs), getAvailableViewControllerNames = js.Any.fromFunction0(getAvailableViewControllerNames), getControllers = js.Any.fromFunction0(getControllers), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setCurrentController = js.Any.fromFunction1(setCurrentController), unlockControllers = js.Any.fromFunction0(unlockControllers))
  
    __obj.asInstanceOf[XModel2]
  }
}

