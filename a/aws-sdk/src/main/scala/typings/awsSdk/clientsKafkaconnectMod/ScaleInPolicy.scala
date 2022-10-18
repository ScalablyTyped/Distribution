package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleInPolicy extends StObject {
  
  /**
    * Specifies the CPU utilization percentage threshold at which you want connector scale in to be triggered.
    */
  var cpuUtilizationPercentage: integerMin1Max100
}
object ScaleInPolicy {
  
  inline def apply(cpuUtilizationPercentage: integerMin1Max100): ScaleInPolicy = {
    val __obj = js.Dynamic.literal(cpuUtilizationPercentage = cpuUtilizationPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInPolicy]
  }
  
  extension [Self <: ScaleInPolicy](x: Self) {
    
    inline def setCpuUtilizationPercentage(value: integerMin1Max100): Self = StObject.set(x, "cpuUtilizationPercentage", value.asInstanceOf[js.Any])
  }
}
