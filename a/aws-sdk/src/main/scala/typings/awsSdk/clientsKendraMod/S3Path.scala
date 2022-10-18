package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Path extends StObject {
  
  /**
    * The name of the S3 bucket that contains the file.
    */
  var Bucket: S3BucketName
  
  /**
    * The name of the file.
    */
  var Key: S3ObjectKey
}
object S3Path {
  
  inline def apply(Bucket: S3BucketName, Key: S3ObjectKey): S3Path = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Path]
  }
  
  extension [Self <: S3Path](x: Self) {
    
    inline def setBucket(value: S3BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: S3ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
