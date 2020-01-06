package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggesterStatus extends js.Object {
  var Options: Suggester = js.native
  var Status: OptionStatus = js.native
}

object SuggesterStatus {
  @scala.inline
  def apply(Options: Suggester, Status: OptionStatus): SuggesterStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuggesterStatus]
  }
}

