package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceState extends js.Object {
  /**
    * The state of the instance as a 16-bit unsigned integer.  The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and 65,535. These numerical values are used for internal purposes and should be ignored. The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.  The valid values for instance-state-code will all be in the range of the low byte and they are:    0 : pending     16 : running     32 : shutting-down     48 : terminated     64 : stopping     80 : stopped    You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
    */
  var Code: js.UndefOr[Integer] = js.native
  /**
    * The current state of the instance.
    */
  var Name: js.UndefOr[InstanceStateName] = js.native
}

object InstanceState {
  @scala.inline
  def apply(Code: Int | scala.Double = null, Name: InstanceStateName = null): InstanceState = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceState]
  }
}

