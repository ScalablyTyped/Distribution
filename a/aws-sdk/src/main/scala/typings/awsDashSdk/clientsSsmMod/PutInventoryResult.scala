package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutInventoryResult extends js.Object {
  /**
    * Information about the request.
    */
  var Message: js.UndefOr[PutInventoryMessage] = js.undefined
}

object PutInventoryResult {
  @scala.inline
  def apply(Message: PutInventoryMessage = null): PutInventoryResult = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[PutInventoryResult]
  }
}

