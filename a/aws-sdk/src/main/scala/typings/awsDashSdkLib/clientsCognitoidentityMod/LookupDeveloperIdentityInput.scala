package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupDeveloperIdentityInput extends js.Object {
  /**
    * A unique ID used by your backend authentication process to identify a user. Typically, a developer identity provider would issue many developer user identifiers, in keeping with the number of users.
    */
  var DeveloperUserIdentifier: js.UndefOr[DeveloperUserIdentifier] = js.undefined
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[IdentityId] = js.undefined
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: awsDashSdkLib.clientsCognitoidentityMod.IdentityPoolId
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: js.UndefOr[QueryLimit] = js.undefined
  /**
    * A pagination token. The first call you make will have NextToken set to null. After that the service will return NextToken values as needed. For example, let's say you make a request with MaxResults set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}

object LookupDeveloperIdentityInput {
  @scala.inline
  def apply(
    IdentityPoolId: IdentityPoolId,
    DeveloperUserIdentifier: DeveloperUserIdentifier = null,
    IdentityId: IdentityId = null,
    MaxResults: js.UndefOr[QueryLimit] = js.undefined,
    NextToken: PaginationKey = null
  ): LookupDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId)
    if (DeveloperUserIdentifier != null) __obj.updateDynamic("DeveloperUserIdentifier")(DeveloperUserIdentifier)
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[LookupDeveloperIdentityInput]
  }
}

