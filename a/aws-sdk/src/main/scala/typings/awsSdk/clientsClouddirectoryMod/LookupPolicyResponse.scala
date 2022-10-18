package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupPolicyResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Provides list of path to policies. Policies contain PolicyId, ObjectIdentifier, and PolicyType. For more information, see Policies.
    */
  var PolicyToPathList: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.PolicyToPathList] = js.undefined
}
object LookupPolicyResponse {
  
  inline def apply(): LookupPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupPolicyResponse]
  }
  
  extension [Self <: LookupPolicyResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPolicyToPathList(value: PolicyToPathList): Self = StObject.set(x, "PolicyToPathList", value.asInstanceOf[js.Any])
    
    inline def setPolicyToPathListUndefined: Self = StObject.set(x, "PolicyToPathList", js.undefined)
    
    inline def setPolicyToPathListVarargs(value: PolicyToPath*): Self = StObject.set(x, "PolicyToPathList", js.Array(value*))
  }
}
