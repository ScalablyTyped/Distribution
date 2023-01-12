package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRegistryInput extends StObject {
  
  /**
    * A description of the registry. If description is not provided, this field will not be updated.
    */
  var Description: DescriptionString
  
  /**
    * This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
    */
  var RegistryId: typings.awsSdk.clientsGlueMod.RegistryId
}
object UpdateRegistryInput {
  
  inline def apply(Description: DescriptionString, RegistryId: RegistryId): UpdateRegistryInput = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], RegistryId = RegistryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegistryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRegistryInput] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "RegistryId", value.asInstanceOf[js.Any])
  }
}
