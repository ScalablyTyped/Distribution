package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PingResponse extends StObject {
  
  /**
    * Information about the health of the service.
    */
  var status: js.UndefOr[String] = js.undefined
}
object PingResponse {
  
  inline def apply(): PingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PingResponse]
  }
  
  extension [Self <: PingResponse](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
