package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHealthServiceStatusForOrganizationResponse extends StObject {
  
  /**
    * Information about the status of enabling or disabling the Health organizational view feature in your organization. Valid values are ENABLED | DISABLED | PENDING. 
    */
  var healthServiceAccessStatusForOrganization: js.UndefOr[typings.awsSdk.clientsHealthMod.healthServiceAccessStatusForOrganization] = js.undefined
}
object DescribeHealthServiceStatusForOrganizationResponse {
  
  inline def apply(): DescribeHealthServiceStatusForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHealthServiceStatusForOrganizationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeHealthServiceStatusForOrganizationResponse] (val x: Self) extends AnyVal {
    
    inline def setHealthServiceAccessStatusForOrganization(value: healthServiceAccessStatusForOrganization): Self = StObject.set(x, "healthServiceAccessStatusForOrganization", value.asInstanceOf[js.Any])
    
    inline def setHealthServiceAccessStatusForOrganizationUndefined: Self = StObject.set(x, "healthServiceAccessStatusForOrganization", js.undefined)
  }
}
