package typings.activexOutlook

import typings.activexOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelToGroup extends js.Object {
  var Cancel: Boolean
  val ToGroup: OutlookBarGroup
}

object AnonCancelToGroup {
  @scala.inline
  def apply(Cancel: Boolean, ToGroup: OutlookBarGroup): AnonCancelToGroup = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ToGroup = ToGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelToGroup]
  }
}

