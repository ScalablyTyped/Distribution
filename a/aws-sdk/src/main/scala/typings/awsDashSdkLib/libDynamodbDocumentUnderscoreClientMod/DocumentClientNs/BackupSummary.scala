package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BackupSummary extends js.Object {
  /**
       * ARN associated with the backup.
       */
  var BackupArn: js.UndefOr[BackupArn] = js.undefined
  /**
       * Time at which the backup was created.
       */
  var BackupCreationDateTime: js.UndefOr[BackupCreationDateTime] = js.undefined
  /**
       * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
       */
  var BackupExpiryDateTime: js.UndefOr[_Date] = js.undefined
  /**
       * Name of the specified backup.
       */
  var BackupName: js.UndefOr[BackupName] = js.undefined
  /**
       * Size of the backup in bytes.
       */
  var BackupSizeBytes: js.UndefOr[BackupSizeBytes] = js.undefined
  /**
       * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
       */
  var BackupStatus: js.UndefOr[BackupStatus] = js.undefined
  /**
       * BackupType:    USER - On-demand backup created by you.    SYSTEM - On-demand backup automatically created by DynamoDB.  
       */
  var BackupType: js.UndefOr[BackupType] = js.undefined
  /**
       * ARN associated with the table.
       */
  var TableArn: js.UndefOr[TableArn] = js.undefined
  /**
       * Unique identifier for the table.
       */
  var TableId: js.UndefOr[TableId] = js.undefined
  /**
       * Name of the table.
       */
  var TableName: js.UndefOr[TableName] = js.undefined
}

