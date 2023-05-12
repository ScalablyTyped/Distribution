package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPreviewRotationShiftsRequest extends StObject {
  
  /**
    * The date and time a rotation shift would end.
    */
  var EndTime: js.Date
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that can be specified in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.MaxResults] = js.undefined
  
  /**
    * The contacts that would be assigned to a rotation.
    */
  var Members: RotationPreviewMemberList
  
  /**
    * A token to start the list. This token is used to get the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about changes that would be made in a rotation override.
    */
  var Overrides: js.UndefOr[OverrideList] = js.undefined
  
  /**
    * Information about how long a rotation would last before restarting at the beginning of the shift order.
    */
  var Recurrence: RecurrenceSettings
  
  /**
    * The date and time a rotation would begin. The first shift is calculated from this date and time.
    */
  var RotationStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Used to filter the range of calculated shifts before sending the response back to the user. 
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time zone the rotation’s activity would be based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". 
    */
  var TimeZoneId: typings.awsSdk.clientsSsmcontactsMod.TimeZoneId
}
object ListPreviewRotationShiftsRequest {
  
  inline def apply(
    EndTime: js.Date,
    Members: RotationPreviewMemberList,
    Recurrence: RecurrenceSettings,
    TimeZoneId: TimeZoneId
  ): ListPreviewRotationShiftsRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Recurrence = Recurrence.asInstanceOf[js.Any], TimeZoneId = TimeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPreviewRotationShiftsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPreviewRotationShiftsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMembers(value: RotationPreviewMemberList): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: Member*): Self = StObject.set(x, "Members", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOverrides(value: OverrideList): Self = StObject.set(x, "Overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "Overrides", js.undefined)
    
    inline def setOverridesVarargs(value: PreviewOverride*): Self = StObject.set(x, "Overrides", js.Array(value*))
    
    inline def setRecurrence(value: RecurrenceSettings): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    inline def setRotationStartTime(value: js.Date): Self = StObject.set(x, "RotationStartTime", value.asInstanceOf[js.Any])
    
    inline def setRotationStartTimeUndefined: Self = StObject.set(x, "RotationStartTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTimeZoneId(value: TimeZoneId): Self = StObject.set(x, "TimeZoneId", value.asInstanceOf[js.Any])
  }
}
