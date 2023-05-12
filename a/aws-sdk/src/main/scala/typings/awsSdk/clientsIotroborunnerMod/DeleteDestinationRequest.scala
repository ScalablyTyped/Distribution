package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDestinationRequest extends StObject {
  
  var id: DestinationGenericIdentifier
}
object DeleteDestinationRequest {
  
  inline def apply(id: DestinationGenericIdentifier): DeleteDestinationRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: DestinationGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
