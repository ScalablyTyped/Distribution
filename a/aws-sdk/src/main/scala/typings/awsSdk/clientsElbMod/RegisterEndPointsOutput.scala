package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterEndPointsOutput extends StObject {
  
  /**
    * The updated list of instances for the load balancer.
    */
  var Instances: js.UndefOr[typings.awsSdk.clientsElbMod.Instances] = js.undefined
}
object RegisterEndPointsOutput {
  
  inline def apply(): RegisterEndPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterEndPointsOutput]
  }
  
  extension [Self <: RegisterEndPointsOutput](x: Self) {
    
    inline def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
  }
}
