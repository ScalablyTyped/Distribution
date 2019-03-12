package typings
package amchartsLib.amChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmChart extends js.Object {
  /**
    * Specifies, if class names should be added to chart elements.
    */
  var addClassNames: scala.Boolean = js.native
  /**
    * Array of Labels. Example of label object, with all possible properties:
    * {
    *     "x": 20,
    *     "y": 20,
    *     "text": "this is label",
    *     "align": "left",
    *     "size": 12,
    *     "color": "#CC0000",
    *     "alpha": 1,
    *     "rotation": 0,
    *     "bold": true,
    *     "url": "http://www.amcharts.com"
    * }
    */
  var allLabels: js.Array[amchartsLib.labelMod.default] = js.native
  /**
    * Set this to false if you don't want chart to resize itself whenever its parent container size changes.
    */
  var autoResize: scala.Boolean = js.native
  /**
    * Opacity of background. Set it to >0 value if you want backgroundColor to work.
    * However we recommend changing div's background-color style for changing background color.
    */
  var backgroundAlpha: scala.Double = js.native
  /**
    * Background color. You should set backgroundAlpha to >0 value in order background to be visible.
    * We recommend setting background color directly on a chart's DIV instead of using this property.
    * @default "#FFFFFF"
    */
  var backgroundColor: java.lang.String = js.native
  /**
    * The chart creates AmBalloon class itself.
    * If you want to customize balloon, get balloon instance using this property,
    * and then change balloon's properties.
    */
  var balloon: amchartsLib.amBalloonMod.default = js.native
  /**
    * Opacity of chart's border. Value range is 0 - 1.
    */
  var borderAlpha: scala.Double = js.native
  /**
    * Color of chart's border. You should set borderAlpha >0 in order border to be visible.
    * We recommend setting border color directly on a chart's DIV instead of using this property.
    * @default #000000
    */
  var borderColor: java.lang.String = js.native
  /**
    * This prefix is added to all class names which are added to all visual elements of a chart
    * in case addClassNames is set to true.
    */
  var classNamePrefix: java.lang.String = js.native
  /**
    * Text color. #000000
    */
  var color: java.lang.String = js.native
  /**
    * Non-commercial version only. Specifies position of link to amCharts site.
    * Allowed values are: top-left, top-right, bottom-left and bottom-right.
    * @default 'top-left'
    */
  var creditsPosition: java.lang.String = js.native
  /**
    * Array of data objects, for example:
    * [{country:"US", value:524}, {country:"UK", value:624}, {country:"Lithuania", value:824}].
    * You can have any number of fields and use any field names.
    * In case of AmMap, data provider should be MapData object.
    */
  var dataProvider: js.Array[_] = js.native
  /**
    * Decimal separator.
    * @default "."
    */
  var decimalSeparator: java.lang.String = js.native
  /**
    * Using this property you can add any additional information to SVG, like SVG filters or clip paths.
    * The structure of this object should be identical to XML structure of a object you are adding,
    * only in JSON format.
    */
  var defs: js.Any = js.native
  /**
    * Export config. Specifies how export to image/data export/print/annotate menu will look and behave.
    * You can find a lot of examples in amcharts/plugins/export folder.
    */
  var export: amchartsLib.exportSettingsMod.default = js.native
  /**
    * Font family. Verdana
    */
  var fontFamily: java.lang.String = js.native
  /**
    * Font size.
    * @default 11
    */
  var fontSize: java.lang.String = js.native
  /**
    * Defines by how many pixels hand-drawn line (when handDrawn is set to true) will fluctuate.
    * @default 2
    */
  var handDrawScatter: scala.Double = js.native
  /**
    * Defines by how many pixels line thickness will fluctuate (when handDrawn is set to true).
    * @default 1
    */
  var handDrawThickness: scala.Double = js.native
  /**
    * If you set this to true, the lines of the chart will be distorted and will produce hand-drawn effect.
    * Try to adjust chart.handDrawScatter and chart.handDrawThickness properties for a more scattered result.
    * @default false
    */
  var handDrawn: scala.Boolean = js.native
  /**
    * Time, in milliseconds after which balloon is hidden if the user rolls-out of the object.
    * Might be useful for AmMap to avoid balloon flickering while moving mouse over the areas.
    * Note, this is not duration of fade-out. Duration of fade-out is set in AmBalloon class.
    * @default 150
    */
  var hideBalloonTime: scala.Double = js.native
  /**
    * Legend of a chart.
    */
  var legend: amchartsLib.amLegendMod.default = js.native
  /**
    * Reference to the div of the legend.
    */
  var legendDiv: stdLib.HTMLElement = js.native
  /**
    * You can add listeners of events using this property. Example:
    * listeners = [{"event":"dataUpdated", "method":handleEvent}];
    */
  var listerns: js.Array[js.Object] = js.native
  /**
    * This setting affects touch-screen devices only.
    * If a chart is on a page, and panEventsEnabled are set to true, the page won't move
    * if the user touches the chart first.
    * If a chart is big enough and occupies all the screen of your touch device,
    * the user won’t be able to move the page at all. That's why the default value is "false".
    * If you think that selecting/panning the chart or moving/pinching the map is a primary purpose of your users,
    * you should set panEventsEnabled to true.
    */
  var panEventsEnabled: scala.Boolean = js.native
  /**
    * Specifies absolute or relative path to amCharts files, i.e. "amcharts/". (where all .js files are located)
    * If relative URLs are used, they will be relative to the current web page, displaying the chart.
    * You can also set path globally, using global JavaScript variable AmCharts_path.
    * If this variable is set, and "path" is not set in chart config, the chart will assume the path from the
    * global variable. This allows setting amCharts path globally. I.e.:
    * let AmCharts_path = "/libs/amcharts/";
    * "path" parameter will be used by the charts to locate it's files, like images, plugins or patterns.
    */
  var path: java.lang.String = js.native
  /**
    * Specifies path to the folder where images like resize grips, lens and similar are.
    * IMPORTANT: Since V3.14.12, you should use "path" to point to amCharts directory instead.
    * The "pathToImages" will be automatically set and does not need to be in the chart config,
    * unless you keep your images separately from other amCharts files.
    */
  var pathToImages: java.lang.String = js.native
  /**
    * Precision of percent values. -1 means percent values won't be rounded at all and show as they are.
    * @default 2
    */
  var percentPrecision: scala.Double = js.native
  /**
    * Precision of values. -1 means values won't be rounded at all and show as they are.
    * @default 1
    */
  var precision: scala.Double = js.native
  /**
    * Prefixes which are used to make big numbers shorter: 2M instead of 2000000, etc.
    * Prefixes are used on value axes and in the legend.
    * To enable prefixes, set usePrefixes property to true.
    * [
    *     {number:1e+3,prefix:"k"},
    *     {number:1e+6,prefix:"M"},
    *     {number:1e+9,prefix:"G"},
    *     {number:1e+12,prefix:"T"},
    *     {number:1e+15,prefix:"P"},
    *     {number:1e+18,prefix:"E"},
    *     {number:1e+21,prefix:"Z"},
    *     {number:1e+24,prefix:"Y"}
    * ]
    */
  var prefixesOfBigNumbers: js.Array[_] = js.native
  /**
    * Prefixes which are used to make small numbers shorter: 2μ instead of 0.000002, etc.
    * Prefixes are used on value axes and in the legend.
    * To enable prefixes, set usePrefixes property to true.
    * [
    *     {number:1e-24, prefix:"y"},
    *     {number:1e-21, prefix:"z"},
    *     {number:1e-18, prefix:"a"},
    *     {number:1e-15, prefix:"f"},
    *     {number:1e-12, prefix:"p"},
    *     {number:1e-9, prefix:"n"},
    *     {number:1e-6, prefix:"μ"},
    *     {number:1e-3, prefix:"m"}
    * ]
    */
  var prefixesOfSmallNumbers: js.Array[_] = js.native
  /**
    * Theme of a chart. Config files of themes can be found in amcharts/themes/ folder.
    * More info about using themes.
    */
  var theme: java.lang.String = js.native
  /**
    * Thousands separator.
    * @default "."
    */
  var thousandsSeparator: java.lang.String = js.native
  /**
    * Array of Title objects.
    */
  var titles: js.Array[amchartsLib.titleMod.default] = js.native
  /**
    * Type of a chart. Required when creating chart using JSON.
    * Possible types are: serial, pie, xy, radar, funnel, gauge, map, stock.
    */
  var `type`: java.lang.String = js.native
  /**
    * If true, prefixes will be used for big and small numbers.
    * You can set arrays of prefixes via prefixesOfSmallNumbers and prefixesOfBigNumbers properties.
    */
  var usePrefixes: scala.Boolean = js.native
  /**
    * Read-only. Indicates current version of a script.
    */
  var version: java.lang.String = js.native
  def addLabel(
    x: java.lang.String,
    y: java.lang.String,
    text: java.lang.String,
    align: java.lang.String,
    size: js.UndefOr[scala.Double],
    color: js.UndefOr[java.lang.String],
    rotation: js.UndefOr[scala.Double],
    alpha: js.UndefOr[scala.Double],
    bold: js.UndefOr[scala.Boolean],
    url: js.UndefOr[java.lang.String]
  ): js.Any = js.native
  def addLabel(
    x: java.lang.String,
    y: scala.Double,
    text: java.lang.String,
    align: java.lang.String,
    size: js.UndefOr[scala.Double],
    color: js.UndefOr[java.lang.String],
    rotation: js.UndefOr[scala.Double],
    alpha: js.UndefOr[scala.Double],
    bold: js.UndefOr[scala.Boolean],
    url: js.UndefOr[java.lang.String]
  ): js.Any = js.native
  def addLabel(
    x: scala.Double,
    y: java.lang.String,
    text: java.lang.String,
    align: java.lang.String,
    size: js.UndefOr[scala.Double],
    color: js.UndefOr[java.lang.String],
    rotation: js.UndefOr[scala.Double],
    alpha: js.UndefOr[scala.Double],
    bold: js.UndefOr[scala.Boolean],
    url: js.UndefOr[java.lang.String]
  ): js.Any = js.native
  /**
    * Adds a label on a chart.
    * You can use it for labeling axes, adding chart title, etc. x and y coordinates can be set in
    * number, percent, or a number with ! in front of it -
    * coordinate will be calculated from right or bottom instead of left or top.
    * x - horizontal coordinate
    * y - vertical coordinate
    * text - label's text
    * align - alignment (left/right/center)
    * size - text size
    * color - text color
    * rotation - angle of rotation
    * alpha - label alpha
    * bold - specifies if text is bold (true/false),
    * url - url
    */
  def addLabel(
    x: scala.Double,
    y: scala.Double,
    text: java.lang.String,
    align: java.lang.String,
    size: js.UndefOr[scala.Double],
    color: js.UndefOr[java.lang.String],
    rotation: js.UndefOr[scala.Double],
    alpha: js.UndefOr[scala.Double],
    bold: js.UndefOr[scala.Boolean],
    url: js.UndefOr[java.lang.String]
  ): js.Any = js.native
  /**
    * Adds a legend to the chart.
    * By default, you don't need to create div for your legend,
    * however if you want it to be positioned in some different way,
    * you can create div anywhere you want and pass id or reference to your div as a second parameter.
    * (NOTE: This method will not work on StockPanel.)
    * @param legend - The legend.
    * @param legendDivId - Id of the legend div (optional).
    */
  def addLegend(legend: amchartsLib.amLegendMod.default): scala.Unit = js.native
  def addLegend(legend: amchartsLib.amLegendMod.default, legendDivId: java.lang.String): scala.Unit = js.native
  /**
    * Adds a legend to the chart.
    * By default, you don't need to create div for your legend,
    * however if you want it to be positioned in some different way,
    * you can create div anywhere you want and pass id or reference to your div as a second parameter.
    * (NOTE: This method will not work on StockPanel.)
    * @param legend - The legend.
    * @param legendDiv - Legend div (optional).
    */
  def addLegend(legend: amchartsLib.amLegendMod.default, legendDiv: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Adds event listener of the type "dataUpdated" or "init" to the object.
    * @param type "dataUpdated" or "init".
    * @param handler
    * If the type is "dataUpdated".
    * Dispatched when chart is build for the first time or after validateData() method was called.
    * If the type is "init". Dispatched when chart is build for the first time.
    */
  def addListener(`type`: java.lang.String, handler: js.Function1[/* e */ amchartsLib.Anon_ChartType, scala.Unit]): scala.Unit = js.native
  /**
    * Adds title to the top of the chart. Pie, Radar positions are updated so that they won't overlap.
    * Plot area of Serial/XY chart is also updated unless autoMargins property is set to false.
    * You can add any number of titles - each of them will be placed in a new line.
    * To remove titles, simply clear titles array: chart.titles = []; and call chart.validateNow() method.
    * text - text of a title size - font size color - title color alpha - title opacity bold -
    * boolean value indicating if title should be bold.
    */
  def addTitle(
    text: java.lang.String,
    size: scala.Double,
    color: java.lang.String,
    alpha: scala.Double,
    bold: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Clears the chart area, intervals, etc.
    */
  def clear(): scala.Unit = js.native
  /**
    * Removes all labels added to the chart.
    */
  def clearLabels(): scala.Unit = js.native
  /**
    * Use this method to force the chart to resize to it's current container size.
    */
  def invalidateSize(): scala.Unit = js.native
  /**
    * Removes chart's legend.
    */
  def removeLegend(): scala.Unit = js.native
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: AmChart, `type`: java.lang.String, handler: js.Any): scala.Unit = js.native
  /**
    * This method should be called after data in your data provider changed or a new array was set to dataProvider.
    * After calling this method the chart will parse data and redraw.
    */
  def validateData(): scala.Unit = js.native
  /**
    * This method should be called after you changed one or more properties of any class.
    * The chart will redraw after this method is called.
    */
  def validateNow(): scala.Unit = js.native
  /**
    * Adds chart to the specified DIV.
    */
  def write(container: java.lang.String): scala.Unit = js.native
  def write(container: stdLib.HTMLDivElement): scala.Unit = js.native
}

