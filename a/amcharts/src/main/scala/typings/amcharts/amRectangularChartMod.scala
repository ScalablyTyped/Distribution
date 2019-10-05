package typings.amcharts

import typings.amcharts.amRectangularChartMod.AmRectangularChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/AmRectangularChart", JSImport.Namespace)
@js.native
object amRectangularChartMod extends js.Object {
  @js.native
  trait AmRectangularChart
    extends typings.amcharts.amCoordinateChartMod.default {
    /**
      * The angle of the 3D part of plot area. This creates a 3D effect (if the "depth3D" is > 0).
      * @default 0
      */
    var angle: Double = js.native
    /**
      * Space left from axis labels/title to the chart's outside border, if autoMargins set to true.
      * @default 10
      */
    var autoMarginOffset: Double = js.native
    /**
      * Specifies if margins of a chart should be calculated automatically so that labels of axes would fit.
      * The chart will adjust only margins with axes.
      * Other margins will use values set with marginRight, marginTop, marginLeft and marginBottom properties.
      * @default true
      */
    var autoMargins: Boolean = js.native
    /**
      * Cursor of a chart.
      */
    var chartCursor: typings.amcharts.chartCursorMod.default = js.native
    /**
      * Chart scrollbar.
      */
    var chartScrollbar: typings.amcharts.chartScrollbarMod.default = js.native
    /**
      * The depth of the 3D part of plot area. This creates a 3D effect (if the "angle" is > 0).
      * @default 0
      */
    var depth3D: Double = js.native
    /**
      * Number of pixels between the container's bottom border and plot area.
      * This space can be used for bottom axis' values.
      * If autoMargin is true and bottom side has axis, this property is ignored.
      * @default 20
      */
    var marginBottom: Double = js.native
    /**
      * Number of pixels between the container's left border and plot area.
      * This space can be used for left axis' values.
      * If autoMargin is true and left side has axis, this property is ignored.
      * @default 20
      */
    var marginLeft: Double = js.native
    /**
      * Number of pixels between the container's right border and plot area.
      * This space can be used for Right axis' values.
      * If autoMargin is true and right side has axis, this property is ignored.
      * @default 20
      */
    var marginRight: Double = js.native
    /**
      * Number of pixels between the container's top border and plot area.
      * This space can be used for top axis' values.
      * If autoMargin is true and top side has axis, this property is ignored.
      * @default 20
      */
    var marginTop: Double = js.native
    /**
      * Flag which should be set to false if you need margins to be recalculated on next chart.validateNow() call.
      * @default false
      */
    var marginsUpdated: Boolean = js.native
    /**
      * The opacity of plot area's border. Value range is 0 - 1.
      * @default 0
      */
    var plotAreaBorderAlpha: Double = js.native
    /**
      * The color of the plot area's border.
      * Note, the it is invisible by default, as plotAreaBorderAlpha default value is 0.
      * Set it to a value higher than 0 to make it visible.
      * @default '#000000'
      */
    var plotAreaBorderColor: String = js.native
    /**
      * Opacity of plot area. Plural form is used to keep the same property names as our Flex charts'.
      * Flex charts can accept array of numbers to generate gradients.
      * Although you can set array here, only first value of this array will be used.
      * @default 0
      */
    var plotAreaFillAlphas: Double = js.native
    /**
      * You can set both one color if you need a solid color or array of colors to generate gradients, for example:
      * ["#000000", "#0000CC"]
      * @default '#FFFFFF'
      */
    var plotAreaFillColors: js.Any = js.native
    /**
      * If you are using gradients to fill the plot area, you can use this property to set gradient angle.
      * The only allowed values are horizontal and vertical: 0, 90, 180, 270.
      * @default 0
      */
    var plotAreaGradientAngle: Double = js.native
    /**
      * Array of trend lines added to a chart.
      * You can add trend lines to a chart using this array or access already existing trend lines
      */
    var trendLines: js.Array[typings.amcharts.trendLineMod.default] = js.native
    /**
      * Opacity of zoom-out button background.
      * @default 0
      */
    var zoomOutButtonAlpha: Double = js.native
    /**
      * Zoom-out button background color.
      * @default '#e5e5e5'
      */
    var zoomOutButtonColor: String = js.native
    /**
      * Name of zoom-out button image. In the images folder there is another lens image, called lensWhite.png.
      * You might want to have white lens when background is dark. Or you can simply use your own image.
      * @default lens.png
      */
    var zoomOutButtonImage: String = js.native
    /**
      * Size of zoom-out button image
      * @default: 17
      */
    var zoomOutButtonImageSize: Double = js.native
    /**
      * Padding around the text and image.
      * @default: 8
      */
    var zoomOutButtonPadding: Double = js.native
    /**
      * Opacity of zoom-out button background when mouse is over it.
      * @default: 1
      */
    var zoomOutButtonRollOverAlpha: Double = js.native
    /**
      * Text in the zoom-out button. Show all
      */
    var zoomOutText: String = js.native
    /**
      * Adds a ChartCursor object to a chart
      */
    def addChartCursor(cursor: typings.amcharts.chartCursorMod.default): Unit = js.native
    /**
      * Adds a ChartScrollbar to a chart
      */
    def addChartScrollbar(scrollbar: typings.amcharts.chartScrollbarMod.default): Unit = js.native
    /**
      * Adds a TrendLine to a chart.
      * You should call chart.validateNow() after this method is called in order the trend line to be visible.
      */
    def addTrendLine(trendLine: typings.amcharts.trendLineMod.default): Unit = js.native
    /**
      * Removes cursor from the chart
      */
    def removeChartCursor(): Unit = js.native
    /**
      * Removes scrollbar from the chart
      */
    def removeChartScrollbar(): Unit = js.native
    /**
      * Removes a trend line from a chart.
      * You should call chart.validateNow() in order the changes to be visible.
      */
    def removeTrendLine(trendLine: typings.amcharts.trendLineMod.default): Unit = js.native
  }
  
  @js.native
  class default () extends AmRectangularChart
  
}

