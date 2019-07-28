package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDocumentPermissionRequest extends js.Object {
  /**
    * The AWS user accounts that should have access to the document. The account IDs can either be a group of account IDs or All.
    */
  var AccountIdsToAdd: js.UndefOr[AccountIdList] = js.undefined
  /**
    * The AWS user accounts that should no longer have access to the document. The AWS user account can either be a group of account IDs or All. This action has a higher priority than AccountIdsToAdd. If you specify an account ID to add and the same ID to remove, the system removes access to the document.
    */
  var AccountIdsToRemove: js.UndefOr[AccountIdList] = js.undefined
  /**
    * The name of the document that you want to share.
    */
  var Name: DocumentName
  /**
    * The permission type for the document. The permission type can be Share.
    */
  var PermissionType: DocumentPermissionType
}

object ModifyDocumentPermissionRequest {
  @scala.inline
  def apply(
    Name: DocumentName,
    PermissionType: DocumentPermissionType,
    AccountIdsToAdd: AccountIdList = null,
    AccountIdsToRemove: AccountIdList = null
  ): ModifyDocumentPermissionRequest = {
    val __obj = js.Dynamic.literal(Name = Name, PermissionType = PermissionType.asInstanceOf[js.Any])
    if (AccountIdsToAdd != null) __obj.updateDynamic("AccountIdsToAdd")(AccountIdsToAdd)
    if (AccountIdsToRemove != null) __obj.updateDynamic("AccountIdsToRemove")(AccountIdsToRemove)
    __obj.asInstanceOf[ModifyDocumentPermissionRequest]
  }
}

