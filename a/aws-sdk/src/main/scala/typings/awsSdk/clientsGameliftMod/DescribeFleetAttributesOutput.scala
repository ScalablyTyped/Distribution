package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetAttributesOutput extends StObject {
  
  /**
    * A collection of objects containing attribute metadata for each requested fleet ID. Attribute objects are returned only for fleets that currently exist.
    */
  var FleetAttributes: js.UndefOr[FleetAttributesList] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeFleetAttributesOutput {
  
  inline def apply(): DescribeFleetAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAttributesOutput]
  }
  
  extension [Self <: DescribeFleetAttributesOutput](x: Self) {
    
    inline def setFleetAttributes(value: FleetAttributesList): Self = StObject.set(x, "FleetAttributes", value.asInstanceOf[js.Any])
    
    inline def setFleetAttributesUndefined: Self = StObject.set(x, "FleetAttributes", js.undefined)
    
    inline def setFleetAttributesVarargs(value: FleetAttributes*): Self = StObject.set(x, "FleetAttributes", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
