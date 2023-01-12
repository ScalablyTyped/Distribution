package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the domain from which you want to delete the specified tags.
    */
  var ARN: typings.awsSdk.clientsOpensearchMod.ARN
  
  /**
    * The list of tag keys to remove from the domain.
    */
  var TagKeys: StringList
}
object RemoveTagsRequest {
  
  inline def apply(ARN: ARN, TagKeys: StringList): RemoveTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveTagsRequest] (val x: Self) extends AnyVal {
    
    inline def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: StringList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
