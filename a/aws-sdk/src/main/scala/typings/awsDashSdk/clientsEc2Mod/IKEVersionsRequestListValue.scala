package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKEVersionsRequestListValue extends js.Object {
  /**
    * The IKE version.
    */
  var Value: js.UndefOr[String] = js.native
}

object IKEVersionsRequestListValue {
  @scala.inline
  def apply(Value: String = null): IKEVersionsRequestListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKEVersionsRequestListValue]
  }
}

