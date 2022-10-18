package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePartnerInputRequest extends StObject {
  
  /**
    * Unique ID of the input.
    */
  var InputId: string
  
  /**
    * Unique identifier of the request to ensure the request is handled
  exactly once in case of retries.
    */
  var RequestId: js.UndefOr[string] = js.undefined
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Tags] = js.undefined
}
object CreatePartnerInputRequest {
  
  inline def apply(InputId: string): CreatePartnerInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePartnerInputRequest]
  }
  
  extension [Self <: CreatePartnerInputRequest](x: Self) {
    
    inline def setInputId(value: string): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
