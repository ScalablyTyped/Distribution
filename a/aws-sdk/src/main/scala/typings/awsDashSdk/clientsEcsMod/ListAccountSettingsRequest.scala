package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAccountSettingsRequest extends js.Object {
  /**
    * Specifies whether to return the effective settings. If true, the account settings for the root user or the default setting for the principalArn are returned. If false, the account settings for the principalArn are returned if they are set. Otherwise, no account settings are returned.
    */
  var effectiveSettings: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of account setting results returned by ListAccountSettings in paginated output. When this parameter is used, ListAccountSettings only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListAccountSettings request with the returned nextToken value. This value can be between 1 and 10. If this parameter is not used, then ListAccountSettings returns up to 10 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The resource name you want to list the account settings for.
    */
  var name: js.UndefOr[SettingName] = js.undefined
  /**
    * The nextToken value returned from a previous paginated ListAccountSettings request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the account settings are listed only for the authenticated user.
    */
  var principalArn: js.UndefOr[String] = js.undefined
  /**
    * The value of the account settings with which to filter results. You must also specify an account setting name to use this parameter.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ListAccountSettingsRequest {
  @scala.inline
  def apply(
    effectiveSettings: js.UndefOr[Boolean] = js.undefined,
    maxResults: js.UndefOr[Integer] = js.undefined,
    name: SettingName = null,
    nextToken: String = null,
    principalArn: String = null,
    value: String = null
  ): ListAccountSettingsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(effectiveSettings)) __obj.updateDynamic("effectiveSettings")(effectiveSettings)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (principalArn != null) __obj.updateDynamic("principalArn")(principalArn)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ListAccountSettingsRequest]
  }
}

