package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) for the OpenSearch Service domain to which you want to attach resource tags.
    */
  var ARN: typings.awsSdk.clientsOpensearchMod.ARN
  
  /**
    * List of resource tags.
    */
  var TagList: typings.awsSdk.clientsOpensearchMod.TagList
}
object AddTagsRequest {
  
  inline def apply(ARN: ARN, TagList: TagList): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsRequest]
  }
  
  extension [Self <: AddTagsRequest](x: Self) {
    
    inline def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
