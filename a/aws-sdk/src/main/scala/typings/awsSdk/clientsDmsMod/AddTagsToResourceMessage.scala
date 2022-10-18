package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsToResourceMessage extends StObject {
  
  /**
    * Identifies the DMS resource to which tags should be added. The value for this parameter is an Amazon Resource Name (ARN). For DMS, you can tag a replication instance, an endpoint, or a replication task.
    */
  var ResourceArn: String
  
  /**
    * One or more tags to be assigned to the resource.
    */
  var Tags: TagList
}
object AddTagsToResourceMessage {
  
  inline def apply(ResourceArn: String, Tags: TagList): AddTagsToResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceMessage]
  }
  
  extension [Self <: AddTagsToResourceMessage](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
