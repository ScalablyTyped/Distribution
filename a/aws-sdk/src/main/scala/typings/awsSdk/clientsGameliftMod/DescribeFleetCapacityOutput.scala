package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetCapacityOutput extends StObject {
  
  /**
    * A collection of objects that contains capacity information for each requested fleet ID. Capacity objects are returned only for fleets that currently exist.
    */
  var FleetCapacity: js.UndefOr[FleetCapacityList] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeFleetCapacityOutput {
  
  inline def apply(): DescribeFleetCapacityOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetCapacityOutput]
  }
  
  extension [Self <: DescribeFleetCapacityOutput](x: Self) {
    
    inline def setFleetCapacity(value: FleetCapacityList): Self = StObject.set(x, "FleetCapacity", value.asInstanceOf[js.Any])
    
    inline def setFleetCapacityUndefined: Self = StObject.set(x, "FleetCapacity", js.undefined)
    
    inline def setFleetCapacityVarargs(value: FleetCapacity*): Self = StObject.set(x, "FleetCapacity", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
