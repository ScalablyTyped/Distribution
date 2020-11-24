package typings.antd.sliderMod

import typings.antd.antdBooleans.`true`
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderRangeProps extends SliderBaseProps {
  
  var defaultValue: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var handleStyle: js.UndefOr[js.Array[CSSProperties]] = js.native
  
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Tuple2[Double, Double], Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ js.Tuple2[Double, Double], Unit]] = js.native
  
  var range: `true` = js.native
  
  var trackStyle: js.UndefOr[js.Array[CSSProperties]] = js.native
  
  var value: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}
object SliderRangeProps {
  
  @scala.inline
  def apply(range: `true`): SliderRangeProps = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderRangeProps]
  }
  
  @scala.inline
  implicit class SliderRangePropsOps[Self <: SliderRangeProps] (val x: Self) extends AnyVal {
    
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
    def setRange(value: `true`): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: js.Tuple2[Double, Double]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setHandleStyleVarargs(value: CSSProperties*): Self = this.set("handleStyle", js.Array(value :_*))
    
    @scala.inline
    def setHandleStyle(value: js.Array[CSSProperties]): Self = this.set("handleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleStyle: Self = this.set("handleStyle", js.undefined)
    
    @scala.inline
    def setOnAfterChange(value: /* value */ js.Tuple2[Double, Double] => Unit): Self = this.set("onAfterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAfterChange: Self = this.set("onAfterChange", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ js.Tuple2[Double, Double] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setTrackStyleVarargs(value: CSSProperties*): Self = this.set("trackStyle", js.Array(value :_*))
    
    @scala.inline
    def setTrackStyle(value: js.Array[CSSProperties]): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    
    @scala.inline
    def setValue(value: js.Tuple2[Double, Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
