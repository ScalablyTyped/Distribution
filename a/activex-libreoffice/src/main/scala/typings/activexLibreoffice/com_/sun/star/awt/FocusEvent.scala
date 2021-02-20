package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a keyboard focus event.
  *
  * There are two levels of focus change events: permanent and temporary. Permanent focus change events occur when focus is directly moved from one
  * component to another, such as through calls to requestFocus() or as the user uses the Tab key to traverse components. Temporary focus change events
  * occur when focus is gained or lost for a component as the indirect result of another operation, such as window deactivation or a scrollbar drag. In
  * this case, the original focus state will automatically be restored once that operation is finished, or for the case of window deactivation, when the
  * window is reactivated. Both permanent and temporary focus events are delivered using the FOCUS_GAINED and FOCUS_LOST event ids; the levels may be
  * distinguished in the event using the isTemporary() method.
  */
@js.native
trait FocusEvent extends EventObject {
  
  /**
    * specifies the reason for the focus change as an arithmetic-or combination of {@link FocusChangeReason} .
    * @see FocusChangeReason
    */
  var FocusFlags: Double = js.native
  
  /** contains the window which gets the focus on a lose focus event. */
  var NextFocus: XInterface = js.native
  
  /** specifies if this focus change event is a temporary change. */
  var Temporary: Boolean = js.native
}
object FocusEvent {
  
  @scala.inline
  def apply(FocusFlags: Double, NextFocus: XInterface, Source: XInterface, Temporary: Boolean): FocusEvent = {
    val __obj = js.Dynamic.literal(FocusFlags = FocusFlags.asInstanceOf[js.Any], NextFocus = NextFocus.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Temporary = Temporary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusEvent]
  }
  
  @scala.inline
  implicit class FocusEventMutableBuilder[Self <: FocusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusFlags(value: Double): Self = StObject.set(x, "FocusFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextFocus(value: XInterface): Self = StObject.set(x, "NextFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporary(value: Boolean): Self = StObject.set(x, "Temporary", value.asInstanceOf[js.Any])
  }
}
