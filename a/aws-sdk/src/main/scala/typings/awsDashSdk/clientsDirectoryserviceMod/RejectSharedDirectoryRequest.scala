package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectSharedDirectoryRequest extends js.Object {
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account.
    */
  var SharedDirectoryId: DirectoryId = js.native
}

object RejectSharedDirectoryRequest {
  @scala.inline
  def apply(SharedDirectoryId: DirectoryId): RejectSharedDirectoryRequest = {
    val __obj = js.Dynamic.literal(SharedDirectoryId = SharedDirectoryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RejectSharedDirectoryRequest]
  }
}

