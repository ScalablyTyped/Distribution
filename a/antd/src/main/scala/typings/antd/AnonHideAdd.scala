package typings.antd

import typings.antd.tabsMod.TabsPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHideAdd extends js.Object {
  var hideAdd: Boolean
  var tabPosition: TabsPosition
}

object AnonHideAdd {
  @scala.inline
  def apply(hideAdd: Boolean, tabPosition: TabsPosition): AnonHideAdd = {
    val __obj = js.Dynamic.literal(hideAdd = hideAdd.asInstanceOf[js.Any], tabPosition = tabPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHideAdd]
  }
}

