package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.created
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.creating
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineOfSightViewModel extends Accessor {
  /**
    * The observer's viewpoint from which lines of sight will be drawn towards the targets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#observer)
    */
  var observer: Point = js.native
  /**
    * The view model's state.
    *
    * Value | Description
    * ------------|-------------
    * disabled | not ready yet
    * ready | ready for analysis
    * creating | observer/target points are being placed
    * created | finished analysis
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready | creating | created = js.native
  /**
    * A collection of [LineOfSightTarget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html) containing the target location and the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#targets)
    */
  var targets: Collection[LineOfSightTarget] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#view)
    */
  var view: SceneView = js.native
  /**
    * Clears the current analysis results. After calling this method, the user can set a new observer and targets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#clear)
    *
    *
    */
  def clear(): Unit = js.native
  /**
    * If stopped, this method continues the line of sight analysis and the user can add more targets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#continue)
    *
    *
    */
  def continue(): Unit = js.native
  /**
    * Starts a new line of sight analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#start)
    *
    *
    */
  def start(): Unit = js.native
  /**
    * Stops the current line of sight analysis, keeping the results in the view. Users can still interact with existing targets and the observer but they can't place new target points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#stop)
    *
    *
    */
  def stop(): Unit = js.native
}

@JSGlobal("__esri.LineOfSightViewModel")
@js.native
object LineOfSightViewModel extends TopLevel[LineOfSightViewModelConstructor]

