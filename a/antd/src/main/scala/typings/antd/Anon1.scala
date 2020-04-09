package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(visible: js.UndefOr[Boolean] = js.undefined): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

