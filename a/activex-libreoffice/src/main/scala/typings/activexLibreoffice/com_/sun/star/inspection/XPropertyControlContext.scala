package typings.activexLibreoffice.com_.sun.star.inspection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the interface of the context of an {@link XPropertyControl} .
  * @see XPropertyControl.ControlContext
  * @since OOo 2.0.3
  */
trait XPropertyControlContext
  extends StObject
     with XPropertyControlObserver {
  
  /**
    * instructs the {@link XPropertyControlContext} to active the next control
    * @param CurrentControl denotes the control which initiated the request.
    */
  def activateNextControl(CurrentControl: XPropertyControl): Unit
}
object XPropertyControlContext {
  
  inline def apply(
    activateNextControl: XPropertyControl => Unit,
    focusGained: XPropertyControl => Unit,
    valueChanged: XPropertyControl => Unit
  ): XPropertyControlContext = {
    val __obj = js.Dynamic.literal(activateNextControl = js.Any.fromFunction1(activateNextControl), focusGained = js.Any.fromFunction1(focusGained), valueChanged = js.Any.fromFunction1(valueChanged))
    __obj.asInstanceOf[XPropertyControlContext]
  }
  
  extension [Self <: XPropertyControlContext](x: Self) {
    
    inline def setActivateNextControl(value: XPropertyControl => Unit): Self = StObject.set(x, "activateNextControl", js.Any.fromFunction1(value))
  }
}
