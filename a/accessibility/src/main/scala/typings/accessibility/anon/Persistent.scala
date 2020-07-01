package typings.accessibility.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistent extends js.Object {
  /** @default true */
  var persistent: js.UndefOr[Boolean] = js.undefined
}

object Persistent {
  @scala.inline
  def apply(persistent: js.UndefOr[Boolean] = js.undefined): Persistent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persistent]
  }
}

