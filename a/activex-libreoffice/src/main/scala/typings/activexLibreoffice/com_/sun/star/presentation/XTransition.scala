package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.rendering.XBitmap
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transition interface to render custom transitions over time.
  * @since OOo 2.4
  */
trait XTransition
  extends StObject
     with XInterface {
  
  /**
    * Update transition on screen to given time state.
    * @param t Time on the transition timeline to display. Must be in the [0,1] range.
    */
  def update(t: Double): Unit
  
  def viewChanged(view: XSlideShowView, leavingBitmap: XBitmap, enteringBitmap: XBitmap): Unit
}
object XTransition {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    update: Double => Unit,
    viewChanged: (XSlideShowView, XBitmap, XBitmap) => Unit
  ): XTransition = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), update = js.Any.fromFunction1(update), viewChanged = js.Any.fromFunction3(viewChanged))
    __obj.asInstanceOf[XTransition]
  }
  
  extension [Self <: XTransition](x: Self) {
    
    inline def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setViewChanged(value: (XSlideShowView, XBitmap, XBitmap) => Unit): Self = StObject.set(x, "viewChanged", js.Any.fromFunction3(value))
  }
}
