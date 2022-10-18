package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetAttributesInput extends StObject {
  
  /**
    * A list of unique fleet identifiers to retrieve attributes for. You can use either the fleet ID or ARN value. To retrieve attributes for all current fleets, do not include this parameter. 
    */
  var FleetIds: js.UndefOr[FleetIdOrArnList] = js.undefined
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is ignored when the request specifies one or a list of fleet IDs.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value. This parameter is ignored when the request specifies one or a list of fleet IDs.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeFleetAttributesInput {
  
  inline def apply(): DescribeFleetAttributesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAttributesInput]
  }
  
  extension [Self <: DescribeFleetAttributesInput](x: Self) {
    
    inline def setFleetIds(value: FleetIdOrArnList): Self = StObject.set(x, "FleetIds", value.asInstanceOf[js.Any])
    
    inline def setFleetIdsUndefined: Self = StObject.set(x, "FleetIds", js.undefined)
    
    inline def setFleetIdsVarargs(value: FleetIdOrArn*): Self = StObject.set(x, "FleetIds", js.Array(value*))
    
    inline def setLimit(value: PositiveInteger): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
