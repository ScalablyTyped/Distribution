package typings.amcharts.amLegendMod

import typings.amcharts.AnonDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmLegend extends js.Object {
  /**
    * Alignment of legend entries. Possible values are: "left", "center", "right". left
    */
  var align: String
  /**
    * Used if chart is Serial or XY.
    * In case true, margins of the legend are adjusted and made equal to chart's margins.
    * @default true
    */
  var autoMargins: Boolean
  /**
    * Opacity of legend's background. Value range is 0 - 1
    */
  var backgroundAlpha: Double
  /**
    * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
    * @default "#FFFFFF"
    */
  var backgroundColor: String
  /**
    * Opacity of chart's border. Value range is 0 - 1.
    */
  var borderAlpha: Double
  /**
    * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
    * @default "#000000"
    */
  var borderColor: String
  /**
    * In case legend position is set to "absolute", you can set distance from bottom of the chart, in pixels.
    */
  var bottom: Double
  /**
    * Text color. Will use chart's color if not set.
    */
  var color: String
  /**
    * This can be used by AmMap only.
    * You can pass array of objects with title, color, markerType values, for example:
    * [{title: "One", color: "#3366CC"},{title: "Two", color: "#FFCC33"}]
    */
  var data: js.Array[_]
  /**
    * Specifies if each of legend entry should be equal to the most wide entry.
    * Won't look good if legend has more than one line.
    * @default true
    */
  var equalWidths: Boolean
  /**
    * Font size. Will use chart's font size if not set.
    */
  var fontSize: String
  /**
    * Horizontal space between legend item and left/right border.
    */
  var horizontalGap: Double
  /**
    * The text which will be displayed in the legend.
    * Tag [[title]] will be replaced with the title of the graph. [[title]]
    */
  var labelText: String
  /**
    * In case legend position is set to "absolute", you can set distance from left side of the chart, in pixels.
    */
  var left: Double
  /**
    * Bottom margin.
    */
  var marginBottom: Double
  /**
    * Left margin.
    * This property will be ignored if chart is Serial or XY
    * and autoMargins property of the legend is true (default).
    * @default 20
    */
  var marginLeft: Double
  /**
    * Right margin.
    * This property will be ignored if chart is Serial or XY
    * and autoMargins property of the legend is true (default).
    * @default 20
    */
  var marginRight: Double
  /**
    * Top margin.
    */
  var marginTop: Double
  /**
    * Marker border opacity 1.
    */
  var markerBorderAlpha: Double
  /**
    * Marker border color. If not set, will use the same color as marker.
    */
  var markerBorderColor: String
  /**
    * Thickness of the legend border.
    * The default value (0) means the line will be a "hairline" (1 px).
    * In case marker type is line, this style will be used for line thickness.
    * @default 1
    */
  var markerBorderThickness: Double
  /**
    * The color of the disabled marker (when the graph is hidden). #AAB3B3
    */
  var markerDisabledColor: String
  /**
    * Space between legend marker and legend text, in pixels.
    * @default 5
    */
  var markerLabelGap: Double
  /**
    * Size of the legend marker (key).
    * @default 16
    */
  var markerSize: Double
  /**
    * Shape of the legend marker (key).
    * Possible values are:
    * "square", "circle", "line", "dashedLine", "triangleUp", "triangleDown", "bubble", "none". square
    */
  var markerType: String
  /**
    * Maximum number of columns in the legend.
    * If Legend's position is set to "right" or "left", maxColumns is automatically set to 1.
    */
  var maxColumns: Double
  /**
    * Position of a legend. Possible values are: "bottom", "top", "left", "right" and "absolute".
    * In case "absolute", you should set left and top properties too. (this setting is ignored in Stock charts).
    * In case legend is used with AmMap, position is set to "absolute" automatically.  bottom
    */
  var position: String
  /**
    * Specifies whether legend entries should be placed in reversed order.
    */
  var reversedOrder: Boolean
  /**
    * In case legend position is set to "absolute", you can set distance from right side of the chart, in pixels.
    */
  var right: Double
  /**
    * Legend item text color on roll-over.  #CC0000
    */
  var rollOverColor: String
  /**
    * When you roll-over the legend entry, all other graphs can reduce their opacity,
    * so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs.
    * @default 1
    */
  var rollOverGraphAlpha: Double
  /**
    * You can use this property to turn all the legend entries off.
    * @default true
    */
  var showEntries: Boolean
  /**
    * Horizontal space between legend items, in pixels.
    * @default 10
    */
  var spacing: Double
  /**
    * Legend switch color. #FFFFFF
    */
  var switchColor: String
  /**
    * Legend switch type (in case the legend is switchable). Possible values are "x" and "v". x
    */
  var switchType: String
  /**
    * Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
    * In case legend is used with AmMap, this is set to false automatically.
    * @default true
    */
  var switchable: Boolean
  /**
    * If true, clicking on the text will show/hide balloon of the graph.
    * Otherwise it will show/hide graph/slice, if switchable is set to true.
    */
  var textClickEnabled: Boolean
  /**
    * In case legend position is set to "absolute", you can set distance from top of the chart, in pixels.
    */
  var top: Double
  /**
    * Legend markers can mirror graph’s settings, displaying a line and a real bullet as in the graph itself.
    * Set this property to true if you want to enable this feature.
    * Note, if you set graph colors in dataProvider, they will not be reflected in the marker.
    * @default false
    */
  var useGraphSettings: Boolean
  /**
    * Specifies if legend labels should be use same color as corresponding markers.
    */
  var useMarkerColorForLabels: Boolean
  /**
    * Alignment of the value text. Possible values are "left" and "right". right
    */
  var valueAlign: String
  /**
    * The text which will be displayed in the value portion of the legend.
    * You can use tags like
    * [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]. [[value]]
    */
  var valueText: String
  /**
    * Width of the value text.
    * @default 80
    */
  var valueWidth: Double
  /**
    * Vertical space between legend items also between legend border and first and last legend row.
    * @default: 10
    */
  var verticalGap: Double
  /**
    * Adds event listener of the type "clickLabel" or "clickMarker" or "hideItem" to the object.
    * @param type Either "clickLabel" or "clickMarker" or "hideItem".
    * @param handler The event handler.
    */
  def addListener(`type`: String, handler: js.Function1[/* e */ AnonDataItem, Unit]): Unit
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit
}

object AmLegend {
  @scala.inline
  def apply(
    addListener: (String, js.Function1[/* e */ AnonDataItem, Unit]) => Unit,
    align: String,
    autoMargins: Boolean,
    backgroundAlpha: Double,
    backgroundColor: String,
    borderAlpha: Double,
    borderColor: String,
    bottom: Double,
    color: String,
    data: js.Array[_],
    equalWidths: Boolean,
    fontSize: String,
    horizontalGap: Double,
    labelText: String,
    left: Double,
    marginBottom: Double,
    marginLeft: Double,
    marginRight: Double,
    marginTop: Double,
    markerBorderAlpha: Double,
    markerBorderColor: String,
    markerBorderThickness: Double,
    markerDisabledColor: String,
    markerLabelGap: Double,
    markerSize: Double,
    markerType: String,
    maxColumns: Double,
    position: String,
    removeListener: (typings.amcharts.amChartMod.default, String, js.Any) => Unit,
    reversedOrder: Boolean,
    right: Double,
    rollOverColor: String,
    rollOverGraphAlpha: Double,
    showEntries: Boolean,
    spacing: Double,
    switchColor: String,
    switchType: String,
    switchable: Boolean,
    textClickEnabled: Boolean,
    top: Double,
    useGraphSettings: Boolean,
    useMarkerColorForLabels: Boolean,
    valueAlign: String,
    valueText: String,
    valueWidth: Double,
    verticalGap: Double
  ): AmLegend = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), align = align.asInstanceOf[js.Any], autoMargins = autoMargins.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlpha = borderAlpha.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], equalWidths = equalWidths.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], horizontalGap = horizontalGap.asInstanceOf[js.Any], labelText = labelText.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], markerBorderAlpha = markerBorderAlpha.asInstanceOf[js.Any], markerBorderColor = markerBorderColor.asInstanceOf[js.Any], markerBorderThickness = markerBorderThickness.asInstanceOf[js.Any], markerDisabledColor = markerDisabledColor.asInstanceOf[js.Any], markerLabelGap = markerLabelGap.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], markerType = markerType.asInstanceOf[js.Any], maxColumns = maxColumns.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3(removeListener), reversedOrder = reversedOrder.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], rollOverColor = rollOverColor.asInstanceOf[js.Any], rollOverGraphAlpha = rollOverGraphAlpha.asInstanceOf[js.Any], showEntries = showEntries.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], switchColor = switchColor.asInstanceOf[js.Any], switchType = switchType.asInstanceOf[js.Any], switchable = switchable.asInstanceOf[js.Any], textClickEnabled = textClickEnabled.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], useGraphSettings = useGraphSettings.asInstanceOf[js.Any], useMarkerColorForLabels = useMarkerColorForLabels.asInstanceOf[js.Any], valueAlign = valueAlign.asInstanceOf[js.Any], valueText = valueText.asInstanceOf[js.Any], valueWidth = valueWidth.asInstanceOf[js.Any], verticalGap = verticalGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmLegend]
  }
}

