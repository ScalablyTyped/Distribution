package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget
  extends Accessor
     with Evented {
  /**
    * The ID or node representing the DOM element containing the widget. This property can only be set once.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#container)
    */
  var container: java.lang.String | stdLib.HTMLElement = js.native
  /**
    * The unique ID assigned to the widget when the widget is created. If not set by the developer, it will default to the container ID, or if that is not present then it will be automatically generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#id)
    */
  var id: java.lang.String = js.native
  /**
    * A utility method used for building the value for a widget's `class` property. This aids in simplifying CSS class setup.
    * > Prior to version 4.7, there were various approaches towards setting CSS classes. These were dependent upon variables, such as whether the classes were:
    *   * a single static class,
    *   * multiple static classes, or
    *   * dynamic classes.
    *
    *
    * This helper method takes all of these approaches into account and simplifies it to use one single pattern to accommodate these multiple approaches.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#classes)
    *
    * @param classNames The class names.
    *
    */
  def classes(classNames: (java.lang.String | js.Array[java.lang.String] | js.Any)*): java.lang.String = js.native
  /**
    * Widget teardown helper. Any handles added to it will be automatically removed when the widget is destroyed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#own)
    *
    * @param handles Handles marked for removal once the widget is destroyed.
    *
    */
  def own(handles: WatchHandle): scala.Unit = js.native
  def own(handles: js.Array[WatchHandle]): scala.Unit = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* Executes after widget is ready for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#postInitialize)
    *
    *
    */
  def postInitialize(): scala.Unit = js.native
  /**
    * Renders widget to the DOM immediately.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#renderNow)
    *
    *
    */
  def renderNow(): scala.Unit = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* Schedules widget rendering. This method is useful for changes affecting the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#scheduleRender)
    *
    *
    */
  def scheduleRender(): scala.Unit = js.native
}

@js.native
trait widget extends js.Object {
  /**
    * This convenience decorator is used to help simplify accessibility within the widget keyboard events. For example, it can be used to execute a method when the `space` or `enter` keys are pressed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#accessibleHandler)
    *
    *
    */
  def accessibleHandler(): js.Function = js.native
  /**
    * Utility method used for creating CSS animation/transition functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#cssTransition)
    *
    * @param type The animation/transition type.  **Possible Values:** enter | exit
    * @param className The animation/transition class name.
    *
    */
  def cssTransition(`type`: java.lang.String, className: java.lang.String): js.Function = js.native
  /**
    * Utility method used to determine if the directionality of the text of the document is right-to-left.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#isRTL)
    *
    *
    */
  def isRTL(): scala.Boolean = js.native
  /**
    * Utility method used for joining CSS classes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#join)
    *
    * @param classNames The class names to join.
    *
    */
  def join(classNames: java.lang.String*): java.lang.String = js.native
  /**
    * This convenience decorator marks a property for automatic rendering. It is useful when you want rendering to be scheduled whenever the decorated property changes. Many times this decorator is used in conjunction with the [@property](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html) decorator. Rendering on deep properties is also supported by providing a path to a property deeper in the instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#renderable)
    *
    * @param propertyName Names of nested renderable properties.
    *
    */
  def renderable(): js.Function = js.native
  def renderable(propertyName: java.lang.String): js.Function = js.native
  def renderable(propertyName: js.Array[java.lang.String]): js.Function = js.native
  /**
    * This convenience method is used to assign an [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) DOM node reference to a variable. It does this by taking a [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) passed from either the [afterUpdate](https://developers.arcgis.com/javascript/latest/guide/custom-widget/index.html#widget-rendering) or [afterCreate](https://developers.arcgis.com/javascript/latest/guide/custom-widget/index.html#widget-rendering) callbacks. In order to use this, the element must have a set [data-node-ref](https://developers.arcgis.com/javascript/latest/guide/custom-widget/index.html#widget-rendering) attribute. In addition, it must also be bound to the widget instance, e.g. `bind={this}`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#storeNode)
    *
    * @param node The referenced DOM node.
    *
    */
  def storeNode(node: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * This convenience method is used to render the JSX in the [widget.render()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#render) method. It is required to import `tsx` even though it is not explicitly called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#tsx)
    *
    * @param selector The element to create.
    * @param properties The element's properties.
    * @param children The element's children.
    *
    */
  def tsx(selector: java.lang.String): js.Any = js.native
  def tsx(selector: java.lang.String, properties: js.Any): js.Any = js.native
  def tsx(selector: java.lang.String, properties: js.Any, children: js.Any): js.Any = js.native
  /**
    * This convenience decorator helps dispatch view model events on the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#vmEvent)
    *
    * @param eventNames The event names to re-dispatch.
    *
    */
  def vmEvent(eventNames: java.lang.String): js.Function = js.native
  def vmEvent(eventNames: js.Array[java.lang.String]): js.Function = js.native
}

