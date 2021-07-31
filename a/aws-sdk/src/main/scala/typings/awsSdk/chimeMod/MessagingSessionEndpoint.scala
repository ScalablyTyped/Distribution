package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingSessionEndpoint extends StObject {
  
  /**
    * The URL of a meeting session endpoint.
    */
  var Url: js.UndefOr[UrlType] = js.undefined
}
object MessagingSessionEndpoint {
  
  @scala.inline
  def apply(): MessagingSessionEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingSessionEndpoint]
  }
  
  @scala.inline
  implicit class MessagingSessionEndpointMutableBuilder[Self <: MessagingSessionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: UrlType): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
