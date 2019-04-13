package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueuesResponse extends js.Object {
  /**
    * Use this string to request the next batch of queues.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * List of queues.
    */
  var Queues: js.UndefOr[__listOfQueue] = js.undefined
}

object ListQueuesResponse {
  @scala.inline
  def apply(NextToken: __string = null, Queues: __listOfQueue = null): ListQueuesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Queues != null) __obj.updateDynamic("Queues")(Queues)
    __obj.asInstanceOf[ListQueuesResponse]
  }
}

