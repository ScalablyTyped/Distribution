package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBlueprintRequest extends StObject {
  
  /**
    * The name of the blueprint to delete.
    */
  var Name: NameString
}
object DeleteBlueprintRequest {
  
  inline def apply(Name: NameString): DeleteBlueprintRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBlueprintRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBlueprintRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
