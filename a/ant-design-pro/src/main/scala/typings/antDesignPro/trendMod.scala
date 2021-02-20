package typings.antDesignPro

import typings.antDesignPro.antDesignProStrings.down
import typings.antDesignPro.antDesignProStrings.up
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trendMod {
  
  @JSImport("ant-design-pro/lib/Trend", JSImport.Default)
  @js.native
  class default ()
    extends Component[ITrendProps, js.Any, js.Any]
  
  @js.native
  trait ITrendProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var colorful: js.UndefOr[Boolean] = js.native
    
    var flag: up | down = js.native
    
    var reverseColor: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ITrendProps {
    
    @scala.inline
    def apply(flag: up | down): ITrendProps = {
      val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITrendProps]
    }
    
    @scala.inline
    implicit class ITrendPropsMutableBuilder[Self <: ITrendProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColorful(value: Boolean): Self = StObject.set(x, "colorful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorfulUndefined: Self = StObject.set(x, "colorful", js.undefined)
      
      @scala.inline
      def setFlag(value: up | down): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseColor(value: Boolean): Self = StObject.set(x, "reverseColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseColorUndefined: Self = StObject.set(x, "reverseColor", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type Trend = Component[ITrendProps, js.Any, js.Any]
}
