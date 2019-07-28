package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousBackupsDescription extends js.Object {
  /**
    *  ContinuousBackupsStatus can be one of the following states: ENABLED, DISABLED
    */
  var ContinuousBackupsStatus: typings.awsDashSdk.clientsDynamodbMod.ContinuousBackupsStatus
  /**
    * The description of the point in time recovery settings applied to the table.
    */
  var PointInTimeRecoveryDescription: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.PointInTimeRecoveryDescription] = js.undefined
}

object ContinuousBackupsDescription {
  @scala.inline
  def apply(
    ContinuousBackupsStatus: ContinuousBackupsStatus,
    PointInTimeRecoveryDescription: PointInTimeRecoveryDescription = null
  ): ContinuousBackupsDescription = {
    val __obj = js.Dynamic.literal(ContinuousBackupsStatus = ContinuousBackupsStatus.asInstanceOf[js.Any])
    if (PointInTimeRecoveryDescription != null) __obj.updateDynamic("PointInTimeRecoveryDescription")(PointInTimeRecoveryDescription)
    __obj.asInstanceOf[ContinuousBackupsDescription]
  }
}

