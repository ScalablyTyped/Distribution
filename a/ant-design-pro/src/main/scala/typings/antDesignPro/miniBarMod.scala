package typings.antDesignPro

import typings.antDesignPro.anon.Y
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miniBarMod {
  
  @JSImport("ant-design-pro/lib/Charts/MiniBar", JSImport.Default)
  @js.native
  class default ()
    extends Component[IMiniBarProps, js.Any, js.Any]
  
  @js.native
  trait IMiniBarProps extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var data: js.Array[Y] = js.native
    
    var height: Double = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object IMiniBarProps {
    
    @scala.inline
    def apply(data: js.Array[Y], height: Double): IMiniBarProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMiniBarProps]
    }
    
    @scala.inline
    implicit class IMiniBarPropsMutableBuilder[Self <: IMiniBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[Y]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: Y*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type MiniBar = Component[IMiniBarProps, js.Any, js.Any]
}
