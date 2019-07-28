package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndBoolean extends js.Object {
  var end: js.UndefOr[Boolean] = js.undefined
}

object Anon_EndBoolean {
  @scala.inline
  def apply(end: js.UndefOr[Boolean] = js.undefined): Anon_EndBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    __obj.asInstanceOf[Anon_EndBoolean]
  }
}

