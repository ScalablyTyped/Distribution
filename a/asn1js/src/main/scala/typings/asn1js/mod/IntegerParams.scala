package typings.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerParams extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
}

object IntegerParams {
  @scala.inline
  def apply(value: js.UndefOr[Double] = js.undefined): IntegerParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParams]
  }
}

