package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupDetails extends js.Object {
  /**
    * ARN associated with the backup.
    */
  var BackupArn: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.BackupArn
  /**
    * Time at which the backup was created. This is the request time of the backup. 
    */
  var BackupCreationDateTime: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.BackupCreationDateTime
  /**
    * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
    */
  var BackupExpiryDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * Name of the requested backup.
    */
  var BackupName: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.BackupName
  /**
    * Size of the backup in bytes.
    */
  var BackupSizeBytes: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.BackupSizeBytes
  ] = js.undefined
  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED. 
    */
  var BackupStatus: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.BackupStatus
  /**
    * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from AWS Backup service.  
    */
  var BackupType: typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.BackupType
}

object BackupDetails {
  @scala.inline
  def apply(
    BackupArn: BackupArn,
    BackupCreationDateTime: BackupCreationDateTime,
    BackupName: BackupName,
    BackupStatus: BackupStatus,
    BackupType: BackupType,
    BackupExpiryDateTime: _Date = null,
    BackupSizeBytes: Int | scala.Double = null
  ): BackupDetails = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn, BackupCreationDateTime = BackupCreationDateTime, BackupName = BackupName, BackupStatus = BackupStatus.asInstanceOf[js.Any], BackupType = BackupType.asInstanceOf[js.Any])
    if (BackupExpiryDateTime != null) __obj.updateDynamic("BackupExpiryDateTime")(BackupExpiryDateTime)
    if (BackupSizeBytes != null) __obj.updateDynamic("BackupSizeBytes")(BackupSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupDetails]
  }
}

