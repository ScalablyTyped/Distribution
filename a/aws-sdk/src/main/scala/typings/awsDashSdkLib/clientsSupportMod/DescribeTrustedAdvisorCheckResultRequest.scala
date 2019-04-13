package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrustedAdvisorCheckResultRequest extends js.Object {
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[String] = js.undefined
}

object DescribeTrustedAdvisorCheckResultRequest {
  @scala.inline
  def apply(checkId: String, language: String = null): DescribeTrustedAdvisorCheckResultRequest = {
    val __obj = js.Dynamic.literal(checkId = checkId)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckResultRequest]
  }
}

