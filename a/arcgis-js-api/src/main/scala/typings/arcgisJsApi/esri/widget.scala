package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def cssTransition(`type`: String, className: String): js.Function = js.native
  /**
    * Utility method used to determine if the directionality of the text of the document is right-to-left.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#isRTL)
    *
    *
    */
  def isRTL(): Boolean = js.native
  /**
    * Utility method used for joining CSS classes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#join)
    *
    * @param classNames The class names to join.
    *
    */
  def join(classNames: String*): String = js.native
  /**
    * This convenience decorator marks a property for automatic rendering. It is useful when you want rendering to be scheduled whenever the decorated property changes. Many times this decorator is used in conjunction with the [@property](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html) decorator. Rendering on deep properties is also supported by providing a path to a property deeper in the instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#renderable)
    *
    * @param propertyName Names of nested renderable properties.
    *
    */
  def renderable(): js.Function = js.native
  def renderable(propertyName: String): js.Function = js.native
  def renderable(propertyName: js.Array[String]): js.Function = js.native
  /**
    * This convenience method is used to assign an [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) DOM node reference to a variable. It does this by taking a [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) passed from either the [afterUpdate](https://developers.arcgis.com/javascript/latest/guide/custom-widget/index.html#widget-rendering) or [afterCreate](https://developers.arcgis.com/javascript/latest/guide/custom-widget/index.html#widget-rendering) callbacks. In order to use this, the element must have a set [data-node-ref](https://developers.arcgis.com/javascript/latest/guide/custom-widget/index.html#widget-rendering) attribute. In addition, it must also be bound to the widget instance, e.g. `bind={this}`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#storeNode)
    *
    * @param node The referenced DOM node.
    *
    */
  def storeNode(node: HTMLElement): Unit = js.native
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
  def tsx(selector: String): js.Any = js.native
  def tsx(selector: String, properties: js.Any): js.Any = js.native
  def tsx(selector: String, properties: js.Any, children: js.Any): js.Any = js.native
  /**
    * This convenience decorator helps dispatch view model events on the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#vmEvent)
    *
    * @param eventNames The event names to re-dispatch.
    *
    */
  def vmEvent(eventNames: String): js.Function = js.native
  def vmEvent(eventNames: js.Array[String]): js.Function = js.native
}

@JSGlobal("__esri.widget")
@js.native
object widget extends TopLevel[widget]

