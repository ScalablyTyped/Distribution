package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to listen to border resize events of a controller. */
trait XBorderResizeListener
  extends StObject
     with XEventListener {
  
  /**
    * notifies the listener that the controller's border widths have been changed.
    * @param Object reference to the object representing the controller
    * @param NewSize the new widths of the controller's border
    */
  def borderWidthsChanged(Object: XInterface, NewSize: BorderWidths): Unit
}
object XBorderResizeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    borderWidthsChanged: (XInterface, BorderWidths) => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBorderResizeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), borderWidthsChanged = js.Any.fromFunction2(borderWidthsChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBorderResizeListener]
  }
  
  @scala.inline
  implicit class XBorderResizeListenerMutableBuilder[Self <: XBorderResizeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderWidthsChanged(value: (XInterface, BorderWidths) => Unit): Self = StObject.set(x, "borderWidthsChanged", js.Any.fromFunction2(value))
  }
}
