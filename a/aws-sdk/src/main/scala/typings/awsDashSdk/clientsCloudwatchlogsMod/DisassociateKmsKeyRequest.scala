package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateKmsKeyRequest extends js.Object {
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}

object DisassociateKmsKeyRequest {
  @scala.inline
  def apply(logGroupName: LogGroupName): DisassociateKmsKeyRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName)
  
    __obj.asInstanceOf[DisassociateKmsKeyRequest]
  }
}

