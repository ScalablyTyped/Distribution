package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var Cancel: Boolean
  val Group: OutlookBarGroup
}

object Group {
  @scala.inline
  def apply(Cancel: Boolean, Group: OutlookBarGroup): Group = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

