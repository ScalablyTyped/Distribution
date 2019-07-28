package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreSummary extends js.Object {
  /**
    * Point in time or source backup time.
    */
  var RestoreDateTime: _Date
  /**
    * Indicates if a restore is in progress or not.
    */
  var RestoreInProgress: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.RestoreInProgress
  /**
    * ARN of the backup from which the table was restored.
    */
  var SourceBackupArn: js.UndefOr[BackupArn] = js.undefined
  /**
    * ARN of the source table of the backup that is being restored.
    */
  var SourceTableArn: js.UndefOr[TableArn] = js.undefined
}

object RestoreSummary {
  @scala.inline
  def apply(
    RestoreDateTime: _Date,
    RestoreInProgress: RestoreInProgress,
    SourceBackupArn: BackupArn = null,
    SourceTableArn: TableArn = null
  ): RestoreSummary = {
    val __obj = js.Dynamic.literal(RestoreDateTime = RestoreDateTime, RestoreInProgress = RestoreInProgress)
    if (SourceBackupArn != null) __obj.updateDynamic("SourceBackupArn")(SourceBackupArn)
    if (SourceTableArn != null) __obj.updateDynamic("SourceTableArn")(SourceTableArn)
    __obj.asInstanceOf[RestoreSummary]
  }
}

