package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSeverityLevelsResponse extends js.Object {
  /**
    * The available severity levels for the support case. Available severity levels are defined by your service level agreement with AWS.
    */
  var severityLevels: js.UndefOr[SeverityLevelsList] = js.undefined
}

object DescribeSeverityLevelsResponse {
  @scala.inline
  def apply(severityLevels: SeverityLevelsList = null): DescribeSeverityLevelsResponse = {
    val __obj = js.Dynamic.literal()
    if (severityLevels != null) __obj.updateDynamic("severityLevels")(severityLevels)
    __obj.asInstanceOf[DescribeSeverityLevelsResponse]
  }
}

