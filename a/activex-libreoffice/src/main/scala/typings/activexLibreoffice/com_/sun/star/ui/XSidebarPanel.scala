package typings.activexLibreoffice.com_.sun.star.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Optional interface of sidebar panels. */
trait XSidebarPanel extends StObject {
  
  /** Minimal possible width of this panel. */
  val MinimalWidth: Double
  
  /**
    * For a given width of the container the layouter asks every ui element for its optimal height.
    *
    * The height to which a ui element is set may differ from the returned value.
    *
    * The height is set via the XWindow interface.
    */
  def getHeightForWidth(nWidth: Double): LayoutSize
  
  /** Minimal possible width of this panel. */
  def getMinimalWidth(): Double
}
object XSidebarPanel {
  
  inline def apply(MinimalWidth: Double, getHeightForWidth: Double => LayoutSize, getMinimalWidth: () => Double): XSidebarPanel = {
    val __obj = js.Dynamic.literal(MinimalWidth = MinimalWidth.asInstanceOf[js.Any], getHeightForWidth = js.Any.fromFunction1(getHeightForWidth), getMinimalWidth = js.Any.fromFunction0(getMinimalWidth))
    __obj.asInstanceOf[XSidebarPanel]
  }
  
  extension [Self <: XSidebarPanel](x: Self) {
    
    inline def setGetHeightForWidth(value: Double => LayoutSize): Self = StObject.set(x, "getHeightForWidth", js.Any.fromFunction1(value))
    
    inline def setGetMinimalWidth(value: () => Double): Self = StObject.set(x, "getMinimalWidth", js.Any.fromFunction0(value))
    
    inline def setMinimalWidth(value: Double): Self = StObject.set(x, "MinimalWidth", value.asInstanceOf[js.Any])
  }
}
