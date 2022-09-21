package typings.achingbrainNatPortMapper

import typings.achingbrainNatPortMapper.achingbrainNatPortMapperStrings.tcp_
import typings.achingbrainNatPortMapper.achingbrainNatPortMapperStrings.udp_
import typings.achingbrainNatPortMapper.discoveryMod.DiscoverGateway_
import typings.achingbrainNatPortMapper.mod.Client
import typings.achingbrainNatPortMapper.mod.MapPortOptions
import typings.achingbrainNatPortMapper.mod.UnmapPortOptions
import typings.node.bufferMod.global.Buffer
import typings.node.dgramMod.RemoteInfo
import typings.node.eventsMod.EventEmitter
import typings.pDefer.mod.DeferredPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pmpMod {
  
  @JSImport("@achingbrain/nat-port-mapper/dist/src/pmp", "PMPClient")
  @js.native
  open class PMPClient protected ()
    extends EventEmitter
       with Client {
    def this(discoverGateway: js.Function0[DiscoverGateway_]) = this()
    
    /**
      * Processes the next request if the socket is listening.
      */
    def _next(): Unit = js.native
    
    /* private */ var cancelGatewayDiscovery: Any = js.native
    
    /* CompleteClass */
    override def close(): js.Promise[Unit] = js.native
    
    def connect(): Unit = js.native
    
    /* private */ var connecting: Any = js.native
    
    /* private */ val discoverGateway: Any = js.native
    
    /* CompleteClass */
    override def externalIp(): js.Promise[String] = js.native
    
    /* private */ var gateway: Any = js.native
    
    /* private */ var listening: Any = js.native
    
    /* CompleteClass */
    override def map(options: MapPortOptions): js.Promise[Unit] = js.native
    
    def onClose(): Unit = js.native
    
    def onError(err: js.Error): Unit = js.native
    
    def onListening(): Unit = js.native
    
    def onMessage(msg: Buffer, rinfo: RemoteInfo): Unit = js.native
    
    /* private */ var queue: Any = js.native
    
    /* private */ var req: Any = js.native
    
    /* private */ var reqActive: Any = js.native
    
    /**
      * Queues a UDP request to be send to the gateway device.
      */
    def request(op: Double, obj: PortMappingOptions, deferred: DeferredPromise[Any]): Unit = js.native
    
    /* private */ val socket: Any = js.native
    
    /* CompleteClass */
    override def unmap(options: UnmapPortOptions): js.Promise[Unit] = js.native
  }
  /* static members */
  object PMPClient {
    
    @JSImport("@achingbrain/nat-port-mapper/dist/src/pmp", "PMPClient")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createClient(discoverGateway: js.Function0[DiscoverGateway_]): js.Promise[PMPClient] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(discoverGateway.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PMPClient]]
  }
  
  trait PortMappingOptions extends StObject {
    
    var external: js.UndefOr[Boolean] = js.undefined
    
    var internal: js.UndefOr[Boolean] = js.undefined
    
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    var public: js.UndefOr[Boolean] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[tcp_ | udp_] = js.undefined
  }
  object PortMappingOptions {
    
    inline def apply(): PortMappingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortMappingOptions]
    }
    
    extension [Self <: PortMappingOptions](x: Self) {
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setType(value: tcp_ | udp_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
