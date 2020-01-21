package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolution extends js.Object {
  var authority: String
  var status: ResolutionStatus
  var values: js.Array[ResolutionValueContainer]
}

object Resolution {
  @scala.inline
  def apply(authority: String, status: ResolutionStatus, values: js.Array[ResolutionValueContainer]): Resolution = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Resolution]
  }
}

