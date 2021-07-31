package typings.antDesignPro

import typings.antDesignPro.anon.X
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barMod {
  
  @JSImport("ant-design-pro/lib/Charts/Bar", JSImport.Default)
  @js.native
  class default ()
    extends Component[IBarProps, js.Any, js.Any]
  
  type Bar = Component[IBarProps, js.Any, js.Any]
  
  trait IBarProps extends StObject {
    
    var autoLabel: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var data: js.Array[X]
    
    var height: Double
    
    var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: ReactNode
  }
  object IBarProps {
    
    @scala.inline
    def apply(data: js.Array[X], height: Double): IBarProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBarProps]
    }
    
    @scala.inline
    implicit class IBarPropsMutableBuilder[Self <: IBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoLabel(value: Boolean): Self = StObject.set(x, "autoLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoLabelUndefined: Self = StObject.set(x, "autoLabel", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[X]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: X*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
