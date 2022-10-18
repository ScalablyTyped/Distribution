package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroup extends StObject {
  
  /**
    * Specifies the number of instances of the instance group.
    */
  var InstanceCount: TrainingInstanceCount
  
  /**
    * Specifies the name of the instance group.
    */
  var InstanceGroupName: typings.awsSdk.clientsSagemakerMod.InstanceGroupName
  
  /**
    * Specifies the instance type of the instance group.
    */
  var InstanceType: TrainingInstanceType
}
object InstanceGroup {
  
  inline def apply(
    InstanceCount: TrainingInstanceCount,
    InstanceGroupName: InstanceGroupName,
    InstanceType: TrainingInstanceType
  ): InstanceGroup = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceGroupName = InstanceGroupName.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroup]
  }
  
  extension [Self <: InstanceGroup](x: Self) {
    
    inline def setInstanceCount(value: TrainingInstanceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupName(value: InstanceGroupName): Self = StObject.set(x, "InstanceGroupName", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: TrainingInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
  }
}
