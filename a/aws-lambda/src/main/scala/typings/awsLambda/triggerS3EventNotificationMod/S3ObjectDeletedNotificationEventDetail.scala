package typings.awsLambda.triggerS3EventNotificationMod

import typings.awsLambda.anon.EtagKey
import typings.awsLambda.anon.NameString
import typings.awsLambda.awsLambdaStrings.`Delete Marker Created`
import typings.awsLambda.awsLambdaStrings.`Permanently Deleted`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectDeletedNotificationEventLifecycleExpirationDetail
  - typings.awsLambda.triggerS3EventNotificationMod.S3ObjectDeletedNotificationEventDeleteObjectDetail
*/
trait S3ObjectDeletedNotificationEventDetail extends StObject
object S3ObjectDeletedNotificationEventDetail {
  
  inline def S3ObjectDeletedNotificationEventDeleteObjectDetail(
    bucket: NameString,
    `deletion-type`: (`Permanently Deleted`) | (`Delete Marker Created`),
    `object`: EtagKey,
    `request-id`: String,
    requester: String,
    `source-ip-address`: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectDeletedNotificationEventDeleteObjectDetail = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], reason = "DeleteObject", requester = requester.asInstanceOf[js.Any], version = "0")
    __obj.updateDynamic("deletion-type")(`deletion-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("request-id")(`request-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-ip-address")(`source-ip-address`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectDeletedNotificationEventDeleteObjectDetail]
  }
  
  inline def S3ObjectDeletedNotificationEventLifecycleExpirationDetail(
    bucket: NameString,
    `deletion-type`: (`Permanently Deleted`) | (`Delete Marker Created`),
    `object`: EtagKey,
    `request-id`: String,
    requester: String
  ): typings.awsLambda.triggerS3EventNotificationMod.S3ObjectDeletedNotificationEventLifecycleExpirationDetail = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], reason = "Lifecycle Expiration", requester = requester.asInstanceOf[js.Any], version = "0")
    __obj.updateDynamic("deletion-type")(`deletion-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("request-id")(`request-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsLambda.triggerS3EventNotificationMod.S3ObjectDeletedNotificationEventLifecycleExpirationDetail]
  }
}
