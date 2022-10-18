package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAggregationAuthorizationRequest extends StObject {
  
  /**
    * The 12-digit account ID of the account authorized to aggregate data.
    */
  var AuthorizedAccountId: AccountId
  
  /**
    * The region authorized to collect aggregated data.
    */
  var AuthorizedAwsRegion: AwsRegion
  
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.undefined
}
object PutAggregationAuthorizationRequest {
  
  inline def apply(AuthorizedAccountId: AccountId, AuthorizedAwsRegion: AwsRegion): PutAggregationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(AuthorizedAccountId = AuthorizedAccountId.asInstanceOf[js.Any], AuthorizedAwsRegion = AuthorizedAwsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAggregationAuthorizationRequest]
  }
  
  extension [Self <: PutAggregationAuthorizationRequest](x: Self) {
    
    inline def setAuthorizedAccountId(value: AccountId): Self = StObject.set(x, "AuthorizedAccountId", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedAwsRegion(value: AwsRegion): Self = StObject.set(x, "AuthorizedAwsRegion", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
