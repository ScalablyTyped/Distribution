package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PassthroughBoolean extends js.Object {
  /**
    * Passthrough the read values, by default it eats everything
    */
  var passthrough: js.UndefOr[Boolean] = js.undefined
}

object Anon_PassthroughBoolean {
  @scala.inline
  def apply(passthrough: js.UndefOr[Boolean] = js.undefined): Anon_PassthroughBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(passthrough)) __obj.updateDynamic("passthrough")(passthrough)
    __obj.asInstanceOf[Anon_PassthroughBoolean]
  }
}

