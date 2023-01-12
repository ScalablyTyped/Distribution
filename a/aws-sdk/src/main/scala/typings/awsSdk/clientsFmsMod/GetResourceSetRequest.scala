package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceSetRequest extends StObject {
  
  /**
    * A unique identifier for the resource set, used in a TODO to refer to the resource set.
    */
  var Identifier: Base62Id
}
object GetResourceSetRequest {
  
  inline def apply(Identifier: Base62Id): GetResourceSetRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceSetRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Base62Id): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
