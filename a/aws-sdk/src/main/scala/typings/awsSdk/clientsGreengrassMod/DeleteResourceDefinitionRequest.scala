package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceDefinitionRequest extends StObject {
  
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: string
}
object DeleteResourceDefinitionRequest {
  
  inline def apply(ResourceDefinitionId: string): DeleteResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResourceDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceDefinitionId(value: string): Self = StObject.set(x, "ResourceDefinitionId", value.asInstanceOf[js.Any])
  }
}
