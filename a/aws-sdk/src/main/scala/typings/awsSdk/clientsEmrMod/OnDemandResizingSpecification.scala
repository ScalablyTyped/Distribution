package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDemandResizingSpecification extends StObject {
  
  /**
    * On-Demand resize timeout in minutes. If On-Demand Instances are not provisioned within this time, the resize workflow stops. The minimum value is 5 minutes, and the maximum value is 10,080 minutes (7 days). The timeout applies to all resize workflows on the Instance Fleet. The resize could be triggered by Amazon EMR Managed Scaling or by the customer (via Amazon EMR Console, Amazon EMR CLI modify-instance-fleet or Amazon EMR SDK ModifyInstanceFleet API) or by Amazon EMR due to Amazon EC2 Spot Reclamation.
    */
  var TimeoutDurationMinutes: WholeNumber
}
object OnDemandResizingSpecification {
  
  inline def apply(TimeoutDurationMinutes: WholeNumber): OnDemandResizingSpecification = {
    val __obj = js.Dynamic.literal(TimeoutDurationMinutes = TimeoutDurationMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDemandResizingSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDemandResizingSpecification] (val x: Self) extends AnyVal {
    
    inline def setTimeoutDurationMinutes(value: WholeNumber): Self = StObject.set(x, "TimeoutDurationMinutes", value.asInstanceOf[js.Any])
  }
}
