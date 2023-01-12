package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagSpecification extends StObject {
  
  /**
    * The type of resource to tag on creation.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.ResourceType] = js.undefined
  
  /**
    * The tags to apply to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object TagSpecification {
  
  inline def apply(): TagSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagSpecification] (val x: Self) extends AnyVal {
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
