package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBillingGroupsOutput extends StObject {
  
  /**
    * A list of BillingGroupListElement retrieved. 
    */
  var BillingGroups: js.UndefOr[BillingGroupList] = js.undefined
  
  /**
    * The pagination token that's used on subsequent calls to get billing groups. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListBillingGroupsOutput {
  
  inline def apply(): ListBillingGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingGroupsOutput]
  }
  
  extension [Self <: ListBillingGroupsOutput](x: Self) {
    
    inline def setBillingGroups(value: BillingGroupList): Self = StObject.set(x, "BillingGroups", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupsUndefined: Self = StObject.set(x, "BillingGroups", js.undefined)
    
    inline def setBillingGroupsVarargs(value: BillingGroupListElement*): Self = StObject.set(x, "BillingGroups", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
