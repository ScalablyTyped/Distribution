package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockPublicAccess extends StObject {
  
  /**
    * Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the bucket.
    */
  var blockPublicAcls: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
    */
  var blockPublicPolicy: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
    */
  var ignorePublicAcls: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether Amazon S3 restricts public bucket policies for the bucket.
    */
  var restrictPublicBuckets: js.UndefOr[boolean] = js.undefined
}
object BlockPublicAccess {
  
  inline def apply(): BlockPublicAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockPublicAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockPublicAccess] (val x: Self) extends AnyVal {
    
    inline def setBlockPublicAcls(value: boolean): Self = StObject.set(x, "blockPublicAcls", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicAclsUndefined: Self = StObject.set(x, "blockPublicAcls", js.undefined)
    
    inline def setBlockPublicPolicy(value: boolean): Self = StObject.set(x, "blockPublicPolicy", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicPolicyUndefined: Self = StObject.set(x, "blockPublicPolicy", js.undefined)
    
    inline def setIgnorePublicAcls(value: boolean): Self = StObject.set(x, "ignorePublicAcls", value.asInstanceOf[js.Any])
    
    inline def setIgnorePublicAclsUndefined: Self = StObject.set(x, "ignorePublicAcls", js.undefined)
    
    inline def setRestrictPublicBuckets(value: boolean): Self = StObject.set(x, "restrictPublicBuckets", value.asInstanceOf[js.Any])
    
    inline def setRestrictPublicBucketsUndefined: Self = StObject.set(x, "restrictPublicBuckets", js.undefined)
  }
}
