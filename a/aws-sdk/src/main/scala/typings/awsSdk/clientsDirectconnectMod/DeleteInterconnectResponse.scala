package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInterconnectResponse extends StObject {
  
  /**
    * The state of the interconnect. The following are the possible values:    requested: The initial state of an interconnect. The interconnect stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The interconnect is approved, and is being initialized.    available: The network link is up, and the interconnect is ready for use.    down: The network link is down.    deleting: The interconnect is being deleted.    deleted: The interconnect is deleted.    unknown: The state of the interconnect is not available.  
    */
  var interconnectState: js.UndefOr[InterconnectState] = js.undefined
}
object DeleteInterconnectResponse {
  
  inline def apply(): DeleteInterconnectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInterconnectResponse]
  }
  
  extension [Self <: DeleteInterconnectResponse](x: Self) {
    
    inline def setInterconnectState(value: InterconnectState): Self = StObject.set(x, "interconnectState", value.asInstanceOf[js.Any])
    
    inline def setInterconnectStateUndefined: Self = StObject.set(x, "interconnectState", js.undefined)
  }
}
