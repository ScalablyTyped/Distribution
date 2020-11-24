package typings.antd.collapseCollapseMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseProps extends js.Object {
  
  /** 手风琴效果 */
  var accordion: js.UndefOr[Boolean] = js.native
  
  var activeKey: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.native
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var defaultActiveKey: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.native
  
  var destroyInactivePanel: js.UndefOr[Boolean] = js.native
  
  var expandIcon: js.UndefOr[js.Function1[/* panelProps */ PanelProps, ReactNode]] = js.native
  
  var expandIconPosition: js.UndefOr[ExpandIconPosition] = js.native
  
  var ghost: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* key */ String | js.Array[String], Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object CollapseProps {
  
  @scala.inline
  def apply(): CollapseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseProps]
  }
  
  @scala.inline
  implicit class CollapsePropsOps[Self <: CollapseProps] (val x: Self) extends AnyVal {
    
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
    def setAccordion(value: Boolean): Self = this.set("accordion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccordion: Self = this.set("accordion", js.undefined)
    
    @scala.inline
    def setActiveKeyVarargs(value: (String | Double)*): Self = this.set("activeKey", js.Array(value :_*))
    
    @scala.inline
    def setActiveKey(value: (js.Array[String | Double]) | String | Double): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDefaultActiveKeyVarargs(value: (String | Double)*): Self = this.set("defaultActiveKey", js.Array(value :_*))
    
    @scala.inline
    def setDefaultActiveKey(value: (js.Array[String | Double]) | String | Double): Self = this.set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveKey: Self = this.set("defaultActiveKey", js.undefined)
    
    @scala.inline
    def setDestroyInactivePanel(value: Boolean): Self = this.set("destroyInactivePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyInactivePanel: Self = this.set("destroyInactivePanel", js.undefined)
    
    @scala.inline
    def setExpandIcon(value: /* panelProps */ PanelProps => ReactNode): Self = this.set("expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    
    @scala.inline
    def setExpandIconPosition(value: ExpandIconPosition): Self = this.set("expandIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandIconPosition: Self = this.set("expandIconPosition", js.undefined)
    
    @scala.inline
    def setGhost(value: Boolean): Self = this.set("ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGhost: Self = this.set("ghost", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* key */ String | js.Array[String] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
