package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaImageState extends js.Object {
  /**
    * The state. The following are the possible values:    pending - AFI bitstream generation is in progress.    available - The AFI is available for use.    failed - AFI bitstream generation failed.    unavailable - The AFI is no longer available for use.  
    */
  var Code: js.UndefOr[FpgaImageStateCode] = js.native
  /**
    * If the state is failed, this is the error message.
    */
  var Message: js.UndefOr[String] = js.native
}

object FpgaImageState {
  @scala.inline
  def apply(Code: FpgaImageStateCode = null, Message: String = null): FpgaImageState = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[FpgaImageState]
  }
}

