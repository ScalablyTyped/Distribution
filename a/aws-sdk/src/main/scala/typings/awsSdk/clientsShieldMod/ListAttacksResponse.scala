package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttacksResponse extends StObject {
  
  /**
    * The attack information for the specified time range.
    */
  var AttackSummaries: js.UndefOr[typings.awsSdk.clientsShieldMod.AttackSummaries] = js.undefined
  
  /**
    * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining available objects, Shield Advanced includes a NextToken value in the response. You can retrieve the next batch of objects by requesting the list again and providing the token that was returned by the prior call in your request.  You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the MaxResults setting. Shield Advanced will not return more than MaxResults objects, but may return fewer, even if more objects are still available. Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a NextToken value.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListAttacksResponse {
  
  inline def apply(): ListAttacksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttacksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAttacksResponse] (val x: Self) extends AnyVal {
    
    inline def setAttackSummaries(value: AttackSummaries): Self = StObject.set(x, "AttackSummaries", value.asInstanceOf[js.Any])
    
    inline def setAttackSummariesUndefined: Self = StObject.set(x, "AttackSummaries", js.undefined)
    
    inline def setAttackSummariesVarargs(value: AttackSummary*): Self = StObject.set(x, "AttackSummaries", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
