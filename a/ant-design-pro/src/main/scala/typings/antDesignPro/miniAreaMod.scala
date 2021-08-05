package typings.antDesignPro

import typings.antDesignPro.anon.Y
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miniAreaMod {
  
  @JSImport("ant-design-pro/lib/Charts/MiniArea", JSImport.Default)
  @js.native
  class default ()
    extends Component[IMiniAreaProps, js.Any, js.Any]
  
  trait IAxis extends StObject {
    
    var grid: js.Any
    
    var gridAlign: js.Any
    
    var labels: js.Any
    
    var line: js.Any
    
    var tickLine: js.Any
    
    var title: js.Any
  }
  object IAxis {
    
    inline def apply(grid: js.Any, gridAlign: js.Any, labels: js.Any, line: js.Any, tickLine: js.Any, title: js.Any): IAxis = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], gridAlign = gridAlign.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], tickLine = tickLine.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAxis]
    }
    
    extension [Self <: IAxis](x: Self) {
      
      inline def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridAlign(value: js.Any): Self = StObject.set(x, "gridAlign", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: js.Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLine(value: js.Any): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setTickLine(value: js.Any): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMiniAreaProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var data: js.Array[Y]
    
    var height: Double
    
    var line: js.UndefOr[Boolean] = js.undefined
    
    var xAxis: js.UndefOr[IAxis] = js.undefined
    
    var yAxis: js.UndefOr[IAxis] = js.undefined
  }
  object IMiniAreaProps {
    
    inline def apply(data: js.Array[Y], height: Double): IMiniAreaProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMiniAreaProps]
    }
    
    extension [Self <: IMiniAreaProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setData(value: js.Array[Y]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Y*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Boolean): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setXAxis(value: IAxis): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
      
      inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
      
      inline def setYAxis(value: IAxis): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
      
      inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
    }
  }
  
  type MiniArea = Component[IMiniAreaProps, js.Any, js.Any]
}
