package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miniProgressMod {
  
  @JSImport("ant-design-pro/lib/Charts/MiniProgress", JSImport.Default)
  @js.native
  class default ()
    extends Component[IMiniProgressProps, js.Any, js.Any]
  
  @js.native
  trait IMiniProgressProps extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var percent: js.UndefOr[Double] = js.native
    
    var strokeWidth: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var target: Double = js.native
    
    var targetLabel: String = js.native
  }
  object IMiniProgressProps {
    
    @scala.inline
    def apply(target: Double, targetLabel: String): IMiniProgressProps = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], targetLabel = targetLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMiniProgressProps]
    }
    
    @scala.inline
    implicit class IMiniProgressPropsMutableBuilder[Self <: IMiniProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetLabel(value: String): Self = StObject.set(x, "targetLabel", value.asInstanceOf[js.Any])
    }
  }
  
  type MiniProgress = Component[IMiniProgressProps, js.Any, js.Any]
}
