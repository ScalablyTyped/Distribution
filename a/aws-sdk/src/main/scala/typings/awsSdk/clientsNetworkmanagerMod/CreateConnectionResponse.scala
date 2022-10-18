package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionResponse extends StObject {
  
  /**
    * Information about the connection.
    */
  var Connection: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Connection] = js.undefined
}
object CreateConnectionResponse {
  
  inline def apply(): CreateConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConnectionResponse]
  }
  
  extension [Self <: CreateConnectionResponse](x: Self) {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
