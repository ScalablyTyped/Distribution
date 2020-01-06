package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveDirectoryBackupAttributes extends js.Object {
  /**
    * The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.native
  /**
    * The fully qualified domain name of the self-managed AD directory.
    */
  var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.native
}

object ActiveDirectoryBackupAttributes {
  @scala.inline
  def apply(ActiveDirectoryId: DirectoryId = null, DomainName: ActiveDirectoryFullyQualifiedName = null): ActiveDirectoryBackupAttributes = {
    val __obj = js.Dynamic.literal()
    if (ActiveDirectoryId != null) __obj.updateDynamic("ActiveDirectoryId")(ActiveDirectoryId.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveDirectoryBackupAttributes]
  }
}

