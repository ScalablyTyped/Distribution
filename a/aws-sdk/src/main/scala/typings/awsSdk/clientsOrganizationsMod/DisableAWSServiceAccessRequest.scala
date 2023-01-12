package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableAWSServiceAccessRequest extends StObject {
  
  /**
    * The service principal name of the Amazon Web Services service for which you want to disable integration with your organization. This is typically in the form of a URL, such as  service-abbreviation.amazonaws.com.
    */
  var ServicePrincipal: typings.awsSdk.clientsOrganizationsMod.ServicePrincipal
}
object DisableAWSServiceAccessRequest {
  
  inline def apply(ServicePrincipal: ServicePrincipal): DisableAWSServiceAccessRequest = {
    val __obj = js.Dynamic.literal(ServicePrincipal = ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableAWSServiceAccessRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableAWSServiceAccessRequest] (val x: Self) extends AnyVal {
    
    inline def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
  }
}
