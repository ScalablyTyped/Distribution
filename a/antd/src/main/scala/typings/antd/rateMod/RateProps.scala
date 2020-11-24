package typings.antd.rateMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateProps extends js.Object {
  
  var allowClear: js.UndefOr[Boolean] = js.native
  
  var allowHalf: js.UndefOr[Boolean] = js.native
  
  var character: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var defaultValue: js.UndefOr[Double] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var onHoverChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tooltips: js.UndefOr[js.Array[String]] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object RateProps {
  
  @scala.inline
  def apply(): RateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateProps]
  }
  
  @scala.inline
  implicit class RatePropsOps[Self <: RateProps] (val x: Self) extends AnyVal {
    
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
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    
    @scala.inline
    def setAllowHalf(value: Boolean): Self = this.set("allowHalf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHalf: Self = this.set("allowHalf", js.undefined)
    
    @scala.inline
    def setCharacter(value: ReactNode): Self = this.set("character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacter: Self = this.set("character", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnHoverChange(value: /* value */ Double => Unit): Self = this.set("onHoverChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHoverChange: Self = this.set("onHoverChange", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTooltipsVarargs(value: String*): Self = this.set("tooltips", js.Array(value :_*))
    
    @scala.inline
    def setTooltips(value: js.Array[String]): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
