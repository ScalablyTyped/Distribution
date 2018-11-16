package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListBackupsOutput extends js.Object {
  /**
       * List of BackupSummary objects.
       */
  var BackupSummaries: js.UndefOr[BackupSummaries] = js.undefined
  /**
       *  The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results.   If LastEvaluatedBackupArn is empty, then the last page of results has been processed and there are no more results to be retrieved.   If LastEvaluatedBackupArn is not empty, this may or may not indicate there is more data to be returned. All results are guaranteed to have been returned if and only if no value for LastEvaluatedBackupArn is returned. 
       */
  var LastEvaluatedBackupArn: js.UndefOr[BackupArn] = js.undefined
}

