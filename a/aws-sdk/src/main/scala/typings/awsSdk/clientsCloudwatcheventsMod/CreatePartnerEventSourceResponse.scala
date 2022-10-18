package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePartnerEventSourceResponse extends StObject {
  
  /**
    * The ARN of the partner event source.
    */
  var EventSourceArn: js.UndefOr[String] = js.undefined
}
object CreatePartnerEventSourceResponse {
  
  inline def apply(): CreatePartnerEventSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePartnerEventSourceResponse]
  }
  
  extension [Self <: CreatePartnerEventSourceResponse](x: Self) {
    
    inline def setEventSourceArn(value: String): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    inline def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
  }
}
