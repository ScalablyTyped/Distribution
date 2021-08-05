package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeEnvironmentOrder extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironment: String
  
  /**
    * The order of the compute environment.
    */
  var order: Integer
}
object ComputeEnvironmentOrder {
  
  inline def apply(computeEnvironment: String, order: Integer): ComputeEnvironmentOrder = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentOrder]
  }
  
  extension [Self <: ComputeEnvironmentOrder](x: Self) {
    
    inline def setComputeEnvironment(value: String): Self = StObject.set(x, "computeEnvironment", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Integer): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
