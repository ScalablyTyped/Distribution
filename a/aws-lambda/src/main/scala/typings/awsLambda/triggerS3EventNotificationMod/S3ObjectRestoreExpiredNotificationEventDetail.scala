package typings.awsLambda.triggerS3EventNotificationMod

import typings.awsLambda.anon.KeyVersionid
import typings.awsLambda.anon.NameString
import typings.awsLambda.awsLambdaStrings.`0`
import typings.awsLambda.awsLambdaStrings.s3DotamazonawsDotcom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectRestoreExpiredNotificationEventDetail extends StObject {
  
  var bucket: NameString
  
  var `object`: KeyVersionid
  
  var `request-id`: String
  
  var requester: s3DotamazonawsDotcom
  
  var version: `0`
}
object S3ObjectRestoreExpiredNotificationEventDetail {
  
  inline def apply(bucket: NameString, `object`: KeyVersionid, `request-id`: String): S3ObjectRestoreExpiredNotificationEventDetail = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], requester = "s3.amazonaws.com", version = "0")
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("request-id")(`request-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectRestoreExpiredNotificationEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ObjectRestoreExpiredNotificationEventDetail] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: NameString): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setObject(value: KeyVersionid): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def `setRequest-id`(value: String): Self = StObject.set(x, "request-id", value.asInstanceOf[js.Any])
    
    inline def setRequester(value: s3DotamazonawsDotcom): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `0`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
