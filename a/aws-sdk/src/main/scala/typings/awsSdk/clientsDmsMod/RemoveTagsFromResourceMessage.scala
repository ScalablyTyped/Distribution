package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsFromResourceMessage extends StObject {
  
  /**
    * An DMS resource from which you want to remove tag(s). The value for this parameter is an Amazon Resource Name (ARN).
    */
  var ResourceArn: String
  
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: KeyList
}
object RemoveTagsFromResourceMessage {
  
  inline def apply(ResourceArn: String, TagKeys: KeyList): RemoveTagsFromResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceMessage]
  }
  
  extension [Self <: RemoveTagsFromResourceMessage](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: KeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
