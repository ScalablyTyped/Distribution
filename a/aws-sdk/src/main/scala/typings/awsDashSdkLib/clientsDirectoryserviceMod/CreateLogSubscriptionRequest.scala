package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLogSubscriptionRequest extends js.Object {
  /**
    * Identifier (ID) of the directory to which you want to subscribe and receive real-time logs to your specified CloudWatch log group.
    */
  var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryId
  /**
    * The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
    */
  var LogGroupName: awsDashSdkLib.clientsDirectoryserviceMod.LogGroupName
}

object CreateLogSubscriptionRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, LogGroupName: LogGroupName): CreateLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, LogGroupName = LogGroupName)
  
    __obj.asInstanceOf[CreateLogSubscriptionRequest]
  }
}

