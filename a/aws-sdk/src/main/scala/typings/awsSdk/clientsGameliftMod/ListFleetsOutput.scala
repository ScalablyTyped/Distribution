package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFleetsOutput extends StObject {
  
  /**
    * A set of fleet IDs that match the list request. You can retrieve additional information about all returned fleets by passing this result set to a DescribeFleetAttributes, DescribeFleetCapacity, or DescribeFleetUtilization call.
    */
  var FleetIds: js.UndefOr[FleetIdList] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object ListFleetsOutput {
  
  inline def apply(): ListFleetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFleetsOutput] (val x: Self) extends AnyVal {
    
    inline def setFleetIds(value: FleetIdList): Self = StObject.set(x, "FleetIds", value.asInstanceOf[js.Any])
    
    inline def setFleetIdsUndefined: Self = StObject.set(x, "FleetIds", js.undefined)
    
    inline def setFleetIdsVarargs(value: FleetId*): Self = StObject.set(x, "FleetIds", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
