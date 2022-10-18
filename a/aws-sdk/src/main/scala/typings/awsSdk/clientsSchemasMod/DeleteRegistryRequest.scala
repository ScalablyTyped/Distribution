package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRegistryRequest extends StObject {
  
  /**
    * The name of the registry.
    */
  var RegistryName: string
}
object DeleteRegistryRequest {
  
  inline def apply(RegistryName: string): DeleteRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRegistryRequest]
  }
  
  extension [Self <: DeleteRegistryRequest](x: Self) {
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
  }
}
