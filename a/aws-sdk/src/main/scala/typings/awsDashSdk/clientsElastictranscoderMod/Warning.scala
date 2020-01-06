package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Warning extends js.Object {
  /**
    * The code of the cross-regional warning.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The message explaining what resources are in a different region from the pipeline.  AWS KMS keys must be in the same region as the pipeline. 
    */
  var Message: js.UndefOr[String] = js.native
}

object Warning {
  @scala.inline
  def apply(Code: String = null, Message: String = null): Warning = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
}

