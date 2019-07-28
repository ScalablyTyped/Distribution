package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLogSubscriptionRequest extends js.Object {
  /**
    * Identifier (ID) of the directory whose log subscription you want to delete.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
}

object DeleteLogSubscriptionRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): DeleteLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId)
  
    __obj.asInstanceOf[DeleteLogSubscriptionRequest]
  }
}

