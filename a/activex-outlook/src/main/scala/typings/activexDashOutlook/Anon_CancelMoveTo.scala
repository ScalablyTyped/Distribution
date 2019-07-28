package typings.activexDashOutlook

import typings.activexDashOutlook.OutlookNs.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelMoveTo extends js.Object {
  var Cancel: Boolean
  val MoveTo: Folder
}

object Anon_CancelMoveTo {
  @scala.inline
  def apply(Cancel: Boolean, MoveTo: Folder): Anon_CancelMoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, MoveTo = MoveTo)
  
    __obj.asInstanceOf[Anon_CancelMoveTo]
  }
}

