package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusReason extends js.Object {
  /**
    * The reason code for the current status of the analyzer.
    */
  var code: ReasonCode = js.native
}

object StatusReason {
  @scala.inline
  def apply(code: ReasonCode): StatusReason = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReason]
  }
}

