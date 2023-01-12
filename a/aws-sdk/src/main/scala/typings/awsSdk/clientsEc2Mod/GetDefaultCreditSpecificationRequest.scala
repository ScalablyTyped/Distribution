package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDefaultCreditSpecificationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance family.
    */
  var InstanceFamily: UnlimitedSupportedInstanceFamily
}
object GetDefaultCreditSpecificationRequest {
  
  inline def apply(InstanceFamily: UnlimitedSupportedInstanceFamily): GetDefaultCreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(InstanceFamily = InstanceFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultCreditSpecificationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDefaultCreditSpecificationRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceFamily(value: UnlimitedSupportedInstanceFamily): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
  }
}
