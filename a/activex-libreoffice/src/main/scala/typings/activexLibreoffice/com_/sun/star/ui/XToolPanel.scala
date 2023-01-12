package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the basic interface to be implemented by a tool panel */
trait XToolPanel extends StObject {
  
  /**
    * provides access to the tool panel's main window.
    *
    * It is allowed for an implementation to return `NULL` here, but in this case some functionality, for instance automatic positioning of the tool panel,
    * might not be available, and must be implemented by the tool panel itself.
    */
  var Window: XWindow
  
  /**
    * creates the root of the Accessibility object tree for the tool panel
    * @param ParentAccessible the parent object in the Accessibility object tree
    */
  def createAccessible(ParentAccessible: XAccessible): XAccessible
}
object XToolPanel {
  
  inline def apply(Window: XWindow, createAccessible: XAccessible => XAccessible): XToolPanel = {
    val __obj = js.Dynamic.literal(Window = Window.asInstanceOf[js.Any], createAccessible = js.Any.fromFunction1(createAccessible))
    __obj.asInstanceOf[XToolPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XToolPanel] (val x: Self) extends AnyVal {
    
    inline def setCreateAccessible(value: XAccessible => XAccessible): Self = StObject.set(x, "createAccessible", js.Any.fromFunction1(value))
    
    inline def setWindow(value: XWindow): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
  }
}
