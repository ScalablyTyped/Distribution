package typings.activexLibreoffice.com_.sun.star.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface of the sidebar that allows its elements like panels to eg request layouts. */
trait XSidebar extends StObject {
  
  /**
    * Request layout of the sidebar. Call this method when one of the panels wants to change its size due to late initilization or different content after a
    * context change.
    */
  def requestLayout(): Unit
}
object XSidebar {
  
  inline def apply(requestLayout: () => Unit): XSidebar = {
    val __obj = js.Dynamic.literal(requestLayout = js.Any.fromFunction0(requestLayout))
    __obj.asInstanceOf[XSidebar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSidebar] (val x: Self) extends AnyVal {
    
    inline def setRequestLayout(value: () => Unit): Self = StObject.set(x, "requestLayout", js.Any.fromFunction0(value))
  }
}
