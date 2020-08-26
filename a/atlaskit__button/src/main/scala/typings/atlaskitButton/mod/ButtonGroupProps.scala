package typings.atlaskitButton.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonGroupProps extends js.Object {
  /** The appearance to apply to all buttons. */
  val appearance: js.UndefOr[ButtonAppearances] = js.native
  /** The buttons to render. */
  val children: ReactNode = js.native
}

object ButtonGroupProps {
  @scala.inline
  def apply(): ButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonGroupProps]
  }
  @scala.inline
  implicit class ButtonGroupPropsOps[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppearance(value: ButtonAppearances): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

