package typings.atAntDashDesignProDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tip extends js.Object {
  var tip: js.UndefOr[String] = js.undefined
}

object Anon_Tip {
  @scala.inline
  def apply(tip: String = null): Anon_Tip = {
    val __obj = js.Dynamic.literal()
    if (tip != null) __obj.updateDynamic("tip")(tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Tip]
  }
}

