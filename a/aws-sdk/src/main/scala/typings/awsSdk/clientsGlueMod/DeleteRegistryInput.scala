package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRegistryInput extends StObject {
  
  /**
    * This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
    */
  var RegistryId: typings.awsSdk.clientsGlueMod.RegistryId
}
object DeleteRegistryInput {
  
  inline def apply(RegistryId: RegistryId): DeleteRegistryInput = {
    val __obj = js.Dynamic.literal(RegistryId = RegistryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRegistryInput]
  }
  
  extension [Self <: DeleteRegistryInput](x: Self) {
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "RegistryId", value.asInstanceOf[js.Any])
  }
}
