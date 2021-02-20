package typings.amcharts

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stockEventMod {
  
  @JSImport("amcharts/StockEvent", JSImport.Default)
  @js.native
  class default () extends StockEvent
  
  @js.native
  trait StockEvent extends StObject {
    
    /**
      * Opacity of bullet background.
      * @default 1
      */
    var backgroundAlpha: Double = js.native
    
    /**
      * Color of bullet background. #DADADA
      */
    var backgroundColor: String = js.native
    
    /**
      * Opacity of bullet border.
      * @default 1
      */
    var borderAlpha: Double = js.native
    
    /**
      * Bullet border color. #888888
      */
    var borderColor: String = js.native
    
    /**
      * The color of the event text. #000000
      */
    var color: String = js.native
    
    /**
      * Date of an event. Must be Date object, not a string.
      */
    var date: Date = js.native
    
    /**
      * graph on which event will be displayed.
      */
    var graph: typings.amcharts.stockGraphMod.default = js.native
    
    /**
      * Roll-over background color. #CC0000
      */
    var rollOverColor: String = js.native
    
    /**
      * Specifies if the event should be displayed on category axis
      */
    var showOnAxis: Boolean = js.native
    
    /**
      * Letter which will be displayed on the event. Not all types can display letters.
      * "text" type can display longer texts.
      */
    var text: String = js.native
    
    /**
      * Type of bullet.
      * Possible values are:
      * "flag", "sign", "pin", "triangleUp", "triangleDown", "triangleLeft", "triangleRight", "text",
      * "arrowUp", "arrowDown"
      * @default "sign"
      */
    var `type`: String = js.native
    
    /**
      * A URL to go to when user clicks the event.
      */
    var url: String = js.native
    
    /**
      * target of url, "_blank" for example.
      */
    var urlTarget: String = js.native
  }
  object StockEvent {
    
    @scala.inline
    def apply(
      backgroundAlpha: Double,
      backgroundColor: String,
      borderAlpha: Double,
      borderColor: String,
      color: String,
      date: Date,
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
    
    @scala.inline
    implicit class StockEventMutableBuilder[Self <: StockEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundAlpha(value: Double): Self = StObject.set(x, "backgroundAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderAlpha(value: Double): Self = StObject.set(x, "borderAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraph(value: typings.amcharts.stockGraphMod.default): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRollOverColor(value: String): Self = StObject.set(x, "rollOverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnAxis(value: Boolean): Self = StObject.set(x, "showOnAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlTarget(value: String): Self = StObject.set(x, "urlTarget", value.asInstanceOf[js.Any])
    }
  }
}
