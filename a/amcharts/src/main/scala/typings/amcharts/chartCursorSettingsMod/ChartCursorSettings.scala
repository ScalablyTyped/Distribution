package typings.amcharts.chartCursorSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCursorSettings extends js.Object {
  /**
    * Size of bullets, following the cursor.
    */
  var bulletSize: Double
  /**
    * Specifies if bullet for each graph will follow the cursor.
    */
  var bulletsEnabled: Boolean
  /**
    * Opacity of the category balloon.
    */
  var categoryBalloonAlpha: Double
  /**
    * Color of the category balloon.
    */
  var categoryBalloonColor: String
  /**
    * Array of date format objects. Date format object must have "period" and "format" items.
    * Available periods are:
    * fff - millisecond,
    * ss - second,
    * mm - minute,
    * hh - hour,
    * DD - date,
    * WW - week,
    * MM - month,
    * YYYY - year
    * [
    *     {period:"YYYY", format:"YYYY"},
    *     {period:"MM", format:"MMM, YYYY"},
    *     {period:"WW", format:"MMM DD, YYYY"},
    *     {period:"DD", format:"MMM DD, YYYY"},
    *     {period:"hh", format:"JJ:NN"},
    *     {period:"mm", format:"JJ:NN"},
    *     {period:"ss", format:"JJ:NN:SS"},
    *     {period:"fff", format:"JJ:NN:SS"}
    * ]
    */
  var categoryBalloonDateFormats: js.Array[_]
  /**
    * Specifies whether category balloon is enabled.
    */
  var categoryBalloonEnabled: Boolean
  /**
    * Opacity of the cursor line.
    */
  var cursorAlpha: Double
  /**
    * Color of the cursor line.
    */
  var cursorColor: String
  /**
    * Possible values: "start", "middle" and "mouse".
    */
  var cursorPosition: String
  /**
    * Set this to "false" if you don't want chart cursor to appear in your charts.
    * @default true
    */
  var enabled: Boolean
  /**
    * If this is set to true, the user will be able to pan the chart instead of zooming.
    */
  var pan: Boolean
  /**
    * Specifies whether value balloons are enabled.
    * In case they are not, the balloons might be displayed anyway, when the user rolls-over the column or bullet.
    */
  var valueBalloonsEnabled: Boolean
  /**
    * Specifies if the user can zoom-in the chart.
    * If pan is set to true, zoomable is switched to false automatically.
    */
  var zoomable: Boolean
}

object ChartCursorSettings {
  @scala.inline
  def apply(
    bulletSize: Double,
    bulletsEnabled: Boolean,
    categoryBalloonAlpha: Double,
    categoryBalloonColor: String,
    categoryBalloonDateFormats: js.Array[_],
    categoryBalloonEnabled: Boolean,
    cursorAlpha: Double,
    cursorColor: String,
    cursorPosition: String,
    enabled: Boolean,
    pan: Boolean,
    valueBalloonsEnabled: Boolean,
    zoomable: Boolean
  ): ChartCursorSettings = {
    val __obj = js.Dynamic.literal(bulletSize = bulletSize.asInstanceOf[js.Any], bulletsEnabled = bulletsEnabled.asInstanceOf[js.Any], categoryBalloonAlpha = categoryBalloonAlpha.asInstanceOf[js.Any], categoryBalloonColor = categoryBalloonColor.asInstanceOf[js.Any], categoryBalloonDateFormats = categoryBalloonDateFormats.asInstanceOf[js.Any], categoryBalloonEnabled = categoryBalloonEnabled.asInstanceOf[js.Any], cursorAlpha = cursorAlpha.asInstanceOf[js.Any], cursorColor = cursorColor.asInstanceOf[js.Any], cursorPosition = cursorPosition.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], valueBalloonsEnabled = valueBalloonsEnabled.asInstanceOf[js.Any], zoomable = zoomable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChartCursorSettings]
  }
}

