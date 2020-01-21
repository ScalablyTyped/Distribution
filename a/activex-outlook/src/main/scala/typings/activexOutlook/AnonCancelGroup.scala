package typings.activexOutlook

import typings.activexOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelGroup extends js.Object {
  var Cancel: Boolean
  val Group: OutlookBarGroup
}

object AnonCancelGroup {
  @scala.inline
  def apply(Cancel: Boolean, Group: OutlookBarGroup): AnonCancelGroup = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelGroup]
  }
}

