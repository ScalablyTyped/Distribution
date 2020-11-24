package typings.activexLibreoffice.com_.sun.star.deployment.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link UpdateRequiredDialog} is used to show a list of extensions not compatible with this office version.
  * @since OOo 3.2
  */
@js.native
trait UpdateRequiredDialog extends XExecutableDialog {
  
  /** Create a GUI using the specific parent window and focus on the given context. */
  def create(): Unit = js.native
}
object UpdateRequiredDialog {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    create: () => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): UpdateRequiredDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction0(create), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[UpdateRequiredDialog]
  }
  
  @scala.inline
  implicit class UpdateRequiredDialogOps[Self <: UpdateRequiredDialog] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: () => Unit): Self = this.set("create", js.Any.fromFunction0(value))
  }
}
