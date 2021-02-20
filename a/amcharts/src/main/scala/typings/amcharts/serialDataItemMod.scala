package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serialDataItemMod {
  
  @JSImport("amcharts/SerialDataItem", JSImport.Default)
  @js.native
  class default () extends SerialDataItem
  
  @js.native
  trait SerialDataItem extends StObject {
    
    /**
      * You can access each GraphDataItem using this object.
      * The data structure is: graphDataItem = serialDataItem.axes[axisId].graphs[graphId].
      */
    var axes: js.Object = js.native
    
    /**
      * category value. String if parseDates is false, Date if true.
      */
    var category: js.Any = js.native
    
    /**
      * Timestamp of a series date. Avalable only if parseDates property of CategoryAxis is set to true.
      */
    var time: Double = js.native
    
    /**
      * Coordinate (horizontal or vertical, depends on chart's rotate property) of the series.
      */
    var x: Double = js.native
  }
  object SerialDataItem {
    
    @scala.inline
    def apply(axes: js.Object, category: js.Any, time: Double, x: Double): SerialDataItem = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerialDataItem]
    }
    
    @scala.inline
    implicit class SerialDataItemMutableBuilder[Self <: SerialDataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: js.Object): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategory(value: js.Any): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
}
