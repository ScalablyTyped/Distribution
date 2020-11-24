package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends interface {@link XModel} .
  *
  * The following functions are added:
  *
  * enumeration of all currently connected controller objects. (not {@link getCurrentController()} only, which depends on focus)establish new view
  * controller factory methods, which will make it possible to create new views for this model.
  */
@js.native
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
  val AvailableViewControllerNames: SafeArray[String] = js.native
  
  /**
    * provides list of all currently connected controller objects.
    *
    * Please note: Because this interface will might be used inside multi threaded environments those list can contain still disposed items or it new added
    * controller will be missing (if they was added after this enumeration was created).
    * @returns list of controller objects. Enumeration can be empty but not NULL.
    */
  val Controllers: XEnumeration = js.native
  
  /**
    * creates the default view instance for this model.
    *
    * Effectively, this method is equivalent to calling createView() with the `ViewName` being `"Default"` .
    * @param Frame used to place the new created view there
    * @returns the new view controller instance
    * @throws com::sun::star::lang::IllegalArgumentException if one of the given parameter was wrong
    * @throws com::sun::star::uno::Exception if creation of a new view failed by other reasons
    */
  def createDefaultViewController(Frame: XFrame): XController2 = js.native
  
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
  def createViewController(ViewName: String, Arguments: SeqEquiv[PropertyValue], Frame: XFrame): XController2 = js.native
  
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
  def getAvailableViewControllerNames(): SafeArray[String] = js.native
  
  /**
    * provides list of all currently connected controller objects.
    *
    * Please note: Because this interface will might be used inside multi threaded environments those list can contain still disposed items or it new added
    * controller will be missing (if they was added after this enumeration was created).
    * @returns list of controller objects. Enumeration can be empty but not NULL.
    */
  def getControllers(): XEnumeration = js.native
}
object XModel2 {
  
  @scala.inline
  def apply(
    Args: SafeArray[PropertyValue],
    AvailableViewControllerNames: SafeArray[String],
    Controllers: XEnumeration,
    CurrentController: XController,
    CurrentSelection: XInterface,
    URL: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Unit,
    createDefaultViewController: XFrame => XController2,
    createViewController: (String, SeqEquiv[PropertyValue], XFrame) => XController2,
    disconnectController: XController => Unit,
    dispose: () => Unit,
    getArgs: () => SafeArray[PropertyValue],
    getAvailableViewControllerNames: () => SafeArray[String],
    getControllers: () => XEnumeration,
    getCurrentController: () => XController,
    getCurrentSelection: () => XInterface,
    getURL: () => String,
    hasControllersLocked: () => Boolean,
    lockControllers: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setCurrentController: XController => Unit,
    unlockControllers: () => Unit
  ): XModel2 = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], AvailableViewControllerNames = AvailableViewControllerNames.asInstanceOf[js.Any], Controllers = Controllers.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), createDefaultViewController = js.Any.fromFunction1(createDefaultViewController), createViewController = js.Any.fromFunction3(createViewController), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArgs = js.Any.fromFunction0(getArgs), getAvailableViewControllerNames = js.Any.fromFunction0(getAvailableViewControllerNames), getControllers = js.Any.fromFunction0(getControllers), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setCurrentController = js.Any.fromFunction1(setCurrentController), unlockControllers = js.Any.fromFunction0(unlockControllers))
    __obj.asInstanceOf[XModel2]
  }
  
  @scala.inline
  implicit class XModel2Ops[Self <: XModel2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailableViewControllerNames(value: SafeArray[String]): Self = this.set("AvailableViewControllerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllers(value: XEnumeration): Self = this.set("Controllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDefaultViewController(value: XFrame => XController2): Self = this.set("createDefaultViewController", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateViewController(value: (String, SeqEquiv[PropertyValue], XFrame) => XController2): Self = this.set("createViewController", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetAvailableViewControllerNames(value: () => SafeArray[String]): Self = this.set("getAvailableViewControllerNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetControllers(value: () => XEnumeration): Self = this.set("getControllers", js.Any.fromFunction0(value))
  }
}
