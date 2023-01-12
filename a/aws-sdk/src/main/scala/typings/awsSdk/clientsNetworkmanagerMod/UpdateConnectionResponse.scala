package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectionResponse extends StObject {
  
  /**
    * Information about the connection.
    */
  var Connection: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Connection] = js.undefined
}
object UpdateConnectionResponse {
  
  inline def apply(): UpdateConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
