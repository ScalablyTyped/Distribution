package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VPCDerivedInfoStatus extends js.Object {
  /**
    *  Specifies the VPC options for the specified Elasticsearch domain.
    */
  var Options: VPCDerivedInfo
  /**
    *  Specifies the status of the VPC options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus
}

object VPCDerivedInfoStatus {
  @scala.inline
  def apply(Options: VPCDerivedInfo, Status: OptionStatus): VPCDerivedInfoStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[VPCDerivedInfoStatus]
  }
}

