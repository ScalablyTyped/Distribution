package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDirectoryRequest extends js.Object {
  /**
    * The identifier of the directory to delete.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
}

object DeleteDirectoryRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): DeleteDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId)
  
    __obj.asInstanceOf[DeleteDirectoryRequest]
  }
}

