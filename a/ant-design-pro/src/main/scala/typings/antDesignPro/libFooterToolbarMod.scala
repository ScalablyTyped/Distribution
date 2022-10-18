package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFooterToolbarMod {
  
  @JSImport("ant-design-pro/lib/FooterToolbar", JSImport.Default)
  @js.native
  open class default () extends Component[FooterToolbarProps, Any, Any]
  
  type FooterToolbar = Component[FooterToolbarProps, Any, Any]
  
  trait FooterToolbarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var extra: ReactNode
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FooterToolbarProps {
    
    inline def apply(): FooterToolbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterToolbarProps]
    }
    
    extension [Self <: FooterToolbarProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
