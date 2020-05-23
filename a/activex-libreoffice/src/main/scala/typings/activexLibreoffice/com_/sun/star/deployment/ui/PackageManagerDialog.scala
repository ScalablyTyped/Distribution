package typings.activexLibreoffice.com_.sun.star.deployment.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XAsynchronousExecutableDialog
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XDialogClosedListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link PackageManagerDialog} is used to visually manage installed packages of the user and shared installation as well as currently open
  * documents.
  * @since OOo 2.0
  */
trait PackageManagerDialog extends XAsynchronousExecutableDialog {
  /**
    * Create a GUI using the specific parent window and focus on the given context.
    * @param xParent parent window
    * @param focussedContext context to be focused
    */
  def create(xParent: XWindow, focussedContext: String): Unit
  /**
    * Create a GUI and pass the URL of the extension which shall be installed right away. This constructor is intended for the case when unopkg is run as
    * result of clicking an extension in a file browser, etc. The extensions will always be installed for the current user.
    * @param extensionURL URL of extension
    */
  def createAndInstall(extensionURL: String): Unit
  /** Create a default GUI. */
  def createDefault(): Unit
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
}

