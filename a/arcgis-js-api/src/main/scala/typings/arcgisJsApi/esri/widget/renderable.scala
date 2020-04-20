package typings.arcgisJsApi.esri.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.widget.renderable")
@js.native
object renderable extends js.Object {
  /**
    * This convenience decorator marks a property for automatic rendering. It is useful when you want rendering to be scheduled whenever the decorated property changes. Many times this decorator is used in conjunction with the [@property](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-accessorSupport-decorators.html) decorator. Rendering on deep properties is also supported by providing a path to a property deeper in the instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-widget.html#renderable)
    *
    * @param propertyName Names of nested renderable properties.
    *
    */
  def apply(): js.Function = js.native
  def apply(propertyName: String): js.Function = js.native
  def apply(propertyName: js.Array[String]): js.Function = js.native
}

