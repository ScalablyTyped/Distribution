package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingSessionEndpoint extends StObject {
  
  /**
    * The endpoint to which you establish a websocket connection.
    */
  var Url: js.UndefOr[UrlType] = js.undefined
}
object MessagingSessionEndpoint {
  
  inline def apply(): MessagingSessionEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingSessionEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagingSessionEndpoint] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: UrlType): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
