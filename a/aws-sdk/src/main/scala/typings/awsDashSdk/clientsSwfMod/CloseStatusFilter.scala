package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseStatusFilter extends js.Object {
  /**
    *  The close status that must match the close status of an execution for it to meet the criteria of this filter.
    */
  var status: CloseStatus = js.native
}

object CloseStatusFilter {
  @scala.inline
  def apply(status: CloseStatus): CloseStatusFilter = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloseStatusFilter]
  }
}

