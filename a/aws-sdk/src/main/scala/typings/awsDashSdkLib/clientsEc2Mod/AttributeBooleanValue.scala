package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeBooleanValue extends js.Object {
  /**
    * The attribute value. The valid values are true or false.
    */
  var Value: js.UndefOr[Boolean] = js.undefined
}

object AttributeBooleanValue {
  @scala.inline
  def apply(Value: js.UndefOr[Boolean] = js.undefined): AttributeBooleanValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[AttributeBooleanValue]
  }
}

