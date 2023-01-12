package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventBusResponse extends StObject {
  
  /**
    * The ARN of the new event bus.
    */
  var EventBusArn: js.UndefOr[String] = js.undefined
}
object CreateEventBusResponse {
  
  inline def apply(): CreateEventBusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventBusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEventBusResponse] (val x: Self) extends AnyVal {
    
    inline def setEventBusArn(value: String): Self = StObject.set(x, "EventBusArn", value.asInstanceOf[js.Any])
    
    inline def setEventBusArnUndefined: Self = StObject.set(x, "EventBusArn", js.undefined)
  }
}
