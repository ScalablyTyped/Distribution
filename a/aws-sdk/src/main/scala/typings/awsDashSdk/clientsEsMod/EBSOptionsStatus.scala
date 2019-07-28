package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EBSOptionsStatus extends js.Object {
  /**
    *  Specifies the EBS options for the specified Elasticsearch domain.
    */
  var Options: EBSOptions
  /**
    *  Specifies the status of the EBS options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus
}

object EBSOptionsStatus {
  @scala.inline
  def apply(Options: EBSOptions, Status: OptionStatus): EBSOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[EBSOptionsStatus]
  }
}

