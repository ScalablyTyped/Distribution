package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libCollapseCollapsePanelMod.CollapsePanelProps
import typings.antd.libCollapseCollapsePanelMod.CollapsibleType
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCollapseCollapseMod extends Shortcut {
  
  @JSImport("antd/lib/collapse/Collapse", JSImport.Default)
  @js.native
  val default: CollapseInterface = js.native
  
  @js.native
  trait CollapseInterface
    extends StObject
       with FunctionComponent[CollapseProps] {
    
    var Panel: FC[CollapsePanelProps] = js.native
  }
  
  trait CollapseProps extends StObject {
    
    /** 手风琴效果 */
    var accordion: js.UndefOr[Boolean] = js.undefined
    
    var activeKey: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.undefined
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var collapsible: js.UndefOr[CollapsibleType] = js.undefined
    
    var defaultActiveKey: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.undefined
    
    var destroyInactivePanel: js.UndefOr[Boolean] = js.undefined
    
    var expandIcon: js.UndefOr[js.Function1[/* panelProps */ PanelProps, ReactNode]] = js.undefined
    
    var expandIconPosition: js.UndefOr[ExpandIconPosition] = js.undefined
    
    var ghost: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* key */ String | js.Array[String], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CollapseProps {
    
    inline def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    extension [Self <: CollapseProps](x: Self) {
      
      inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      inline def setActiveKey(value: (js.Array[String | Double]) | String | Double): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setActiveKeyVarargs(value: (String | Double)*): Self = StObject.set(x, "activeKey", js.Array(value*))
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setDefaultActiveKey(value: (js.Array[String | Double]) | String | Double): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      inline def setDefaultActiveKeyVarargs(value: (String | Double)*): Self = StObject.set(x, "defaultActiveKey", js.Array(value*))
      
      inline def setDestroyInactivePanel(value: Boolean): Self = StObject.set(x, "destroyInactivePanel", value.asInstanceOf[js.Any])
      
      inline def setDestroyInactivePanelUndefined: Self = StObject.set(x, "destroyInactivePanel", js.undefined)
      
      inline def setExpandIcon(value: /* panelProps */ PanelProps => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconPosition(value: ExpandIconPosition): Self = StObject.set(x, "expandIconPosition", value.asInstanceOf[js.Any])
      
      inline def setExpandIconPositionUndefined: Self = StObject.set(x, "expandIconPosition", js.undefined)
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
      
      inline def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
      
      inline def setOnChange(value: /* key */ String | js.Array[String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.start
    - typings.antd.antdStrings.end
    - typings.antd.libCollapseCollapseMod.ExpandIconPositionLegacy
    - scala.Unit
  */
  type ExpandIconPosition = js.UndefOr[_ExpandIconPosition]
  
  /** @deprecated Please use `start` | `end` instead */
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.left
    - typings.antd.antdStrings.right
  */
  trait ExpandIconPositionLegacy
    extends StObject
       with _ExpandIconPosition
  object ExpandIconPositionLegacy {
    
    inline def left: typings.antd.antdStrings.left = "left".asInstanceOf[typings.antd.antdStrings.left]
    
    inline def right: typings.antd.antdStrings.right = "right".asInstanceOf[typings.antd.antdStrings.right]
  }
  
  trait PanelProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var collapsible: js.UndefOr[CollapsibleType] = js.undefined
    
    /** @deprecated Use `collapsible="disabled"` instead */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[ReactNode] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PanelProps {
    
    inline def apply(): PanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelProps]
    }
    
    extension [Self <: PanelProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait _ExpandIconPosition extends StObject
  
  type _To = CollapseInterface
  
  /* This means you don't have to write `default`, but can instead just say `libCollapseCollapseMod.foo` */
  override def _to: CollapseInterface = default
}
