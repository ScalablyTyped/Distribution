package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDefaultCreditSpecificationRequest extends StObject {
  
  /**
    * The credit option for CPU usage of the instance family. Valid Values: standard | unlimited 
    */
  var CpuCredits: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance family.
    */
  var InstanceFamily: UnlimitedSupportedInstanceFamily
}
object ModifyDefaultCreditSpecificationRequest {
  
  inline def apply(CpuCredits: String, InstanceFamily: UnlimitedSupportedInstanceFamily): ModifyDefaultCreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(CpuCredits = CpuCredits.asInstanceOf[js.Any], InstanceFamily = InstanceFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDefaultCreditSpecificationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyDefaultCreditSpecificationRequest] (val x: Self) extends AnyVal {
    
    inline def setCpuCredits(value: String): Self = StObject.set(x, "CpuCredits", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceFamily(value: UnlimitedSupportedInstanceFamily): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
  }
}
