package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesInProtectionGroupResponse extends StObject {
  
  /**
    * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining available objects, Shield Advanced includes a NextToken value in the response. You can retrieve the next batch of objects by requesting the list again and providing the token that was returned by the prior call in your request.  You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the MaxResults setting. Shield Advanced will not return more than MaxResults objects, but may return fewer, even if more objects are still available. Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a NextToken value.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the resources that are included in the protection group.
    */
  var ResourceArns: ResourceArnList
}
object ListResourcesInProtectionGroupResponse {
  
  inline def apply(ResourceArns: ResourceArnList): ListResourcesInProtectionGroupResponse = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesInProtectionGroupResponse]
  }
  
  extension [Self <: ListResourcesInProtectionGroupResponse](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value*))
  }
}
