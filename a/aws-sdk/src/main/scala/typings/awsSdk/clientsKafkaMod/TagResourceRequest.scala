package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the resource that's associated with the tags.
    
    */
  var ResourceArn: string
  
  /**
    * 
    The key-value pair for the resource tag.
    
    */
  var Tags: mapOfString
}
object TagResourceRequest {
  
  inline def apply(ResourceArn: string, Tags: mapOfString): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
