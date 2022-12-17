package typings.awsLambda.triggerS3EventNotificationMod

import typings.awsLambda.anon.NameString
import typings.awsLambda.anon.Size
import typings.awsLambda.awsLambdaStrings.DEEP_ARCHIVE
import typings.awsLambda.awsLambdaStrings.GLACIER
import typings.awsLambda.awsLambdaStrings.GLACIER_IR
import typings.awsLambda.awsLambdaStrings.INTELLIGENT_TIERING
import typings.awsLambda.awsLambdaStrings.ONEZONE_IA
import typings.awsLambda.awsLambdaStrings.OUTPOSTS
import typings.awsLambda.awsLambdaStrings.REDUCED_REDUNDANCY
import typings.awsLambda.awsLambdaStrings.STANDARD
import typings.awsLambda.awsLambdaStrings.STANDARD_IA
import typings.awsLambda.awsLambdaStrings.`0`
import typings.awsLambda.awsLambdaStrings.s3DotamazonawsDotcom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectRestoreCompletedNotificationEventDetail extends StObject {
  
  var bucket: NameString
  
  var `object`: Size
  
  var `request-id`: String
  
  var requester: s3DotamazonawsDotcom
  
  var `restore-expiry-time`: String
  
  var `source-storage-class`: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | INTELLIGENT_TIERING | GLACIER | DEEP_ARCHIVE | OUTPOSTS | GLACIER_IR
  
  var version: `0`
}
object S3ObjectRestoreCompletedNotificationEventDetail {
  
  inline def apply(
    bucket: NameString,
    `object`: Size,
    `request-id`: String,
    `restore-expiry-time`: String,
    `source-storage-class`: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | INTELLIGENT_TIERING | GLACIER | DEEP_ARCHIVE | OUTPOSTS | GLACIER_IR
  ): S3ObjectRestoreCompletedNotificationEventDetail = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], requester = "s3.amazonaws.com", version = "0")
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("request-id")(`request-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("restore-expiry-time")(`restore-expiry-time`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-storage-class")(`source-storage-class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectRestoreCompletedNotificationEventDetail]
  }
  
  extension [Self <: S3ObjectRestoreCompletedNotificationEventDetail](x: Self) {
    
    inline def setBucket(value: NameString): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Size): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def `setRequest-id`(value: String): Self = StObject.set(x, "request-id", value.asInstanceOf[js.Any])
    
    inline def setRequester(value: s3DotamazonawsDotcom): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def `setRestore-expiry-time`(value: String): Self = StObject.set(x, "restore-expiry-time", value.asInstanceOf[js.Any])
    
    inline def `setSource-storage-class`(
      value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | INTELLIGENT_TIERING | GLACIER | DEEP_ARCHIVE | OUTPOSTS | GLACIER_IR
    ): Self = StObject.set(x, "source-storage-class", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `0`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
