package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleInPolicyUpdate extends StObject {
  
  /**
    * The target CPU utilization percentage threshold at which you want connector scale in to be triggered.
    */
  var cpuUtilizationPercentage: integerMin1Max100
}
object ScaleInPolicyUpdate {
  
  inline def apply(cpuUtilizationPercentage: integerMin1Max100): ScaleInPolicyUpdate = {
    val __obj = js.Dynamic.literal(cpuUtilizationPercentage = cpuUtilizationPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInPolicyUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleInPolicyUpdate] (val x: Self) extends AnyVal {
    
    inline def setCpuUtilizationPercentage(value: integerMin1Max100): Self = StObject.set(x, "cpuUtilizationPercentage", value.asInstanceOf[js.Any])
  }
}
