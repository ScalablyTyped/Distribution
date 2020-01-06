package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQueuesResponse extends js.Object {
  /**
    * Use this string to request the next batch of queues.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * List of queues.
    */
  var Queues: js.UndefOr[__listOfQueue] = js.native
}

object ListQueuesResponse {
  @scala.inline
  def apply(NextToken: __string = null, Queues: __listOfQueue = null): ListQueuesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Queues != null) __obj.updateDynamic("Queues")(Queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesResponse]
  }
}

