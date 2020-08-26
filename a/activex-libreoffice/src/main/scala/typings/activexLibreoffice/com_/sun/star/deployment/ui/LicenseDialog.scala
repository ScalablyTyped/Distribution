package typings.activexLibreoffice.com_.sun.star.deployment.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link LicenseDialog} is used to display a license text.
  * @since OOo 2.0.4
  */
@js.native
trait LicenseDialog extends XExecutableDialog {
  /**
    * Create a GUI using the specific parent window and focus on the given context.
    * @param xParent parent window
    * @param extensionName the display name of the extension
    * @param licenseText text to be displayed
    */
  def create(xParent: XWindow, extensionName: String, licenseText: String): Unit = js.native
}

object LicenseDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    create: (XWindow, String, String) => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): LicenseDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction3(create), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[LicenseDialog]
  }
  @scala.inline
  implicit class LicenseDialogOps[Self <: LicenseDialog] (val x: Self) extends AnyVal {
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
    def setCreate(value: (XWindow, String, String) => Unit): Self = this.set("create", js.Any.fromFunction3(value))
  }
  
}

