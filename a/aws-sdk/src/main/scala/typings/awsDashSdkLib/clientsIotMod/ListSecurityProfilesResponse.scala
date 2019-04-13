package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSecurityProfilesResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of security profile identifiers (names and ARNs).
    */
  var securityProfileIdentifiers: js.UndefOr[SecurityProfileIdentifiers] = js.undefined
}

object ListSecurityProfilesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, securityProfileIdentifiers: SecurityProfileIdentifiers = null): ListSecurityProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (securityProfileIdentifiers != null) __obj.updateDynamic("securityProfileIdentifiers")(securityProfileIdentifiers)
    __obj.asInstanceOf[ListSecurityProfilesResponse]
  }
}

