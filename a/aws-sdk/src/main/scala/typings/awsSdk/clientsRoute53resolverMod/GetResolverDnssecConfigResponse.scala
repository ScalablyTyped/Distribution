package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverDnssecConfigResponse extends StObject {
  
  /**
    * The information about a configuration for DNSSEC validation.
    */
  var ResolverDNSSECConfig: js.UndefOr[ResolverDnssecConfig] = js.undefined
}
object GetResolverDnssecConfigResponse {
  
  inline def apply(): GetResolverDnssecConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverDnssecConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResolverDnssecConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setResolverDNSSECConfig(value: ResolverDnssecConfig): Self = StObject.set(x, "ResolverDNSSECConfig", value.asInstanceOf[js.Any])
    
    inline def setResolverDNSSECConfigUndefined: Self = StObject.set(x, "ResolverDNSSECConfig", js.undefined)
  }
}
