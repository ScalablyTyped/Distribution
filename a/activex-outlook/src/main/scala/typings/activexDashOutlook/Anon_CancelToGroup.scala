package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.OutlookBarGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelToGroup extends js.Object {
  var Cancel: Boolean
  val ToGroup: OutlookBarGroup
}

object Anon_CancelToGroup {
  @scala.inline
  def apply(Cancel: Boolean, ToGroup: OutlookBarGroup): Anon_CancelToGroup = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, ToGroup = ToGroup)
  
    __obj.asInstanceOf[Anon_CancelToGroup]
  }
}

