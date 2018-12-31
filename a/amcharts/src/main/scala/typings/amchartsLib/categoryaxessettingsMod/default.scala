package typings
package amchartsLib.categoryaxessettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/CategoryAxesSettings", JSImport.Default)
@js.native
class default () extends CategoryAxesSettings {
  /**
    * Specifies whether number of gridCount is specified automatically, according to the axis size.
    * @default true
    */
  /* CompleteClass */
  override var autoGridCount: scala.Boolean = js.native
  /**
    * Axis opacity.
    */
  /* CompleteClass */
  override var axisAlpha: scala.Double = js.native
  /**
    * Axis color.
    */
  /* CompleteClass */
  override var axisColor: java.lang.String = js.native
  /**
    * Height of category axes. Set it to 0 if you set inside property to true.
    * @default 28
    */
  /* CompleteClass */
  override var axisHeight: scala.Double = js.native
  /**
    * Thickness of the axis.
    */
  /* CompleteClass */
  override var axisThickness: scala.Double = js.native
  /**
    * Text color.
    */
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**
    * Length of a dash.
    */
  /* CompleteClass */
  override var dashLength: scala.Double = js.native
  /**
    * Date formats of different periods.
    * Possible period values:
    * fff - milliseconds,
    * ss - seconds,
    * mm - minutes,
    * hh - hours,
    * DD - days,
    * MM - months,
    * WW - weeks,
    * YYYY - years
    * Check this page for date formatting strings.
    */
  /* CompleteClass */
  override var dateFormats: js.Array[_] = js.native
  /**
    * If you want data points to be placed at equal intervals (omiting dates with no data),
    * set equalSpacing to true.
    */
  /* CompleteClass */
  override var equalSpacing: scala.Boolean = js.native
  /**
    * Fill opacity. Every second space between grid lines can be filled with fillColor.
    */
  /* CompleteClass */
  override var fillAlpha: scala.Double = js.native
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  /* CompleteClass */
  override var fillColor: java.lang.String = js.native
  /**
    * Text size.
    */
  /* CompleteClass */
  override var fontSize: java.lang.String = js.native
  /**
    * Opacity of grid lines.
    */
  /* CompleteClass */
  override var gridAlpha: scala.Double = js.native
  /**
    * Color of grid lines.
    */
  /* CompleteClass */
  override var gridColor: java.lang.String = js.native
  /**
    * Approximate number of grid lines.
    * You should set autoGridCount to false in order this property not to be ignored.
    * @default 10
    */
  /* CompleteClass */
  override var gridCount: scala.Double = js.native
  /**
    * Thickness of grid lines.
    */
  /* CompleteClass */
  override var gridThickness: scala.Double = js.native
  /**
    * Periods to which data will be gruoped in case there are more data items in
    * the selected period than specified in maxSeries property.
    * ["ss", "10ss", "30ss", "mm", "10mm", "30mm", "hh", "DD", "WW", "MM", "YYYY"]
    */
  /* CompleteClass */
  override var groupToPeriods: js.Array[_] = js.native
  /**
    * Specifies whether values should be placed inside or outside of plot area.
    */
  /* CompleteClass */
  override var inside: scala.Boolean = js.native
  /**
    * Rotation angle of a label.
    */
  /* CompleteClass */
  override var labelRotation: scala.Double = js.native
  /**
    * Maximum series shown at a time.
    * In case there are more data points in the selection than maxSeries,
    * the chart will group data to longer periods, for example - you have 250 days in the selection,
    * and maxSeries is 150 - the chart will group data to weeks.
    * @default 150
    */
  /* CompleteClass */
  override var maxSeries: scala.Double = js.native
  /**
    * Specifies the shortest period of your data.
    * fff - millisecond,
    * ss - second,
    * mm - minute,
    * hh - hour,
    * DD - day,
    * MM - month,
    * YYYY - year
    * @default "DD"
    */
  /* CompleteClass */
  override var minPeriod: java.lang.String = js.native
  /**
    * top or "bottom".
    */
  /* CompleteClass */
  override var position: java.lang.String = js.native
  /**
    * Specifies whether the graph should start on axis or not.
    * In case you display columns, it is recommended to set this to false.
    * startOnAxis can be set to true only if equalSpacing is set to true.
    */
  /* CompleteClass */
  override var startOnAxis: scala.Boolean = js.native
  /**
    * Tick length.
    */
  /* CompleteClass */
  override var tickLength: scala.Double = js.native
}

