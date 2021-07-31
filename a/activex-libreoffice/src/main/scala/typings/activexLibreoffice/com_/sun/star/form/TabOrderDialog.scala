package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControlContainer
import typings.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.2 */
trait TabOrderDialog
  extends StObject
     with XExecutableDialog {
  
  def createWithModel(TabbingModel: XTabControllerModel, ControlContext: XControlContainer, ParentWindow: XWindow): Unit
}
object TabOrderDialog {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithModel: (XTabControllerModel, XControlContainer, XWindow) => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): TabOrderDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithModel = js.Any.fromFunction3(createWithModel), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[TabOrderDialog]
  }
  
  @scala.inline
  implicit class TabOrderDialogMutableBuilder[Self <: TabOrderDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWithModel(value: (XTabControllerModel, XControlContainer, XWindow) => Unit): Self = StObject.set(x, "createWithModel", js.Any.fromFunction3(value))
  }
}
