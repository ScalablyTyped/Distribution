package typings
package amchartsLib.amlegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmLegend extends js.Object {
  /**
    * Alignment of legend entries. Possible values are: "left", "center", "right". left
    */
  var align: java.lang.String
  /**
    * Used if chart is Serial or XY.
    * In case true, margins of the legend are adjusted and made equal to chart's margins.
    * @default true
    */
  var autoMargins: scala.Boolean
  /**
    * Opacity of legend's background. Value range is 0 - 1
    */
  var backgroundAlpha: scala.Double
  /**
    * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
    * @default "#FFFFFF"
    */
  var backgroundColor: java.lang.String
  /**
    * Opacity of chart's border. Value range is 0 - 1.
    */
  var borderAlpha: scala.Double
  /**
    * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
    * @default "#000000"
    */
  var borderColor: java.lang.String
  /**
    * In case legend position is set to "absolute", you can set distance from bottom of the chart, in pixels.
    */
  var bottom: scala.Double
  /**
    * Text color. Will use chart's color if not set.
    */
  var color: java.lang.String
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
  var equalWidths: scala.Boolean
  /**
    * Font size. Will use chart's font size if not set.
    */
  var fontSize: java.lang.String
  /**
    * Horizontal space between legend item and left/right border.
    */
  var horizontalGap: scala.Double
  /**
    * The text which will be displayed in the legend.
    * Tag [[title]] will be replaced with the title of the graph. [[title]]
    */
  var labelText: java.lang.String
  /**
    * In case legend position is set to "absolute", you can set distance from left side of the chart, in pixels.
    */
  var left: scala.Double
  /**
    * Bottom margin.
    */
  var marginBottom: scala.Double
  /**
    * Left margin.
    * This property will be ignored if chart is Serial or XY
    * and autoMargins property of the legend is true (default).
    * @default 20
    */
  var marginLeft: scala.Double
  /**
    * Right margin.
    * This property will be ignored if chart is Serial or XY
    * and autoMargins property of the legend is true (default).
    * @default 20
    */
  var marginRight: scala.Double
  /**
    * Top margin.
    */
  var marginTop: scala.Double
  /**
    * Marker border opacity 1.
    */
  var markerBorderAlpha: scala.Double
  /**
    * Marker border color. If not set, will use the same color as marker.
    */
  var markerBorderColor: java.lang.String
  /**
    * Thickness of the legend border.
    * The default value (0) means the line will be a "hairline" (1 px).
    * In case marker type is line, this style will be used for line thickness.
    * @default 1
    */
  var markerBorderThickness: scala.Double
  /**
    * The color of the disabled marker (when the graph is hidden). #AAB3B3
    */
  var markerDisabledColor: java.lang.String
  /**
    * Space between legend marker and legend text, in pixels.
    * @default 5
    */
  var markerLabelGap: scala.Double
  /**
    * Size of the legend marker (key).
    * @default 16
    */
  var markerSize: scala.Double
  /**
    * Shape of the legend marker (key).
    * Possible values are:
    * "square", "circle", "line", "dashedLine", "triangleUp", "triangleDown", "bubble", "none". square
    */
  var markerType: java.lang.String
  /**
    * Maximum number of columns in the legend.
    * If Legend's position is set to "right" or "left", maxColumns is automatically set to 1.
    */
  var maxColumns: scala.Double
  /**
    * Position of a legend. Possible values are: "bottom", "top", "left", "right" and "absolute".
    * In case "absolute", you should set left and top properties too. (this setting is ignored in Stock charts).
    * In case legend is used with AmMap, position is set to "absolute" automatically.  bottom
    */
  var position: java.lang.String
  /**
    * Specifies whether legend entries should be placed in reversed order.
    */
  var reversedOrder: scala.Boolean
  /**
    * In case legend position is set to "absolute", you can set distance from right side of the chart, in pixels.
    */
  var right: scala.Double
  /**
    * Legend item text color on roll-over.  #CC0000
    */
  var rollOverColor: java.lang.String
  /**
    * When you roll-over the legend entry, all other graphs can reduce their opacity,
    * so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs.
    * @default 1
    */
  var rollOverGraphAlpha: scala.Double
  /**
    * You can use this property to turn all the legend entries off.
    * @default true
    */
  var showEntries: scala.Boolean
  /**
    * Horizontal space between legend items, in pixels.
    * @default 10
    */
  var spacing: scala.Double
  /**
    * Legend switch color. #FFFFFF
    */
  var switchColor: java.lang.String
  /**
    * Legend switch type (in case the legend is switchable). Possible values are "x" and "v". x
    */
  var switchType: java.lang.String
  /**
    * Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
    * In case legend is used with AmMap, this is set to false automatically.
    * @default true
    */
  var switchable: scala.Boolean
  /**
    * If true, clicking on the text will show/hide balloon of the graph.
    * Otherwise it will show/hide graph/slice, if switchable is set to true.
    */
  var textClickEnabled: scala.Boolean
  /**
    * In case legend position is set to "absolute", you can set distance from top of the chart, in pixels.
    */
  var top: scala.Double
  /**
    * Legend markers can mirror graph’s settings, displaying a line and a real bullet as in the graph itself.
    * Set this property to true if you want to enable this feature.
    * Note, if you set graph colors in dataProvider, they will not be reflected in the marker.
    * @default false
    */
  var useGraphSettings: scala.Boolean
  /**
    * Specifies if legend labels should be use same color as corresponding markers.
    */
  var useMarkerColorForLabels: scala.Boolean
  /**
    * Alignment of the value text. Possible values are "left" and "right". right
    */
  var valueAlign: java.lang.String
  /**
    * The text which will be displayed in the value portion of the legend.
    * You can use tags like
    * [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]. [[value]]
    */
  var valueText: java.lang.String
  /**
    * Width of the value text.
    * @default 80
    */
  var valueWidth: scala.Double
  /**
    * Vertical space between legend items also between legend border and first and last legend row.
    * @default: 10
    */
  var verticalGap: scala.Double
  /**
    * Adds event listener of the type "clickLabel" or "clickMarker" or "hideItem" to the object.
    * @param type Either "clickLabel" or "clickMarker" or "hideItem".
    * @param handler The event handler.
    */
  def addListener(
    `type`: java.lang.String,
    handler: js.Function1[/* e */ amchartsLib.Anon_ChartDataItem, scala.Unit]
  ): scala.Unit
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: amchartsLib.amchartMod.default, `type`: java.lang.String, handler: js.Any): scala.Unit
}

object AmLegend {
  @scala.inline
  def apply(
    addListener: js.Function2[
      java.lang.String, 
      js.Function1[/* e */ amchartsLib.Anon_ChartDataItem, scala.Unit], 
      scala.Unit
    ],
    align: java.lang.String,
    autoMargins: scala.Boolean,
    backgroundAlpha: scala.Double,
    backgroundColor: java.lang.String,
    borderAlpha: scala.Double,
    borderColor: java.lang.String,
    bottom: scala.Double,
    color: java.lang.String,
    data: js.Array[_],
    equalWidths: scala.Boolean,
    fontSize: java.lang.String,
    horizontalGap: scala.Double,
    labelText: java.lang.String,
    left: scala.Double,
    marginBottom: scala.Double,
    marginLeft: scala.Double,
    marginRight: scala.Double,
    marginTop: scala.Double,
    markerBorderAlpha: scala.Double,
    markerBorderColor: java.lang.String,
    markerBorderThickness: scala.Double,
    markerDisabledColor: java.lang.String,
    markerLabelGap: scala.Double,
    markerSize: scala.Double,
    markerType: java.lang.String,
    maxColumns: scala.Double,
    position: java.lang.String,
    removeListener: js.Function3[amchartsLib.amchartMod.default, java.lang.String, js.Any, scala.Unit],
    reversedOrder: scala.Boolean,
    right: scala.Double,
    rollOverColor: java.lang.String,
    rollOverGraphAlpha: scala.Double,
    showEntries: scala.Boolean,
    spacing: scala.Double,
    switchColor: java.lang.String,
    switchType: java.lang.String,
    switchable: scala.Boolean,
    textClickEnabled: scala.Boolean,
    top: scala.Double,
    useGraphSettings: scala.Boolean,
    useMarkerColorForLabels: scala.Boolean,
    valueAlign: java.lang.String,
    valueText: java.lang.String,
    valueWidth: scala.Double,
    verticalGap: scala.Double
  ): AmLegend = {
    val __obj = js.Dynamic.literal(addListener = addListener, align = align, autoMargins = autoMargins, backgroundAlpha = backgroundAlpha, backgroundColor = backgroundColor, borderAlpha = borderAlpha, borderColor = borderColor, bottom = bottom, color = color, data = data, equalWidths = equalWidths, fontSize = fontSize, horizontalGap = horizontalGap, labelText = labelText, left = left, marginBottom = marginBottom, marginLeft = marginLeft, marginRight = marginRight, marginTop = marginTop, markerBorderAlpha = markerBorderAlpha, markerBorderColor = markerBorderColor, markerBorderThickness = markerBorderThickness, markerDisabledColor = markerDisabledColor, markerLabelGap = markerLabelGap, markerSize = markerSize, markerType = markerType, maxColumns = maxColumns, position = position, removeListener = removeListener, reversedOrder = reversedOrder, right = right, rollOverColor = rollOverColor, rollOverGraphAlpha = rollOverGraphAlpha, showEntries = showEntries, spacing = spacing, switchColor = switchColor, switchType = switchType, switchable = switchable, textClickEnabled = textClickEnabled, top = top, useGraphSettings = useGraphSettings, useMarkerColorForLabels = useMarkerColorForLabels, valueAlign = valueAlign, valueText = valueText, valueWidth = valueWidth, verticalGap = verticalGap)
  
    __obj.asInstanceOf[AmLegend]
  }
}

