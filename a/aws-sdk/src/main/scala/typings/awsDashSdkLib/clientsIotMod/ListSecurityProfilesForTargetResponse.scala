package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSecurityProfilesForTargetResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of security profiles and their associated targets.
    */
  var securityProfileTargetMappings: js.UndefOr[SecurityProfileTargetMappings] = js.undefined
}

object ListSecurityProfilesForTargetResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, securityProfileTargetMappings: SecurityProfileTargetMappings = null): ListSecurityProfilesForTargetResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (securityProfileTargetMappings != null) __obj.updateDynamic("securityProfileTargetMappings")(securityProfileTargetMappings)
    __obj.asInstanceOf[ListSecurityProfilesForTargetResponse]
  }
}

