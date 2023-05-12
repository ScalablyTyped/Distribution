package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketCountBySharedAccessType extends StObject {
  
  /**
    * The total number of buckets that are shared with one or more of the following or any combination of the following: an Amazon CloudFront OAI, a CloudFront OAC, or an Amazon Web Services account that isn't in the same Amazon Macie organization.
    */
  var external: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that are shared with one or more Amazon Web Services accounts in the same Amazon Macie organization. These buckets aren't shared with Amazon CloudFront OAIs or OACs.
    */
  var internal: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that aren't shared with other Amazon Web Services accounts, Amazon CloudFront OAIs, or CloudFront OACs.
    */
  var notShared: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that Amazon Macie wasn't able to evaluate shared access settings for. Macie can't determine whether these buckets are shared with other Amazon Web Services accounts, Amazon CloudFront OAIs, or CloudFront OACs.
    */
  var unknown: js.UndefOr[long] = js.undefined
}
object BucketCountBySharedAccessType {
  
  inline def apply(): BucketCountBySharedAccessType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCountBySharedAccessType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketCountBySharedAccessType] (val x: Self) extends AnyVal {
    
    inline def setExternal(value: long): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setInternal(value: long): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    inline def setNotShared(value: long): Self = StObject.set(x, "notShared", value.asInstanceOf[js.Any])
    
    inline def setNotSharedUndefined: Self = StObject.set(x, "notShared", js.undefined)
    
    inline def setUnknown(value: long): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
  }
}
