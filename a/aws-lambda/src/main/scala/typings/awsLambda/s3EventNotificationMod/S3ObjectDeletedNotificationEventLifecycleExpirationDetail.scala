package typings.awsLambda.s3EventNotificationMod

import typings.awsLambda.anon.EtagKey
import typings.awsLambda.anon.NameString
import typings.awsLambda.awsLambdaStrings.`0`
import typings.awsLambda.awsLambdaStrings.`Delete Marker Created`
import typings.awsLambda.awsLambdaStrings.`Lifecycle Expiration`
import typings.awsLambda.awsLambdaStrings.`Permanently Deleted`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectDeletedNotificationEventLifecycleExpirationDetail
  extends StObject
     with S3ObjectDeletedNotificationEventDetail {
  
  var bucket: NameString
  
  var `deletion-type`: (`Permanently Deleted`) | (`Delete Marker Created`)
  
  var `object`: EtagKey
  
  var reason: `Lifecycle Expiration`
  
  var `request-id`: String
  
  var requester: String
  
  var version: `0`
}
object S3ObjectDeletedNotificationEventLifecycleExpirationDetail {
  
  inline def apply(
    bucket: NameString,
    `deletion-type`: (`Permanently Deleted`) | (`Delete Marker Created`),
    `object`: EtagKey,
    `request-id`: String,
    requester: String
  ): S3ObjectDeletedNotificationEventLifecycleExpirationDetail = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], reason = "Lifecycle Expiration", requester = requester.asInstanceOf[js.Any], version = "0")
    __obj.updateDynamic("deletion-type")(`deletion-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("request-id")(`request-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectDeletedNotificationEventLifecycleExpirationDetail]
  }
  
  extension [Self <: S3ObjectDeletedNotificationEventLifecycleExpirationDetail](x: Self) {
    
    inline def setBucket(value: NameString): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def `setDeletion-type`(value: (`Permanently Deleted`) | (`Delete Marker Created`)): Self = StObject.set(x, "deletion-type", value.asInstanceOf[js.Any])
    
    inline def setObject(value: EtagKey): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setReason(value: `Lifecycle Expiration`): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def `setRequest-id`(value: String): Self = StObject.set(x, "request-id", value.asInstanceOf[js.Any])
    
    inline def setRequester(value: String): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `0`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
