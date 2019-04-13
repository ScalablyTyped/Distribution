package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListV2LoggingLevelsResponse extends js.Object {
  /**
    * The logging configuration for a target.
    */
  var logTargetConfigurations: js.UndefOr[LogTargetConfigurations] = js.undefined
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListV2LoggingLevelsResponse {
  @scala.inline
  def apply(logTargetConfigurations: LogTargetConfigurations = null, nextToken: NextToken = null): ListV2LoggingLevelsResponse = {
    val __obj = js.Dynamic.literal()
    if (logTargetConfigurations != null) __obj.updateDynamic("logTargetConfigurations")(logTargetConfigurations)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListV2LoggingLevelsResponse]
  }
}

