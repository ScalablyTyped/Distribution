package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSinkInput extends StObject {
  
  /**
    * The ARN of the sink to delete.
    */
  var Identifier: ResourceIdentifier
}
object DeleteSinkInput {
  
  inline def apply(Identifier: ResourceIdentifier): DeleteSinkInput = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSinkInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSinkInput] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
