package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cipher extends js.Object {
  /**
    * The name of the cipher.
    */
  var Name: js.UndefOr[CipherName] = js.undefined
  /**
    * The priority of the cipher.
    */
  var Priority: js.UndefOr[CipherPriority] = js.undefined
}

object Cipher {
  @scala.inline
  def apply(Name: CipherName = null, Priority: js.UndefOr[CipherPriority] = js.undefined): Cipher = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    __obj.asInstanceOf[Cipher]
  }
}

