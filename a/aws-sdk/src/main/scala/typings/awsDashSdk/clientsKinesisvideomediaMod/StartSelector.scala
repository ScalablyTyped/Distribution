package typings.awsDashSdk.clientsKinesisvideomediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSelector extends js.Object {
  /**
    * Specifies the fragment number from where you want the GetMedia API to start returning the fragments. 
    */
  var AfterFragmentNumber: js.UndefOr[FragmentNumberString] = js.native
  /**
    * Continuation token that Kinesis Video Streams returned in the previous GetMedia response. The GetMedia API then starts with the chunk identified by the continuation token.
    */
  var ContinuationToken: js.UndefOr[typings.awsDashSdk.clientsKinesisvideomediaMod.ContinuationToken] = js.native
  /**
    * Identifies the fragment on the Kinesis video stream where you want to start getting the data from.   NOW - Start with the latest chunk on the stream.   EARLIEST - Start with earliest available chunk on the stream.   FRAGMENT_NUMBER - Start with the chunk after a specific fragment. You must also specify the AfterFragmentNumber parameter.   PRODUCER_TIMESTAMP or SERVER_TIMESTAMP - Start with the chunk containing a fragment with the specified producer or server timestamp. You specify the timestamp by adding StartTimestamp.    CONTINUATION_TOKEN - Read using the specified continuation token.     If you choose the NOW, EARLIEST, or CONTINUATION_TOKEN as the startSelectorType, you don't provide any additional information in the startSelector. 
    */
  var StartSelectorType: typings.awsDashSdk.clientsKinesisvideomediaMod.StartSelectorType = js.native
  /**
    * A timestamp value. This value is required if you choose the PRODUCER_TIMESTAMP or the SERVER_TIMESTAMP as the startSelectorType. The GetMedia API then starts with the chunk containing the fragment that has the specified timestamp.
    */
  var StartTimestamp: js.UndefOr[Timestamp] = js.native
}

object StartSelector {
  @scala.inline
  def apply(
    StartSelectorType: StartSelectorType,
    AfterFragmentNumber: FragmentNumberString = null,
    ContinuationToken: ContinuationToken = null,
    StartTimestamp: Timestamp = null
  ): StartSelector = {
    val __obj = js.Dynamic.literal(StartSelectorType = StartSelectorType.asInstanceOf[js.Any])
    if (AfterFragmentNumber != null) __obj.updateDynamic("AfterFragmentNumber")(AfterFragmentNumber.asInstanceOf[js.Any])
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken.asInstanceOf[js.Any])
    if (StartTimestamp != null) __obj.updateDynamic("StartTimestamp")(StartTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSelector]
  }
}

