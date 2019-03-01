package typings
package atAtlaskitButtonLib.atAtlaskitButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps extends js.Object {
  /** The appearance to apply to all buttons. */
  val appearance: js.UndefOr[ButtonAppearances] = js.undefined
  /** The buttons to render. */
  val children: reactLib.reactMod.ReactNs.ReactNode
}

object ButtonGroupProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNs.ReactNode, appearance: ButtonAppearances = null): ButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (appearance != null) __obj.updateDynamic("appearance")(appearance)
    __obj.asInstanceOf[ButtonGroupProps]
  }
}

