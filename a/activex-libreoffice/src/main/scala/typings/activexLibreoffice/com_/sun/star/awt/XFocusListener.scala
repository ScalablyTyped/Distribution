package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive keyboard focus events.
  *
  * The window which has the keyboard focus is the window which gets the keyboard events.
  */
@js.native
trait XFocusListener extends XEventListener {
  
  /**
    * is invoked when a window gains the keyboard focus.
    * @see XActivateListener.windowActivated
    */
  def focusGained(e: FocusEvent): Unit = js.native
  
  /**
    * is invoked when a window loses the keyboard focus.
    * @see XActivateListener.windowDeactivated
    */
  def focusLost(e: FocusEvent): Unit = js.native
}
object XFocusListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    focusGained: FocusEvent => Unit,
    focusLost: FocusEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFocusListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), focusGained = js.Any.fromFunction1(focusGained), focusLost = js.Any.fromFunction1(focusLost), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFocusListener]
  }
  
  @scala.inline
  implicit class XFocusListenerMutableBuilder[Self <: XFocusListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusGained(value: FocusEvent => Unit): Self = StObject.set(x, "focusGained", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocusLost(value: FocusEvent => Unit): Self = StObject.set(x, "focusLost", js.Any.fromFunction1(value))
  }
}
