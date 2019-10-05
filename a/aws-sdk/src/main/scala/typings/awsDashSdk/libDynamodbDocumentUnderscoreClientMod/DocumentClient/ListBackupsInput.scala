package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBackupsInput extends js.Object {
  /**
    * The backups from the table specified by BackupType are listed. Where BackupType can be:    USER - On-demand backup created by you.    SYSTEM - On-demand backup automatically created by DynamoDB.    ALL - All types of on-demand backups (USER and SYSTEM).  
    */
  var BackupType: js.UndefOr[BackupTypeFilter] = js.undefined
  /**
    *  LastEvaluatedBackupArn is the Amazon Resource Name (ARN) of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results. 
    */
  var ExclusiveStartBackupArn: js.UndefOr[BackupArn] = js.undefined
  /**
    * Maximum number of backups to return at once.
    */
  var Limit: js.UndefOr[BackupsInputLimit] = js.undefined
  /**
    * The backups from the table specified by TableName are listed. 
    */
  var TableName: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TableName
  ] = js.undefined
  /**
    * Only backups created after this time are listed. TimeRangeLowerBound is inclusive.
    */
  var TimeRangeLowerBound: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TimeRangeLowerBound
  ] = js.undefined
  /**
    * Only backups created before this time are listed. TimeRangeUpperBound is exclusive. 
    */
  var TimeRangeUpperBound: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TimeRangeUpperBound
  ] = js.undefined
}

object ListBackupsInput {
  @scala.inline
  def apply(
    BackupType: BackupTypeFilter = null,
    ExclusiveStartBackupArn: BackupArn = null,
    Limit: Int | scala.Double = null,
    TableName: TableName = null,
    TimeRangeLowerBound: TimeRangeLowerBound = null,
    TimeRangeUpperBound: TimeRangeUpperBound = null
  ): ListBackupsInput = {
    val __obj = js.Dynamic.literal()
    if (BackupType != null) __obj.updateDynamic("BackupType")(BackupType.asInstanceOf[js.Any])
    if (ExclusiveStartBackupArn != null) __obj.updateDynamic("ExclusiveStartBackupArn")(ExclusiveStartBackupArn)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName)
    if (TimeRangeLowerBound != null) __obj.updateDynamic("TimeRangeLowerBound")(TimeRangeLowerBound)
    if (TimeRangeUpperBound != null) __obj.updateDynamic("TimeRangeUpperBound")(TimeRangeUpperBound)
    __obj.asInstanceOf[ListBackupsInput]
  }
}

