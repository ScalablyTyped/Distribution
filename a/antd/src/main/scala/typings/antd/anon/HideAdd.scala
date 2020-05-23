package typings.antd.anon

import typings.antd.tabsMod.TabsPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HideAdd extends js.Object {
  var hideAdd: Boolean
  var tabPosition: TabsPosition
}

object HideAdd {
  @scala.inline
  def apply(hideAdd: Boolean, tabPosition: TabsPosition): HideAdd = {
    val __obj = js.Dynamic.literal(hideAdd = hideAdd.asInstanceOf[js.Any], tabPosition = tabPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideAdd]
  }
}

