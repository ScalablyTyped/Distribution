package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the applied quota that you want to untag. You can get this information by using the Service Quotas console, or by listing the quotas using the list-service-quotas AWS CLI command or the ListServiceQuotas AWS API operation.
    */
  var ResourceARN: AmazonResourceName
  
  /**
    * The keys of the tags that you want to remove from the resource.
    */
  var TagKeys: InputTagKeys
}
object UntagResourceRequest {
  
  inline def apply(ResourceARN: AmazonResourceName, TagKeys: InputTagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceARN(value: AmazonResourceName): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: InputTagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
