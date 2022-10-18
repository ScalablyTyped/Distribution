package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the bot, bot alias, or bot channel to tag.
    */
  var resourceArn: AmazonResourceName
  
  /**
    * A list of tag keys to add to the resource. If a tag key already exists, the existing value is replaced with the new value.
    */
  var tags: TagList
}
object TagResourceRequest {
  
  inline def apply(resourceArn: AmazonResourceName, tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
