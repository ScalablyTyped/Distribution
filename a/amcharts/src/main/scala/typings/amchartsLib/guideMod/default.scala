package typings
package amchartsLib.guideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/Guide", JSImport.Default)
@js.native
class default () extends Guide {
  /**
      * If you set it to true, the guide will be displayed above the graphs.
      */
  /* CompleteClass */
  override var above: scala.Boolean = js.native
  /**
      * Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines.
      */
  /* CompleteClass */
  override var angle: scala.Double = js.native
  /**
      * Baloon fill color.
      */
  /* CompleteClass */
  override var balloonColor: java.lang.String = js.native
  /**
      * The text which will be displayed if the user rolls-over the guide.
      */
  /* CompleteClass */
  override var balloonText: java.lang.String = js.native
  /**
      * Specifies if label should be bold or not.
      */
  /* CompleteClass */
  override var boldLabel: scala.Boolean = js.native
  /**
      * Category of the guide (in case the guide is for category axis).
      */
  /* CompleteClass */
  override var category: java.lang.String = js.native
  /**
      * Dash length.
      */
  /* CompleteClass */
  override var dashLength: scala.Double = js.native
  /**
      * Date of the guide (in case the guide is for category axis and parseDates is set to true).
      */
  /* CompleteClass */
  override var date: stdLib.Date = js.native
  /**
      * Works if a guide is added to CategoryAxis and this axis is non-date-based.
      * If you set it to true, the guide will start (or be placed, if it's not a fill) on the
      * beginning of the category cell and will end at the end of toCategory cell.
      */
  /* CompleteClass */
  override var expand: scala.Boolean = js.native
  /**
      * Fill opacity. Value range is 0 - 1.
      */
  /* CompleteClass */
  override var fillAlpha: scala.Double = js.native
  /**
      * Fill color.
      */
  /* CompleteClass */
  override var fillColor: java.lang.String = js.native
  /**
      * Font size of guide label.
      */
  /* CompleteClass */
  override var fontSize: java.lang.String = js.native
  /**
      * Unique id of a Guide. You don't need to set it, unless you want to.
      */
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /**
      * Specifies whether label should be placed inside or outside plot area.
      */
  /* CompleteClass */
  override var inside: scala.Boolean = js.native
  /**
      * The label which will be displayed near the guide.
      */
  /* CompleteClass */
  override var label: java.lang.String = js.native
  /**
      * Rotation angle of a guide label.
      */
  /* CompleteClass */
  override var labelRotation: scala.Double = js.native
  /**
      * Line opacity.
      */
  /* CompleteClass */
  override var lineAlpha: scala.Double = js.native
  /**
      * Line color.
      */
  /* CompleteClass */
  override var lineColor: java.lang.String = js.native
  /**
      * Line thickness.
      */
  /* CompleteClass */
  override var lineThickness: scala.Double = js.native
  /**
      * Position of guide label. Possible values are "left" or "right" for horizontal axis
      * and "top" or "bottom" for vertical axis.
      */
  /* CompleteClass */
  override var position: java.lang.String = js.native
  /**
      * Tick length.
      */
  /* CompleteClass */
  override var tickLength: scala.Double = js.native
  /**
      * Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines.
      */
  /* CompleteClass */
  override var toAngle: scala.Double = js.native
  /**
      * To category of the guide (in case the guide is for category axis).
      */
  /* CompleteClass */
  override var toCategory: java.lang.String = js.native
  /**
      * To date of the guide (in case the guide is for category axis and parseDates is set to true).
      * If you have both date and toDate, the space between these two dates can be filled with color.
      */
  /* CompleteClass */
  override var toDate: stdLib.Date = js.native
  /**
      * To value of the guide (in case the guide is for value axis).
      */
  /* CompleteClass */
  override var toValue: scala.Double = js.native
  /**
      * Value of the guide (in case the guide is for value axis).
      */
  /* CompleteClass */
  override var value: scala.Double = js.native
  /**
      * Value axis of a guide. As you can add guides directly to the chart,
      * you might need to specify which which value axis should be used.
      */
  /* CompleteClass */
  override var valueAxis: amchartsLib.valueaxisMod.default = js.native
}

