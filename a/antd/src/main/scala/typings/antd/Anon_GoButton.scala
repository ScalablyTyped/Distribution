package typings.antd

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GoButton extends js.Object {
  var goButton: js.UndefOr[ReactNode] = js.undefined
}

object Anon_GoButton {
  @scala.inline
  def apply(goButton: ReactNode = null): Anon_GoButton = {
    val __obj = js.Dynamic.literal()
    if (goButton != null) __obj.updateDynamic("goButton")(goButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GoButton]
  }
}

