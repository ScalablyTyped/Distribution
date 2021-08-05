package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopFleetRequest extends StObject {
  
  /**
    * The name of the fleet.
    */
  var Name: String
}
object StopFleetRequest {
  
  inline def apply(Name: String): StopFleetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopFleetRequest]
  }
  
  extension [Self <: StopFleetRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
