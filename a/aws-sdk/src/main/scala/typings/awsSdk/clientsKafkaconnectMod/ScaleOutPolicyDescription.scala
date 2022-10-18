package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleOutPolicyDescription extends StObject {
  
  /**
    * The CPU utilization percentage threshold at which you want connector scale out to be triggered.
    */
  var cpuUtilizationPercentage: js.UndefOr[integer] = js.undefined
}
object ScaleOutPolicyDescription {
  
  inline def apply(): ScaleOutPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleOutPolicyDescription]
  }
  
  extension [Self <: ScaleOutPolicyDescription](x: Self) {
    
    inline def setCpuUtilizationPercentage(value: integer): Self = StObject.set(x, "cpuUtilizationPercentage", value.asInstanceOf[js.Any])
    
    inline def setCpuUtilizationPercentageUndefined: Self = StObject.set(x, "cpuUtilizationPercentage", js.undefined)
  }
}
