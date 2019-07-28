package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersRequest extends js.Object {
  /**
    * An array of strings, where each string is the name of a user attribute to be returned for each user in the search results. If the array is null, all attributes are returned.
    */
  var AttributesToGet: js.UndefOr[SearchedAttributeNamesListType] = js.undefined
  /**
    * A filter string of the form "AttributeName Filter-Type "AttributeValue"". Quotation marks within the filter string must be escaped using the backslash (\) character. For example, "family_name = \"Reddy\"".    AttributeName: The name of the attribute to search for. You can only search for one attribute at a time.    Filter-Type: For an exact match, use =, for example, "given_name = \"Jon\"". For a prefix ("starts with") match, use ^=, for example, "given_name ^= \"Jon\"".     AttributeValue: The attribute value that must be matched for each user.   If the filter string is empty, ListUsers returns all users in the user pool. You can only search for the following standard attributes:    username (case-sensitive)    email     phone_number     name     given_name     family_name     preferred_username     cognito:user_status (called Status in the Console) (case-insensitive)    status (called Enabled in the Console) (case-sensitive)     sub    Custom attributes are not searchable. For more information, see Searching for Users Using the ListUsers API and Examples of Using the ListUsers API in the Amazon Cognito Developer Guide.
    */
  var Filter: js.UndefOr[UserFilterType] = js.undefined
  /**
    * Maximum number of users to be returned.
    */
  var Limit: js.UndefOr[QueryLimitType] = js.undefined
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
  /**
    * The user pool ID for the user pool on which the search should be performed.
    */
  var UserPoolId: UserPoolIdType
}

object ListUsersRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    AttributesToGet: SearchedAttributeNamesListType = null,
    Filter: UserFilterType = null,
    Limit: js.UndefOr[QueryLimitType] = js.undefined,
    PaginationToken: SearchPaginationTokenType = null
  ): ListUsersRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
    if (AttributesToGet != null) __obj.updateDynamic("AttributesToGet")(AttributesToGet)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    __obj.asInstanceOf[ListUsersRequest]
  }
}

