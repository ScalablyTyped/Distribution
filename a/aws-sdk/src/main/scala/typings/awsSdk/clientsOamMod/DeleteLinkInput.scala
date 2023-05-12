package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLinkInput extends StObject {
  
  /**
    * The ARN of the link to delete.
    */
  var Identifier: ResourceIdentifier
}
object DeleteLinkInput {
  
  inline def apply(Identifier: ResourceIdentifier): DeleteLinkInput = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLinkInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLinkInput] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
