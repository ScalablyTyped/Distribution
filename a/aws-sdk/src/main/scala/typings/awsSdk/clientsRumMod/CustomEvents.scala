package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEvents extends StObject {
  
  /**
    * Specifies whether this app monitor allows the web client to define and send custom events. The default is for custom events to be DISABLED.
    */
  var Status: js.UndefOr[CustomEventsStatus] = js.undefined
}
object CustomEvents {
  
  inline def apply(): CustomEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomEvents] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: CustomEventsStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
