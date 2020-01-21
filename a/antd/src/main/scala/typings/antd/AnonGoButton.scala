package typings.antd

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGoButton extends js.Object {
  var goButton: js.UndefOr[ReactNode] = js.undefined
}

object AnonGoButton {
  @scala.inline
  def apply(goButton: ReactNode = null): AnonGoButton = {
    val __obj = js.Dynamic.literal()
    if (goButton != null) __obj.updateDynamic("goButton")(goButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGoButton]
  }
}

