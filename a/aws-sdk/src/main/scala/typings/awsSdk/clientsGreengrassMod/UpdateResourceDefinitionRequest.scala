package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceDefinitionRequest extends StObject {
  
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: string
}
object UpdateResourceDefinitionRequest {
  
  inline def apply(ResourceDefinitionId: string): UpdateResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceDefinitionRequest]
  }
  
  extension [Self <: UpdateResourceDefinitionRequest](x: Self) {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceDefinitionId(value: string): Self = StObject.set(x, "ResourceDefinitionId", value.asInstanceOf[js.Any])
  }
}
