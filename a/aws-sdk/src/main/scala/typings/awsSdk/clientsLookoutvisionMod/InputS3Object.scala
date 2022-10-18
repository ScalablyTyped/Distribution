package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputS3Object extends StObject {
  
  /**
    * The Amazon S3 bucket that contains the manifest.
    */
  var Bucket: S3BucketName
  
  /**
    * The name and location of the manifest file withiin the bucket.
    */
  var Key: S3ObjectKey
  
  /**
    * The version ID of the bucket.
    */
  var VersionId: js.UndefOr[S3ObjectVersion] = js.undefined
}
object InputS3Object {
  
  inline def apply(Bucket: S3BucketName, Key: S3ObjectKey): InputS3Object = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputS3Object]
  }
  
  extension [Self <: InputS3Object](x: Self) {
    
    inline def setBucket(value: S3BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: S3ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: S3ObjectVersion): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
