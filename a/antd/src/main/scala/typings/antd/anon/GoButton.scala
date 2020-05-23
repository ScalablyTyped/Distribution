package typings.antd.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoButton extends js.Object {
  var goButton: js.UndefOr[ReactNode] = js.undefined
}

object GoButton {
  @scala.inline
  def apply(goButton: ReactNode = null): GoButton = {
    val __obj = js.Dynamic.literal()
    if (goButton != null) __obj.updateDynamic("goButton")(goButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoButton]
  }
}

