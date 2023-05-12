package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLinkInput extends StObject {
  
  /**
    * The ARN of the link to retrieve information for.
    */
  var Identifier: ResourceIdentifier
}
object GetLinkInput {
  
  inline def apply(Identifier: ResourceIdentifier): GetLinkInput = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLinkInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLinkInput] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
