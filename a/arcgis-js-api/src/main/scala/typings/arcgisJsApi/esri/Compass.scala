package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compass
  extends StObject
     with Widget_
     with GoTo {
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#iconClass)
    */
  var iconClass: String = js.native
  
  /**
    * If working in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html), sets the view's [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) to `0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#reset)
    */
  def reset(): Unit = js.native
  
  /**
    * The view in which the Compass obtains and indicates camera [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading), using a (SceneView) or rotation (MapView).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html#viewModel)
    */
  var viewModel: CompassViewModel = js.native
}
