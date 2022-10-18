package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPoliciesGrantingServiceAccessEntry extends StObject {
  
  /**
    * The PoliciesGrantingServiceAccess object that contains details about the policy.
    */
  var Policies: js.UndefOr[policyGrantingServiceAccessListType] = js.undefined
  
  /**
    * The namespace of the service that was accessed. To learn the service namespace of a service, see Actions, resources, and condition keys for Amazon Web Services services in the Service Authorization Reference. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see Amazon Web Services service namespaces in the Amazon Web Services General Reference.
    */
  var ServiceNamespace: js.UndefOr[serviceNamespaceType] = js.undefined
}
object ListPoliciesGrantingServiceAccessEntry {
  
  inline def apply(): ListPoliciesGrantingServiceAccessEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPoliciesGrantingServiceAccessEntry]
  }
  
  extension [Self <: ListPoliciesGrantingServiceAccessEntry](x: Self) {
    
    inline def setPolicies(value: policyGrantingServiceAccessListType): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    inline def setPoliciesVarargs(value: PolicyGrantingServiceAccess*): Self = StObject.set(x, "Policies", js.Array(value*))
    
    inline def setServiceNamespace(value: serviceNamespaceType): Self = StObject.set(x, "ServiceNamespace", value.asInstanceOf[js.Any])
    
    inline def setServiceNamespaceUndefined: Self = StObject.set(x, "ServiceNamespace", js.undefined)
  }
}
