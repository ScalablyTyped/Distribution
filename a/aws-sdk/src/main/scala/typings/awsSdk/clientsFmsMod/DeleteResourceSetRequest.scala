package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceSetRequest extends StObject {
  
  /**
    * A unique identifier for the resource set, used in a TODO to refer to the resource set.
    */
  var Identifier: Base62Id
}
object DeleteResourceSetRequest {
  
  inline def apply(Identifier: Base62Id): DeleteResourceSetRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResourceSetRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Base62Id): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
