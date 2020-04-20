package typings.arcgisJsApi.esri.widget

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.widget.storeNode")
@js.native
object storeNode extends js.Object {
  /**
    * This convenience method is used to assign an [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) DOM node reference to a variable. It does this by taking a [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) passed from either the [afterUpdate](https://developers.arcgis.com/javascript/latest/guide/custom-widget/index.html#widget-rendering) or [afterCreate](https://developers.arcgis.com/javascript/latest/guide/custom-widget/index.html#widget-rendering) callbacks. In order to use this, the element must have a set [data-node-ref](https://developers.arcgis.com/javascript/latest/guide/custom-widget/index.html#widget-rendering) attribute. In addition, it must also be bound to the widget instance, e.g. `bind={this}`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#storeNode)
    *
    * @param node The referenced DOM node.
    *
    */
  def apply(node: HTMLElement): Unit = js.native
}

