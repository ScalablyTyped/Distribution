package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDestinationRequest extends StObject {
  
  /**
    * The name of the resource to get.
    */
  var Name: DestinationName
}
object GetDestinationRequest {
  
  inline def apply(Name: DestinationName): GetDestinationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDestinationRequest]
  }
  
  extension [Self <: GetDestinationRequest](x: Self) {
    
    inline def setName(value: DestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
