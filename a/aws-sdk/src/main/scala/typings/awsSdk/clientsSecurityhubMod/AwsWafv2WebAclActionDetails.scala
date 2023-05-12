package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2WebAclActionDetails extends StObject {
  
  /**
    *  Specifies that WAF should allow requests by default. 
    */
  var Allow: js.UndefOr[AwsWafv2ActionAllowDetails] = js.undefined
  
  /**
    *  Specifies that WAF should block requests by default. 
    */
  var Block: js.UndefOr[AwsWafv2ActionBlockDetails] = js.undefined
}
object AwsWafv2WebAclActionDetails {
  
  inline def apply(): AwsWafv2WebAclActionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2WebAclActionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2WebAclActionDetails] (val x: Self) extends AnyVal {
    
    inline def setAllow(value: AwsWafv2ActionAllowDetails): Self = StObject.set(x, "Allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "Allow", js.undefined)
    
    inline def setBlock(value: AwsWafv2ActionBlockDetails): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "Block", js.undefined)
  }
}
