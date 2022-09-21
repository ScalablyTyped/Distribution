package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphDataItemMod {
  
  @JSImport("amcharts/GraphDataItem", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GraphDataItem {
    
    /**
      * Opacity of the data item.
      */
    /* CompleteClass */
    var alpha: Double = js.native
    
    /**
      * Bullet type.
      */
    /* CompleteClass */
    var bullet: String = js.native
    
    /**
      * Bullet size.
      */
    /* CompleteClass */
    var bulletSize: Double = js.native
    
    /**
      * Category value.
      */
    /* CompleteClass */
    var category: String = js.native
    
    /**
      * Color of the data item.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Custom bullet (path to file name).
      */
    /* CompleteClass */
    var customBullet: String = js.native
    
    /**
      * Original object from data provider.
      */
    /* CompleteClass */
    var dataContext: js.Object = js.native
    
    /**
      * Description.
      */
    /* CompleteClass */
    var description: String = js.native
    
    /**
      * Array of colors of the data item, used by column and candlestick chart only.
      */
    /* CompleteClass */
    var fillColors: js.Array[Any] = js.native
    
    /**
      * Object which holds percents when recalculateToPercents is set to true.
      */
    /* CompleteClass */
    var percents: js.Object = js.native
    
    /**
      * SerialDataItem of this graphDataItem
      */
    /* CompleteClass */
    var serialDataItem: typings.amcharts.serialDataItemMod.default = js.native
    
    /**
      * url
      */
    /* CompleteClass */
    var url: String = js.native
    
    /**
      * Object which holds values of the data item (value, open, close, low, high).
      */
    /* CompleteClass */
    var values: js.Object = js.native
    
    /**
      * x coordinate of the data item.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * y coordinate of the data item.
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  trait GraphDataItem extends StObject {
    
    /**
      * Opacity of the data item.
      */
    var alpha: Double
    
    /**
      * Bullet type.
      */
    var bullet: String
    
    /**
      * Bullet size.
      */
    var bulletSize: Double
    
    /**
      * Category value.
      */
    var category: String
    
    /**
      * Color of the data item.
      */
    var color: String
    
    /**
      * Custom bullet (path to file name).
      */
    var customBullet: String
    
    /**
      * Original object from data provider.
      */
    var dataContext: js.Object
    
    /**
      * Description.
      */
    var description: String
    
    /**
      * Array of colors of the data item, used by column and candlestick chart only.
      */
    var fillColors: js.Array[Any]
    
    /**
      * Object which holds percents when recalculateToPercents is set to true.
      */
    var percents: js.Object
    
    /**
      * SerialDataItem of this graphDataItem
      */
    var serialDataItem: typings.amcharts.serialDataItemMod.default
    
    /**
      * url
      */
    var url: String
    
    /**
      * Object which holds values of the data item (value, open, close, low, high).
      */
    var values: js.Object
    
    /**
      * x coordinate of the data item.
      */
    var x: Double
    
    /**
      * y coordinate of the data item.
      */
    var y: Double
  }
  object GraphDataItem {
    
    inline def apply(
      alpha: Double,
      bullet: String,
      bulletSize: Double,
      category: String,
      color: String,
      customBullet: String,
      dataContext: js.Object,
      description: String,
      fillColors: js.Array[Any],
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
    
    extension [Self <: GraphDataItem](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBullet(value: String): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      inline def setBulletSize(value: Double): Self = StObject.set(x, "bulletSize", value.asInstanceOf[js.Any])
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setCustomBullet(value: String): Self = StObject.set(x, "customBullet", value.asInstanceOf[js.Any])
      
      inline def setDataContext(value: js.Object): Self = StObject.set(x, "dataContext", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFillColors(value: js.Array[Any]): Self = StObject.set(x, "fillColors", value.asInstanceOf[js.Any])
      
      inline def setFillColorsVarargs(value: Any*): Self = StObject.set(x, "fillColors", js.Array(value*))
      
      inline def setPercents(value: js.Object): Self = StObject.set(x, "percents", value.asInstanceOf[js.Any])
      
      inline def setSerialDataItem(value: typings.amcharts.serialDataItemMod.default): Self = StObject.set(x, "serialDataItem", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
