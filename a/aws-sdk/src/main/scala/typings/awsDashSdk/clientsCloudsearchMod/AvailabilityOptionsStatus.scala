package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailabilityOptionsStatus extends js.Object {
  /**
    * The availability options configured for the domain.
    */
  var Options: MultiAZ
  var Status: OptionStatus
}

object AvailabilityOptionsStatus {
  @scala.inline
  def apply(Options: MultiAZ, Status: OptionStatus): AvailabilityOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[AvailabilityOptionsStatus]
  }
}

