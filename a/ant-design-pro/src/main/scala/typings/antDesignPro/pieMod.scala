package typings.antDesignPro

import typings.antDesignPro.anon.X
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pieMod {
  
  @JSImport("ant-design-pro/lib/Charts/Pie", JSImport.Default)
  @js.native
  open class default () extends Component[IPieProps, Any, Any]
  
  trait IPieProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    var data: js.UndefOr[js.Array[X]] = js.undefined
    
    var hasLegend: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var subTitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var tooltip: js.UndefOr[Boolean] = js.undefined
    
    var total: js.UndefOr[ReactNode | Double | (js.Function0[ReactNode | Double])] = js.undefined
    
    var valueFormat: js.UndefOr[js.Function1[/* value */ String, String | ReactNode]] = js.undefined
  }
  object IPieProps {
    
    inline def apply(height: Double): IPieProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPieProps]
    }
    
    extension [Self <: IPieProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setData(value: js.Array[X]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: X*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHasLegend(value: Boolean): Self = StObject.set(x, "hasLegend", value.asInstanceOf[js.Any])
      
      inline def setHasLegendUndefined: Self = StObject.set(x, "hasLegend", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setSubTitle(value: ReactNode): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTotal(value: ReactNode | Double | (js.Function0[ReactNode | Double])): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalFunction0(value: () => ReactNode | Double): Self = StObject.set(x, "total", js.Any.fromFunction0(value))
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      inline def setValueFormat(value: /* value */ String => String | ReactNode): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    }
  }
  
  type Pie = Component[IPieProps, Any, Any]
}
