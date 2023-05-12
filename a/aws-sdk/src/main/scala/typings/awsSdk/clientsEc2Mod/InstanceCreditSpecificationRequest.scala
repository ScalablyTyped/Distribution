package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceCreditSpecificationRequest extends StObject {
  
  /**
    * The credit option for CPU usage of the instance. Valid values: standard | unlimited  T3 instances with host tenancy do not support the unlimited CPU credit option.
    */
  var CpuCredits: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.clientsEc2Mod.InstanceId
}
object InstanceCreditSpecificationRequest {
  
  inline def apply(InstanceId: InstanceId): InstanceCreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCreditSpecificationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceCreditSpecificationRequest] (val x: Self) extends AnyVal {
    
    inline def setCpuCredits(value: String): Self = StObject.set(x, "CpuCredits", value.asInstanceOf[js.Any])
    
    inline def setCpuCreditsUndefined: Self = StObject.set(x, "CpuCredits", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
