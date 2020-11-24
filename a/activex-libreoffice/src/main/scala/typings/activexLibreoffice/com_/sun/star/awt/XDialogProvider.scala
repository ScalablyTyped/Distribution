package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides dialogs implementing the {@link com.sun.star.awt.XDialog} interface. */
@js.native
trait XDialogProvider extends XInterface {
  
  /**
    * creates a dialog for the given URL.
    * @param URL is the URL.
    * @returns a dialog implementing the {@link com.sun.star.awt.XDialog} interface.
    * @throws com::sun::star::lang::IllegalArgumentException if no dialog for the given URL is found or if the URL is invalid.
    */
  def createDialog(URL: String): XDialog = js.native
}
object XDialogProvider {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDialog: String => XDialog,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDialogProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDialog = js.Any.fromFunction1(createDialog), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDialogProvider]
  }
  
  @scala.inline
  implicit class XDialogProviderOps[Self <: XDialogProvider] (val x: Self) extends AnyVal {
    
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
    def setCreateDialog(value: String => XDialog): Self = this.set("createDialog", js.Any.fromFunction1(value))
  }
}
