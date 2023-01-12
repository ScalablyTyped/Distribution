package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecurityGroupRuleDescriptionsIngressResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object UpdateSecurityGroupRuleDescriptionsIngressResult {
  
  inline def apply(): UpdateSecurityGroupRuleDescriptionsIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecurityGroupRuleDescriptionsIngressResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSecurityGroupRuleDescriptionsIngressResult] (val x: Self) extends AnyVal {
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
