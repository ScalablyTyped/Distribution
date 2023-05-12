package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobManifestLocation extends StObject {
  
  /**
    * The ETag for the specified manifest object.
    */
  var ETag: NonEmptyMaxLength1024String
  
  /**
    * The Amazon Resource Name (ARN) for a manifest object.  When you're using XML requests, you must replace special characters (such as carriage returns) in object keys with their equivalent XML entity codes. For more information, see  XML-related object key constraints in the Amazon S3 User Guide. 
    */
  var ObjectArn: S3KeyArnString
  
  /**
    * The optional version ID to identify a specific version of the manifest object.
    */
  var ObjectVersionId: js.UndefOr[S3ObjectVersionId] = js.undefined
}
object JobManifestLocation {
  
  inline def apply(ETag: NonEmptyMaxLength1024String, ObjectArn: S3KeyArnString): JobManifestLocation = {
    val __obj = js.Dynamic.literal(ETag = ETag.asInstanceOf[js.Any], ObjectArn = ObjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobManifestLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobManifestLocation] (val x: Self) extends AnyVal {
    
    inline def setETag(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setObjectArn(value: S3KeyArnString): Self = StObject.set(x, "ObjectArn", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionId(value: S3ObjectVersionId): Self = StObject.set(x, "ObjectVersionId", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionIdUndefined: Self = StObject.set(x, "ObjectVersionId", js.undefined)
  }
}
