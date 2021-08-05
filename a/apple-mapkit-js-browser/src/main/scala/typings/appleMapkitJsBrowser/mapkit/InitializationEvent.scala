package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.appleMapkitJsBrowserStrings.Initialized
import typings.appleMapkitJsBrowser.appleMapkitJsBrowserStrings.Refreshed
import typings.appleMapkitJsBrowser.appleMapkitJsBrowserStrings.Unauthorized
import typings.appleMapkitJsBrowser.appleMapkitJsBrowserStrings.`Too Many Requests`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializationEvent extends StObject {
  
  var status: Initialized | Refreshed | Unauthorized | (`Too Many Requests`)
}
object InitializationEvent {
  
  inline def apply(status: Initialized | Refreshed | Unauthorized | (`Too Many Requests`)): InitializationEvent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializationEvent]
  }
  
  extension [Self <: InitializationEvent](x: Self) {
    
    inline def setStatus(value: Initialized | Refreshed | Unauthorized | (`Too Many Requests`)): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
