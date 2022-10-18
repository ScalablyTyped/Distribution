package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTagsMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) from which you want to remove the tag or tags. For example, arn:aws:redshift:us-east-2:123456789:cluster:t1. 
    */
  var ResourceName: String
  
  /**
    * The tag key that you want to delete.
    */
  var TagKeys: TagKeyList
}
object DeleteTagsMessage {
  
  inline def apply(ResourceName: String, TagKeys: TagKeyList): DeleteTagsMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsMessage]
  }
  
  extension [Self <: DeleteTagsMessage](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
