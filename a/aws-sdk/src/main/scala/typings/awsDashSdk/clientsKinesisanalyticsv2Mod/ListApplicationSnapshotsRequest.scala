package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationSnapshotsRequest extends js.Object {
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * The maximum number of application snapshots to list.
    */
  var Limit: js.UndefOr[ListSnapshotsInputLimit] = js.undefined
  /**
    * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.NextToken] = js.undefined
}

object ListApplicationSnapshotsRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, Limit: Int | Double = null, NextToken: NextToken = null): ListApplicationSnapshotsRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListApplicationSnapshotsRequest]
  }
}

