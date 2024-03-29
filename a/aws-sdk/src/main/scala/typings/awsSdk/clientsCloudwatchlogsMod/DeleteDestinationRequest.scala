package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDestinationRequest extends StObject {
  
  /**
    * The name of the destination.
    */
  var destinationName: DestinationName
}
object DeleteDestinationRequest {
  
  inline def apply(destinationName: DestinationName): DeleteDestinationRequest = {
    val __obj = js.Dynamic.literal(destinationName = destinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
  }
}
