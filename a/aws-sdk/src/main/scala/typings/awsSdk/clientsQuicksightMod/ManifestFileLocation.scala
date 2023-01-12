package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestFileLocation extends StObject {
  
  /**
    * Amazon S3 bucket.
    */
  var Bucket: S3Bucket
  
  /**
    * Amazon S3 key that identifies an object.
    */
  var Key: S3Key
}
object ManifestFileLocation {
  
  inline def apply(Bucket: S3Bucket, Key: S3Key): ManifestFileLocation = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestFileLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestFileLocation] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: S3Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
