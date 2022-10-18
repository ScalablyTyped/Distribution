package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketCountByEffectivePermission extends StObject {
  
  /**
    * The total number of buckets that allow the general public to have read or write access to the bucket.
    */
  var publiclyAccessible: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that allow the general public to have read access to the bucket.
    */
  var publiclyReadable: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that allow the general public to have write access to the bucket.
    */
  var publiclyWritable: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that Amazon Macie wasn't able to evaluate permissions settings for. Macie can't determine whether these buckets are publicly accessible.
    */
  var unknown: js.UndefOr[long] = js.undefined
}
object BucketCountByEffectivePermission {
  
  inline def apply(): BucketCountByEffectivePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCountByEffectivePermission]
  }
  
  extension [Self <: BucketCountByEffectivePermission](x: Self) {
    
    inline def setPubliclyAccessible(value: long): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
    
    inline def setPubliclyReadable(value: long): Self = StObject.set(x, "publiclyReadable", value.asInstanceOf[js.Any])
    
    inline def setPubliclyReadableUndefined: Self = StObject.set(x, "publiclyReadable", js.undefined)
    
    inline def setPubliclyWritable(value: long): Self = StObject.set(x, "publiclyWritable", value.asInstanceOf[js.Any])
    
    inline def setPubliclyWritableUndefined: Self = StObject.set(x, "publiclyWritable", js.undefined)
    
    inline def setUnknown(value: long): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
  }
}
