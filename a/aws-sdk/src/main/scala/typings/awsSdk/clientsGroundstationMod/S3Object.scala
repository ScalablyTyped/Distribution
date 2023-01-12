package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Object extends StObject {
  
  /**
    * An Amazon S3 Bucket name.
    */
  var bucket: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * An Amazon S3 key for the ephemeris.
    */
  var key: js.UndefOr[S3ObjectKey] = js.undefined
  
  /**
    * For versioned S3 objects, the version to use for the ephemeris.
    */
  var version: js.UndefOr[S3VersionId] = js.undefined
}
object S3Object {
  
  inline def apply(): S3Object = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Object]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Object] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: S3BucketName): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setKey(value: S3ObjectKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setVersion(value: S3VersionId): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
