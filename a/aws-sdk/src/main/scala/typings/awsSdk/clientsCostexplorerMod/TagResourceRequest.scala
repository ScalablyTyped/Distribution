package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource. For a list of supported resources, see ResourceTag. 
    */
  var ResourceArn: Arn
  
  /**
    *  A list of tag key-value pairs to be added to the resource. Each tag consists of a key and a value, and each key must be unique for the resource. The following restrictions apply to resource tags:   Although the maximum number of array members is 200, you can assign a maximum of 50 user-tags to one resource. The remaining are reserved for Amazon Web Services use   The maximum length of a key is 128 characters   The maximum length of a value is 256 characters   Keys and values can only contain alphanumeric characters, spaces, and any of the following: _.:/=+@-    Keys and values are case sensitive   Keys and values are trimmed for any leading or trailing whitespaces   Don’t use aws: as a prefix for your keys. This prefix is reserved for Amazon Web Services use  
    */
  var ResourceTags: ResourceTagList
}
object TagResourceRequest {
  
  inline def apply(ResourceArn: Arn, ResourceTags: ResourceTagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], ResourceTags = ResourceTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceTags(value: ResourceTagList): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
  }
}
