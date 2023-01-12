package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetLocationCapacityOutput extends StObject {
  
  /**
    * Resource capacity information for the requested fleet location. Capacity objects are returned only for fleets and locations that currently exist.
    */
  var FleetCapacity: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetCapacity] = js.undefined
}
object DescribeFleetLocationCapacityOutput {
  
  inline def apply(): DescribeFleetLocationCapacityOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetLocationCapacityOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFleetLocationCapacityOutput] (val x: Self) extends AnyVal {
    
    inline def setFleetCapacity(value: FleetCapacity): Self = StObject.set(x, "FleetCapacity", value.asInstanceOf[js.Any])
    
    inline def setFleetCapacityUndefined: Self = StObject.set(x, "FleetCapacity", js.undefined)
  }
}
