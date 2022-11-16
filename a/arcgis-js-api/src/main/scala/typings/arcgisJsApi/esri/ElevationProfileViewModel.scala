package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.created
import typings.arcgisJsApi.arcgisJsApiStrings.creating
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.selected
import typings.arcgisJsApi.arcgisJsApiStrings.selecting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationProfileViewModel
  extends StObject
     with Accessor {
  
  /**
    * Stops a creation/selection operation and restores the previously configured input path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#cancel)
    */
  def cancel(): scala.Unit = js.native
  
  /**
    * Clears the existing profile and stops any interaction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#clear)
    */
  def clear(): scala.Unit = js.native
  
  /**
    * Units which have been selected according to the magnitude of the elevations and distances that are to be displayed in the widget, according to the selected unit or unit system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#effectiveUnits)
    */
  val effectiveUnits: EffectiveUnits = js.native
  
  /**
    * When the spatial reference is projected (other than web mercator) and the path is shorter than this threshold, distances will be computed planimetrically.
    *
    * @default 100000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#geodesicDistanceThreshold)
    */
  var geodesicDistanceThreshold: Double = js.native
  
  /**
    * Whether the graphic used as [input](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#input) is highlighted.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#highlightEnabled)
    */
  var highlightEnabled: Boolean = js.native
  
  /**
    * The position, in the range [0, 1], being hovered in the graph.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#hoveredChartPosition)
    */
  var hoveredChartPosition: Double = js.native
  
  /**
    * The input path along which elevation will be queried in order to generate an elevation profile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#input)
    */
  var input: Graphic = js.native
  
  /**
    * Collection of elevation profile lines which are to be generated and displayed in the widget's chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#profiles)
    */
  var profiles: Collection[
    ElevationProfileLineGround | ElevationProfileLineInput | ElevationProfileLineQuery | ElevationProfileLineView
  ] = js.native
  
  /**
    * The progress, between 0 and 1 of generating all the configured elevation profiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#progress)
    */
  val progress: Double = js.native
  
  /**
    * If mode is "sketch" (the default), switches to the "creating" state in which the user can draw a new line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#start)
    */
  def start(): scala.Unit = js.native
  def start(options: ElevationProfileViewModelStartOptions): scala.Unit = js.native
  
  /**
    * The current state of the view model that can be used for rendering the UI of the widget.
    *
    * @default disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#state)
    */
  val state: disabled | ready | creating | created | selecting | selected = js.native
  
  /**
    * Stops a creation/selection operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#stop)
    */
  def stop(): scala.Unit = js.native
  
  /**
    * Whether the chart should use a uniform scale for the X and Y axes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#uniformChartScaling)
    */
  var uniformChartScaling: Boolean = js.native
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the elevation and distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#unit)
    */
  var unit: SystemOrLengthUnit = js.native
  
  /**
    * List of available units and unit systems (imperial, metric) for displaying the elevation and distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#unitOptions)
    */
  var unitOptions: js.Array[SystemOrLengthUnit] = js.native
  
  /**
    * A reference to the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#view)
    */
  var view: SceneView | MapView = js.native
}
