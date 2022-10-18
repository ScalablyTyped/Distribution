package typings.awsLambda.triggerS3EventNotificationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectAccessTierChangedNotificationEvent
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectACLUpdatedNotificationEvent
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectCreatedNotificationEvent
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectDeletedNotificationEvent
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectRestoreCompletedNotificationEvent
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectRestoreExpiredNotificationEvent
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectRestoreInitiatedNotificationEvent
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectStorageClassChangedNotificationEvent
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectTagsAddedNotificationEvent
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectTagsDeletedNotificationEvent
*/
trait S3NotificationEvent extends StObject
object S3NotificationEvent {
  
  inline def S3ObjectACLUpdatedNotificationEvent(
    account: String,
    detail: S3ObjectACLUpdatedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectACLUpdatedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object ACL Updated")
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectACLUpdatedNotificationEvent]
  }
  
  inline def S3ObjectAccessTierChangedNotificationEvent(
    account: String,
    detail: S3ObjectAccessTierChangedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectAccessTierChangedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Access Tier Changed")
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectAccessTierChangedNotificationEvent]
  }
  
  inline def S3ObjectCreatedNotificationEvent(
    account: String,
    detail: S3ObjectCreatedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectCreatedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Created")
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectCreatedNotificationEvent]
  }
  
  inline def S3ObjectDeletedNotificationEvent(
    account: String,
    detail: S3ObjectDeletedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectDeletedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Deleted")
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectDeletedNotificationEvent]
  }
  
  inline def S3ObjectRestoreCompletedNotificationEvent(
    account: String,
    detail: S3ObjectRestoreCompletedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectRestoreCompletedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Restore Completed")
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectRestoreCompletedNotificationEvent]
  }
  
  inline def S3ObjectRestoreExpiredNotificationEvent(
    account: String,
    detail: S3ObjectRestoreExpiredNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectRestoreExpiredNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Restore Expired")
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectRestoreExpiredNotificationEvent]
  }
  
  inline def S3ObjectRestoreInitiatedNotificationEvent(
    account: String,
    detail: S3ObjectRestoreInitiatedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectRestoreInitiatedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Restore Initiated")
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectRestoreInitiatedNotificationEvent]
  }
  
  inline def S3ObjectStorageClassChangedNotificationEvent(
    account: String,
    detail: S3ObjectStorageClassChangedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectStorageClassChangedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Storage Class Changed")
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectStorageClassChangedNotificationEvent]
  }
  
  inline def S3ObjectTagsAddedNotificationEvent(
    account: String,
    detail: S3ObjectTagsAddedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectTagsAddedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Tags Added")
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectTagsAddedNotificationEvent]
  }
  
  inline def S3ObjectTagsDeletedNotificationEvent(
    account: String,
    detail: S3ObjectTagsDeletedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectTagsDeletedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Tags Deleted")
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectTagsDeletedNotificationEvent]
  }
}
