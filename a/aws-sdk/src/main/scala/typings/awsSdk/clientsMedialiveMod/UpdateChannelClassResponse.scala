package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelClassResponse extends StObject {
  
  var Channel: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Channel] = js.undefined
}
object UpdateChannelClassResponse {
  
  inline def apply(): UpdateChannelClassResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelClassResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateChannelClassResponse] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
  }
}
