package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var container: stdLib.HTMLElement = js.native
  /**
    * The height of the UI container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#height)
    */
  val height: scala.Double = js.native
  /**
    * Defines the padding for the UI from the top, left, right, and bottom sides of the container or [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). If the value is a number, it will be used to pad all sides of the container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#padding)
    *
    * @default { left: 15, top: 15, right: 15, bottom: 15 }
    */
  var padding: js.Any | scala.Double = js.native
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
  val width: scala.Double = js.native
  def add(component: UIAddComponent): scala.Unit = js.native
  def add(component: UIAddComponent, position: UIAddPosition): scala.Unit = js.native
  def add(component: UIAddComponent, position: java.lang.String): scala.Unit = js.native
  /**
    * Adds one or more HTML component(s) or [widgets](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) to the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    *
    * @param component The component(s) to add to the UI. This can be a widget instance, HTML element, a string value representing a DOM node ID, or an array containing a combination of any of those types. See the example snippets below for code examples. Alternatively, you can pass an array of objects with the following specification.
    * @param component.component The component to add to the UI. This can be a widget instance, HTML element, a string value representing a DOM node ID.
    * @param component.position The position in the view at which to add the component. If not specified, `manual` is used by default. **Possible Values:** top-left | top-right | bottom-left | bottom-right | manual
    * @param component.index The placement index of the component. This index shows where to place the component relative to other components. For example a value of `0` would place it topmost when position is top-*, leftmost for bottom-left and right most for bottom-right.
    * @param position The position in the view at which to add the component. If not specified, `manual` is used by default. **Possible Values:** top-left | top-right | bottom-left | bottom-right | manual
    * @param position.position The position in the view at which to add the component(s). If not specified, `manual` is used by default. **Possible Values:** top-left | top-right | bottom-left | bottom-right | manual
    * @param position.index The placement index of the component(s). This index shows where to place the component relative to other components. For example a value of `0` would place it topmost when position is top-*, leftmost for bottom-left and right most for bottom-right.
    *
    */
  def add(component: Widget): scala.Unit = js.native
  def add(component: Widget, position: UIAddPosition): scala.Unit = js.native
  def add(component: Widget, position: java.lang.String): scala.Unit = js.native
  def add(component: java.lang.String): scala.Unit = js.native
  def add(component: java.lang.String, position: UIAddPosition): scala.Unit = js.native
  def add(component: java.lang.String, position: java.lang.String): scala.Unit = js.native
  def add(component: js.Array[_]): scala.Unit = js.native
  def add(component: js.Array[_], position: UIAddPosition): scala.Unit = js.native
  def add(component: js.Array[_], position: java.lang.String): scala.Unit = js.native
  def add(component: stdLib.HTMLElement): scala.Unit = js.native
  def add(component: stdLib.HTMLElement, position: UIAddPosition): scala.Unit = js.native
  def add(component: stdLib.HTMLElement, position: java.lang.String): scala.Unit = js.native
  /**
    * Removes all components from a given position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#empty)
    *
    * @param position The position from which to remove all components. If not specified, `manual` is used by default. **Possible Values:** top-left | top-right | bottom-left | bottom-right | manual
    *
    */
  def empty(): scala.Unit = js.native
  def empty(position: java.lang.String): scala.Unit = js.native
  def move(component: UIMoveComponent): scala.Unit = js.native
  def move(component: UIMoveComponent, position: java.lang.String): scala.Unit = js.native
  /**
    * Moves one or more UI component(s) to the specified position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    *
    * @param component The component(s) to move. This value can be a widget instance, HTML element, a string value representing a DOM node ID, or an array containing a combination of any of those types. See the example snippets below for code examples. Alternatively, you can pass an array of objects with the following specification.
    * @param component.component The component to move. This can be a widget instance, HTML element, a string value representing a DOM node ID.
    * @param component.position The destination position. The component will be placed in the UI [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#container) when not provided. If not specified, `manual` is used by default. **Possible Values:** top-left | top-right | bottom-left | bottom-right | manual
    * @param position The destination position. The component will be placed in the UI [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#container) when not provided. **Possible Values:** top-left | top-right | bottom-left | bottom-right | manual
    *
    */
  def move(component: Widget): scala.Unit = js.native
  def move(component: Widget, position: java.lang.String): scala.Unit = js.native
  def move(component: java.lang.String): scala.Unit = js.native
  def move(component: java.lang.String, position: java.lang.String): scala.Unit = js.native
  def move(component: js.Array[_]): scala.Unit = js.native
  def move(component: js.Array[_], position: java.lang.String): scala.Unit = js.native
  def move(component: stdLib.HTMLElement): scala.Unit = js.native
  def move(component: stdLib.HTMLElement, position: java.lang.String): scala.Unit = js.native
  /**
    * Removes one or more HTML component(s) or [widgets](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) from the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#remove)
    *
    * @param component The component(s) to remove from the UI. This can be a widget instance, HTML element, a string value representing a DOM node ID, or an array containing a combination of any of those types. See the example snippets below for code examples.
    *
    */
  def remove(component: Widget): scala.Unit = js.native
  def remove(component: java.lang.String): scala.Unit = js.native
  def remove(component: js.Array[_]): scala.Unit = js.native
  def remove(component: stdLib.HTMLElement): scala.Unit = js.native
}

@JSGlobal("__esri.UI")
@js.native
/**
  * This class provides a simple interface for [adding](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add), [moving](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move) and [removing](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#remove) components from a view's user interface (UI). In most cases, you will work with the view's [DefaultUI](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html) which places default [widgets](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html), such as [Zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom.html) and [Attribution](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html) in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html)
  */
class UICls () extends UI {
  def this(properties: UIProperties) = this()
}

