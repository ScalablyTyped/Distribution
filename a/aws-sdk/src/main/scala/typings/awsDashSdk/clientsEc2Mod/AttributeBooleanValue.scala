package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeBooleanValue extends js.Object {
  /**
    * The attribute value. The valid values are true or false.
    */
  var Value: js.UndefOr[Boolean] = js.native
}

object AttributeBooleanValue {
  @scala.inline
  def apply(Value: js.UndefOr[scala.Boolean] = js.undefined): AttributeBooleanValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeBooleanValue]
  }
}

