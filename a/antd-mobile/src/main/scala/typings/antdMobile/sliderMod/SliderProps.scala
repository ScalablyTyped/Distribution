package typings.antdMobile.sliderMod

import org.scalablytyped.runtime.NumberDictionary
import typings.antdMobile.sliderPropsTypeMod.SliderPropsType
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderProps extends SliderPropsType {
  var dots: js.UndefOr[Boolean] = js.native
  var handleStyle: js.UndefOr[CSSProperties] = js.native
  var included: js.UndefOr[Boolean] = js.native
  var marks: js.UndefOr[NumberDictionary[String]] = js.native
  var maximumTrackStyle: js.UndefOr[CSSProperties] = js.native
  var minimumTrackStyle: js.UndefOr[CSSProperties] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var railStyle: js.UndefOr[CSSProperties] = js.native
  var trackStyle: js.UndefOr[CSSProperties] = js.native
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
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setHandleStyle(value: CSSProperties): Self = this.set("handleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleStyle: Self = this.set("handleStyle", js.undefined)
    @scala.inline
    def setIncluded(value: Boolean): Self = this.set("included", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncluded: Self = this.set("included", js.undefined)
    @scala.inline
    def setMarks(value: NumberDictionary[String]): Self = this.set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    @scala.inline
    def setMaximumTrackStyle(value: CSSProperties): Self = this.set("maximumTrackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumTrackStyle: Self = this.set("maximumTrackStyle", js.undefined)
    @scala.inline
    def setMinimumTrackStyle(value: CSSProperties): Self = this.set("minimumTrackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumTrackStyle: Self = this.set("minimumTrackStyle", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRailStyle(value: CSSProperties): Self = this.set("railStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRailStyle: Self = this.set("railStyle", js.undefined)
    @scala.inline
    def setTrackStyle(value: CSSProperties): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
  }
  
}

