package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTagsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource tag.
    */
  var ResourceArn: string
  
  /**
    * An array of tag keys to delete
    */
  var TagKeys: listOfString
}
object DeleteTagsRequest {
  
  inline def apply(ResourceArn: string, TagKeys: listOfString): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTagsRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: listOfString): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: string*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
