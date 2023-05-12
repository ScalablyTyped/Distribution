package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for a tag you remove a resource from.
    */
  var ResourceArn: MonitorArn
  
  /**
    * Tag keys that you remove from a resource.
    */
  var TagKeys: typings.awsSdk.clientsInternetmonitorMod.TagKeys
}
object UntagResourceInput {
  
  inline def apply(ResourceArn: MonitorArn, TagKeys: TagKeys): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: MonitorArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
