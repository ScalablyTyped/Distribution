package typings
package amchartsLib.amcoordinatechartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmCoordinateChart
  extends amchartsLib.amchartMod.default {
  /**
    * Array, holding processed chart's data.
    */
  var chartData: js.Array[js.Object] = js.native
  /**
    * Specifies the colors of the graphs if the lineColor of a graph is not set.
    * It there are more graphs then colors in this array, the chart picks random color.
    * @default ['#FF6600','#FCD202','#B0DE09','#0D8ECF','#2A0CD0','#CD0D74','#CC0000','#00CC00',
    * '#0000CC','#DDDDDD','#999999','#333333','#990000']
    */
  var colors: js.Array[java.lang.String] = js.native
  /**
    * The array of graphs belonging to this chart.
    * To add/remove graph use addGraph/removeGraph methods instead of adding/removing graphs directly to array.
    */
  var graphs: js.Array[amchartsLib.amgraphMod.default] = js.native
  /**
    * Specifies if grid should be drawn above the graphs or below. Will not work properly with 3D charts.
    * @default false
    */
  var gridAboveGraphs: scala.Boolean = js.native
  /**
    * Instead of adding guides to the axes, you can push all of them to this array.
    * In case guide has category or date defined, it will automatically will be assigned to the category axis.
    * Otherwise to first value axis, unless you specify a different valueAxis for the guide.
    */
  var guides: js.Array[amchartsLib.guideMod.default] = js.native
  /**
    * Specifies whether the animation should be sequenced or all objects should appear at once.
    * @default true
    */
  var sequencedAnimation: scala.Boolean = js.native
  /**
    * The initial opacity of the column/line.
    * If you set startDuration to a value higher than 0, the columns/lines will fade in from startAlpha.
    * Value range is 0 - 1.
    * @default 1
    */
  var startAlpha: scala.Double = js.native
  /**
    * Duration of the animation, in seconds.
    */
  var startDuration: scala.Double = js.native
  /**
    * Animation effect.
    * Possible values are ">", "<", elastic" and "bounce".
    * @default "elastic"
    */
  var startEffect: java.lang.String = js.native
  /**
    * Target of url.
    * @default this
    */
  var urlTarget: js.Any = js.native
  /**
    * The array of value axes.
    * To add/remove value axis use addValueAxis/removeValueAxis methods instead of
    * adding/removing axes directly to array.
    * Chart creates one value axis automatically, so if you need only one value axis, you don't need to create it.
    */
  var valueAxes: js.Array[_] = js.native
  /**
    * Adds a graph to the chart.
    */
  def addGraph(graph: amchartsLib.amgraphMod.default): scala.Unit = js.native
  /**
    * Adds value axis to the chart.
    * One value axis is created automatically, so if you don't want to change anything or add more value axes,
    * you don't need to add it.
    */
  def addValueAxis(axis: amchartsLib.valueaxisMod.default): scala.Unit = js.native
  /**
    * You can trigger the animation of the chart.
    */
  def animateAgain(): scala.Unit = js.native
  /**
    * AmGraph Returns graph by id.
    */
  def getGraphById(graphId: java.lang.String): amchartsLib.amgraphMod.default = js.native
  /**
    * Returns value axis by id.
    */
  def getValueAxisById(axisId: java.lang.String): amchartsLib.valueaxisMod.default = js.native
  /**
    * Hide the graph (if it is visible).
    * Usually this method is called from the Legend, when you click on the legend marker.
    */
  def hideGraph(graph: amchartsLib.amgraphMod.default): scala.Unit = js.native
  /**
    * Hide value balloon of a graph.
    * Usually this method is called from the Legend, when you click on the legend text.
    */
  def hideGraphsBalloon(graph: amchartsLib.amgraphMod.default): scala.Unit = js.native
  /**
    * Highlight the graph. Usually this method is called from the Legend, when you roll-over the legend entry.
    */
  def highlightGraph(graph: amchartsLib.amgraphMod.default): scala.Unit = js.native
  /**
    * Removes graph from the chart.
    */
  def removeGraph(graph: amchartsLib.amgraphMod.default): scala.Unit = js.native
  /**
    * Removes value axis from the chart.
    * When you remove value axis, all graphs assigned to this axis are also removed.
    */
  def removeValueAxis(axis: amchartsLib.valueaxisMod.default): scala.Unit = js.native
  /**
    * Show the graph (if it is hidden).
    * Usually this method is called from the Legend, when you click on the legend marker.
    */
  def showGraph(graph: amchartsLib.amgraphMod.default): scala.Unit = js.native
  /**
    * Show value balloon of a graph.
    * Usually this method is called from the Legend, when you click on the legend text.
    */
  def showGraphsBalloon(graph: amchartsLib.amgraphMod.default): scala.Unit = js.native
  /**
    * UnhighlightGraph the graph.
    * Usually this method is called from the Legend, when you roll-out the legend entry.
    */
  def unhighlightGraph(graph: amchartsLib.amgraphMod.default): scala.Unit = js.native
}

