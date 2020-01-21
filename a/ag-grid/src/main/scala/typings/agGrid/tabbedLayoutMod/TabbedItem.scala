package typings.agGrid.tabbedLayoutMod

import typings.agGrid.utilsMod.Promise
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbedItem extends js.Object {
  var afterAttachedCallback: js.UndefOr[js.Function] = js.undefined
  var bodyPromise: Promise[HTMLElement]
  var name: String
  var title: Element
}

object TabbedItem {
  @scala.inline
  def apply(
    bodyPromise: Promise[HTMLElement],
    name: String,
    title: Element,
    afterAttachedCallback: js.Function = null
  ): TabbedItem = {
    val __obj = js.Dynamic.literal(bodyPromise = bodyPromise.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (afterAttachedCallback != null) __obj.updateDynamic("afterAttachedCallback")(afterAttachedCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedItem]
  }
}

