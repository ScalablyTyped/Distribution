package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolutionStatus extends js.Object {
  var code: String
}

object ResolutionStatus {
  @scala.inline
  def apply(code: String): ResolutionStatus = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolutionStatus]
  }
}

