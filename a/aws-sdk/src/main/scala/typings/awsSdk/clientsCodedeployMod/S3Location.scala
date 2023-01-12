package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * The name of the Amazon S3 bucket where the application revision is stored.
    */
  var bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * The file type of the application revision. Must be one of the following:    tar: A tar archive file.    tgz: A compressed tar archive file.    zip: A zip archive file.  
    */
  var bundleType: js.UndefOr[BundleType] = js.undefined
  
  /**
    * The ETag of the Amazon S3 object that represents the bundled artifacts for the application revision. If the ETag is not specified as an input parameter, ETag validation of the object is skipped.
    */
  var eTag: js.UndefOr[ETag] = js.undefined
  
  /**
    * The name of the Amazon S3 object that represents the bundled artifacts for the application revision.
    */
  var key: js.UndefOr[S3Key] = js.undefined
  
  /**
    * A specific version of the Amazon S3 object that represents the bundled artifacts for the application revision. If the version is not specified, the system uses the most recent version by default.
    */
  var version: js.UndefOr[VersionId] = js.undefined
}
object S3Location {
  
  inline def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Location] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setBundleType(value: BundleType): Self = StObject.set(x, "bundleType", value.asInstanceOf[js.Any])
    
    inline def setBundleTypeUndefined: Self = StObject.set(x, "bundleType", js.undefined)
    
    inline def setETag(value: ETag): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
    
    inline def setKey(value: S3Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setVersion(value: VersionId): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
