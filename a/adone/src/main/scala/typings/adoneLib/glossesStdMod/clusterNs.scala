package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "cluster")
@js.native
object clusterNs extends js.Object {
  @js.native
  class Worker ()
    extends nodeLib.clusterMod.Worker
  
  val isMaster: scala.Boolean = js.native
  val isWorker: scala.Boolean = js.native
  // TODO: cluster.schedulingPolicy
  val settings: nodeLib.clusterMod.ClusterSettings = js.native
  val worker: nodeLib.clusterMod.Worker = js.native
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
  def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): nodeLib.clusterMod.Cluster = js.native
  @JSName("addListener")
  def addListener_disconnect(
    event: adoneLib.adoneLibStrings.disconnect,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("addListener")
  def addListener_exit(
    event: adoneLib.adoneLibStrings.exit,
    listener: js.Function3[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("addListener")
  def addListener_fork(
    event: adoneLib.adoneLibStrings.fork,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("addListener")
  def addListener_listening(
    event: adoneLib.adoneLibStrings.listening,
    listener: js.Function2[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* address */ nodeLib.clusterMod.Address, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("addListener")
  def addListener_message(
    event: adoneLib.adoneLibStrings.message,
    listener: js.Function3[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("addListener")
  def addListener_online(
    event: adoneLib.adoneLibStrings.online,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("addListener")
  def addListener_setup(event: adoneLib.adoneLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): nodeLib.clusterMod.Cluster = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(callback: js.Function): scala.Unit = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  @JSName("emit")
  def emit_disconnect(event: adoneLib.adoneLibStrings.disconnect, worker: nodeLib.clusterMod.Worker): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(
    event: adoneLib.adoneLibStrings.exit,
    worker: nodeLib.clusterMod.Worker,
    code: scala.Double,
    signal: java.lang.String
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_fork(event: adoneLib.adoneLibStrings.fork, worker: nodeLib.clusterMod.Worker): scala.Boolean = js.native
  @JSName("emit")
  def emit_listening(
    event: adoneLib.adoneLibStrings.listening,
    worker: nodeLib.clusterMod.Worker,
    address: nodeLib.clusterMod.Address
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(
    event: adoneLib.adoneLibStrings.message,
    worker: nodeLib.clusterMod.Worker,
    message: js.Any,
    handle: nodeLib.netMod.Server
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(
    event: adoneLib.adoneLibStrings.message,
    worker: nodeLib.clusterMod.Worker,
    message: js.Any,
    handle: nodeLib.netMod.Socket
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_online(event: adoneLib.adoneLibStrings.online, worker: nodeLib.clusterMod.Worker): scala.Boolean = js.native
  @JSName("emit")
  def emit_setup(event: adoneLib.adoneLibStrings.setup, settings: js.Any): scala.Boolean = js.native
  def eventNames(): js.Array[java.lang.String] = js.native
  def fork(): nodeLib.clusterMod.Worker = js.native
  def fork(env: js.Any): nodeLib.clusterMod.Worker = js.native
  def getMaxListeners(): scala.Double = js.native
  def listenerCount(`type`: java.lang.String): scala.Double = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): nodeLib.clusterMod.Cluster = js.native
  @JSName("on")
  def on_disconnect(
    event: adoneLib.adoneLibStrings.disconnect,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("on")
  def on_exit(
    event: adoneLib.adoneLibStrings.exit,
    listener: js.Function3[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("on")
  def on_fork(
    event: adoneLib.adoneLibStrings.fork,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("on")
  def on_listening(
    event: adoneLib.adoneLibStrings.listening,
    listener: js.Function2[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* address */ nodeLib.clusterMod.Address, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("on")
  def on_message(
    event: adoneLib.adoneLibStrings.message,
    listener: js.Function3[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("on")
  def on_online(
    event: adoneLib.adoneLibStrings.online,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("on")
  def on_setup(event: adoneLib.adoneLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): nodeLib.clusterMod.Cluster = js.native
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): nodeLib.clusterMod.Cluster = js.native
  @JSName("once")
  def once_disconnect(
    event: adoneLib.adoneLibStrings.disconnect,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("once")
  def once_exit(
    event: adoneLib.adoneLibStrings.exit,
    listener: js.Function3[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("once")
  def once_fork(
    event: adoneLib.adoneLibStrings.fork,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("once")
  def once_listening(
    event: adoneLib.adoneLibStrings.listening,
    listener: js.Function2[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* address */ nodeLib.clusterMod.Address, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("once")
  def once_message(
    event: adoneLib.adoneLibStrings.message,
    listener: js.Function3[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("once")
  def once_online(
    event: adoneLib.adoneLibStrings.online,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("once")
  def once_setup(event: adoneLib.adoneLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): nodeLib.clusterMod.Cluster = js.native
  def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependListener")
  def prependListener_disconnect(
    event: adoneLib.adoneLibStrings.disconnect,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: adoneLib.adoneLibStrings.exit,
    listener: js.Function3[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependListener")
  def prependListener_fork(
    event: adoneLib.adoneLibStrings.fork,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependListener")
  def prependListener_listening(
    event: adoneLib.adoneLibStrings.listening,
    listener: js.Function2[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* address */ nodeLib.clusterMod.Address, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependListener")
  def prependListener_message(
    event: adoneLib.adoneLibStrings.message,
    listener: js.Function3[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependListener")
  def prependListener_online(
    event: adoneLib.adoneLibStrings.online,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependListener")
  def prependListener_setup(event: adoneLib.adoneLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): nodeLib.clusterMod.Cluster = js.native
  def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(
    event: adoneLib.adoneLibStrings.disconnect,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: adoneLib.adoneLibStrings.exit,
    listener: js.Function3[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fork(
    event: adoneLib.adoneLibStrings.fork,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(
    event: adoneLib.adoneLibStrings.listening,
    listener: js.Function2[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* address */ nodeLib.clusterMod.Address, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: adoneLib.adoneLibStrings.message,
    listener: js.Function3[
      /* worker */ nodeLib.clusterMod.Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_online(
    event: adoneLib.adoneLibStrings.online,
    listener: js.Function1[/* worker */ nodeLib.clusterMod.Worker, scala.Unit]
  ): nodeLib.clusterMod.Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_setup(event: adoneLib.adoneLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): nodeLib.clusterMod.Cluster = js.native
  def removeAllListeners(): nodeLib.clusterMod.Cluster = js.native
  def removeAllListeners(event: java.lang.String): nodeLib.clusterMod.Cluster = js.native
  def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): nodeLib.clusterMod.Cluster = js.native
  def setMaxListeners(n: scala.Double): nodeLib.clusterMod.Cluster = js.native
  def setupMaster(): scala.Unit = js.native
  def setupMaster(settings: nodeLib.clusterMod.ClusterSettings): scala.Unit = js.native
  @js.native
  object workers
    extends /* index */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[nodeLib.clusterMod.Worker]]
  
}

