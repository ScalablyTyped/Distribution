package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelEgressEndpoint extends StObject {
  
  /**
    * Public IP of where a channel's output comes from
    */
  var SourceIp: js.UndefOr[string] = js.undefined
}
object ChannelEgressEndpoint {
  
  inline def apply(): ChannelEgressEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelEgressEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelEgressEndpoint] (val x: Self) extends AnyVal {
    
    inline def setSourceIp(value: string): Self = StObject.set(x, "SourceIp", value.asInstanceOf[js.Any])
    
    inline def setSourceIpUndefined: Self = StObject.set(x, "SourceIp", js.undefined)
  }
}
