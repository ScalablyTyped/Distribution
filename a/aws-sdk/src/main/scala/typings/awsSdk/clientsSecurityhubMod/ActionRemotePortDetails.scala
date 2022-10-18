package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionRemotePortDetails extends StObject {
  
  /**
    * The number of the port.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * The port name of the remote connection.
    */
  var PortName: js.UndefOr[NonEmptyString] = js.undefined
}
object ActionRemotePortDetails {
  
  inline def apply(): ActionRemotePortDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionRemotePortDetails]
  }
  
  extension [Self <: ActionRemotePortDetails](x: Self) {
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortName(value: NonEmptyString): Self = StObject.set(x, "PortName", value.asInstanceOf[js.Any])
    
    inline def setPortNameUndefined: Self = StObject.set(x, "PortName", js.undefined)
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
