package typings.awsLambda.triggerS3EventNotificationMod

import typings.awsLambda.anon.Etag
import typings.awsLambda.anon.NameString
import typings.awsLambda.awsLambdaStrings.ARCHIVE_ACCESS
import typings.awsLambda.awsLambdaStrings.DEEP_ARCHIVE_ACCESS
import typings.awsLambda.awsLambdaStrings.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectAccessTierChangedNotificationEventDetail extends StObject {
  
  var bucket: NameString
  
  var `destination-access-tier`: ARCHIVE_ACCESS | DEEP_ARCHIVE_ACCESS
  
  var `object`: Etag
  
  var `request-id`: String
  
  var requester: String
  
  var version: `0`
}
object S3ObjectAccessTierChangedNotificationEventDetail {
  
  inline def apply(
    bucket: NameString,
    `destination-access-tier`: ARCHIVE_ACCESS | DEEP_ARCHIVE_ACCESS,
    `object`: Etag,
    `request-id`: String,
    requester: String
  ): S3ObjectAccessTierChangedNotificationEventDetail = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], requester = requester.asInstanceOf[js.Any], version = "0")
    __obj.updateDynamic("destination-access-tier")(`destination-access-tier`.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("request-id")(`request-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectAccessTierChangedNotificationEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ObjectAccessTierChangedNotificationEventDetail] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: NameString): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def `setDestination-access-tier`(value: ARCHIVE_ACCESS | DEEP_ARCHIVE_ACCESS): Self = StObject.set(x, "destination-access-tier", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Etag): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def `setRequest-id`(value: String): Self = StObject.set(x, "request-id", value.asInstanceOf[js.Any])
    
    inline def setRequester(value: String): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `0`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
