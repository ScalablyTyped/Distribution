package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-leading`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-trailing`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-leading`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-trailing`
import typings.arcgisJsApi.arcgisJsApiStrings.manual
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UI
  extends StObject
     with Accessor {
  
  def add(component: String): scala.Unit = js.native
  def add(component: String, position: String): scala.Unit = js.native
  def add(component: String, position: UIAddPosition): scala.Unit = js.native
  def add(component: js.Array[Any]): scala.Unit = js.native
  def add(component: js.Array[Any], position: String): scala.Unit = js.native
  def add(component: js.Array[Any], position: UIAddPosition): scala.Unit = js.native
  def add(component: UIAddComponent): scala.Unit = js.native
  def add(component: UIAddComponent, position: String): scala.Unit = js.native
  def add(component: UIAddComponent, position: UIAddPosition): scala.Unit = js.native
  /**
    * Adds one or more HTML component(s) or [widgets](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) to the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  def add(component: Widget_): scala.Unit = js.native
  def add(component: Widget_, position: String): scala.Unit = js.native
  def add(component: Widget_, position: UIAddPosition): scala.Unit = js.native
  def add(component: HTMLElement): scala.Unit = js.native
  def add(component: HTMLElement, position: String): scala.Unit = js.native
  def add(component: HTMLElement, position: UIAddPosition): scala.Unit = js.native
  
  /**
    * The HTML Element that contains the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#container)
    */
  var container: HTMLElement = js.native
  
  /**
    * Removes all components from a given position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#empty)
    */
  def empty(): scala.Unit = js.native
  def empty(
    position: `bottom-leading` | `bottom-left` | `bottom-right` | `bottom-trailing` | `top-leading` | `top-left` | `top-right` | `top-trailing` | manual
  ): scala.Unit = js.native
  
  /**
    * Find a component by widget or DOM ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#find)
    */
  def find(id: String): HTMLElement | Widget_ = js.native
  
  /**
    * The height of the UI container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#height)
    */
  val height: Double = js.native
  
  def move(component: String): scala.Unit = js.native
  def move(component: String, position: String): scala.Unit = js.native
  def move(component: String, position: UIMovePosition): scala.Unit = js.native
  def move(component: js.Array[Any]): scala.Unit = js.native
  def move(component: js.Array[Any], position: String): scala.Unit = js.native
  def move(component: js.Array[Any], position: UIMovePosition): scala.Unit = js.native
  def move(component: UIMoveComponent): scala.Unit = js.native
  def move(component: UIMoveComponent, position: String): scala.Unit = js.native
  def move(component: UIMoveComponent, position: UIMovePosition): scala.Unit = js.native
  /**
    * Moves one or more UI component(s) to the specified position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  def move(component: Widget_): scala.Unit = js.native
  def move(component: Widget_, position: String): scala.Unit = js.native
  def move(component: Widget_, position: UIMovePosition): scala.Unit = js.native
  def move(component: HTMLElement): scala.Unit = js.native
  def move(component: HTMLElement, position: String): scala.Unit = js.native
  def move(component: HTMLElement, position: UIMovePosition): scala.Unit = js.native
  
  /**
    * Defines the padding for the UI from the top, left, right, and bottom sides of the container or [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * @default { left: 15, top: 15, right: 15, bottom: 15 }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#padding)
    */
  var padding: Any | Double = js.native
  
  def remove(component: String): scala.Unit = js.native
  def remove(component: js.Array[Any]): scala.Unit = js.native
  /**
    * Removes one or more HTML component(s) or [widgets](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) from the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#remove)
    */
  def remove(component: Widget_): scala.Unit = js.native
  def remove(component: HTMLElement): scala.Unit = js.native
  
  /**
    * The view associated with the UI components.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The width of the UI container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#width)
    */
  val width: Double = js.native
}
