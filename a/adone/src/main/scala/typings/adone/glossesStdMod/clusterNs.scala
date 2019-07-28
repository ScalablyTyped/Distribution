package typings.adone.glossesStdMod

import org.scalablytyped.runtime.StringDictionary
import typings.adone.adoneStrings.disconnect
import typings.adone.adoneStrings.exit
import typings.adone.adoneStrings.fork
import typings.adone.adoneStrings.listening
import typings.adone.adoneStrings.message
import typings.adone.adoneStrings.online
import typings.adone.adoneStrings.setup
import typings.node.clusterMod.Address
import typings.node.clusterMod.Cluster
import typings.node.clusterMod.ClusterSettings
import typings.node.netMod.Server
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "cluster")
@js.native
object clusterNs extends js.Object {
  @js.native
  class Worker ()
    extends typings.node.clusterMod.Worker
  
  val isMaster: Boolean = js.native
  val isWorker: Boolean = js.native
  // TODO: cluster.schedulingPolicy
  val settings: ClusterSettings = js.native
  val worker: typings.node.clusterMod.Worker = js.native
  /**
    * events.EventEmitter
    *   1. disconnect
    *   2. exit
    *   3. fork
    *   4. listening
    *   5. message
    *   6. online
    *   7. setup
    */
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ typings.node.clusterMod.Worker, 
      /* code */ Double, 
      /* signal */ String, 
      Unit
    ]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_fork(event: fork, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_listening(
    event: listening,
    listener: js.Function2[/* worker */ typings.node.clusterMod.Worker, /* address */ Address, Unit]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("addListener")
  def addListener_message(
    event: message,
    listener: js.Function3[
      /* worker */ typings.node.clusterMod.Worker, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_online(event: online, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  def disconnect(): Unit = js.native
  def disconnect(callback: js.Function0[Unit]): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSName("emit")
  def emit_disconnect(event: disconnect, worker: typings.node.clusterMod.Worker): Boolean = js.native
  @JSName("emit")
  def emit_exit(event: exit, worker: typings.node.clusterMod.Worker, code: Double, signal: String): Boolean = js.native
  @JSName("emit")
  def emit_fork(event: fork, worker: typings.node.clusterMod.Worker): Boolean = js.native
  @JSName("emit")
  def emit_listening(event: listening, worker: typings.node.clusterMod.Worker, address: Address): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, worker: typings.node.clusterMod.Worker, message: js.Any, handle: Server): Boolean = js.native
  @JSName("emit")
  def emit_message(event: message, worker: typings.node.clusterMod.Worker, message: js.Any, handle: Socket): Boolean = js.native
  @JSName("emit")
  def emit_online(event: online, worker: typings.node.clusterMod.Worker): Boolean = js.native
  @JSName("emit")
  def emit_setup(event: setup, settings: ClusterSettings): Boolean = js.native
  def eventNames(): js.Array[String] = js.native
  def fork(): typings.node.clusterMod.Worker = js.native
  def fork(env: js.Any): typings.node.clusterMod.Worker = js.native
  def getMaxListeners(): Double = js.native
  def listenerCount(`type`: String): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("on")
  def on_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ typings.node.clusterMod.Worker, 
      /* code */ Double, 
      /* signal */ String, 
      Unit
    ]
  ): Cluster = js.native
  @JSName("on")
  def on_fork(event: fork, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("on")
  def on_listening(
    event: listening,
    listener: js.Function2[/* worker */ typings.node.clusterMod.Worker, /* address */ Address, Unit]
  ): Cluster = js.native
  @JSName("on")
  def on_message(
    event: message,
    listener: js.Function3[
      /* worker */ typings.node.clusterMod.Worker, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = js.native
  @JSName("on")
  def on_online(event: online, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("on")
  def on_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSName("once")
  def once_disconnect(event: disconnect, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("once")
  def once_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ typings.node.clusterMod.Worker, 
      /* code */ Double, 
      /* signal */ String, 
      Unit
    ]
  ): Cluster = js.native
  @JSName("once")
  def once_fork(event: fork, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("once")
  def once_listening(
    event: listening,
    listener: js.Function2[/* worker */ typings.node.clusterMod.Worker, /* address */ Address, Unit]
  ): Cluster = js.native
  @JSName("once")
  def once_message(
    event: message,
    listener: js.Function3[
      /* worker */ typings.node.clusterMod.Worker, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = js.native
  @JSName("once")
  def once_online(event: online, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("once")
  def once_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ typings.node.clusterMod.Worker, 
      /* code */ Double, 
      /* signal */ String, 
      Unit
    ]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_fork(event: fork, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_listening(
    event: listening,
    listener: js.Function2[/* worker */ typings.node.clusterMod.Worker, /* address */ Address, Unit]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependListener")
  def prependListener_message(
    event: message,
    listener: js.Function3[
      /* worker */ typings.node.clusterMod.Worker, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_online(event: online, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: disconnect, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: exit,
    listener: js.Function3[
      /* worker */ typings.node.clusterMod.Worker, 
      /* code */ Double, 
      /* signal */ String, 
      Unit
    ]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fork(event: fork, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(
    event: listening,
    listener: js.Function2[/* worker */ typings.node.clusterMod.Worker, /* address */ Address, Unit]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: message,
    listener: js.Function3[
      /* worker */ typings.node.clusterMod.Worker, 
      /* message */ js.Any, 
      /* handle */ Socket | Server, 
      Unit
    ]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_online(event: online, listener: js.Function1[/* worker */ typings.node.clusterMod.Worker, Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_setup(event: setup, listener: js.Function1[/* settings */ ClusterSettings, Unit]): Cluster = js.native
  def removeAllListeners(): Cluster = js.native
  def removeAllListeners(event: String): Cluster = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): Cluster = js.native
  def setMaxListeners(n: Double): Cluster = js.native
  def setupMaster(): Unit = js.native
  def setupMaster(settings: ClusterSettings): Unit = js.native
  @js.native
  object workers
    extends /* index */ StringDictionary[js.UndefOr[typings.node.clusterMod.Worker]]
  
}

