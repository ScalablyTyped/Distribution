package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDestinationRequest extends StObject {
  
  var id: DestinationGenericIdentifier
}
object GetDestinationRequest {
  
  inline def apply(id: DestinationGenericIdentifier): GetDestinationRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: DestinationGenericIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
