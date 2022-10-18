package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntitlementsResult extends StObject {
  
  /**
    * The entitlements.
    */
  var Entitlements: js.UndefOr[EntitlementList] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeEntitlementsResult {
  
  inline def apply(): DescribeEntitlementsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntitlementsResult]
  }
  
  extension [Self <: DescribeEntitlementsResult](x: Self) {
    
    inline def setEntitlements(value: EntitlementList): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsUndefined: Self = StObject.set(x, "Entitlements", js.undefined)
    
    inline def setEntitlementsVarargs(value: Entitlement*): Self = StObject.set(x, "Entitlements", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
