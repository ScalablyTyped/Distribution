package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToGroup extends js.Object {
  var Cancel: Boolean
  val ToGroup: OutlookBarGroup
}

object ToGroup {
  @scala.inline
  def apply(Cancel: Boolean, ToGroup: OutlookBarGroup): ToGroup = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ToGroup = ToGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToGroup]
  }
}

