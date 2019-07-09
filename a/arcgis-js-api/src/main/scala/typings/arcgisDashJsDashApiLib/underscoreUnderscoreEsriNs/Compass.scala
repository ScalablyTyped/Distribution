package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compass
  extends Widget
     with GoTo {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#iconClass)
    */
  var iconClass: java.lang.String = js.native
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
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#render)
    *
    *
    */
  def render(): js.Any = js.native
  /**
    * If working in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html), sets the view's [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) to `0`. If working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), sets the camera's [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading) to `0`. This method is executed each time the [Compass](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html) is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#reset)
    *
    *
    */
  def reset(): scala.Unit = js.native
}

@JSGlobal("__esri.Compass")
@js.native
/**
  * The Compass widget indicates where north is in relation to the current view [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) or [camera heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading). Clicking the Compass widget rotates the view to face north (heading = 0). This widget is added to a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) by default. The icon for the Compass widget is determined based upon the view's [spatial reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#spatialReference). If the view's [spatial reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference) is not Web Mercator or WGS84 a dial icon will be used, however when the spatial reference is Web Mercator or WGS84 the icon will be a north arrow.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html)
  */
class CompassCls () extends Compass {
  def this(properties: CompassProperties) = this()
}

