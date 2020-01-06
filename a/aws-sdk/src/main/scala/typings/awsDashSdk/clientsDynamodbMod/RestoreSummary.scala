package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreSummary extends js.Object {
  /**
    * Point in time or source backup time.
    */
  var RestoreDateTime: _Date = js.native
  /**
    * Indicates if a restore is in progress or not.
    */
  var RestoreInProgress: typings.awsDashSdk.clientsDynamodbMod.RestoreInProgress = js.native
  /**
    * The Amazon Resource Name (ARN) of the backup from which the table was restored.
    */
  var SourceBackupArn: js.UndefOr[BackupArn] = js.native
  /**
    * The ARN of the source table of the backup that is being restored.
    */
  var SourceTableArn: js.UndefOr[TableArn] = js.native
}

object RestoreSummary {
  @scala.inline
  def apply(
    RestoreDateTime: _Date,
    RestoreInProgress: RestoreInProgress,
    SourceBackupArn: BackupArn = null,
    SourceTableArn: TableArn = null
  ): RestoreSummary = {
    val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime.asInstanceOf[js.Any], RestoreInProgress = RestoreInProgress.asInstanceOf[js.Any])
    if (SourceBackupArn != null) __obj.updateDynamic("SourceBackupArn")(SourceBackupArn.asInstanceOf[js.Any])
    if (SourceTableArn != null) __obj.updateDynamic("SourceTableArn")(SourceTableArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreSummary]
  }
}

