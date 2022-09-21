package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.center
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.left
import typings.antd.antdStrings.right
import typings.antd.antdStrings.vertical
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerMod extends Shortcut {
  
  @JSImport("antd/lib/divider", JSImport.Default)
  @js.native
  val default: FC[DividerProps] = js.native
  
  trait DividerProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dashed: js.UndefOr[Boolean] = js.undefined
    
    var orientation: js.UndefOr[left | right | center] = js.undefined
    
    var orientationMargin: js.UndefOr[String | Double] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var `type`: js.UndefOr[horizontal | vertical] = js.undefined
  }
  object DividerProps {
    
    inline def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
    
    extension [Self <: DividerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDashed(value: Boolean): Self = StObject.set(x, "dashed", value.asInstanceOf[js.Any])
      
      inline def setDashedUndefined: Self = StObject.set(x, "dashed", js.undefined)
      
      inline def setOrientation(value: left | right | center): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationMargin(value: String | Double): Self = StObject.set(x, "orientationMargin", value.asInstanceOf[js.Any])
      
      inline def setOrientationMarginUndefined: Self = StObject.set(x, "orientationMargin", js.undefined)
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: horizontal | vertical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = FC[DividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `dividerMod.foo` */
  override def _to: FC[DividerProps] = default
}
