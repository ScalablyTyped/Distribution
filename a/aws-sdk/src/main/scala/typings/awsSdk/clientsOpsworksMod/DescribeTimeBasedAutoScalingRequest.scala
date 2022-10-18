package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTimeBasedAutoScalingRequest extends StObject {
  
  /**
    * An array of instance IDs.
    */
  var InstanceIds: Strings
}
object DescribeTimeBasedAutoScalingRequest {
  
  inline def apply(InstanceIds: Strings): DescribeTimeBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTimeBasedAutoScalingRequest]
  }
  
  extension [Self <: DescribeTimeBasedAutoScalingRequest](x: Self) {
    
    inline def setInstanceIds(value: Strings): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsVarargs(value: String*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
  }
}
