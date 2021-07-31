package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cui {
  
  /** @since LibreOffice 4.1 */
  trait ColorPicker
    extends StObject
       with XExecutableDialog {
    
    def createWithParent(Parent: XWindow): Unit
  }
  object ColorPicker {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      createWithParent: XWindow => Unit,
      execute: () => Double,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      setTitle: String => Unit
    ): ColorPicker = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithParent = js.Any.fromFunction1(createWithParent), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
      __obj.asInstanceOf[ColorPicker]
    }
    
    @scala.inline
    implicit class ColorPickerMutableBuilder[Self <: ColorPicker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateWithParent(value: XWindow => Unit): Self = StObject.set(x, "createWithParent", js.Any.fromFunction1(value))
    }
  }
}
