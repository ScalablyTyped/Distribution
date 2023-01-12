package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRegistryResponse extends StObject {
  
  /**
    * The description of the registry.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the registry.
    */
  var RegistryArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.undefined
  
  /**
    * Tags associated with the registry.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsSchemasMod.Tags] = js.undefined
}
object UpdateRegistryResponse {
  
  inline def apply(): UpdateRegistryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRegistryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRegistryResponse] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRegistryArn(value: string): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    inline def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
