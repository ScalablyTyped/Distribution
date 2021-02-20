package typings.antDesignPro

import typings.antDesignPro.anon.X
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pieMod {
  
  @JSImport("ant-design-pro/lib/Charts/Pie", JSImport.Default)
  @js.native
  class default ()
    extends Component[IPieProps, js.Any, js.Any]
  
  @js.native
  trait IPieProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var colors: js.UndefOr[js.Array[String]] = js.native
    
    var data: js.UndefOr[js.Array[X]] = js.native
    
    var hasLegend: js.UndefOr[Boolean] = js.native
    
    var height: Double = js.native
    
    var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
    
    var percent: js.UndefOr[Double] = js.native
    
    var subTitle: js.UndefOr[ReactNode] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
    
    var tooltip: js.UndefOr[Boolean] = js.native
    
    var total: js.UndefOr[ReactNode | Double | (js.Function0[ReactNode | Double])] = js.native
    
    var valueFormat: js.UndefOr[js.Function1[/* value */ String, String | ReactNode]] = js.native
  }
  object IPieProps {
    
    @scala.inline
    def apply(height: Double): IPieProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPieProps]
    }
    
    @scala.inline
    implicit class IPiePropsMutableBuilder[Self <: IPieProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[X]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: X*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHasLegend(value: Boolean): Self = StObject.set(x, "hasLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLegendUndefined: Self = StObject.set(x, "hasLegend", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setSubTitle(value: ReactNode): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTotal(value: ReactNode | Double | (js.Function0[ReactNode | Double])): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalFunction0(value: () => ReactNode | Double): Self = StObject.set(x, "total", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      @scala.inline
      def setValueFormat(value: /* value */ String => String | ReactNode): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    }
  }
  
  type Pie = Component[IPieProps, js.Any, js.Any]
}
