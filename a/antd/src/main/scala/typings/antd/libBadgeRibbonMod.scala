package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libUtilColorsMod.PresetColorType
import typings.antd.libUtilTypeMod.LiteralUnion
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBadgeRibbonMod extends Shortcut {
  
  @JSImport("antd/lib/badge/Ribbon", JSImport.Default)
  @js.native
  val default: FC[RibbonProps] = js.native
  
  object RibbonPlacement {
    
    inline def end: "end" = "end".asInstanceOf["end"]
    
    inline def start: "start" = "start".asInstanceOf["start"]
  }
  type RibbonPlacement = "start" | "end"
  
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
    
    inline def apply(): RibbonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RibbonProps]
    }
    
    extension [Self <: RibbonProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: LiteralUnion[PresetColorType, String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setPlacement(value: RibbonPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type _To = FC[RibbonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libBadgeRibbonMod.foo` */
  override def _to: FC[RibbonProps] = default
}
