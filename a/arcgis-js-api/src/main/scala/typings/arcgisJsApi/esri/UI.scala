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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UI extends Accessor {
  
  def add(component: String): Unit = js.native
  def add(component: String, position: String): Unit = js.native
  def add(component: String, position: UIAddPosition): Unit = js.native
  def add(component: js.Array[_]): Unit = js.native
  def add(component: js.Array[_], position: String): Unit = js.native
  def add(component: js.Array[_], position: UIAddPosition): Unit = js.native
  def add(component: UIAddComponent): Unit = js.native
  def add(component: UIAddComponent, position: String): Unit = js.native
  def add(component: UIAddComponent, position: UIAddPosition): Unit = js.native
  /**
    * Adds one or more HTML component(s) or [widgets](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) to the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  def add(component: Widget_): Unit = js.native
  def add(component: Widget_, position: String): Unit = js.native
  def add(component: Widget_, position: UIAddPosition): Unit = js.native
  def add(component: HTMLElement): Unit = js.native
  def add(component: HTMLElement, position: String): Unit = js.native
  def add(component: HTMLElement, position: UIAddPosition): Unit = js.native
  
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
  def empty(): Unit = js.native
  @JSName("empty")
  def empty_bottomleading(position: `bottom-leading`): Unit = js.native
  @JSName("empty")
  def empty_bottomleft(position: `bottom-left`): Unit = js.native
  @JSName("empty")
  def empty_bottomright(position: `bottom-right`): Unit = js.native
  @JSName("empty")
  def empty_bottomtrailing(position: `bottom-trailing`): Unit = js.native
  @JSName("empty")
  def empty_manual(position: manual): Unit = js.native
  @JSName("empty")
  def empty_topleading(position: `top-leading`): Unit = js.native
  @JSName("empty")
  def empty_topleft(position: `top-left`): Unit = js.native
  @JSName("empty")
  def empty_topright(position: `top-right`): Unit = js.native
  @JSName("empty")
  def empty_toptrailing(position: `top-trailing`): Unit = js.native
  
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
  
  def move(component: String): Unit = js.native
  def move(component: String, position: String): Unit = js.native
  def move(component: String, position: UIMovePosition): Unit = js.native
  def move(component: js.Array[_]): Unit = js.native
  def move(component: js.Array[_], position: String): Unit = js.native
  def move(component: js.Array[_], position: UIMovePosition): Unit = js.native
  def move(component: UIMoveComponent): Unit = js.native
  def move(component: UIMoveComponent, position: String): Unit = js.native
  def move(component: UIMoveComponent, position: UIMovePosition): Unit = js.native
  /**
    * Moves one or more UI component(s) to the specified position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  def move(component: Widget_): Unit = js.native
  def move(component: Widget_, position: String): Unit = js.native
  def move(component: Widget_, position: UIMovePosition): Unit = js.native
  def move(component: HTMLElement): Unit = js.native
  def move(component: HTMLElement, position: String): Unit = js.native
  def move(component: HTMLElement, position: UIMovePosition): Unit = js.native
  
  /**
    * Defines the padding for the UI from the top, left, right, and bottom sides of the container or [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#padding)
    */
  var padding: js.Any | Double = js.native
  
  def remove(component: String): Unit = js.native
  def remove(component: js.Array[_]): Unit = js.native
  /**
    * Removes one or more HTML component(s) or [widgets](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) from the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#remove)
    */
  def remove(component: Widget_): Unit = js.native
  def remove(component: HTMLElement): Unit = js.native
  
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
