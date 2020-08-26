package typings.antd.stepsMod

import typings.antd.progressProgressMod.ProgressProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepsProps extends ProgressProps {
  @JSName("steps")
  var steps_StepsProps: Double = js.native
  @JSName("strokeColor")
  var strokeColor_StepsProps: js.UndefOr[String] = js.native
}

object StepsProps {
  @scala.inline
  def apply(steps: Double): StepsProps = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
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
    def setSteps(value: Double): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
  }
  
}

