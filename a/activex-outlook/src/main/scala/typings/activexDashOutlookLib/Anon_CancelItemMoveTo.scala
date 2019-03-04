package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelItemMoveTo extends js.Object {
  var Cancel: scala.Boolean
  val Item: js.Any
  val MoveTo: activexDashOutlookLib.OutlookNs.Folder
}

object Anon_CancelItemMoveTo {
  @scala.inline
  def apply(Cancel: scala.Boolean, Item: js.Any, MoveTo: activexDashOutlookLib.OutlookNs.Folder): Anon_CancelItemMoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Item = Item, MoveTo = MoveTo)
  
    __obj.asInstanceOf[Anon_CancelItemMoveTo]
  }
}

