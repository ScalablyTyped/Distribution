package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSmartHomeAppliancesRequest extends StObject {
  
  /**
    * The maximum number of appliances to be returned, per paginated calls.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.MaxResults] = js.undefined
  
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The room that the appliances are associated with.
    */
  var RoomArn: Arn
}
object ListSmartHomeAppliancesRequest {
  
  inline def apply(RoomArn: Arn): ListSmartHomeAppliancesRequest = {
    val __obj = js.Dynamic.literal(RoomArn = RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSmartHomeAppliancesRequest]
  }
  
  extension [Self <: ListSmartHomeAppliancesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
  }
}
