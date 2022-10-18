package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Websocket extends StObject {
  
  /**
    * The URL expiration timestamp in ISO date format. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var ConnectionExpiry: js.UndefOr[ISO8601Datetime] = js.undefined
  
  /**
    * The URL of the websocket.
    */
  var Url: js.UndefOr[PreSignedConnectionUrl] = js.undefined
}
object Websocket {
  
  inline def apply(): Websocket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Websocket]
  }
  
  extension [Self <: Websocket](x: Self) {
    
    inline def setConnectionExpiry(value: ISO8601Datetime): Self = StObject.set(x, "ConnectionExpiry", value.asInstanceOf[js.Any])
    
    inline def setConnectionExpiryUndefined: Self = StObject.set(x, "ConnectionExpiry", js.undefined)
    
    inline def setUrl(value: PreSignedConnectionUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
