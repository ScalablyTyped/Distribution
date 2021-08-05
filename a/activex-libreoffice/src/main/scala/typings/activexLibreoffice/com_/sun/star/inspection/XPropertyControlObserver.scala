package typings.activexLibreoffice.com_.sun.star.inspection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies an interface for components to observer certain aspects of an {@link XPropertyControl} .
  * @since OOo 2.2
  */
trait XPropertyControlObserver extends StObject {
  
  /**
    * notifies the observer that a certain {@link XPropertyControl} 's UI representation gained the focus.
    * @param Control denotes the control whose UI representation gained the focus
    */
  def focusGained(Control: XPropertyControl): Unit
  
  /**
    * notifies the observer that a certain {@link XPropertyControl} 's value changed.
    * @param Control denotes the control whose value changed.
    * @see XPropertyControl.Value
    */
  def valueChanged(Control: XPropertyControl): Unit
}
object XPropertyControlObserver {
  
  inline def apply(focusGained: XPropertyControl => Unit, valueChanged: XPropertyControl => Unit): XPropertyControlObserver = {
    val __obj = js.Dynamic.literal(focusGained = js.Any.fromFunction1(focusGained), valueChanged = js.Any.fromFunction1(valueChanged))
    __obj.asInstanceOf[XPropertyControlObserver]
  }
  
  extension [Self <: XPropertyControlObserver](x: Self) {
    
    inline def setFocusGained(value: XPropertyControl => Unit): Self = StObject.set(x, "focusGained", js.Any.fromFunction1(value))
    
    inline def setValueChanged(value: XPropertyControl => Unit): Self = StObject.set(x, "valueChanged", js.Any.fromFunction1(value))
  }
}
