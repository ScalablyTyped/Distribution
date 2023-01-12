package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentInput extends StObject {
  
  /**
    * The name of the environment to delete.
    */
  var name: ResourceName
}
object DeleteEnvironmentInput {
  
  inline def apply(name: ResourceName): DeleteEnvironmentInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEnvironmentInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
