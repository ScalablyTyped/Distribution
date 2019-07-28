package typings.atAtlaskitButton.atAtlaskitButtonMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  /** The appearance to apply to all buttons. */
  val appearance: js.UndefOr[ButtonAppearances] = js.undefined
  /** The buttons to render. */
  val children: ReactNode
}

object ButtonGroupProps {
  @scala.inline
  def apply(children: ReactNode, appearance: ButtonAppearances = null): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (appearance != null) __obj.updateDynamic("appearance")(appearance)
    __obj.asInstanceOf[ButtonGroupProps]
  }
}

