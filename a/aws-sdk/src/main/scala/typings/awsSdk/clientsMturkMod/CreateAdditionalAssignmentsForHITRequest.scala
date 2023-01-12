package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAdditionalAssignmentsForHITRequest extends StObject {
  
  /**
    * The ID of the HIT to extend.
    */
  var HITId: EntityId
  
  /**
    * The number of additional assignments to request for this HIT.
    */
  var NumberOfAdditionalAssignments: Integer
  
  /**
    *  A unique identifier for this request, which allows you to retry the call on error without extending the HIT multiple times. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the extend HIT already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return an error with a message containing the request ID. 
    */
  var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
}
object CreateAdditionalAssignmentsForHITRequest {
  
  inline def apply(HITId: EntityId, NumberOfAdditionalAssignments: Integer): CreateAdditionalAssignmentsForHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any], NumberOfAdditionalAssignments = NumberOfAdditionalAssignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAdditionalAssignmentsForHITRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAdditionalAssignmentsForHITRequest] (val x: Self) extends AnyVal {
    
    inline def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    inline def setNumberOfAdditionalAssignments(value: Integer): Self = StObject.set(x, "NumberOfAdditionalAssignments", value.asInstanceOf[js.Any])
    
    inline def setUniqueRequestToken(value: IdempotencyToken): Self = StObject.set(x, "UniqueRequestToken", value.asInstanceOf[js.Any])
    
    inline def setUniqueRequestTokenUndefined: Self = StObject.set(x, "UniqueRequestToken", js.undefined)
  }
}
