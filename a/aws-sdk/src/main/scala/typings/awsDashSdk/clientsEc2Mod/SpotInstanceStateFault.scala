package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotInstanceStateFault extends js.Object {
  /**
    * The reason code for the Spot Instance state change.
    */
  var Code: js.UndefOr[String] = js.undefined
  /**
    * The message for the Spot Instance state change.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object SpotInstanceStateFault {
  @scala.inline
  def apply(Code: String = null, Message: String = null): SpotInstanceStateFault = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[SpotInstanceStateFault]
  }
}

