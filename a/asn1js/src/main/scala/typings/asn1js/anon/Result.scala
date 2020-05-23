package typings.asn1js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var result: js.UndefOr[js.Any] = js.undefined
  var verified: Boolean
}

object Result {
  @scala.inline
  def apply(verified: Boolean, result: js.Any = null): Result = {
    val __obj = js.Dynamic.literal(verified = verified.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

