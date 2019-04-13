package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOTAUpdatesResponse extends js.Object {
  /**
    * A token to use to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of OTA update jobs.
    */
  var otaUpdates: js.UndefOr[OTAUpdatesSummary] = js.undefined
}

object ListOTAUpdatesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, otaUpdates: OTAUpdatesSummary = null): ListOTAUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (otaUpdates != null) __obj.updateDynamic("otaUpdates")(otaUpdates)
    __obj.asInstanceOf[ListOTAUpdatesResponse]
  }
}

