package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRotationShiftsRequest extends StObject {
  
  /**
    * The date and time for the end of the time range to list shifts for.
    */
  var EndTime: js.Date
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.MaxResults] = js.undefined
  
  /**
    * A token to start the list. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the rotation to retrieve shift information about. 
    */
  var RotationId: SsmContactsArn
  
  /**
    * The date and time for the beginning of the time range to list shifts for.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object ListRotationShiftsRequest {
  
  inline def apply(EndTime: js.Date, RotationId: SsmContactsArn): ListRotationShiftsRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], RotationId = RotationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRotationShiftsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRotationShiftsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRotationId(value: SsmContactsArn): Self = StObject.set(x, "RotationId", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
