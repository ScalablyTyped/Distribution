package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceInventory extends StObject {
  
  /**
    * Platform of the resource.
    */
  var Platform: js.UndefOr[String] = js.undefined
  
  /**
    * Platform version of the resource in the inventory.
    */
  var PlatformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the account that owns the resource.
    */
  var ResourceOwningAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ResourceType] = js.undefined
}
object ResourceInventory {
  
  inline def apply(): ResourceInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInventory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceInventory] (val x: Self) extends AnyVal {
    
    inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceOwningAccountId(value: String): Self = StObject.set(x, "ResourceOwningAccountId", value.asInstanceOf[js.Any])
    
    inline def setResourceOwningAccountIdUndefined: Self = StObject.set(x, "ResourceOwningAccountId", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
