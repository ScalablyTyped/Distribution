package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetProperties extends js.Object {
  /**
    * The ID or node representing the DOM element containing the widget. This property can only be set once.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#container)
    */
  var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  /**
    * When `true`, this property indicates whether the widget has been destroyed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#destroyed)
    */
  var destroyed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The unique ID assigned to the widget when the widget is created. If not set by the developer, it will default to the container ID, or if that is not present then it will be automatically generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html#id)
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object WidgetProperties {
  @scala.inline
  def apply(
    container: java.lang.String | stdLib.HTMLElement = null,
    destroyed: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null
  ): WidgetProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[WidgetProperties]
  }
}

