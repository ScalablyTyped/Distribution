package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libConfigProviderSizeContextMod.SizeType
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonButtonGroupMod extends Shortcut {
  
  @JSImport("antd/lib/button/button-group", JSImport.Default)
  @js.native
  val default: FC[ButtonGroupProps] = js.native
  
  @JSImport("antd/lib/button/button-group", "GroupSizeContext")
  @js.native
  val GroupSizeContext: Context[SizeType] = js.native
  
  trait ButtonGroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ButtonGroupProps {
    
    inline def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
    
    extension [Self <: ButtonGroupProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[ButtonGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `libButtonButtonGroupMod.foo` */
  override def _to: FC[ButtonGroupProps] = default
}
