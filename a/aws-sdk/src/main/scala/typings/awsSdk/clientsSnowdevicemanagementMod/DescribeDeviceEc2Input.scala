package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceEc2Input extends StObject {
  
  /**
    * A list of instance IDs associated with the managed device.
    */
  var instanceIds: InstanceIdsList
  
  /**
    * The ID of the managed device.
    */
  var managedDeviceId: ManagedDeviceId
}
object DescribeDeviceEc2Input {
  
  inline def apply(instanceIds: InstanceIdsList, managedDeviceId: ManagedDeviceId): DescribeDeviceEc2Input = {
    val __obj = js.Dynamic.literal(instanceIds = instanceIds.asInstanceOf[js.Any], managedDeviceId = managedDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeviceEc2Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDeviceEc2Input] (val x: Self) extends AnyVal {
    
    inline def setInstanceIds(value: InstanceIdsList): Self = StObject.set(x, "instanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsVarargs(value: String*): Self = StObject.set(x, "instanceIds", js.Array(value*))
    
    inline def setManagedDeviceId(value: ManagedDeviceId): Self = StObject.set(x, "managedDeviceId", value.asInstanceOf[js.Any])
  }
}
