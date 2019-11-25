package typings.asn1js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Result extends js.Object {
  var result: js.UndefOr[js.Any] = js.undefined
  var verified: Boolean
}

object Anon_Result {
  @scala.inline
  def apply(verified: Boolean, result: js.Any = null): Anon_Result = {
    val __obj = js.Dynamic.literal(verified = verified.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Result]
  }
}

