package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventIntegrationResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the event integration. 
    */
  var EventIntegrationArn: js.UndefOr[Arn] = js.undefined
}
object CreateEventIntegrationResponse {
  
  inline def apply(): CreateEventIntegrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventIntegrationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEventIntegrationResponse] (val x: Self) extends AnyVal {
    
    inline def setEventIntegrationArn(value: Arn): Self = StObject.set(x, "EventIntegrationArn", value.asInstanceOf[js.Any])
    
    inline def setEventIntegrationArnUndefined: Self = StObject.set(x, "EventIntegrationArn", js.undefined)
  }
}
