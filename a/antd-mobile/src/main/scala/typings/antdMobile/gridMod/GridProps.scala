package typings.antdMobile.gridMod

import typings.antdMobile.gridPropsTypeMod.GridPropsType
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridProps extends GridPropsType {
  
  var activeClassName: js.UndefOr[String] = js.native
  
  var activeStyle: js.UndefOr[Boolean | CSSProperties] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var itemStyle: js.UndefOr[CSSProperties] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var square: js.UndefOr[Boolean] = js.native
}
object GridProps {
  
  @scala.inline
  def apply(): GridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps]
  }
  
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
    
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
    def setActiveClassName(value: String): Self = this.set("activeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveClassName: Self = this.set("activeClassName", js.undefined)
    
    @scala.inline
    def setActiveStyle(value: Boolean | CSSProperties): Self = this.set("activeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveStyle: Self = this.set("activeStyle", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setItemStyle(value: CSSProperties): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setSquare(value: Boolean): Self = this.set("square", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSquare: Self = this.set("square", js.undefined)
  }
}
