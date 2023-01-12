package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the resource that's associated with the tags.
    
    */
  var ResourceArn: string
  
  /**
    * 
    Tag keys must be unique for a given cluster. In addition, the following restrictions apply:
    
    
    Each tag key must be unique. If you add a tag with a key that's already in
    use, your new tag overwrites the existing key-value pair. 
    
    
    You can't start a tag key with aws: because this prefix is reserved for use
    by  AWS.  AWS creates tags that begin with this prefix on your behalf, but
    you can't edit or delete them.
    
    
    Tag keys must be between 1 and 128 Unicode characters in length.
    
    
    Tag keys must consist of the following characters: Unicode letters, digits,
    white space, and the following special characters: _ . / = + -
    @.
    
    
    
    */
  var TagKeys: listOfString
}
object UntagResourceRequest {
  
  inline def apply(ResourceArn: string, TagKeys: listOfString): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: listOfString): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: string*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
