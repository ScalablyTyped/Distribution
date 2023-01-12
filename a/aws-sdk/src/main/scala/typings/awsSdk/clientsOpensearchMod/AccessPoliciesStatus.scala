package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPoliciesStatus extends StObject {
  
  /**
    * The access policy configured for the domain. Access policies can be resource-based, IP-based, or IAM-based. For more information, see Configuring access policies.
    */
  var Options: PolicyDocument
  
  /**
    * The status of the access policy for the domain.
    */
  var Status: OptionStatus
}
object AccessPoliciesStatus {
  
  inline def apply(Options: PolicyDocument, Status: OptionStatus): AccessPoliciesStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPoliciesStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPoliciesStatus] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: PolicyDocument): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
