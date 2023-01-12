package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetLocationAttributesInput extends StObject {
  
  /**
    * A unique identifier for the fleet to retrieve remote locations for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This limit is not currently enforced. 
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * A list of fleet locations to retrieve information for. Specify locations in the form of an Amazon Web Services Region code, such as us-west-2.
    */
  var Locations: js.UndefOr[LocationList] = js.undefined
  
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeFleetLocationAttributesInput {
  
  inline def apply(FleetId: FleetIdOrArn): DescribeFleetLocationAttributesInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetLocationAttributesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFleetLocationAttributesInput] (val x: Self) extends AnyVal {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: PositiveInteger): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setLocations(value: LocationList): Self = StObject.set(x, "Locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "Locations", js.undefined)
    
    inline def setLocationsVarargs(value: LocationStringModel*): Self = StObject.set(x, "Locations", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
