package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serialDataItemMod {
  
  @JSImport("amcharts/SerialDataItem", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SerialDataItem {
    
    /**
      * You can access each GraphDataItem using this object.
      * The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
      */
    /* CompleteClass */
    var axes: js.Object = js.native
    
    /**
      * category value. String if parseDates is false, Date if true.
      */
    /* CompleteClass */
    var category: Any = js.native
    
    /**
      * Timestamp of a series date. Avalable only if parseDates property of CategoryAxis is set to true.
      */
    /* CompleteClass */
    var time: Double = js.native
    
    /**
      * Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
      */
    /* CompleteClass */
    var x: Double = js.native
  }
  
  trait SerialDataItem extends StObject {
    
    /**
      * You can access each GraphDataItem using this object.
      * The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
      */
    var axes: js.Object
    
    /**
      * category value. String if parseDates is false, Date if true.
      */
    var category: Any
    
    /**
      * Timestamp of a series date. Avalable only if parseDates property of CategoryAxis is set to true.
      */
    var time: Double
    
    /**
      * Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
      */
    var x: Double
  }
  object SerialDataItem {
    
    inline def apply(axes: js.Object, category: Any, time: Double, x: Double): SerialDataItem = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerialDataItem]
    }
    
    extension [Self <: SerialDataItem](x: Self) {
      
      inline def setAxes(value: js.Object): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setCategory(value: Any): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
}
