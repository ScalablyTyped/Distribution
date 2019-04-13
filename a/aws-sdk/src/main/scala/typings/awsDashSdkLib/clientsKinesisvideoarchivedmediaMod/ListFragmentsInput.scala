package typings
package awsDashSdkLib.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFragmentsInput extends js.Object {
  /**
    * Describes the timestamp range and timestamp origin for the range of fragments to return.
    */
  var FragmentSelector: js.UndefOr[FragmentSelector] = js.undefined
  /**
    * The total number of fragments to return. If the total number of fragments available is more than the value specified in max-results, then a ListFragmentsOutput$NextToken is provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[PageLimit] = js.undefined
  /**
    * A token to specify where to start paginating. This is the ListFragmentsOutput$NextToken from a previously truncated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the stream from which to retrieve a fragment list.
    */
  var StreamName: awsDashSdkLib.clientsKinesisvideoarchivedmediaMod.StreamName
}

object ListFragmentsInput {
  @scala.inline
  def apply(
    StreamName: StreamName,
    FragmentSelector: FragmentSelector = null,
    MaxResults: js.UndefOr[PageLimit] = js.undefined,
    NextToken: String = null
  ): ListFragmentsInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName)
    if (FragmentSelector != null) __obj.updateDynamic("FragmentSelector")(FragmentSelector)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFragmentsInput]
  }
}

