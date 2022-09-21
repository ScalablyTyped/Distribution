package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.discrete
import typings.arcgisJsApi.arcgisJsApiStrings.duration
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.threshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowCastViewModel
  extends StObject
     with Accessor {
  
  /**
    * The calendar date used to calculate the shadow cast.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#date)
    */
  var date: js.Date = js.native
  
  /**
    * The configuration used when the widget's [visualizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#visualizationType) is set to "discrete".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#discreteOptions)
    */
  var discreteOptions: ShadowCastViewModelDiscreteOptions = js.native
  
  /**
    * The configuration used when the widget's [visualizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#visualizationType) is set to "duration".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#durationOptions)
    */
  var durationOptions: ShadowCastViewModelDurationOptions = js.native
  
  /**
    * Time (in milliseconds from midnight of the [date](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#date)) when the shadow cast computation should stop.
    *
    * @default 16 * 3600 * 1000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#endTimeOfDay)
    */
  var endTimeOfDay: Double = js.native
  
  /**
    * Returns the time (in milliseconds) spent in shadow for a certain point on the screen.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#getDuration)
    */
  def getDuration(point: SceneViewScreenPoint): Double = js.native
  
  /**
    * Starts the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#start)
    */
  def start(): scala.Unit = js.native
  
  /**
    * Time (in milliseconds from midnight of the [date](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#date)) when the shadow cast computation should start.
    *
    * @default 10 * 3600 * 1000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#startTimeOfDay)
    */
  var startTimeOfDay: Double = js.native
  
  /**
    * The current state of the view model that can be used for rendering the UI of the widget.
    *
    * @default disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#state)
    */
  val state: disabled | ready = js.native
  
  /**
    * Stops the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#stop)
    */
  def stop(): scala.Unit = js.native
  
  /**
    * The configuration used when the widget's [visualizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#visualizationType) is set to "threshold".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#thresholdOptions)
    */
  var thresholdOptions: ShadowCastViewModelThresholdOptions = js.native
  
  /**
    * The difference in hours between UTC time and the times displayed in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#utcOffset)
    */
  var utcOffset: Double = js.native
  
  /**
    * A reference to the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#view)
    */
  var view: SceneView = js.native
  
  /**
    * Type of visualization to use when showing the shadows.
    *
    * @default "threshold"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#visualizationType)
    */
  var visualizationType: threshold | duration | discrete = js.native
}
