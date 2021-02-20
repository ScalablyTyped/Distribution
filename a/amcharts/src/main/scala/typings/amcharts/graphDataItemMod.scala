package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphDataItemMod {
  
  @JSImport("amcharts/GraphDataItem", JSImport.Default)
  @js.native
  class default () extends GraphDataItem
  
  @js.native
  trait GraphDataItem extends StObject {
    
    /**
      * Opacity of the data item.
      */
    var alpha: Double = js.native
    
    /**
      * Bullet type.
      */
    var bullet: String = js.native
    
    /**
      * Bullet size.
      */
    var bulletSize: Double = js.native
    
    /**
      * Category value.
      */
    var category: String = js.native
    
    /**
      * Color of the data item.
      */
    var color: String = js.native
    
    /**
      * Custom bullet (path to file name).
      */
    var customBullet: String = js.native
    
    /**
      * Original object from data provider.
      */
    var dataContext: js.Object = js.native
    
    /**
      * Description.
      */
    var description: String = js.native
    
    /**
      * Array of colors of the data item, used by column and candlestick chart only.
      */
    var fillColors: js.Array[_] = js.native
    
    /**
      * Object which holds percents when recalculateToPercents is set to true.
      */
    var percents: js.Object = js.native
    
    /**
      * SerialDataItem of this graphDataItem
      */
    var serialDataItem: typings.amcharts.serialDataItemMod.default = js.native
    
    /**
      * url
      */
    var url: String = js.native
    
    /**
      * Object which holds values of the data item (value, open, close, low, high).
      */
    var values: js.Object = js.native
    
    /**
      * x coordinate of the data item.
      */
    var x: Double = js.native
    
    /**
      * y coordinate of the data item.
      */
    var y: Double = js.native
  }
  object GraphDataItem {
    
    @scala.inline
    def apply(
      alpha: Double,
      bullet: String,
      bulletSize: Double,
      category: String,
      color: String,
      customBullet: String,
      dataContext: js.Object,
      description: String,
      fillColors: js.Array[_],
      percents: js.Object,
      serialDataItem: typings.amcharts.serialDataItemMod.default,
      url: String,
      values: js.Object,
      x: Double,
      y: Double
    ): GraphDataItem = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bullet = bullet.asInstanceOf[js.Any], bulletSize = bulletSize.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], customBullet = customBullet.asInstanceOf[js.Any], dataContext = dataContext.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fillColors = fillColors.asInstanceOf[js.Any], percents = percents.asInstanceOf[js.Any], serialDataItem = serialDataItem.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphDataItem]
    }
    
    @scala.inline
    implicit class GraphDataItemMutableBuilder[Self <: GraphDataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBullet(value: String): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBulletSize(value: Double): Self = StObject.set(x, "bulletSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomBullet(value: String): Self = StObject.set(x, "customBullet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataContext(value: js.Object): Self = StObject.set(x, "dataContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColors(value: js.Array[_]): Self = StObject.set(x, "fillColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorsVarargs(value: js.Any*): Self = StObject.set(x, "fillColors", js.Array(value :_*))
      
      @scala.inline
      def setPercents(value: js.Object): Self = StObject.set(x, "percents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialDataItem(value: typings.amcharts.serialDataItemMod.default): Self = StObject.set(x, "serialDataItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
