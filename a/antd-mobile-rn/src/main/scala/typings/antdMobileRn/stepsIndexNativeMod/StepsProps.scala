package typings.antdMobileRn.stepsIndexNativeMod

import typings.antdMobileRn.antdMobileRnStrings.horizontal
import typings.antdMobileRn.antdMobileRnStrings.vertical
import typings.antdMobileRn.stepsPropsTypeMod.StepsPropsType
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepsProps extends StepsPropsType {
  @JSName("children")
  var children_StepsProps: js.Array[ReactElement] = js.native
  var direction: js.UndefOr[vertical | horizontal] = js.native
  var finishIcon: js.UndefOr[String] = js.native
  var styles: js.UndefOr[js.Any] = js.native
}

object StepsProps {
  @scala.inline
  def apply(children: js.Array[ReactElement]): StepsProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsProps]
  }
  @scala.inline
  implicit class StepsPropsOps[Self <: StepsProps] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: vertical | horizontal): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setFinishIcon(value: String): Self = this.set("finishIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishIcon: Self = this.set("finishIcon", js.undefined)
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

