package typings.antd.esListMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLocale extends js.Object {
  var emptyText: ReactNode | js.Function0[ReactNode]
}

object ListLocale {
  @scala.inline
  def apply(emptyText: ReactNode | js.Function0[ReactNode] = null): ListLocale = {
    val __obj = js.Dynamic.literal()
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLocale]
  }
}

