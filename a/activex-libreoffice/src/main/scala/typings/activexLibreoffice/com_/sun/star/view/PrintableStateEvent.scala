package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the print progress of an {@link XPrintable} .
  *
  * {@link com.sun.star.lang.EventObject.Source} contains the {@link XPrintable} having changed its state
  *
  * .
  */
trait PrintableStateEvent
  extends StObject
     with EventObject {
  
  var State: PrintableState
}
object PrintableStateEvent {
  
  inline def apply(Source: XInterface, State: PrintableState): PrintableStateEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintableStateEvent]
  }
  
  extension [Self <: PrintableStateEvent](x: Self) {
    
    inline def setState(value: PrintableState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
