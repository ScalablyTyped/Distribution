package typings.activexLibreoffice.com_.sun.star.inspection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the interface of the context of an {@link XPropertyControl} .
  * @see XPropertyControl.ControlContext
  * @since OOo 2.0.3
  */
@js.native
trait XPropertyControlContext extends XPropertyControlObserver {
  
  /**
    * instructs the {@link XPropertyControlContext} to active the next control
    * @param CurrentControl denotes the control which initiated the request.
    */
  def activateNextControl(CurrentControl: XPropertyControl): Unit = js.native
}
object XPropertyControlContext {
  
  @scala.inline
  def apply(
    activateNextControl: XPropertyControl => Unit,
    focusGained: XPropertyControl => Unit,
    valueChanged: XPropertyControl => Unit
  ): XPropertyControlContext = {
    val __obj = js.Dynamic.literal(activateNextControl = js.Any.fromFunction1(activateNextControl), focusGained = js.Any.fromFunction1(focusGained), valueChanged = js.Any.fromFunction1(valueChanged))
    __obj.asInstanceOf[XPropertyControlContext]
  }
  
  @scala.inline
  implicit class XPropertyControlContextMutableBuilder[Self <: XPropertyControlContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivateNextControl(value: XPropertyControl => Unit): Self = StObject.set(x, "activateNextControl", js.Any.fromFunction1(value))
  }
}
