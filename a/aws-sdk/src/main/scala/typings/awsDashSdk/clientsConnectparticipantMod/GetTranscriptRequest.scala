package typings.awsDashSdk.clientsConnectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTranscriptRequest extends js.Object {
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken = js.native
  /**
    * The contactId from the current contact chain for which transcript is needed.
    */
  var ContactId: js.UndefOr[typings.awsDashSdk.clientsConnectparticipantMod.ContactId] = js.native
  /**
    * The maximum number of results to return in the page. Default: 10. 
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsConnectparticipantMod.MaxResults] = js.native
  /**
    * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectparticipantMod.NextToken] = js.native
  /**
    * The direction from StartPosition from which to retrieve message. Default: BACKWARD when no StartPosition is provided, FORWARD with StartPosition. 
    */
  var ScanDirection: js.UndefOr[typings.awsDashSdk.clientsConnectparticipantMod.ScanDirection] = js.native
  /**
    * The sort order for the records. Default: DESCENDING.
    */
  var SortOrder: js.UndefOr[SortKey] = js.native
  /**
    * A filtering option for where to start.
    */
  var StartPosition: js.UndefOr[typings.awsDashSdk.clientsConnectparticipantMod.StartPosition] = js.native
}

object GetTranscriptRequest {
  @scala.inline
  def apply(
    ConnectionToken: ParticipantToken,
    ContactId: ContactId = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    ScanDirection: ScanDirection = null,
    SortOrder: SortKey = null,
    StartPosition: StartPosition = null
  ): GetTranscriptRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any])
    if (ContactId != null) __obj.updateDynamic("ContactId")(ContactId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScanDirection != null) __obj.updateDynamic("ScanDirection")(ScanDirection.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    if (StartPosition != null) __obj.updateDynamic("StartPosition")(StartPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTranscriptRequest]
  }
}

