package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amGraphMod {
  
  @JSImport("amcharts/AmGraph", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AmGraph
  
  @js.native
  trait AmGraph extends StObject {
    
    /**
      * Text which screen readers will read if user rolls-over the bullet/column or sets focus using tab key
      * (this is possible only if tabIndex property of AmGraph is set to some number).
      * Text is added as aria-label tag. Note - not all screen readers and browsers support this.
      * @default "[[title]] [[category]] [[value]]"
      */
    var accessibleLabel: String = js.native
    
    /**
      * Name of the alpha field in your dataProvider.
      */
    var alphaField: String = js.native
    
    /**
      * If you set this to true before chart is drawn, the animation of this graph won't be played.
      * @default false
      */
    var animationPlayed: Boolean = js.native
    
    /**
      * Allows customizing graphs balloons individually (only when ChartCursor is used).
      * Note: the balloon object is not created automatically, you should create it before setting properties
      */
    var balloon: typings.amcharts.amBalloonMod.default = js.native
    
    /**
      * Value balloon color. Will use graph or data item color if not set.
      */
    var balloonColor: String = js.native
    
    /**
      * If you set some function, the graph will call it and pass GraphDataItem and AmGraph objects to it.
      * This function should return a string which will be displayed in a balloon.
      */
    def balloonFunction(graphDataItem: typings.amcharts.graphDataItemMod.default, amGraph: AmGraph): String = js.native
    
    /**
      * Balloon text.
      * You can use tags like
      * [[value]],
      * [[description]],
      * [[percents]],
      * [[open]],
      * [[category]]
      * or any other field name from your data provider. HTML tags can also be used.
      * @default [[value]]
      */
    var balloonText: String = js.native
    
    /**
      * Specifies if the line graph should be placed behind column graphs
      * @default false
      */
    var behindColumns: Boolean = js.native
    
    /**
      * Type of the bullets.
      * Possible values are:
      * "none", "round", "square", "triangleUp", "triangleDown", "triangleLeft", "triangleRight",
      * "bubble", "diamond", "xError", "yError" and "custom".
      * @default "none"
      */
    var bullet: String = js.native
    
    /**
      * Opacity of bullets. Value range is 0 - 1.
      * @default 1
      */
    var bulletAlpha: Double = js.native
    
    /**
      * bulletAxis value is used when you are building error chart.
      * Error chart is a regular serial or XY chart with bullet type set to "xError" or "yError".
      * The graph should know which axis should be used to determine the size of this bullet -
      * that's when bulletAxis should be set. Besides that, you should also set graph.errorField.
      * You can also use other bullet types with this feature too.
      * For example, if you set bulletAxis for XY chart, the size of a bullet will change as you zoom the chart.
      */
    var bulletAxis: typings.amcharts.valueAxisMod.default = js.native
    
    /**
      * Bullet border opacity.
      * @default 0
      */
    var bulletBorderAlpha: Double = js.native
    
    /**
      * Bullet border color. Will use lineColor if not set.
      */
    var bulletBorderColor: String = js.native
    
    /**
      * Bullet border thickness.
      * @default 2
      */
    var bulletBorderThickness: Double = js.native
    
    /**
      * Bullet color. Will use lineColor if not set.
      */
    var bulletColor: String = js.native
    
    /**
      * Name of the bullet field in your dataProvider.
      */
    var bulletField: String = js.native
    
    /**
      * Useful for touch devices - if you set it to 20 or so, the bullets of a graph will have
      * invisible circle around the actual bullet (bullets should still be enabled),
      * which will be easier to touch (bullets usually are smaller and hard to hit).
      */
    var bulletHitAreaSize: Double = js.native
    
    /**
      * Bullet offset. Distance from the actual data point to the bullet.
      * Can be used to place custom bullets above the columns.
      * @default 0
      */
    var bulletOffset: Double = js.native
    
    /**
      * Bullet size.
      * @default 8
      */
    var bulletSize: Double = js.native
    
    /**
      * Name of the bullet size field in your dataProvider.
      */
    var bulletSizeField: String = js.native
    
    /**
      * If this field is set and addClassNames is enabled, the chart will look for a class name string in
      * data using this setting and apply additional class names to elements of the particular data points,
      * such as bullets.
      */
    var classNameField: String = js.native
    
    /**
      * Name of the close field (used by candlesticks and ohlc) in your dataProvider.
      */
    var closeField: String = js.native
    
    /**
      * In case you want to place this graph's columns in front of other columns, set this to false.
      * In case "true", the columns will be clustered next to each other.
      * NOTE: clustering works only for graphs of type "column".
      * @default true
      */
    var clustered: Boolean = js.native
    
    /**
      * Color of value labels. Will use chart's color if not set.
      */
    var color: String = js.native
    
    /**
      * Name of the color field in your dataProvider.
      */
    var colorField: String = js.native
    
    /**
      * You can use this property with non-stacked column graphs and specify order of columns of each category
      * (starting from 0).
      * Important: this feature does not work in stacked columns scenarios as well as with graph
      * toggling enabled in legend.
      */
    var columnIndexField: String = js.native
    
    /**
      * You can specify custom column width for each graph individually.
      * Value range is 0 - 1 (we set relative width, not pixel width here).
      */
    var columnWidth: Double = js.native
    
    /**
      * Specifies whether to connect data points if data is missing. The default value is true.
      * This feature does not work with XY chart.
      * @default true
      */
    var connect: Boolean = js.native
    
    /**
      * Corner radius of column. It can be set both in pixels or in percents.
      * The chart's depth and angle styles must be set to 0. The default value is 0.
      * Note, cornerRadiusTop will be applied for all corners of the column,
      * JavaScript charts do not have a possibility to set separate corner radius for top and bottom.
      * As we want all the property names to be the same both on JS and Flex, we didn't change this too.
      * @default 0
      */
    var cornerRadiusTop: Double = js.native
    
    /**
      * If bulletsEnabled of ChartCurosor is true, a bullet on each graph follows the cursor.
      * You can set opacity of each graphs bullet. In case you want to disable these bullets for a certain graph,
      * set opacity to 0.
      * @default 1
      */
    var cursorBulletAlpha: Double = js.native
    
    /**
      * Path to the image of custom bullet.
      */
    var customBullet: String = js.native
    
    /**
      * Name of the custom bullet field in your dataProvider.
      */
    var customBulletField: String = js.native
    
    /**
      * Path to the image for legend marker.
      */
    var customMarker: String = js.native
    
    /**
      * Dash length. If you set it to a value greater than 0, the graph line (or columns border) will be dashed.
      * @default 0
      */
    var dashLength: Double = js.native
    
    /**
      * Name of the dash length field in your dataProvider.
      * This property adds a possibility to change graphs’ line from solid to dashed on any data point.
      * You can also make columns border dashed using this setting. Note, this won't work with smoothedLineGraph.
      */
    var dashLengthField: String = js.native
    
    /**
      * Used to format balloons if value axis is date-based.
      * @default "MMM DD, YYYY"
      */
    var dateFormat: String = js.native
    
    /**
      * Name of the description field in your dataProvider.
      */
    var descriptionField: String = js.native
    
    /**
      * Name of error value field in your data provider.
      */
    var errorField: String = js.native
    
    /**
      * Opacity of fill. Plural form is used to keep the same property names as our Flex charts'.
      * Flex charts can accept array of numbers to generate gradients.
      * Although you can set array here, only first value of this array will be used.
      * @default 0
      */
    var fillAlphas: Double = js.native
    
    /**
      * Fill color. Will use lineColor if not set. You can also set array of colors here.
      */
    var fillColors: String = js.native
    
    /**
      * Name of the fill colors field in your dataProvider.
      * This property adds a possibility to change line graphs’ fill color on any data point to create highlighted
      * sections of the graph. Works only with AmSerialChart.
      */
    var fillColorsField: String = js.native
    
    /**
      * XY chart only. If you set this property to id or reference of your X or Y axis, and the fillAlphas is > 0,
      * the area between graph and axis will be filled with color, like in this demo.
      */
    var fillToAxis: typings.amcharts.valueAxisMod.default = js.native
    
    /**
      * You can set another graph here and if fillAlpha is >0, the area from this graph to fillToGraph will be filled
      * (instead of filling the area to the X axis).
      * This feature is not supported by smoothedLine graphs and Radar chart.
      */
    var fillToGraph: AmGraph = js.native
    
    /**
      * Column width in pixels.
      * If you set this property, columns will be of a fixed width and won't adjust to the available space.
      */
    var fixedColumnWidth: Double = js.native
    
    /**
      * Size of value labels text. Will use chart's fontSize if not set.
      */
    var fontSize: Double = js.native
    
    /**
      * If this is set `true`, the graph will always break the line if the distance in time between
      * two adjacent data points is bigger than `gapPeriod x minPeriod`, even if `connect` is set to `true`.
      * @default false
      */
    var forceGap: Boolean = js.native
    
    /**
      * Name of the gap field in your dataProvider.
      * You can force graph to show gap at a desired data point using this feature.
      * This feature does not work with XY chart.
      */
    var gapField: String = js.native
    
    /**
      * Using this property you can specify when graph should display gap -
      * if the time difference between data points is bigger than duration of minPeriod * gapPeriod,
      * and connect property of a graph is set to false, graph will display gap.
      * @default 1.1
      */
    var gapPeriod: Double = js.native
    
    /**
      * Orientation of the gradient fills (only for "column" graph type).
      * Possible values are "vertical" and "horizontal".
      * @default "vertical"
      */
    var gradientOrientation: String = js.native
    
    /**
      * Specifies whether the graph is hidden.
      * Do not use this to show/hide the graph, use hideGraph(graph) and showGraph(graph) methods instead.
      * @default false
      */
    var hidden: Boolean = js.native
    
    /**
      * If there are more data points than hideBulletsCount, the bullets will not be shown.
      * 0 means the bullets will always be visible.
      * @default 0
      */
    var hideBulletsCount: Double = js.native
    
    /**
      * Name of the high field (used by candlesticks and ohlc) in your dataProvider.
      */
    var highField: String = js.native
    
    /**
      * Unique id of a graph.
      * It is not required to set one, unless you want to use this graph for as your scrollbar's graph and need
      * to indicate which graph should be used.
      */
    var id: String = js.native
    
    /**
      * Whether to include this graph when calculating min and max value of the axis.
      * @default true
      */
    var includeInMinMax: Boolean = js.native
    
    /**
      * Data label text anchor.
      * @default "auto"
      */
    var labelAnchor: String = js.native
    
    /**
      * Name of label color field in data provider.
      */
    var labelColorField: String = js.native
    
    def labelFunction(valueText: String, data: js.Date, valueAxis: typings.amcharts.valueAxisMod.default): String = js.native
    /**
      * You can use it to format labels of data items in any way you want.
      * Graph will call this function and pass reference to GraphDataItem and formatted text as attributes.
      * This function should return string which will be displayed as label.
      */
    def labelFunction(value: Double, valueText: String, valueAxis: typings.amcharts.valueAxisMod.default): String = js.native
    
    /**
      * Offset of data label.
      * @default 0
      */
    var labelOffset: Double = js.native
    
    /**
      * Position of value label. Possible values are: "bottom", "top", "right", "left", "inside", "middle".
      * Sometimes position is changed by the chart, depending on a graph type, rotation, etc.
      * @default "top"
      */
    var labelPosition: String = js.native
    
    /**
      * Rotation of a data label.
      * @default 0
      */
    var labelRotation: Double = js.native
    
    /**
      * Value label text. You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]].
      */
    var labelText: String = js.native
    
    /**
      * Legend marker opacity. Will use lineAlpha if not set. Value range is 0 - 1.
      */
    var legendAlpha: Double = js.native
    
    /**
      * Legend marker color. Will use lineColor if not set.
      */
    var legendColor: String = js.native
    
    /**
      * It is called and the following attributes are passed:
      * dataItem, formattedText, periodValues, periodPercentValues
      * It should return hex color code which will be used for legend marker.
      */
    var legendColorFunction: js.Object = js.native
    
    /**
      * The text which will be displayed in the value portion of the legend when user is not hovering above
      * any data point. The tags should be made out of two parts - the name of a field
      * (value / open / close / high / low)
      * and the value of the period you want to be show -
      * open / close / high / low / sum / average / count.
      * For example: [[value.sum]]
      * means that sum of all data points of value field in the selected period will be displayed.
      */
    var legendPeriodValueText: String = js.native
    
    /**
      * Legend value text.
      * You can use tags like [[value]], [[description]], [[percents]], [[open]], [[category]]
      * You can also use custom fields from your dataProvider. If not set, uses Legend's valueText.
      */
    var legendValueText: String = js.native
    
    /**
      * Opacity of the line (or column border). Value range is 0 - 1.
      * @default 1
      */
    var lineAlpha: Double = js.native
    
    /**
      * Color of the line (or column border).
      * If you do not set any, the color from AmCoordinateChart.colors array will be used for each subsequent graph.
      */
    var lineColor: String = js.native
    
    /**
      * Name of the line color field in your dataProvider.
      * This property adds a possibility to change graphs’ line color on any data point to create highlighted
      * sections of the graph. Works only with AmSerialChart.
      */
    var lineColorField: String = js.native
    
    /**
      * Specifies thickness of the graph line (or column border).
      * @default 1
      */
    var lineThickness: Double = js.native
    
    /**
      * Name of the low field (used by candlesticks and ohlc) in your dataProvider.
      */
    var lowField: String = js.native
    
    /**
      * Legend marker type. You can set legend marker (key) type for individual graphs.
      * Possible values are:
      * square, circle, diamond, triangleUp, triangleDown, triangleLeft, triangleDown, bubble, line, none.
      */
    var markerType: String = js.native
    
    /**
      * Specifies size of the bullet which value is the biggest (XY chart).
      * @default 50
      */
    var maxBulletSize: Double = js.native
    
    /**
      * Specifies minimum size of the bullet (XY chart).
      * @default 4
      */
    var minBulletSize: Double = js.native
    
    /**
      * It is useful if you have really lots of data points.
      * Based on this property the graph will omit some of the lines
      * (if the distance between points is less that minDistance, in pixels).
      * This will not affect the bullets or indicator in anyway, so the user will not see any difference
      * (unless you set minValue to a bigger value, let say 5),
      * but will increase performance as less lines will be drawn.
      * By setting value to a bigger number you can also make your lines look less jagged.
      * @default 1
      */
    var minDistance: Double = js.native
    
    /**
      * If you use different colors for your negative values, a graph below zero line is filled with negativeColor.
      * With this property you can define a different base value at which
      * colors should be changed to negative colors.
      * @default 0
      */
    var negativeBase: Double = js.native
    
    /**
      * Fill opacity of negative part of the graph. Will use fillAlphas if not set.
      */
    var negativeFillAlphas: Double = js.native
    
    /**
      * Fill color of negative part of the graph. Will use fillColors if not set.
      */
    var negativeFillColors: String = js.native
    
    /**
      * Opacity of the negative portion of the line (or column border). Value range is 0 - 1.
      * @default 1
      */
    var negativeLineAlpha: Double = js.native
    
    /**
      * Color of the line (or column) when the values are negative.
      * In case the graph type is "candlestick" or "ohlc", "negativeLineColor" is used
      * when close value is less then open value.
      */
    var negativeLineColor: String = js.native
    
    /**
      * If you set it to true, column chart will begin new stack.
      * This allows having Clustered and Stacked column/bar chart.
      * @default false
      */
    var newStack: Boolean = js.native
    
    /**
      * In case you want to have a step line graph without risers, you should set this to true.
      * @default false
      */
    var noStepRisers: Boolean = js.native
    
    /**
      * Name of the open field (used by floating columns, candlesticks and ohlc) in your dataProvider.
      */
    var openField: String = js.native
    
    /**
      * Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX
      * and randomY values.
      * For example: {"url":"../amcharts/patterns/black/pattern1.png", "width":4, "height":4}.
      * If you want to have individual patterns for each column, define patterns in data provider and set
      * graph.patternField property. Check amcharts/patterns folder for some patterns.
      * You can create your own patterns and use them. Note, x, y, randomX and randomY properties won't work
      * with IE8 and older. 3D bar/Pie charts won't work properly with patterns.
      */
    var pattern: js.Object = js.native
    
    /**
      * Field name in your data provider which holds pattern information.
      * Value of pattern should be object with url, width, height of an image,
      * optionally it might have x, y, randomX and randomY values.
      * For example: {"url":"../amcharts/patterns/black/pattern1.png", "width":4, "height":4}.
      * Check amcharts/patterns folder for some patterns. You can create your own patterns and use them.
      * Note, x, y, randomX and randomY properties won't work with IE8 and older.
      * 3D bar/Pie charts won't work properly with patterns.
      */
    var patternField: String = js.native
    
    /**
      * This property can be used by step graphs - you can set how many periods one horizontal line should span.
      * @default 1
      */
    var periodSpan: Double = js.native
    
    /**
      * Specifies where data points should be placed -
      * on the beginning of the period (day, hour, etc) or in the middle
      * (only when parseDates property of categoryAxis is set to true).
      * This setting affects Serial chart only. Possible values are "start", "middle" and "end"
      * @default "middle"
      */
    var pointPosition: String = js.native
    
    /**
      * Precision of values. Will use chart's precision if not set any.
      */
    var precision: Double = js.native
    
    /**
      * If this is set to true, candlesticks will be colored in a different manner -
      * if current close is less than current open, the candlestick will be empty, otherwise - filled with color.
      * If previous close is less than current close, the candlestick will use positive color,
      * otherwise - negative color.
      * @default false
      */
    var proCandlesticks: Boolean = js.native
    
    /**
      * Gantt chart only. Contains unmodified segment object from data provider.
      */
    var segmentData: js.Object = js.native
    
    /**
      * If graph's type is column and labelText is set, graph hides labels which do not fit into the column's
      * space or go outside plot area. If you don't want these labels to be hidden, set this to true.
      * @default false
      */
    var showAllValueLabels: Boolean = js.native
    
    /**
      * Specifies whether the value balloon of this graph is shown when mouse is over data item or chart's
      * indicator is over some series.
      * @default true
      */
    var showBalloon: Boolean = js.native
    
    /**
      * Specifies graphs value at which cursor is showed. This is only important for candlestick and ohlc charts,
      * also if column chart has "open" value.
      * Possible values are: "open", "close", "high", "low".
      * "top" and "bottom" values will glue the balloon to top/bottom of the plot area.
      * @default "close"
      */
    var showBalloonAt: String = js.native
    
    /**
      * Works with candlestick graph type, you can set it to open, close, high, low.
      * If you set it to high, the events will be shown at the tip of the high line.
      * @default "close"
      */
    var showBulletsAt: String = js.native
    
    /**
      * If you want mouse pointer to change to hand when hovering the graph, set this property to true.
      * @default false
      */
    var showHandOnHover: Boolean = js.native
    
    /**
      * It can only be used together with topRadius (when columns look like cylinders).
      * If you set it to true, the cylinder will be lowered down so that the center of it's bottom circle would be
      * right on category axis.
      * @default false
      */
    var showOnAxis: Boolean = js.native
    
    /**
      * If the value axis of this graph has stack types like "regular" or "100%"
      * You can exclude this graph from stacking.
      * @default true
      */
    var stackable: Boolean = js.native
    
    /**
      * Step graph only. Specifies to which direction step should be drawn.
      * @default "right"
      */
    var stepDirection: String = js.native
    
    /**
      * If you set it to false, the graph will not be hidden when user clicks on legend entry.
      * @default true
      */
    var switchable: Boolean = js.native
    
    /**
      * In case you set it to some number, the chart will set focus on bullet/column (starting from first)
      * when user clicks tab key. When a focus is set, screen readers like NVDA Screen reader will read label
      * which is set using accessibleLabel property of AmGraph. Note, not all browsers and readers support this.
      */
    var tabIndex: Double = js.native
    
    /**
      * Graph title.
      */
    var title: String = js.native
    
    /**
      * If you set this to 1, columns will become cylinders (must set depth3D and angle properties of a chart to >0
      * values in order this to be visible). you can make columns look like cones (set topRadius to 0)
      * or even like some glasses (set to bigger than 1). We strongly recommend setting grid opacity to 0
      * in order this to look good.
      */
    var topRadius: Double = js.native
    
    /**
      * Type of the graph.
      * Possible values are: "line", "column", "step", "smoothedLine", "candlestick", "ohlc".
      * XY and Radar charts can only display "line" type graphs.
      * @default "line"
      */
    var `type`: String = js.native
    
    /**
      * Name of the url field in your dataProvider.
      */
    var urlField: String = js.native
    
    /**
      * Target to open URLs in, i.e. _blank, _top, etc.
      */
    var urlTarget: String = js.native
    
    /**
      * If set to true, the bullet border will take the same color as graph line.
      * @default false
      */
    var useLineColorForBulletBorder: Boolean = js.native
    
    /**
      * If negativeLineColor and/or negativeFillColors are set and useNegativeColorIfDown is set to true
      * (default is false), the line, step and column graphs will use these colors for lines,
      * bullets or columns if previous value is bigger than current value. In case you set openField for the graph,
      * the graph will compare current value with openField value instead of comparing to previous value.
      * @default false
      */
    var useNegativeColorIfDown: Boolean = js.native
    
    /**
      * Specifies which value axis the graph will use. Will use the first value axis if not set.
      * You can use reference to the real ValueAxis object or set value axis id.
      * @default ValueAxis
      */
    var valueAxis: typings.amcharts.valueAxisMod.default = js.native
    
    /**
      * Name of the value field in your dataProvider.
      */
    var valueField: String = js.native
    
    /**
      * Specifies whether this graph should be shown in the Legend.
      * @default true
      */
    var visibleInLegend: Boolean = js.native
    
    /**
      * XY chart only. A horizontal value axis object to attach graph to.
      * @default ValueAxis
      */
    var xAxis: typings.amcharts.valueAxisMod.default = js.native
    
    /**
      * XY chart only. Name of the x field in your dataProvider.
      */
    var xField: String = js.native
    
    /**
      * XY chart only. A vertical value axis object to attach graph to.
      * @default ValueAxis
      */
    var yAxis: typings.amcharts.valueAxisMod.default = js.native
    
    /**
      * XY chart only. Name of the y field in your dataProvider.
      */
    var yField: String = js.native
  }
}
