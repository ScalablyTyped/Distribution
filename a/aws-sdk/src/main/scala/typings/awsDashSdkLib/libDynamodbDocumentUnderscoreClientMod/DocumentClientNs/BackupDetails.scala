package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BackupDetails extends js.Object {
  /**
       * ARN associated with the backup.
       */
  var BackupArn: BackupArn
  /**
       * Time at which the backup was created. This is the request time of the backup. 
       */
  var BackupCreationDateTime: BackupCreationDateTime
  /**
       * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
       */
  var BackupExpiryDateTime: js.UndefOr[_Date] = js.undefined
  /**
       * Name of the requested backup.
       */
  var BackupName: BackupName
  /**
       * Size of the backup in bytes.
       */
  var BackupSizeBytes: js.UndefOr[BackupSizeBytes] = js.undefined
  /**
       * Backup can be in one of the following states: CREATING, ACTIVE, DELETED. 
       */
  var BackupStatus: BackupStatus
  /**
       * BackupType:    USER - On-demand backup created by you.    SYSTEM - On-demand backup automatically created by DynamoDB.  
       */
  var BackupType: BackupType
}

