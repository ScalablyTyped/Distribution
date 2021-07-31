package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Zoom
  extends StObject
     with Widget_ {
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom.html#iconClass)
    */
  var iconClass: String = js.native
  
  /**
    * Determines the layout/orientation of the Zoom widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom.html#layout)
    */
  var layout: vertical | horizontal = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom.html#viewModel)
    */
  var viewModel: ZoomViewModel = js.native
  
  /**
    * Zooms the view in by an LOD factor of 0.5.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom.html#zoomIn)
    */
  def zoomIn(): Unit = js.native
  
  /**
    * Zooms the view out by an LOD factor of 2.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom.html#zoomOut)
    */
  def zoomOut(): Unit = js.native
}
