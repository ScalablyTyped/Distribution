package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagDescription extends StObject {
  
  /**
    * The tag key.
    */
  var Key: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsEc2Mod.ResourceType] = js.undefined
  
  /**
    * The tag value.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object TagDescription {
  
  inline def apply(): TagDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagDescription]
  }
  
  extension [Self <: TagDescription](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
