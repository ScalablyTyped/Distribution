package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelMoveTo extends js.Object {
  var Cancel: scala.Boolean
  val MoveTo: activexDashOutlookLib.OutlookNs.Folder
}

object Anon_CancelMoveTo {
  @scala.inline
  def apply(Cancel: scala.Boolean, MoveTo: activexDashOutlookLib.OutlookNs.Folder): Anon_CancelMoveTo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("MoveTo")(MoveTo)
    __obj.asInstanceOf[Anon_CancelMoveTo]
  }
}

