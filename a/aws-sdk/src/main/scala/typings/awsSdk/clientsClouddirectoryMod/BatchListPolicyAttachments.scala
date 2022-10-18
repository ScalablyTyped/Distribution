package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListPolicyAttachments extends StObject {
  
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * The reference that identifies the policy object.
    */
  var PolicyReference: ObjectReference
}
object BatchListPolicyAttachments {
  
  inline def apply(PolicyReference: ObjectReference): BatchListPolicyAttachments = {
    val __obj = js.Dynamic.literal(PolicyReference = PolicyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListPolicyAttachments]
  }
  
  extension [Self <: BatchListPolicyAttachments](x: Self) {
    
    inline def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPolicyReference(value: ObjectReference): Self = StObject.set(x, "PolicyReference", value.asInstanceOf[js.Any])
  }
}
