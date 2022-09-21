package typings.achingbrainNatPortMapper

import typings.achingbrainNatPortMapper.deviceMod.Device
import typings.achingbrainNatPortMapper.discoveryMod.DiscoverGateway_
import typings.achingbrainNatPortMapper.mod.Client
import typings.achingbrainNatPortMapper.mod.MapPortOptions
import typings.achingbrainNatPortMapper.mod.UnmapPortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upnpMod {
  
  @JSImport("@achingbrain/nat-port-mapper/dist/src/upnp", "UPNPClient")
  @js.native
  open class UPNPClient protected ()
    extends StObject
       with Client {
    def this(discoverGateway: js.Function0[DiscoverGateway_]) = this()
    
    /* private */ val abortController: Any = js.native
    
    /* private */ var cancelGatewayDiscovery: Any = js.native
    
    /* CompleteClass */
    override def close(): js.Promise[Unit] = js.native
    
    /* private */ var closed: Any = js.native
    
    /* private */ val discoverGateway: Any = js.native
    
    /* CompleteClass */
    override def externalIp(): js.Promise[String] = js.native
    
    def findGateway(): js.Promise[Device] = js.native
    
    /* CompleteClass */
    override def map(options: MapPortOptions): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def unmap(options: UnmapPortOptions): js.Promise[Unit] = js.native
  }
  /* static members */
  object UPNPClient {
    
    @JSImport("@achingbrain/nat-port-mapper/dist/src/upnp", "UPNPClient")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createClient(discoverGateway: js.Function0[DiscoverGateway_]): js.Promise[UPNPClient] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(discoverGateway.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UPNPClient]]
  }
}
