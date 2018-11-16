package typings
package amchartsLib.chartcursorsettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChartCursorSettings extends js.Object {
  /**
       * Size of bullets, following the cursor.
       */
  var bulletSize: scala.Double
  /**
       * Specifies if bullet for each graph will follow the cursor.
       */
  var bulletsEnabled: scala.Boolean
  /**
       * Opacity of the category balloon.
       */
  var categoryBalloonAlpha: scala.Double
  /**
       * Color of the category balloon.
       */
  var categoryBalloonColor: java.lang.String
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
  var categoryBalloonEnabled: scala.Boolean
  /**
       * Opacity of the cursor line.
       */
  var cursorAlpha: scala.Double
  /**
       * Color of the cursor line.
       */
  var cursorColor: java.lang.String
  /**
       * Possible values: "start", "middle" and "mouse".
       */
  var cursorPosition: java.lang.String
  /**
       * Set this to "false" if you don't want chart cursor to appear in your charts.
       * @default true
       */
  var enabled: scala.Boolean
  /**
       * If this is set to true, the user will be able to pan the chart instead of zooming.
       */
  var pan: scala.Boolean
  /**
       * Specifies whether value balloons are enabled.
       * In case they are not, the balloons might be displayed anyway, when the user rolls-over the column or bullet.
       */
  var valueBalloonsEnabled: scala.Boolean
  /**
       * Specifies if the user can zoom-in the chart.
       * If pan is set to true, zoomable is switched to false automatically.
       */
  var zoomable: scala.Boolean
}

