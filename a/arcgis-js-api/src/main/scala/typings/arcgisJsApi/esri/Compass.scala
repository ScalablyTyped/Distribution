package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compass
  extends Widget_
     with GoTo {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#iconClass)
    */
  var iconClass: String = js.native
  /**
    * The view in which the Compass obtains and indicates camera [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading), using a (SceneView) or rotation (MapView).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [CompassViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass-CompassViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#viewModel)
    */
  var viewModel: CompassViewModel = js.native
  /**
    * If working in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html), sets the view's [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) to `0`. If working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), sets the camera's [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading) to `0`. This method is executed each time the [Compass](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html) is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#reset)
    *
    *
    */
  def reset(): Unit = js.native
}

