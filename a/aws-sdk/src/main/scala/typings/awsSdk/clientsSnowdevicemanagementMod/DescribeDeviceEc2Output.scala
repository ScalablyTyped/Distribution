package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceEc2Output extends StObject {
  
  /**
    * A list of structures containing information about each instance. 
    */
  var instances: js.UndefOr[InstanceSummaryList] = js.undefined
}
object DescribeDeviceEc2Output {
  
  inline def apply(): DescribeDeviceEc2Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceEc2Output]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDeviceEc2Output] (val x: Self) extends AnyVal {
    
    inline def setInstances(value: InstanceSummaryList): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: InstanceSummary*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
