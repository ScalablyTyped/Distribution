package typings
package asn1jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Result extends js.Object {
  var result: js.UndefOr[js.Any] = js.undefined
  var verified: scala.Boolean
}

object Anon_Result {
  @scala.inline
  def apply(verified: scala.Boolean, result: js.Any = null): Anon_Result = {
    val __obj = js.Dynamic.literal(verified = verified)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_Result]
  }
}

