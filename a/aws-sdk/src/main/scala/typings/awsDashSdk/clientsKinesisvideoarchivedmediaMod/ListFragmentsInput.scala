package typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFragmentsInput extends js.Object {
  /**
    * Describes the timestamp range and timestamp origin for the range of fragments to return.
    */
  var FragmentSelector: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod.FragmentSelector] = js.native
  /**
    * The total number of fragments to return. If the total number of fragments available is more than the value specified in max-results, then a ListFragmentsOutput$NextToken is provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[PageLimit] = js.native
  /**
    * A token to specify where to start paginating. This is the ListFragmentsOutput$NextToken from a previously truncated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name of the stream from which to retrieve a fragment list.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod.StreamName = js.native
}

object ListFragmentsInput {
  @scala.inline
  def apply(
    StreamName: StreamName,
    FragmentSelector: FragmentSelector = null,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): ListFragmentsInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    if (FragmentSelector != null) __obj.updateDynamic("FragmentSelector")(FragmentSelector.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFragmentsInput]
  }
}

