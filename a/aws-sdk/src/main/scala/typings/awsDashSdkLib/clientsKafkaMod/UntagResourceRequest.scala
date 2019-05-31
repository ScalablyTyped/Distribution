package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the resource that's associated with the tags.
    
    */
  var ResourceArn: __string
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
  var TagKeys: __listOf__string
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, TagKeys: __listOf__string): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

