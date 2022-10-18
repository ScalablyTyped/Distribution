package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtectionsRequest extends StObject {
  
  /**
    * Narrows the set of protections that the call retrieves. You can retrieve a single protection by providing its name or the ARN (Amazon Resource Name) of its protected resource. You can also retrieve all protections for a specific resource type. You can provide up to one criteria per filter type. Shield Advanced returns protections that exactly match all of the filter criteria that you provide.
    */
  var InclusionFilters: js.UndefOr[InclusionProtectionFilters] = js.undefined
  
  /**
    * The greatest number of objects that you want Shield Advanced to return to the list request. Shield Advanced might return fewer objects than you indicate in this setting, even if more objects are available. If there are more objects remaining, Shield Advanced will always also return a NextToken value in the response. The default setting is 20.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsShieldMod.MaxResults] = js.undefined
  
  /**
    * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining available objects, Shield Advanced includes a NextToken value in the response. You can retrieve the next batch of objects by requesting the list again and providing the token that was returned by the prior call in your request.  You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the MaxResults setting. Shield Advanced will not return more than MaxResults objects, but may return fewer, even if more objects are still available. Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a NextToken value. On your first call to a list operation, leave this setting empty.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListProtectionsRequest {
  
  inline def apply(): ListProtectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtectionsRequest]
  }
  
  extension [Self <: ListProtectionsRequest](x: Self) {
    
    inline def setInclusionFilters(value: InclusionProtectionFilters): Self = StObject.set(x, "InclusionFilters", value.asInstanceOf[js.Any])
    
    inline def setInclusionFiltersUndefined: Self = StObject.set(x, "InclusionFilters", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
