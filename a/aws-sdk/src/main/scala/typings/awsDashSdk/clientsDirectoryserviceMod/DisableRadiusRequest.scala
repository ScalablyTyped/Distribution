package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableRadiusRequest extends js.Object {
  /**
    * The identifier of the directory for which to disable MFA.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
}

object DisableRadiusRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): DisableRadiusRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId)
  
    __obj.asInstanceOf[DisableRadiusRequest]
  }
}

