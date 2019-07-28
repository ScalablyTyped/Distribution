package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptSharedDirectoryRequest extends js.Object {
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account. 
    */
  var SharedDirectoryId: DirectoryId
}

object AcceptSharedDirectoryRequest {
  @scala.inline
  def apply(SharedDirectoryId: DirectoryId): AcceptSharedDirectoryRequest = {
    val __obj = js.Dynamic.literal(SharedDirectoryId = SharedDirectoryId)
  
    __obj.asInstanceOf[AcceptSharedDirectoryRequest]
  }
}

