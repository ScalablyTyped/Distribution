package typings
package amchartsLib.amlegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/AmLegend", JSImport.Default)
@js.native
class default () extends AmLegend {
  /**
       * Alignment of legend entries. Possible values are: "left", "center", "right". left
       */
  /* CompleteClass */
  override var align: java.lang.String = js.native
  /**
       * Used if chart is Serial or XY.
       * In case true, margins of the legend are adjusted and made equal to chart's margins.
       * @default true
       */
  /* CompleteClass */
  override var autoMargins: scala.Boolean = js.native
  /**
       * Opacity of legend's background. Value range is 0 - 1
       */
  /* CompleteClass */
  override var backgroundAlpha: scala.Double = js.native
  /**
       * Background color. You should set backgroundAlpha to >0 vallue in order background to be visible.
       * @default "#FFFFFF"
       */
  /* CompleteClass */
  override var backgroundColor: java.lang.String = js.native
  /**
       * Opacity of chart's border. Value range is 0 - 1.
       */
  /* CompleteClass */
  override var borderAlpha: scala.Double = js.native
  /**
       * Color of legend's border. You should set borderAlpha >0 in order border to be visible.
       * @default "#000000"
       */
  /* CompleteClass */
  override var borderColor: java.lang.String = js.native
  /**
       * In case legend position is set to "absolute", you can set distance from bottom of the chart, in pixels.
       */
  /* CompleteClass */
  override var bottom: scala.Double = js.native
  /**
       * Text color. Will use chart's color if not set.
       */
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**
       * This can be used by AmMap only.
       * You can pass array of objects with title, color, markerType values, for example:
       * [{title: "One", color: "#3366CC"},{title: "Two", color: "#FFCC33"}]
       */
  /* CompleteClass */
  override var data: js.Array[_] = js.native
  /**
       * Specifies if each of legend entry should be equal to the most wide entry.
       * Won't look good if legend has more than one line.
       * @default true
       */
  /* CompleteClass */
  override var equalWidths: scala.Boolean = js.native
  /**
       * Font size. Will use chart's font size if not set.
       */
  /* CompleteClass */
  override var fontSize: java.lang.String = js.native
  /**
       * Horizontal space between legend item and left/right border.
       */
  /* CompleteClass */
  override var horizontalGap: scala.Double = js.native
  /**
       * The text which will be displayed in the legend.
       * Tag [[title]] will be replaced with the title of the graph. [[title]]
       */
  /* CompleteClass */
  override var labelText: java.lang.String = js.native
  /**
       * In case legend position is set to "absolute", you can set distance from left side of the chart, in pixels.
       */
  /* CompleteClass */
  override var left: scala.Double = js.native
  /**
       * Bottom margin.
       */
  /* CompleteClass */
  override var marginBottom: scala.Double = js.native
  /**
       * Left margin.
       * This property will be ignored if chart is Serial or XY
       * and autoMargins property of the legend is true (default).
       * @default 20
       */
  /* CompleteClass */
  override var marginLeft: scala.Double = js.native
  /**
       * Right margin.
       * This property will be ignored if chart is Serial or XY
       * and autoMargins property of the legend is true (default).
       * @default 20
       */
  /* CompleteClass */
  override var marginRight: scala.Double = js.native
  /**
       * Top margin.
       */
  /* CompleteClass */
  override var marginTop: scala.Double = js.native
  /**
       * Marker border opacity 1.
       */
  /* CompleteClass */
  override var markerBorderAlpha: scala.Double = js.native
  /**
       * Marker border color. If not set, will use the same color as marker.
       */
  /* CompleteClass */
  override var markerBorderColor: java.lang.String = js.native
  /**
       * Thickness of the legend border.
       * The default value (0) means the line will be a "hairline" (1 px).
       * In case marker type is line, this style will be used for line thickness.
       * @default 1
       */
  /* CompleteClass */
  override var markerBorderThickness: scala.Double = js.native
  /**
       * The color of the disabled marker (when the graph is hidden). #AAB3B3
       */
  /* CompleteClass */
  override var markerDisabledColor: java.lang.String = js.native
  /**
       * Space between legend marker and legend text, in pixels.
       * @default 5
       */
  /* CompleteClass */
  override var markerLabelGap: scala.Double = js.native
  /**
       * Size of the legend marker (key).
       * @default 16
       */
  /* CompleteClass */
  override var markerSize: scala.Double = js.native
  /**
       * Shape of the legend marker (key).
       * Possible values are:
       * "square", "circle", "line", "dashedLine", "triangleUp", "triangleDown", "bubble", "none". square
       */
  /* CompleteClass */
  override var markerType: java.lang.String = js.native
  /**
       * Maximum number of columns in the legend.
       * If Legend's position is set to "right" or "left", maxColumns is automatically set to 1.
       */
  /* CompleteClass */
  override var maxColumns: scala.Double = js.native
  /**
       * Position of a legend. Possible values are: "bottom", "top", "left", "right" and "absolute".
       * In case "absolute", you should set left and top properties too. (this setting is ignored in Stock charts).
       * In case legend is used with AmMap, position is set to "absolute" automatically.  bottom
       */
  /* CompleteClass */
  override var position: java.lang.String = js.native
  /**
       * Specifies whether legend entries should be placed in reversed order.
       */
  /* CompleteClass */
  override var reversedOrder: scala.Boolean = js.native
  /**
       * In case legend position is set to "absolute", you can set distance from right side of the chart, in pixels.
       */
  /* CompleteClass */
  override var right: scala.Double = js.native
  /**
       * Legend item text color on roll-over.  #CC0000
       */
  /* CompleteClass */
  override var rollOverColor: java.lang.String = js.native
  /**
       * When you roll-over the legend entry, all other graphs can reduce their opacity,
       * so that the graph you rolled-over would be distinguished. This style specifies the opacity of the graphs.
       * @default 1
       */
  /* CompleteClass */
  override var rollOverGraphAlpha: scala.Double = js.native
  /**
       * You can use this property to turn all the legend entries off.
       * @default true
       */
  /* CompleteClass */
  override var showEntries: scala.Boolean = js.native
  /**
       * Horizontal space between legend items, in pixels.
       * @default 10
       */
  /* CompleteClass */
  override var spacing: scala.Double = js.native
  /**
       * Legend switch color. #FFFFFF
       */
  /* CompleteClass */
  override var switchColor: java.lang.String = js.native
  /**
       * Legend switch type (in case the legend is switchable). Possible values are "x" and "v". x
       */
  /* CompleteClass */
  override var switchType: java.lang.String = js.native
  /**
       * Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
       * In case legend is used with AmMap, this is set to false automatically.
       * @default true
       */
  /* CompleteClass */
  override var switchable: scala.Boolean = js.native
  /**
       * If true, clicking on the text will show/hide balloon of the graph.
       * Otherwise it will show/hide graph/slice, if switchable is set to true.
       */
  /* CompleteClass */
  override var textClickEnabled: scala.Boolean = js.native
  /**
       * In case legend position is set to "absolute", you can set distance from top of the chart, in pixels.
       */
  /* CompleteClass */
  override var top: scala.Double = js.native
  /**
       * Legend markers can mirror graph’s settings, displaying a line and a real bullet as in the graph itself.
       * Set this property to true if you want to enable this feature.
       * Note, if you set graph colors in dataProvider, they will not be reflected in the marker.
       * @default false
       */
  /* CompleteClass */
  override var useGraphSettings: scala.Boolean = js.native
  /**
       * Specifies if legend labels should be use same color as corresponding markers.
       */
  /* CompleteClass */
  override var useMarkerColorForLabels: scala.Boolean = js.native
  /**
       * Alignment of the value text. Possible values are "left" and "right". right
       */
  /* CompleteClass */
  override var valueAlign: java.lang.String = js.native
  /**
       * The text which will be displayed in the value portion of the legend.
       * You can use tags like
       * [[value]], [[open]], [[high]], [[low]], [[close]], [[percents]], [[description]]. [[value]]
       */
  /* CompleteClass */
  override var valueText: java.lang.String = js.native
  /**
       * Width of the value text.
       * @default 80
       */
  /* CompleteClass */
  override var valueWidth: scala.Double = js.native
  /**
       * Vertical space between legend items also between legend border and first and last legend row.
       * @default: 10
       */
  /* CompleteClass */
  override var verticalGap: scala.Double = js.native
  /**
       * Adds event listener of the type "clickLabel" or "clickMarker" or "hideItem" to the object.
       * @param type Either "clickLabel" or "clickMarker" or "hideItem".
       * @param handler The event handler.
       */
  /* CompleteClass */
  override def addListener(`type`: java.lang.String, handler: js.Function1[/* e */ amchartsLib.Anon_TypeDataItem, scala.Unit]): scala.Unit = js.native
  /**
       * Removes event listener from chart object.
       */
  /* CompleteClass */
  override def removeListener(chart: amchartsLib.amchartMod.default, `type`: java.lang.String, handler: js.Any): scala.Unit = js.native
}

