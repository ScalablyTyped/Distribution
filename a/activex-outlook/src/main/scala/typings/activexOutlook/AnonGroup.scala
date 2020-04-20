package typings.activexOutlook

import typings.activexOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroup extends js.Object {
  var Cancel: Boolean
  val Group: OutlookBarGroup
}

object AnonGroup {
  @scala.inline
  def apply(Cancel: Boolean, Group: OutlookBarGroup): AnonGroup = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroup]
  }
}

