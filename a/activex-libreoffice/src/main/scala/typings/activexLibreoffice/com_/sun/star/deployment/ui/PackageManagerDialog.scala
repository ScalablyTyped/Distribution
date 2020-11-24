package typings.activexLibreoffice.com_.sun.star.deployment.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XAsynchronousExecutableDialog
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XDialogClosedListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link PackageManagerDialog} is used to visually manage installed packages of the user and shared installation as well as currently open
  * documents.
  * @since OOo 2.0
  */
@js.native
trait PackageManagerDialog extends XAsynchronousExecutableDialog {
  
  /**
    * Create a GUI using the specific parent window and focus on the given context.
    * @param xParent parent window
    * @param focussedContext context to be focused
    */
  def create(xParent: XWindow, focussedContext: String): Unit = js.native
  
  /**
    * Create a GUI and pass the URL of the extension which shall be installed right away. This constructor is intended for the case when unopkg is run as
    * result of clicking an extension in a file browser, etc. The extensions will always be installed for the current user.
    * @param extensionURL URL of extension
    */
  def createAndInstall(extensionURL: String): Unit = js.native
  
  /** Create a default GUI. */
  def createDefault(): Unit = js.native
}
object PackageManagerDialog {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    create: (XWindow, String) => Unit,
    createAndInstall: String => Unit,
    createDefault: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDialogTitle: String => Unit,
    startExecuteModal: XDialogClosedListener => Unit
  ): PackageManagerDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction2(create), createAndInstall = js.Any.fromFunction1(createAndInstall), createDefault = js.Any.fromFunction0(createDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDialogTitle = js.Any.fromFunction1(setDialogTitle), startExecuteModal = js.Any.fromFunction1(startExecuteModal))
    __obj.asInstanceOf[PackageManagerDialog]
  }
  
  @scala.inline
  implicit class PackageManagerDialogOps[Self <: PackageManagerDialog] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: (XWindow, String) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateAndInstall(value: String => Unit): Self = this.set("createAndInstall", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateDefault(value: () => Unit): Self = this.set("createDefault", js.Any.fromFunction0(value))
  }
}
