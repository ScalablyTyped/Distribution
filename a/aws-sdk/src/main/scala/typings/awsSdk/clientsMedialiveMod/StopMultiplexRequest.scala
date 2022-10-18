package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopMultiplexRequest extends StObject {
  
  /**
    * The ID of the multiplex.
    */
  var MultiplexId: string
}
object StopMultiplexRequest {
  
  inline def apply(MultiplexId: string): StopMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMultiplexRequest]
  }
  
  extension [Self <: StopMultiplexRequest](x: Self) {
    
    inline def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
  }
}
