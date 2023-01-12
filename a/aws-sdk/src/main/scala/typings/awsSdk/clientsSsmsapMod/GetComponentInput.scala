package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentInput extends StObject {
  
  /**
    * 
    */
  var ApplicationId: typings.awsSdk.clientsSsmsapMod.ApplicationId
  
  /**
    * 
    */
  var ComponentId: typings.awsSdk.clientsSsmsapMod.ComponentId
}
object GetComponentInput {
  
  inline def apply(ApplicationId: ApplicationId, ComponentId: ComponentId): GetComponentInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ComponentId = ComponentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetComponentInput] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setComponentId(value: ComponentId): Self = StObject.set(x, "ComponentId", value.asInstanceOf[js.Any])
  }
}
