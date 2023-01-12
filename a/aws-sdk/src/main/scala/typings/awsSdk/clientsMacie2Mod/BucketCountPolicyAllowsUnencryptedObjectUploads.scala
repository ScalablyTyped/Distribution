package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketCountPolicyAllowsUnencryptedObjectUploads extends StObject {
  
  /**
    * The total number of buckets that don't have a bucket policy or have a bucket policy that doesn't require server-side encryption of new objects. If a bucket policy exists, the policy doesn't require PutObject requests to include the x-amz-server-side-encryption header and it doesn't require the value for that header to be AES256 or aws:kms.
    */
  var allowsUnencryptedObjectUploads: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets whose bucket policies require server-side encryption of new objects. PutObject requests for these buckets must include the x-amz-server-side-encryption header and the value for that header must be AES256 or aws:kms.
    */
  var deniesUnencryptedObjectUploads: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that Amazon Macie wasn't able to evaluate server-side encryption requirements for. Macie can't determine whether the bucket policies for these buckets require server-side encryption of new objects.
    */
  var unknown: js.UndefOr[long] = js.undefined
}
object BucketCountPolicyAllowsUnencryptedObjectUploads {
  
  inline def apply(): BucketCountPolicyAllowsUnencryptedObjectUploads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCountPolicyAllowsUnencryptedObjectUploads]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketCountPolicyAllowsUnencryptedObjectUploads] (val x: Self) extends AnyVal {
    
    inline def setAllowsUnencryptedObjectUploads(value: long): Self = StObject.set(x, "allowsUnencryptedObjectUploads", value.asInstanceOf[js.Any])
    
    inline def setAllowsUnencryptedObjectUploadsUndefined: Self = StObject.set(x, "allowsUnencryptedObjectUploads", js.undefined)
    
    inline def setDeniesUnencryptedObjectUploads(value: long): Self = StObject.set(x, "deniesUnencryptedObjectUploads", value.asInstanceOf[js.Any])
    
    inline def setDeniesUnencryptedObjectUploadsUndefined: Self = StObject.set(x, "deniesUnencryptedObjectUploads", js.undefined)
    
    inline def setUnknown(value: long): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
  }
}
