package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelGroup extends js.Object {
  var Cancel: Boolean
  val Group: OutlookBarGroup
}

object Anon_CancelGroup {
  @scala.inline
  def apply(Cancel: Boolean, Group: OutlookBarGroup): Anon_CancelGroup = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelGroup]
  }
}

