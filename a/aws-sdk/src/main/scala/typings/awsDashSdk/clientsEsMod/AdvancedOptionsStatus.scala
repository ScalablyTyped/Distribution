package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedOptionsStatus extends js.Object {
  /**
    *  Specifies the status of advanced options for the specified Elasticsearch domain.
    */
  var Options: AdvancedOptions
  /**
    *  Specifies the status of OptionStatus for advanced options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus
}

object AdvancedOptionsStatus {
  @scala.inline
  def apply(Options: AdvancedOptions, Status: OptionStatus): AdvancedOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[AdvancedOptionsStatus]
  }
}

