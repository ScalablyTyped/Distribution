package typings.antDesignPro.gaugeMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGaugeProps extends js.Object {
  var bgColor: js.UndefOr[Double] = js.native
  var color: js.UndefOr[String] = js.native
  var height: Double = js.native
  var percent: Double = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: ReactNode = js.native
}

object IGaugeProps {
  @scala.inline
  def apply(height: Double, percent: Double): IGaugeProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGaugeProps]
  }
  @scala.inline
  implicit class IGaugePropsOps[Self <: IGaugeProps] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgColor(value: Double): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

