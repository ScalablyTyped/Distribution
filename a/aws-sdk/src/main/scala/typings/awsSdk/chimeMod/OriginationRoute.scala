package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginationRoute extends StObject {
  
  /**
    * The FQDN or IP address to contact for origination traffic.
    */
  var Host: js.UndefOr[String] = js.undefined
  
  /**
    * The designated origination route port. Defaults to 5060.
    */
  var Port: js.UndefOr[typings.awsSdk.chimeMod.Port] = js.undefined
  
  /**
    * The priority associated with the host, with 1 being the highest priority. Higher priority hosts are attempted first.
    */
  var Priority: js.UndefOr[OriginationRoutePriority] = js.undefined
  
  /**
    * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol by default.
    */
  var Protocol: js.UndefOr[OriginationRouteProtocol] = js.undefined
  
  /**
    * The weight associated with the host. If hosts are equal in priority, calls are distributed among them based on their relative weight.
    */
  var Weight: js.UndefOr[OriginationRouteWeight] = js.undefined
}
object OriginationRoute {
  
  @scala.inline
  def apply(): OriginationRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginationRoute]
  }
  
  @scala.inline
  implicit class OriginationRouteMutableBuilder[Self <: OriginationRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    @scala.inline
    def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setPriority(value: OriginationRoutePriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setProtocol(value: OriginationRouteProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setWeight(value: OriginationRouteWeight): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "Weight", js.undefined)
  }
}
