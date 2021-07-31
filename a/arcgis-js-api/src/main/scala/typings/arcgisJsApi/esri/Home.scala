package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.go
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Home
  extends StObject
     with Widget_
     with GoTo {
  
  /**
    * This function provides the ability to interrupt and cancel the process of navigating the view back to the view's initial extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#cancelGo)
    */
  def cancelGo(): Unit = js.native
  
  /**
    * Animates the view to the initial Viewpoint of the view or the value of [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#viewpoint).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#go)
    */
  def go(): Unit = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#iconClass)
    */
  var iconClass: String = js.native
  
  @JSName("on")
  def on_go(name: go, eventHandler: HomeGoEventHandler): IHandle = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#viewModel)
    */
  var viewModel: HomeViewModel = js.native
  
  /**
    * The [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), or point of view, to zoom to when going home.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
}
