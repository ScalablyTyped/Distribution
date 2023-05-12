package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * An ARN of a CloudFront resource.
    */
  var Resource: ResourceARN
  
  /**
    * A complex type that contains zero or more Tag key elements.
    */
  var TagKeys: typings.awsSdk.clientsCloudfrontMod.TagKeys
}
object UntagResourceRequest {
  
  inline def apply(Resource: ResourceARN, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResource(value: ResourceARN): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
  }
}
