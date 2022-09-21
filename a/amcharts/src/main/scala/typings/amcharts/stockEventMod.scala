package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stockEventMod {
  
  @JSImport("amcharts/StockEvent", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with StockEvent {
    
    /**
      * Opacity of bullet background.
      * @default 1
      */
    /* CompleteClass */
    var backgroundAlpha: Double = js.native
    
    /**
      * Color of bullet background. #DADADA
      */
    /* CompleteClass */
    var backgroundColor: String = js.native
    
    /**
      * Opacity of bullet border.
      * @default 1
      */
    /* CompleteClass */
    var borderAlpha: Double = js.native
    
    /**
      * Bullet border color. #888888
      */
    /* CompleteClass */
    var borderColor: String = js.native
    
    /**
      * The color of the event text. #000000
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Date of an event. Must be Date object, not a string.
      */
    /* CompleteClass */
    var date: js.Date = js.native
    
    /**
      * graph on which event will be displayed.
      */
    /* CompleteClass */
    var graph: typings.amcharts.stockGraphMod.default = js.native
    
    /**
      * Roll-over background color. #CC0000
      */
    /* CompleteClass */
    var rollOverColor: String = js.native
    
    /**
      * Specifies if the event should be displayed on category axis
      */
    /* CompleteClass */
    var showOnAxis: Boolean = js.native
    
    /**
      * Letter which will be displayed on the event. Not all types can display letters.
      * "text" type can display longer texts.
      */
    /* CompleteClass */
    var text: String = js.native
    
    /**
      * Type of bullet.
      * Possible values are:
      * "flag", "sign", "pin", "triangleUp", "triangleDown", "triangleLeft", "triangleRight", "text",
      * "arrowUp", "arrowDown"
      * @default "sign"
      */
    /* CompleteClass */
    var `type`: String = js.native
    
    /**
      * A URL to go to when user clicks the event.
      */
    /* CompleteClass */
    var url: String = js.native
    
    /**
      * target of url, "_blank" for example.
      */
    /* CompleteClass */
    var urlTarget: String = js.native
  }
  
  trait StockEvent extends StObject {
    
    /**
      * Opacity of bullet background.
      * @default 1
      */
    var backgroundAlpha: Double
    
    /**
      * Color of bullet background. #DADADA
      */
    var backgroundColor: String
    
    /**
      * Opacity of bullet border.
      * @default 1
      */
    var borderAlpha: Double
    
    /**
      * Bullet border color. #888888
      */
    var borderColor: String
    
    /**
      * The color of the event text. #000000
      */
    var color: String
    
    /**
      * Date of an event. Must be Date object, not a string.
      */
    var date: js.Date
    
    /**
      * graph on which event will be displayed.
      */
    var graph: typings.amcharts.stockGraphMod.default
    
    /**
      * Roll-over background color. #CC0000
      */
    var rollOverColor: String
    
    /**
      * Specifies if the event should be displayed on category axis
      */
    var showOnAxis: Boolean
    
    /**
      * Letter which will be displayed on the event. Not all types can display letters.
      * "text" type can display longer texts.
      */
    var text: String
    
    /**
      * Type of bullet.
      * Possible values are:
      * "flag", "sign", "pin", "triangleUp", "triangleDown", "triangleLeft", "triangleRight", "text",
      * "arrowUp", "arrowDown"
      * @default "sign"
      */
    var `type`: String
    
    /**
      * A URL to go to when user clicks the event.
      */
    var url: String
    
    /**
      * target of url, "_blank" for example.
      */
    var urlTarget: String
  }
  object StockEvent {
    
    inline def apply(
      backgroundAlpha: Double,
      backgroundColor: String,
      borderAlpha: Double,
      borderColor: String,
      color: String,
      date: js.Date,
      graph: typings.amcharts.stockGraphMod.default,
      rollOverColor: String,
      showOnAxis: Boolean,
      text: String,
      `type`: String,
      url: String,
      urlTarget: String
    ): StockEvent = {
      val __obj = js.Dynamic.literal(backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlpha = borderAlpha.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], rollOverColor = rollOverColor.asInstanceOf[js.Any], showOnAxis = showOnAxis.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlTarget = urlTarget.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StockEvent]
    }
    
    extension [Self <: StockEvent](x: Self) {
      
      inline def setBackgroundAlpha(value: Double): Self = StObject.set(x, "backgroundAlpha", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBorderAlpha(value: Double): Self = StObject.set(x, "borderAlpha", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: typings.amcharts.stockGraphMod.default): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setRollOverColor(value: String): Self = StObject.set(x, "rollOverColor", value.asInstanceOf[js.Any])
      
      inline def setShowOnAxis(value: Boolean): Self = StObject.set(x, "showOnAxis", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlTarget(value: String): Self = StObject.set(x, "urlTarget", value.asInstanceOf[js.Any])
    }
  }
}
