package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive paint events. */
trait XPaintListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a region of the window became invalid, e.g. when another window has been moved away. */
  def windowPaint(e: PaintEvent): Unit
}
object XPaintListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    windowPaint: PaintEvent => Unit
  ): XPaintListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), windowPaint = js.Any.fromFunction1(windowPaint))
    __obj.asInstanceOf[XPaintListener]
  }
  
  extension [Self <: XPaintListener](x: Self) {
    
    inline def setWindowPaint(value: PaintEvent => Unit): Self = StObject.set(x, "windowPaint", js.Any.fromFunction1(value))
  }
}
