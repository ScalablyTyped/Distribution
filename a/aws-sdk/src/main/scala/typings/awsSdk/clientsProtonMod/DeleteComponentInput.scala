package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteComponentInput extends StObject {
  
  /**
    * The name of the component to delete.
    */
  var name: ResourceName
}
object DeleteComponentInput {
  
  inline def apply(name: ResourceName): DeleteComponentInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteComponentInput]
  }
  
  extension [Self <: DeleteComponentInput](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
