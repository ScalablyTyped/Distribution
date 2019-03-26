package typings
package agDashGridLib.distLibLayoutTabbedLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbedLayoutParams extends js.Object {
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  var items: js.Array[TabbedItem]
  var onActiveItemClicked: js.UndefOr[js.Function] = js.undefined
  var onItemClicked: js.UndefOr[js.Function] = js.undefined
}

object TabbedLayoutParams {
  @scala.inline
  def apply(
    items: js.Array[TabbedItem],
    cssClass: java.lang.String = null,
    onActiveItemClicked: js.Function = null,
    onItemClicked: js.Function = null
  ): TabbedLayoutParams = {
    val __obj = js.Dynamic.literal(items = items)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (onActiveItemClicked != null) __obj.updateDynamic("onActiveItemClicked")(onActiveItemClicked)
    if (onItemClicked != null) __obj.updateDynamic("onItemClicked")(onItemClicked)
    __obj.asInstanceOf[TabbedLayoutParams]
  }
}

