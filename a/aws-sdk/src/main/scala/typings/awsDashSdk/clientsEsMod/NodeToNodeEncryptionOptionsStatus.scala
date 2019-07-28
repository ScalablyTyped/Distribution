package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeToNodeEncryptionOptionsStatus extends js.Object {
  /**
    * Specifies the node-to-node encryption options for the specified Elasticsearch domain.
    */
  var Options: NodeToNodeEncryptionOptions
  /**
    * Specifies the status of the node-to-node encryption options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus
}

object NodeToNodeEncryptionOptionsStatus {
  @scala.inline
  def apply(Options: NodeToNodeEncryptionOptions, Status: OptionStatus): NodeToNodeEncryptionOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[NodeToNodeEncryptionOptionsStatus]
  }
}

