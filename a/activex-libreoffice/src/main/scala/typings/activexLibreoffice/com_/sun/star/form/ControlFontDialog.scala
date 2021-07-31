package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait ControlFontDialog
  extends StObject
     with XExecutableDialog {
  
  def createWithGridModel(GridModel: XPropertySet): Unit
}
object ControlFontDialog {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithGridModel: XPropertySet => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): ControlFontDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithGridModel = js.Any.fromFunction1(createWithGridModel), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[ControlFontDialog]
  }
  
  @scala.inline
  implicit class ControlFontDialogMutableBuilder[Self <: ControlFontDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWithGridModel(value: XPropertySet => Unit): Self = StObject.set(x, "createWithGridModel", js.Any.fromFunction1(value))
  }
}
