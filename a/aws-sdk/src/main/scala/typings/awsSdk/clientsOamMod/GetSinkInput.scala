package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSinkInput extends StObject {
  
  /**
    * The ARN of the sink to retrieve information for.
    */
  var Identifier: ResourceIdentifier
}
object GetSinkInput {
  
  inline def apply(Identifier: ResourceIdentifier): GetSinkInput = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSinkInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSinkInput] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
