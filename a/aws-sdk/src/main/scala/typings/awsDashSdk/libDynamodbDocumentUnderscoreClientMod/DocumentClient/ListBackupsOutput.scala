package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupsOutput extends js.Object {
  /**
    * List of BackupSummary objects.
    */
  var BackupSummaries: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.BackupSummaries
  ] = js.native
  /**
    *  The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results.   If LastEvaluatedBackupArn is empty, then the last page of results has been processed and there are no more results to be retrieved.   If LastEvaluatedBackupArn is not empty, this may or may not indicate that there is more data to be returned. All results are guaranteed to have been returned if and only if no value for LastEvaluatedBackupArn is returned. 
    */
  var LastEvaluatedBackupArn: js.UndefOr[BackupArn] = js.native
}

object ListBackupsOutput {
  @scala.inline
  def apply(BackupSummaries: BackupSummaries = null, LastEvaluatedBackupArn: BackupArn = null): ListBackupsOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupSummaries != null) __obj.updateDynamic("BackupSummaries")(BackupSummaries.asInstanceOf[js.Any])
    if (LastEvaluatedBackupArn != null) __obj.updateDynamic("LastEvaluatedBackupArn")(LastEvaluatedBackupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackupsOutput]
  }
}

