package typings
package amchartsLib.axisBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/AxisBase", JSImport.Default)
@js.native
class default () extends AxisBase {
  /**
    * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
    * @default true
    */
  /* CompleteClass */
  override var autoGridCount: scala.Boolean = js.native
  /**
    * Axis opacity. Value range is 0 - 1.
    * @default 1
    */
  /* CompleteClass */
  override var axisAlpha: scala.Double = js.native
  /**
    * Axis color.  #000000
    */
  /* CompleteClass */
  override var axisColor: java.lang.String = js.native
  /**
    * Thickness of the axis.
    * @default 1
    */
  /* CompleteClass */
  override var axisThickness: scala.Double = js.native
  /**
    * Color of axis value labels. Will use chart's color if not set.
    */
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**
    * Length of a dash. 0 means line is not dashed.
    */
  /* CompleteClass */
  override var dashLength: scala.Double = js.native
  /**
    * Fill opacity. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  /* CompleteClass */
  override var fillAlpha: scala.Double = js.native
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    * @default "#FFFFFF"
    */
  /* CompleteClass */
  override var fillColor: java.lang.String = js.native
  /**
    * Size of value labels text. Will use chart's fontSize if not set.
    */
  /* CompleteClass */
  override var fontSize: java.lang.String = js.native
  /**
    * Opacity of grid lines. 0.2
    */
  /* CompleteClass */
  override var gridAlpha: scala.Double = js.native
  /**
    * Color of grid lines. #000000
    */
  /* CompleteClass */
  override var gridColor: java.lang.String = js.native
  /**
    * Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
    * the number is approximate. The default value is 5. If you set autoGridCount to true,
    * this property is ignored.
    * @default 5
    */
  /* CompleteClass */
  override var gridCount: scala.Double = js.native
  /**
    * Thickness of grid lines.
    * @default 1
    */
  /* CompleteClass */
  override var gridThickness: scala.Double = js.native
  /**
    * The array of guides belonging to this axis.
    */
  /* CompleteClass */
  override var guides: js.Array[_] = js.native
  /**
    * If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin,
    * set ignoreAxisWidth to true.
    */
  /* CompleteClass */
  override var ignoreAxisWidth: scala.Boolean = js.native
  /**
    * Specifies whether values should be placed inside or outside plot area.
    */
  /* CompleteClass */
  override var inside: scala.Boolean = js.native
  /**
    * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
    * @default 1
    */
  /* CompleteClass */
  override var labelFrequency: scala.Double = js.native
  /**
    * Rotation angle of a label. Only horizontal axis' values can be rotated.
    * If you set this for vertical axis, the setting will be ignored.
    */
  /* CompleteClass */
  override var labelRotation: scala.Double = js.native
  /**
    * Specifies whether axis displays category axis' labels and value axis' values.
    * @default true
    */
  /* CompleteClass */
  override var labelsEnabled: scala.Boolean = js.native
  /**
    * The distance of the axis to the plot area, in pixels. Negative values can also be used.
    */
  /* CompleteClass */
  override var offset: scala.Double = js.native
  /**
    * Possible values are: "top", "bottom", "left", "right".
    * If axis is vertical, default position is "left".
    * If axis is horizontal, default position is "bottom".
    */
  /* CompleteClass */
  override var position: java.lang.String = js.native
  /**
    * Whether to show first axis label or not.
    * @default true
    */
  /* CompleteClass */
  override var showFirstLabel: scala.Boolean = js.native
  /**
    * Whether to show last axis label or not.
    * @default true
    */
  /* CompleteClass */
  override var showLastLabel: scala.Boolean = js.native
  /**
    * Length of the tick marks.
    * @default 5
    */
  /* CompleteClass */
  override var tickLength: scala.Double = js.native
  /**
    * Title of the axis.
    */
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /**
    * Specifies if title should be bold or not.
    * @default true
    */
  /* CompleteClass */
  override var titleBold: scala.Boolean = js.native
  /**
    * Color of axis title. Will use text color of chart if not set any.
    */
  /* CompleteClass */
  override var titleColor: java.lang.String = js.native
  /**
    * Font size of axis title. Will use font size of chart plus two pixels if not set any.
    */
  /* CompleteClass */
  override var titlefontSize: java.lang.String = js.native
  /**
    * Adds guide to the axis.
    */
  /* CompleteClass */
  override def addGuide(guide: amchartsLib.guideMod.default): scala.Unit = js.native
  /**
    * Removes guide from the axis.
    */
  /* CompleteClass */
  override def removeGuide(guide: amchartsLib.guideMod.default): scala.Unit = js.native
}

