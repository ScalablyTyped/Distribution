package typings.antDesignPro

import typings.antDesignPro.anon.Y1
import typings.antDesignPro.anon.Y2
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartsTimelineChartMod {
  
  @JSImport("ant-design-pro/lib/Charts/TimelineChart", JSImport.Default)
  @js.native
  open class default () extends Component[ITimelineChartProps, Any, Any]
  
  trait ITimelineChartProps extends StObject {
    
    var data: js.Array[Y1]
    
    var height: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var titleMap: Y2
  }
  object ITimelineChartProps {
    
    inline def apply(data: js.Array[Y1], titleMap: Y2): ITimelineChartProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], titleMap = titleMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimelineChartProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITimelineChartProps] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[Y1]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Y1*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitleMap(value: Y2): Self = StObject.set(x, "titleMap", value.asInstanceOf[js.Any])
    }
  }
  
  type TimelineChart = Component[ITimelineChartProps, Any, Any]
}
