package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueuesResult extends js.Object {
  /**
    * A list of queue URLs, up to 1,000 entries.
    */
  var QueueUrls: js.UndefOr[QueueUrlList] = js.undefined
}

object ListQueuesResult {
  @scala.inline
  def apply(QueueUrls: QueueUrlList = null): ListQueuesResult = {
    val __obj = js.Dynamic.literal()
    if (QueueUrls != null) __obj.updateDynamic("QueueUrls")(QueueUrls)
    __obj.asInstanceOf[ListQueuesResult]
  }
}

