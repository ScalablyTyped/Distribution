package typings
package agDashGridLib.distLibLayoutTabbedLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbedItem extends js.Object {
  var afterAttachedCallback: js.UndefOr[js.Function] = js.undefined
  var bodyPromise: agDashGridLib.distLibUtilsMod.Promise[stdLib.HTMLElement]
  var name: java.lang.String
  var title: stdLib.Element
}

object TabbedItem {
  @scala.inline
  def apply(
    bodyPromise: agDashGridLib.distLibUtilsMod.Promise[stdLib.HTMLElement],
    name: java.lang.String,
    title: stdLib.Element,
    afterAttachedCallback: js.Function = null
  ): TabbedItem = {
    val __obj = js.Dynamic.literal(bodyPromise = bodyPromise, name = name, title = title)
    if (afterAttachedCallback != null) __obj.updateDynamic("afterAttachedCallback")(afterAttachedCallback)
    __obj.asInstanceOf[TabbedItem]
  }
}

