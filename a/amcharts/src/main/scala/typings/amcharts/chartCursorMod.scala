package typings.amcharts

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/ChartCursor", JSImport.Namespace)
@js.native
object chartCursorMod extends js.Object {
  @js.native
  trait ChartCursor extends js.Object {
    /**
      * Size of bullets, following the cursor.
      * @default 8
      */
    var bulletSize: Double = js.native
    /**
      * Specifies if bullet for each graph will follow the cursor.
      */
    var bulletsEnabled: Boolean = js.native
    /**
      * Opacity of the category balloon.
      * @default 1
      */
    var categoryBalloonAlpha: Double = js.native
    /**
      * Color of the category balloon. cursorColor is used if not set.
      */
    var categoryBalloonColor: String = js.native
    /**
      * Category balloon date format (used only if category axis parses dates).
      * Check this page for instructions on how to format dates. MMM DD, YYYY
      */
    var categoryBalloonDateFormat: String = js.native
    /**
      * Specifies whether category balloon is enabled.
      * @default true
      */
    var categoryBalloonEnabled: Boolean = js.native
    /**
      * Text color. #FFFFFF
      */
    var color: String = js.native
    /**
      * Opacity of the cursor line.  1
      */
    var cursorAlpha: Double = js.native
    /**
      * Color of the cursor line. #CC0000
      */
    var cursorColor: String = js.native
    /**
      * Specifies where the cursor line should be placed - on the beginning of the period (day, hour, etc) or
      * in the middle (only when parseDates property of categoryAxis is set to true).
      * If you want the cursor to follow mouse and not to glue to the nearest data point, set "mouse" here.
      * Possible values are: "start", "middle", "mouse".
      */
    var cursorPosition: String = js.native
    /**
      * Specifies whether cursor is enabled.
      * @default true
      */
    var enabled: Boolean = js.native
    /**
      * If set to true, instead of a cursor line user will see a fill which width will always
      * be equal to the width of one data item.
      * Recommend setting cursorAlpha to 0.1 or some other small number if using this feature.
      * @default false
      */
    var fullWidth: Boolean = js.native
    /**
      * If this is set to true, only one balloon at a time will be displayed. Note, this is quite CPU consuming.
      */
    var oneBalloonOnly: Boolean = js.native
    /**
      * If this is set to true, the user will be able to pan the chart (Serial only) instead of zooming.
      */
    var pan: Boolean = js.native
    /**
      * Specifies if cursor should only mark selected area but not zoom-in after user releases mouse button.
      */
    var selectWithoutZooming: Boolean = js.native
    /**
      * Opacity of the selection.
      */
    var selectionAlpha: Double = js.native
    /**
      * Specifies whether value balloons are enabled.
      * In case they are not, the balloons might be displayed anyway, when the user rolls-over the column or bullet.
      * @default true
      */
    var valueBalloonsEnabled: Boolean = js.native
    /**
      * Specifies if the user can zoom-in the chart.
      * If pan is set to true, zoomable is switched to false automatically.
      * @default true
      */
    var zoomable: Boolean = js.native
    /**
      * Indicates if currently user is selecting some chart area to zoom-in.
      */
    var zooming: Boolean = js.native
    /**
      * Adds event listener.
      * @param type One of "changed", "draw", "moved", "onHideCursor", "onShowCursor", "panning",
      * "selected", "zoomed", "zoomStarted".
      * @param handler The event handler.
      */
    def addListener(`type`: String, handler: js.Function1[/* e */ AnonChartDelta2X, Unit]): Unit = js.native
    /**
      * Hides cursor.
      */
    def hideCursor(): Unit = js.native
    /**
      * Removes event listener from chart object.
      */
    def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit = js.native
    /**
      * You can force cursor to appear at specified cateogry or date.
      */
    def showCursorAt(category: String): Unit = js.native
    def showCursorAt(category: Date): Unit = js.native
  }
  
  @js.native
  class default () extends ChartCursor
  
}

