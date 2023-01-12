package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDestinationRequest extends StObject {
  
  /**
    * The name of the resource to delete.
    */
  var Name: DestinationName
}
object DeleteDestinationRequest {
  
  inline def apply(Name: DestinationName): DeleteDestinationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: DestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
