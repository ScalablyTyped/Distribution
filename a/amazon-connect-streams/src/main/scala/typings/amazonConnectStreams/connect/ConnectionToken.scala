package typings.amazonConnectStreams.connect

import typings.amazonConnectStreams.anon.Expiry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionToken extends StObject {
  
  val chatTokenTransport: Expiry
}
object ConnectionToken {
  
  inline def apply(chatTokenTransport: Expiry): ConnectionToken = {
    val __obj = js.Dynamic.literal(chatTokenTransport = chatTokenTransport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionToken]
  }
  
  extension [Self <: ConnectionToken](x: Self) {
    
    inline def setChatTokenTransport(value: Expiry): Self = StObject.set(x, "chatTokenTransport", value.asInstanceOf[js.Any])
  }
}
