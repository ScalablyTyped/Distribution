package typings
package amchartsLib.guideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Guide extends js.Object {
  /**
      * If you set it to true, the guide will be displayed above the graphs.
      */
  var above: scala.Boolean
  /**
      * Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines.
      */
  var angle: scala.Double
  /**
      * Baloon fill color.
      */
  var balloonColor: java.lang.String
  /**
      * The text which will be displayed if the user rolls-over the guide.
      */
  var balloonText: java.lang.String
  /**
      * Specifies if label should be bold or not.
      */
  var boldLabel: scala.Boolean
  /**
      * Category of the guide (in case the guide is for category axis).
      */
  var category: java.lang.String
  /**
      * Dash length.
      */
  var dashLength: scala.Double
  /**
      * Date of the guide (in case the guide is for category axis and parseDates is set to true).
      */
  var date: stdLib.Date
  /**
      * Works if a guide is added to CategoryAxis and this axis is non-date-based.
      * If you set it to true, the guide will start (or be placed, if it's not a fill) on the
      * beginning of the category cell and will end at the end of toCategory cell.
      */
  var expand: scala.Boolean
  /**
      * Fill opacity. Value range is 0 - 1.
      */
  var fillAlpha: scala.Double
  /**
      * Fill color.
      */
  var fillColor: java.lang.String
  /**
      * Font size of guide label.
      */
  var fontSize: java.lang.String
  /**
      * Unique id of a Guide. You don't need to set it, unless you want to.
      */
  var id: java.lang.String
  /**
      * Specifies whether label should be placed inside or outside plot area.
      */
  var inside: scala.Boolean
  /**
      * The label which will be displayed near the guide.
      */
  var label: java.lang.String
  /**
      * Rotation angle of a guide label.
      */
  var labelRotation: scala.Double
  /**
      * Line opacity.
      */
  var lineAlpha: scala.Double
  /**
      * Line color.
      */
  var lineColor: java.lang.String
  /**
      * Line thickness.
      */
  var lineThickness: scala.Double
  /**
      * Position of guide label. Possible values are "left" or "right" for horizontal axis
      * and "top" or "bottom" for vertical axis.
      */
  var position: java.lang.String
  /**
      * Tick length.
      */
  var tickLength: scala.Double
  /**
      * Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines.
      */
  var toAngle: scala.Double
  /**
      * To category of the guide (in case the guide is for category axis).
      */
  var toCategory: java.lang.String
  /**
      * To date of the guide (in case the guide is for category axis and parseDates is set to true).
      * If you have both date and toDate, the space between these two dates can be filled with color.
      */
  var toDate: stdLib.Date
  /**
      * To value of the guide (in case the guide is for value axis).
      */
  var toValue: scala.Double
  /**
      * Value of the guide (in case the guide is for value axis).
      */
  var value: scala.Double
  /**
      * Value axis of a guide. As you can add guides directly to the chart,
      * you might need to specify which which value axis should be used.
      */
  var valueAxis: amchartsLib.valueaxisMod.default
}

