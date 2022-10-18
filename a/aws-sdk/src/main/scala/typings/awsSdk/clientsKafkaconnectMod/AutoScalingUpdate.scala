package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingUpdate extends StObject {
  
  /**
    * The target maximum number of workers allocated to the connector.
    */
  var maxWorkerCount: integerMin1Max10
  
  /**
    * The target number of microcontroller units (MCUs) allocated to each connector worker. The valid values are 1,2,4,8.
    */
  var mcuCount: integerMin1Max8
  
  /**
    * The target minimum number of workers allocated to the connector.
    */
  var minWorkerCount: integerMin1Max10
  
  /**
    * The target sacle-in policy for the connector.
    */
  var scaleInPolicy: ScaleInPolicyUpdate
  
  /**
    * The target sacle-out policy for the connector.
    */
  var scaleOutPolicy: ScaleOutPolicyUpdate
}
object AutoScalingUpdate {
  
  inline def apply(
    maxWorkerCount: integerMin1Max10,
    mcuCount: integerMin1Max8,
    minWorkerCount: integerMin1Max10,
    scaleInPolicy: ScaleInPolicyUpdate,
    scaleOutPolicy: ScaleOutPolicyUpdate
  ): AutoScalingUpdate = {
    val __obj = js.Dynamic.literal(maxWorkerCount = maxWorkerCount.asInstanceOf[js.Any], mcuCount = mcuCount.asInstanceOf[js.Any], minWorkerCount = minWorkerCount.asInstanceOf[js.Any], scaleInPolicy = scaleInPolicy.asInstanceOf[js.Any], scaleOutPolicy = scaleOutPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingUpdate]
  }
  
  extension [Self <: AutoScalingUpdate](x: Self) {
    
    inline def setMaxWorkerCount(value: integerMin1Max10): Self = StObject.set(x, "maxWorkerCount", value.asInstanceOf[js.Any])
    
    inline def setMcuCount(value: integerMin1Max8): Self = StObject.set(x, "mcuCount", value.asInstanceOf[js.Any])
    
    inline def setMinWorkerCount(value: integerMin1Max10): Self = StObject.set(x, "minWorkerCount", value.asInstanceOf[js.Any])
    
    inline def setScaleInPolicy(value: ScaleInPolicyUpdate): Self = StObject.set(x, "scaleInPolicy", value.asInstanceOf[js.Any])
    
    inline def setScaleOutPolicy(value: ScaleOutPolicyUpdate): Self = StObject.set(x, "scaleOutPolicy", value.asInstanceOf[js.Any])
  }
}
