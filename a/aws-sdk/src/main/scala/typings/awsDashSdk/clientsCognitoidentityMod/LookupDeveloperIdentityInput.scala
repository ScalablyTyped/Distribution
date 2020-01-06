package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupDeveloperIdentityInput extends js.Object {
  /**
    * A unique ID used by your backend authentication process to identify a user. Typically, a developer identity provider would issue many developer user identifiers, in keeping with the number of users.
    */
  var DeveloperUserIdentifier: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.DeveloperUserIdentifier] = js.native
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityMod.IdentityId] = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitoidentityMod.IdentityPoolId = js.native
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: js.UndefOr[QueryLimit] = js.native
  /**
    * A pagination token. The first call you make will have NextToken set to null. After that the service will return NextToken values as needed. For example, let's say you make a request with MaxResults set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object LookupDeveloperIdentityInput {
  @scala.inline
  def apply(
    IdentityPoolId: IdentityPoolId,
    DeveloperUserIdentifier: DeveloperUserIdentifier = null,
    IdentityId: IdentityId = null,
    MaxResults: Int | Double = null,
    NextToken: PaginationKey = null
  ): LookupDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    if (DeveloperUserIdentifier != null) __obj.updateDynamic("DeveloperUserIdentifier")(DeveloperUserIdentifier.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupDeveloperIdentityInput]
  }
}

