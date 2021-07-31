package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.colorsMod.PresetColorType
import typings.antd.typeMod.LiteralUnion
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ribbonMod extends Shortcut {
  
  @JSImport("antd/lib/badge/Ribbon", JSImport.Default)
  @js.native
  val default: FC[RibbonProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.start
    - typings.antd.antdStrings.end
  */
  trait RibbonPlacement extends StObject
  object RibbonPlacement {
    
    @scala.inline
    def end: typings.antd.antdStrings.end = "end".asInstanceOf[typings.antd.antdStrings.end]
    
    @scala.inline
    def start: typings.antd.antdStrings.start = "start".asInstanceOf[typings.antd.antdStrings.start]
  }
  
  trait RibbonProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[LiteralUnion[PresetColorType, String]] = js.undefined
    
    var placement: js.UndefOr[RibbonPlacement] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var text: js.UndefOr[ReactNode] = js.undefined
  }
  object RibbonProps {
    
    @scala.inline
    def apply(): RibbonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RibbonProps]
    }
    
    @scala.inline
    implicit class RibbonPropsMutableBuilder[Self <: RibbonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: LiteralUnion[PresetColorType, String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setPlacement(value: RibbonPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type _To = FC[RibbonProps]
  
  /* This means you don't have to write `default`, but can instead just say `ribbonMod.foo` */
  override def _to: FC[RibbonProps] = default
}
