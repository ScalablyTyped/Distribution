package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggesterStatus extends js.Object {
  var Options: Suggester
  var Status: OptionStatus
}

object SuggesterStatus {
  @scala.inline
  def apply(Options: Suggester, Status: OptionStatus): SuggesterStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[SuggesterStatus]
  }
}

