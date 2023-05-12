package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealTimeInferenceConfig extends StObject {
  
  /**
    * The number of instances of the type specified by InstanceType.
    */
  var InstanceCount: TaskCount
  
  /**
    * The instance type the model is deployed to.
    */
  var InstanceType: typings.awsSdk.clientsSagemakerMod.InstanceType
}
object RealTimeInferenceConfig {
  
  inline def apply(InstanceCount: TaskCount, InstanceType: InstanceType): RealTimeInferenceConfig = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealTimeInferenceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RealTimeInferenceConfig] (val x: Self) extends AnyVal {
    
    inline def setInstanceCount(value: TaskCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
  }
}
