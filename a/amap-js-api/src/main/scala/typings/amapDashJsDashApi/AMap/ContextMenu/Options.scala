package typings.amapDashJsDashApi.AMap.ContextMenu

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 右键菜单内容
    */
  var content: js.UndefOr[String | HTMLElement] = js.undefined
  // internal
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(content: String | HTMLElement = null, visible: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

