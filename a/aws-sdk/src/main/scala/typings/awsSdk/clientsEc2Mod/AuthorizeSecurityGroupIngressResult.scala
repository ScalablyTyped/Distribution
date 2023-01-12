package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeSecurityGroupIngressResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the inbound (ingress) security group rules that were added.
    */
  var SecurityGroupRules: js.UndefOr[SecurityGroupRuleList] = js.undefined
}
object AuthorizeSecurityGroupIngressResult {
  
  inline def apply(): AuthorizeSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
    
    inline def setSecurityGroupRules(value: SecurityGroupRuleList): Self = StObject.set(x, "SecurityGroupRules", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRulesUndefined: Self = StObject.set(x, "SecurityGroupRules", js.undefined)
    
    inline def setSecurityGroupRulesVarargs(value: SecurityGroupRule*): Self = StObject.set(x, "SecurityGroupRules", js.Array(value*))
  }
}
