package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceAccessPoliciesRequest extends StObject {
  
  /**
    * The access rules you want to configure. These rules replace any existing rules. 
    */
  var AccessPolicies: PolicyDocument
  
  var DomainName: typings.awsSdk.clientsCloudsearchMod.DomainName
}
object UpdateServiceAccessPoliciesRequest {
  
  inline def apply(AccessPolicies: PolicyDocument, DomainName: DomainName): UpdateServiceAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceAccessPoliciesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceAccessPoliciesRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessPolicies(value: PolicyDocument): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
