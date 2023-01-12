package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResponse extends StObject {
  
  var TagsModel: typings.awsSdk.clientsPinpointMod.TagsModel
}
object ListTagsForResourceResponse {
  
  inline def apply(TagsModel: TagsModel): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal(TagsModel = TagsModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setTagsModel(value: TagsModel): Self = StObject.set(x, "TagsModel", value.asInstanceOf[js.Any])
  }
}
