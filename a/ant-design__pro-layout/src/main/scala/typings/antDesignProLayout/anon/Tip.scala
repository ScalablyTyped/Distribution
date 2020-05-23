package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tip extends js.Object {
  var tip: js.UndefOr[String] = js.undefined
}

object Tip {
  @scala.inline
  def apply(tip: String = null): Tip = {
    val __obj = js.Dynamic.literal()
    if (tip != null) __obj.updateDynamic("tip")(tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tip]
  }
}

