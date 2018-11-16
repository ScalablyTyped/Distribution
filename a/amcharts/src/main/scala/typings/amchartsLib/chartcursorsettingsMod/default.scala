package typings
package amchartsLib.chartcursorsettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/ChartCursorSettings", JSImport.Default)
@js.native
class default () extends ChartCursorSettings {
  /**
       * Size of bullets, following the cursor.
       */
  /* CompleteClass */
  override var bulletSize: scala.Double = js.native
  /**
       * Specifies if bullet for each graph will follow the cursor.
       */
  /* CompleteClass */
  override var bulletsEnabled: scala.Boolean = js.native
  /**
       * Opacity of the category balloon.
       */
  /* CompleteClass */
  override var categoryBalloonAlpha: scala.Double = js.native
  /**
       * Color of the category balloon.
       */
  /* CompleteClass */
  override var categoryBalloonColor: java.lang.String = js.native
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
  /* CompleteClass */
  override var categoryBalloonDateFormats: js.Array[_] = js.native
  /**
       * Specifies whether category balloon is enabled.
       */
  /* CompleteClass */
  override var categoryBalloonEnabled: scala.Boolean = js.native
  /**
       * Opacity of the cursor line.
       */
  /* CompleteClass */
  override var cursorAlpha: scala.Double = js.native
  /**
       * Color of the cursor line.
       */
  /* CompleteClass */
  override var cursorColor: java.lang.String = js.native
  /**
       * Possible values: "start", "middle" and "mouse".
       */
  /* CompleteClass */
  override var cursorPosition: java.lang.String = js.native
  /**
       * Set this to "false" if you don't want chart cursor to appear in your charts.
       * @default true
       */
  /* CompleteClass */
  override var enabled: scala.Boolean = js.native
  /**
       * If this is set to true, the user will be able to pan the chart instead of zooming.
       */
  /* CompleteClass */
  override var pan: scala.Boolean = js.native
  /**
       * Specifies whether value balloons are enabled.
       * In case they are not, the balloons might be displayed anyway, when the user rolls-over the column or bullet.
       */
  /* CompleteClass */
  override var valueBalloonsEnabled: scala.Boolean = js.native
  /**
       * Specifies if the user can zoom-in the chart.
       * If pan is set to true, zoomable is switched to false automatically.
       */
  /* CompleteClass */
  override var zoomable: scala.Boolean = js.native
}

