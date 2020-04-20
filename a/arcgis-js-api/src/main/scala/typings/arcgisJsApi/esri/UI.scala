package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UI extends Accessor {
  /**
    * The HTML Element that contains the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#container)
    */
  var container: HTMLElement = js.native
  /**
    * The height of the UI container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#height)
    */
  val height: Double = js.native
  /**
    * Defines the padding for the UI from the top, left, right, and bottom sides of the container or [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). If the value is a number, it will be used to pad all sides of the container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#padding)
    *
    * @default { left: 15, top: 15, right: 15, bottom: 15 }
    */
  var padding: js.Any | Double = js.native
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
    *
    * @param component The component(s) to add to the UI. This can be a widget instance, HTML element, a string value representing a DOM node ID, or an array containing a combination of any of those types. See the example snippets below for code examples. Alternatively, you can pass an array of objects with the following specification.
    * @param component.component The component to add to the UI. This can be a widget instance, HTML element, a string value representing a DOM node ID.
    * @param component.position The position in the view at which to add the component. If not specified, `manual` is used by default. Using `manual` allows you to place the component in a container where you can position it anywhere using CSS. For the other possible values, "top", "bottom", "left", and "right" are consistent placements. The "leading" and "trailing" values depend on whether the browser is using right-to-left (RTL) or left-to-right (LTR). For LTR, "leading" is left and "trailing" is right. For RTL, "leading" is right and "trailing" is left.
    * @param component.index The placement index of the component. This index shows where to place the component relative to other components. For example a value of `0` would place it topmost when position is top-*, leftmost for bottom-left and right most for bottom-right.
    * @param position The position in the view at which to add the component. If not specified, `manual` is used by default. Using `manual` allows you to place the component in a container where you can position it anywhere using CSS. For the other possible values, "top", "bottom", "left", and "right" are consistent placements. The "leading" and "trailing" values depend on whether the browser is using right-to-left (RTL) or left-to-right (LTR). For LTR, "leading" is left and "trailing" is right. For RTL, "leading" is right and "trailing" is left.
    * @param position.position The position in the view at which to add the component. If not specified, `manual` is used by default. Using `manual` allows you to place the component in a container where you can position it anywhere using CSS. For the other possible values, "top", "bottom", "left", and "right" are consistent placements. The "leading" and "trailing" values depend on whether the browser is using right-to-left (RTL) or left-to-right (LTR). For LTR, "leading" is left and "trailing" is right. For RTL, "leading" is right and "trailing" is left.
    * @param position.index The placement index of the component(s). This index shows where to place the component relative to other components. For example a value of `0` would place it topmost when position is top-*, leftmost for bottom-left and right most for bottom-right.
    *
    */
  def add(component: Widget_): Unit = js.native
  def add(component: Widget_, position: String): Unit = js.native
  def add(component: Widget_, position: UIAddPosition): Unit = js.native
  def add(component: HTMLElement): Unit = js.native
  def add(component: HTMLElement, position: String): Unit = js.native
  def add(component: HTMLElement, position: UIAddPosition): Unit = js.native
  /**
    * Removes all components from a given position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#empty)
    *
    * @param position The position in the view at which to add the component. If not specified, `manual` is used by default. Using `manual` allows you to place the component in a container where you can position it anywhere using CSS. For the other possible values, "top", "bottom", "left", and "right" are consistent placements. The "leading" and "trailing" values depend on whether the browser is using right-to-left (RTL) or left-to-right (LTR). For LTR, "leading" is left and "trailing" is right. For RTL, "leading" is right and "trailing" is left.
    *
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
    *
    * @param id The component's ID.
    *
    */
  def find(id: String): HTMLElement | Widget_ = js.native
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
    *
    * @param component The component(s) to move. This value can be a widget instance, HTML element, a string value representing a DOM node ID, or an array containing a combination of any of those types. See the example snippets below for code examples. Alternatively, you can pass an array of objects with the following specification.
    * @param component.component The component to move. This can be a widget instance, HTML element, a string value representing a DOM node ID.
    * @param component.position The destination position. The component will be placed in the UI [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#container) when not provided. If not specified, `manual` is used by default. Using `manual` allows you to place the component in a container where you can position it anywhere using CSS.
    * @param component.index The placement index of the component. This index shows where to place the component relative to other components. For example a value of 0 would place it topmost when position is top-*, leftmost for bottom-left and right most for bottom-right.
    * @param position The destination position. The component will be placed in the UI [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#container) when not provided.
    * @param position.position The position in the view at which to add the component. If not specified, `manual` is used by default. Using `manual` allows you to place the component in a container where you can position it anywhere using CSS.
    * @param position.index The placement index of the component(s). This index shows where to place the component relative to other components. For example a value of `0` would place it topmost when position is top-*, leftmost for bottom-left and right most for bottom-right.
    *
    */
  def move(component: Widget_): Unit = js.native
  def move(component: Widget_, position: String): Unit = js.native
  def move(component: Widget_, position: UIMovePosition): Unit = js.native
  def move(component: HTMLElement): Unit = js.native
  def move(component: HTMLElement, position: String): Unit = js.native
  def move(component: HTMLElement, position: UIMovePosition): Unit = js.native
  def remove(component: String): Unit = js.native
  def remove(component: js.Array[_]): Unit = js.native
  /**
    * Removes one or more HTML component(s) or [widgets](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) from the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#remove)
    *
    * @param component The component(s) to remove from the UI. This can be a widget instance, HTML element, a string value representing a DOM node ID, or an array containing a combination of any of those types. See the example snippets below for code examples.
    *
    */
  def remove(component: Widget_): Unit = js.native
  def remove(component: HTMLElement): Unit = js.native
}

@JSGlobal("__esri.UI")
@js.native
object UI extends TopLevel[UIConstructor]

