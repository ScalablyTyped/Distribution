package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EBSOptionsStatus extends js.Object {
  /**
    *  Specifies the EBS options for the specified Elasticsearch domain.
    */
  var Options: EBSOptions = js.native
  /**
    *  Specifies the status of the EBS options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}

object EBSOptionsStatus {
  @scala.inline
  def apply(Options: EBSOptions, Status: OptionStatus): EBSOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EBSOptionsStatus]
  }
}

