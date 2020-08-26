package typings.antdMobileRn.stepsIndexNativeMod

import typings.antdMobileRn.stepsStyleIndexNativeMod.IStepsStyle
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepsNativeProps extends StepsProps {
  @JSName("styles")
  var styles_StepsNativeProps: js.UndefOr[IStepsStyle] = js.native
}

object StepsNativeProps {
  @scala.inline
  def apply(children: js.Array[ReactElement]): StepsNativeProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsNativeProps]
  }
  @scala.inline
  implicit class StepsNativePropsOps[Self <: StepsNativeProps] (val x: Self) extends AnyVal {
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
    def setStyles(value: IStepsStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

