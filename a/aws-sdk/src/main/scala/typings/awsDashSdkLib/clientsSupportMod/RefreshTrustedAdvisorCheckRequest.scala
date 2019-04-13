package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshTrustedAdvisorCheckRequest extends js.Object {
  /**
    * The unique identifier for the Trusted Advisor check to refresh. Note: Specifying the check ID of a check that is automatically refreshed causes an InvalidParameterValue error.
    */
  var checkId: String
}

object RefreshTrustedAdvisorCheckRequest {
  @scala.inline
  def apply(checkId: String): RefreshTrustedAdvisorCheckRequest = {
    val __obj = js.Dynamic.literal(checkId = checkId)
  
    __obj.asInstanceOf[RefreshTrustedAdvisorCheckRequest]
  }
}

