package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Object extends StObject {
  
  /**
    * The bucket containing the object.
    */
  var bucket: S3Bucket
  
  /**
    * The etag of the object.
    */
  var etag: js.UndefOr[S3Etag] = js.undefined
  
  /**
    * The key of the object.
    */
  var key: S3Key
}
object S3Object {
  
  inline def apply(bucket: S3Bucket, key: S3Key): S3Object = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Object]
  }
  
  extension [Self <: S3Object](x: Self) {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setEtag(value: S3Etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKey(value: S3Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
