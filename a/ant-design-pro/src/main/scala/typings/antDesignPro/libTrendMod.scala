package typings.antDesignPro

import typings.antDesignPro.antDesignProStrings.down
import typings.antDesignPro.antDesignProStrings.up
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTrendMod {
  
  @JSImport("ant-design-pro/lib/Trend", JSImport.Default)
  @js.native
  open class default () extends Component[ITrendProps, Any, Any]
  
  trait ITrendProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var colorful: js.UndefOr[Boolean] = js.undefined
    
    var flag: up | down
    
    var reverseColor: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ITrendProps {
    
    inline def apply(flag: up | down): ITrendProps = {
      val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITrendProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITrendProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColorful(value: Boolean): Self = StObject.set(x, "colorful", value.asInstanceOf[js.Any])
      
      inline def setColorfulUndefined: Self = StObject.set(x, "colorful", js.undefined)
      
      inline def setFlag(value: up | down): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setReverseColor(value: Boolean): Self = StObject.set(x, "reverseColor", value.asInstanceOf[js.Any])
      
      inline def setReverseColorUndefined: Self = StObject.set(x, "reverseColor", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type Trend = Component[ITrendProps, Any, Any]
}
