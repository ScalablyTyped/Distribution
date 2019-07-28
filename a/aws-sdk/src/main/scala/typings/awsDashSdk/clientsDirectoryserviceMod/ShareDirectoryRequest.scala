package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDirectoryRequest extends js.Object {
  /**
    * Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a directory sharing request (HANDSHAKE).
    */
  var ShareMethod: typings.awsDashSdk.clientsDirectoryserviceMod.ShareMethod
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.undefined
  /**
    * Identifier for the directory consumer account with whom the directory is to be shared.
    */
  var ShareTarget: typings.awsDashSdk.clientsDirectoryserviceMod.ShareTarget
}

object ShareDirectoryRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId,
    ShareMethod: ShareMethod,
    ShareTarget: ShareTarget,
    ShareNotes: Notes = null
  ): ShareDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, ShareMethod = ShareMethod.asInstanceOf[js.Any], ShareTarget = ShareTarget)
    if (ShareNotes != null) __obj.updateDynamic("ShareNotes")(ShareNotes)
    __obj.asInstanceOf[ShareDirectoryRequest]
  }
}

