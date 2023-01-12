package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHoursOfOperationRequest extends StObject {
  
  /**
    * The identifier for the hours of operation.
    */
  var HoursOfOperationId: typings.awsSdk.clientsConnectMod.HoursOfOperationId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object DescribeHoursOfOperationRequest {
  
  inline def apply(HoursOfOperationId: HoursOfOperationId, InstanceId: InstanceId): DescribeHoursOfOperationRequest = {
    val __obj = js.Dynamic.literal(HoursOfOperationId = HoursOfOperationId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHoursOfOperationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeHoursOfOperationRequest] (val x: Self) extends AnyVal {
    
    inline def setHoursOfOperationId(value: HoursOfOperationId): Self = StObject.set(x, "HoursOfOperationId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
