package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationProfile
  extends StObject
     with Widget_ {
  
  /**
    * When the spatial reference is projected (other than web mercator) and the path is shorter than this threshold, distances will be computed planimetrically.
    *
    * @default 100000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#geodesicDistanceThreshold)
    */
  var geodesicDistanceThreshold: Double = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#iconClass)
    */
  var iconClass: String = js.native
  
  /**
    * The input line graphic along which elevation will be queried in order to generate an elevation profile.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#input)
    */
  var input: Graphic = js.native
  
  /**
    * Collection of elevation profile lines which are to be generated and displayed in the widget's chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#profiles)
    */
  var profiles: Collection[
    ElevationProfileLineGround | ElevationProfileLineInput | ElevationProfileLineQuery | ElevationProfileLineView
  ] = js.native
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the elevation and distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#unit)
    */
  var unit: SystemOrLengthUnit = js.native
  
  /**
    * List of available units and unit systems (imperial, metric) for displaying the elevation and distance values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#unitOptions)
    */
  var unitOptions: js.Array[SystemOrLengthUnit] = js.native
  
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#view)
    */
  var view: SceneView | MapView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#viewModel)
    */
  var viewModel: ElevationProfileViewModel = js.native
  
  /**
    * This property provides the ability to display or hide the individual elements of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#visibleElements)
    */
  var visibleElements: ElevationProfileVisibleElements = js.native
}
