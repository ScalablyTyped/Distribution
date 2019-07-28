package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveDirectoryBackupAttributes extends js.Object {
  /**
    * The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  /**
    * The fully qualified domain name of the self-managed AD directory.
    */
  var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.undefined
}

object ActiveDirectoryBackupAttributes {
  @scala.inline
  def apply(ActiveDirectoryId: DirectoryId = null, DomainName: ActiveDirectoryFullyQualifiedName = null): ActiveDirectoryBackupAttributes = {
    val __obj = js.Dynamic.literal()
    if (ActiveDirectoryId != null) __obj.updateDynamic("ActiveDirectoryId")(ActiveDirectoryId)
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    __obj.asInstanceOf[ActiveDirectoryBackupAttributes]
  }
}

