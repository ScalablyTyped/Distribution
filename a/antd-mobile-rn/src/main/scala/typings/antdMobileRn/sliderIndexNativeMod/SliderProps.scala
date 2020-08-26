package typings.antdMobileRn.sliderIndexNativeMod

import typings.antdMobileRn.sliderPropsTypeMod.SliderPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderProps extends SliderPropsType {
  var maximumTrackTintColor: js.UndefOr[String] = js.native
  var minimumTrackTintColor: js.UndefOr[String] = js.native
}

object SliderProps {
  @scala.inline
  def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  @scala.inline
  implicit class SliderPropsOps[Self <: SliderProps] (val x: Self) extends AnyVal {
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
    def setMaximumTrackTintColor(value: String): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumTrackTintColor: Self = this.set("maximumTrackTintColor", js.undefined)
    @scala.inline
    def setMinimumTrackTintColor(value: String): Self = this.set("minimumTrackTintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumTrackTintColor: Self = this.set("minimumTrackTintColor", js.undefined)
  }
  
}

