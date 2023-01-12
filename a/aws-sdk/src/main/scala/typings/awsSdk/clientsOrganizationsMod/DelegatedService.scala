package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedService extends StObject {
  
  /**
    * The date that the account became a delegated administrator for this service. 
    */
  var DelegationEnabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of an Amazon Web Services service that can request an operation for the specified service. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
    */
  var ServicePrincipal: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.ServicePrincipal] = js.undefined
}
object DelegatedService {
  
  inline def apply(): DelegatedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelegatedService] (val x: Self) extends AnyVal {
    
    inline def setDelegationEnabledDate(value: js.Date): Self = StObject.set(x, "DelegationEnabledDate", value.asInstanceOf[js.Any])
    
    inline def setDelegationEnabledDateUndefined: Self = StObject.set(x, "DelegationEnabledDate", js.undefined)
    
    inline def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalUndefined: Self = StObject.set(x, "ServicePrincipal", js.undefined)
  }
}
