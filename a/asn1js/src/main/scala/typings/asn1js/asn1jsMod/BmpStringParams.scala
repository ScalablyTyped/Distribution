package typings.asn1js.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BmpStringParams extends js.Object {
  var value: js.UndefOr[String] = js.undefined
}

object BmpStringParams {
  @scala.inline
  def apply(value: String = null): BmpStringParams = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BmpStringParams]
  }
}

