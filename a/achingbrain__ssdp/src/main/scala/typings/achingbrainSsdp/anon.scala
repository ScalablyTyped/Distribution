package typings.achingbrainSsdp

import typings.achingbrainSsdp.achingbrainSsdpStrings.udp4
import typings.achingbrainSsdp.achingbrainSsdpStrings.udp6
import typings.achingbrainSsdp.mod.NetworkAddress
import typings.achingbrainSsdp.mod.SSDPSocketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@achingbrain/ssdp.@achingbrain/ssdp.SSDPOptions> */
  trait PartialSSDPOptions extends StObject {
    
    var signature: js.UndefOr[String] = js.undefined
    
    var sockets: js.UndefOr[js.Array[SSDPSocketOptions]] = js.undefined
    
    var start: js.UndefOr[Boolean] = js.undefined
    
    var udn: js.UndefOr[String] = js.undefined
  }
  object PartialSSDPOptions {
    
    inline def apply(): PartialSSDPOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSSDPOptions]
    }
    
    extension [Self <: PartialSSDPOptions](x: Self) {
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setSockets(value: js.Array[SSDPSocketOptions]): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
      
      inline def setSocketsUndefined: Self = StObject.set(x, "sockets", js.undefined)
      
      inline def setSocketsVarargs(value: SSDPSocketOptions*): Self = StObject.set(x, "sockets", js.Array(value*))
      
      inline def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setUdn(value: String): Self = StObject.set(x, "udn", value.asInstanceOf[js.Any])
      
      inline def setUdnUndefined: Self = StObject.set(x, "udn", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@achingbrain/ssdp.@achingbrain/ssdp.SSDPSocketOptions> */
  trait PartialSSDPSocketOptions extends StObject {
    
    var bind: js.UndefOr[NetworkAddress] = js.undefined
    
    var broadcast: js.UndefOr[NetworkAddress] = js.undefined
    
    var maxHops: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[udp4 | udp6] = js.undefined
  }
  object PartialSSDPSocketOptions {
    
    inline def apply(): PartialSSDPSocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSSDPSocketOptions]
    }
    
    extension [Self <: PartialSSDPSocketOptions](x: Self) {
      
      inline def setBind(value: NetworkAddress): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setBroadcast(value: NetworkAddress): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
      
      inline def setBroadcastUndefined: Self = StObject.set(x, "broadcast", js.undefined)
      
      inline def setMaxHops(value: Double): Self = StObject.set(x, "maxHops", value.asInstanceOf[js.Any])
      
      inline def setMaxHopsUndefined: Self = StObject.set(x, "maxHops", js.undefined)
      
      inline def setType(value: udp4 | udp6): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
