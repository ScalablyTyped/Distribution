package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedDirectory extends js.Object {
  /**
    * The date and time that the shared directory was created.
    */
  var CreatedDateTime: js.UndefOr[CreatedDateTime] = js.undefined
  /**
    * The date and time that the shared directory was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined
  /**
    * Identifier of the directory owner account, which contains the directory that has been shared to the consumer account.
    */
  var OwnerAccountId: js.UndefOr[CustomerId] = js.undefined
  /**
    * Identifier of the directory in the directory owner account. 
    */
  var OwnerDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a shared directory request (HANDSHAKE).
    */
  var ShareMethod: js.UndefOr[ShareMethod] = js.undefined
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.undefined
  /**
    * Current directory status of the shared AWS Managed Microsoft AD directory.
    */
  var ShareStatus: js.UndefOr[ShareStatus] = js.undefined
  /**
    * Identifier of the directory consumer account that has access to the shared directory (OwnerDirectoryId) in the directory owner account.
    */
  var SharedAccountId: js.UndefOr[CustomerId] = js.undefined
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account.
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
}

object SharedDirectory {
  @scala.inline
  def apply(
    CreatedDateTime: CreatedDateTime = null,
    LastUpdatedDateTime: LastUpdatedDateTime = null,
    OwnerAccountId: CustomerId = null,
    OwnerDirectoryId: DirectoryId = null,
    ShareMethod: ShareMethod = null,
    ShareNotes: Notes = null,
    ShareStatus: ShareStatus = null,
    SharedAccountId: CustomerId = null,
    SharedDirectoryId: DirectoryId = null
  ): SharedDirectory = {
    val __obj = js.Dynamic.literal()
    if (CreatedDateTime != null) __obj.updateDynamic("CreatedDateTime")(CreatedDateTime)
    if (LastUpdatedDateTime != null) __obj.updateDynamic("LastUpdatedDateTime")(LastUpdatedDateTime)
    if (OwnerAccountId != null) __obj.updateDynamic("OwnerAccountId")(OwnerAccountId)
    if (OwnerDirectoryId != null) __obj.updateDynamic("OwnerDirectoryId")(OwnerDirectoryId)
    if (ShareMethod != null) __obj.updateDynamic("ShareMethod")(ShareMethod.asInstanceOf[js.Any])
    if (ShareNotes != null) __obj.updateDynamic("ShareNotes")(ShareNotes)
    if (ShareStatus != null) __obj.updateDynamic("ShareStatus")(ShareStatus.asInstanceOf[js.Any])
    if (SharedAccountId != null) __obj.updateDynamic("SharedAccountId")(SharedAccountId)
    if (SharedDirectoryId != null) __obj.updateDynamic("SharedDirectoryId")(SharedDirectoryId)
    __obj.asInstanceOf[SharedDirectory]
  }
}

