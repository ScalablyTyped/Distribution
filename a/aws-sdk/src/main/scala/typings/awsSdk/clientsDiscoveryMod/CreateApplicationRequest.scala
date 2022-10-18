package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationRequest extends StObject {
  
  /**
    * Description of the application to be created.
    */
  var description: js.UndefOr[ApplicationDescription] = js.undefined
  
  /**
    * Name of the application to be created.
    */
  var name: ApplicationName
}
object CreateApplicationRequest {
  
  inline def apply(name: ApplicationName): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  extension [Self <: CreateApplicationRequest](x: Self) {
    
    inline def setDescription(value: ApplicationDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
