package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.created
import typings.arcgisJsApi.arcgisJsApiStrings.creating
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineOfSightViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * The line of sight analysis object being created or modified by the view model.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#analysis)
  		 */
  val analysis: LineOfSightAnalysis = js.native
  
  /**
  		 * Clears the current analysis results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#clear)
  		 */
  def clear(): scala.Unit = js.native
  
  /**
  		 * If stopped, this method continues the line of sight analysis and the user can add more targets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#continue)
  		 */
  def continue(): scala.Unit = js.native
  
  /**
  		 * The observer's viewpoint from which lines of sight will be drawn towards the targets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#observer)
  		 */
  var observer: Point = js.native
  
  /**
  		 * Starts a new line of sight analysis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#start)
  		 */
  def start(): scala.Unit = js.native
  
  /**
  		 * The view model's state.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#state)
  		 */
  val state: disabled | ready | creating | created = js.native
  
  /**
  		 * Stops the current line of sight analysis, keeping the results in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#stop)
  		 */
  def stop(): scala.Unit = js.native
  
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
}
