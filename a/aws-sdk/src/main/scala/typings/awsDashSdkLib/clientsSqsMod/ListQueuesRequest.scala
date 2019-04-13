package typings
package awsDashSdkLib.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueuesRequest extends js.Object {
  /**
    * A string to use for filtering the list results. Only those queues whose name begins with the specified string are returned. Queue URLs and names are case-sensitive.
    */
  var QueueNamePrefix: js.UndefOr[String] = js.undefined
}

object ListQueuesRequest {
  @scala.inline
  def apply(QueueNamePrefix: String = null): ListQueuesRequest = {
    val __obj = js.Dynamic.literal()
    if (QueueNamePrefix != null) __obj.updateDynamic("QueueNamePrefix")(QueueNamePrefix)
    __obj.asInstanceOf[ListQueuesRequest]
  }
}

