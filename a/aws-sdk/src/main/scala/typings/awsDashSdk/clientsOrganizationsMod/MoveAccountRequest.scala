package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveAccountRequest extends js.Object {
  /**
    * The unique identifier (ID) of the account that you want to move. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: typings.awsDashSdk.clientsOrganizationsMod.AccountId
  /**
    * The unique identifier (ID) of the root or organizational unit that you want to move the account to. The regex pattern for a parent ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var DestinationParentId: ParentId
  /**
    * The unique identifier (ID) of the root or organizational unit that you want to move the account from. The regex pattern for a parent ID string requires one of the following:   Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var SourceParentId: ParentId
}

object MoveAccountRequest {
  @scala.inline
  def apply(AccountId: AccountId, DestinationParentId: ParentId, SourceParentId: ParentId): MoveAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, DestinationParentId = DestinationParentId, SourceParentId = SourceParentId)
  
    __obj.asInstanceOf[MoveAccountRequest]
  }
}

