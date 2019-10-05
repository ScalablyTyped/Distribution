package typings.areDashWeDashThereDashYet

import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetMod.Tracker
import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetMod.TrackerBase
import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetMod.TrackerEventListener
import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetMod.TrackerGroup
import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetMod.TrackerObject
import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetMod.TrackerStream
import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetStrings.change
import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetStrings.close
import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetStrings.data
import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetStrings.end
import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetStrings.error
import typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetStrings.readable
import typings.node.Anon_End
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("are-we-there-yet", JSImport.Namespace)
@js.native
object areDashWeDashThereDashYetMod extends js.Object {
  @js.native
  class Tracker ()
    extends TrackerBase
       with TrackerObject {
    def this(name: String) = this()
    def this(name: String, todo: Double) = this()
    /* InferMemberOverrides */
    override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addWork(work: Double): Unit = js.native
    def completeWork(completed: Double): Unit = js.native
    def completed(): Double = js.native
    /* InferMemberOverrides */
    override def emit(event: String, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def eventNames(): js.Array[String | js.Symbol] = js.native
    def finish(): Unit = js.native
    /* InferMemberOverrides */
    override def getMaxListeners(): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: String): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: js.Symbol): Double = js.native
    /* InferMemberOverrides */
    override def listeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    // Added in Node 6...
    /* InferMemberOverrides */
    override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: String): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: js.Symbol): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def setMaxListeners(n: Double): this.type = js.native
  }
  
  @js.native
  class TrackerBase () extends EventEmitter {
    def this(name: String) = this()
    @JSName("addListener")
    def addListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("on")
    def on_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("once")
    def once_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_change(event: change, listener: TrackerEventListener): this.type = js.native
  }
  
  @js.native
  class TrackerGroup ()
    extends TrackerBase
       with TrackerObject {
    def this(name: String) = this()
    /* InferMemberOverrides */
    override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addUnit(tracker: TrackerBase): TrackerObject = js.native
    def addUnit(tracker: TrackerBase, weight: Double): TrackerObject = js.native
    def completed(): Double = js.native
    def debug(): String = js.native
    /* InferMemberOverrides */
    override def emit(event: String, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def eventNames(): js.Array[String | js.Symbol] = js.native
    def finish(): Unit = js.native
    /* InferMemberOverrides */
    override def getMaxListeners(): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: String): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: js.Symbol): Double = js.native
    /* InferMemberOverrides */
    override def listeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    def newGroup(): TrackerGroup = js.native
    def newGroup(name: String): TrackerGroup = js.native
    def newGroup(name: String, weight: Double): TrackerGroup = js.native
    def newItem(): Tracker = js.native
    def newItem(name: String): Tracker = js.native
    def newItem(name: String, todo: Double): Tracker = js.native
    def newItem(name: String, todo: Double, weight: Double): Tracker = js.native
    def newStream(): TrackerStream = js.native
    def newStream(name: String): TrackerStream = js.native
    def newStream(name: String, todo: Double): TrackerStream = js.native
    def newStream(name: String, todo: Double, weight: Double): TrackerStream = js.native
    /* InferMemberOverrides */
    override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    // Added in Node 6...
    /* InferMemberOverrides */
    override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: String): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: js.Symbol): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def setMaxListeners(n: Double): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetMod.Tracker
    - typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetMod.TrackerGroup
    - typings.areDashWeDashThereDashYet.areDashWeDashThereDashYetMod.TrackerStream
  */
  trait TrackerObject extends js.Object
  
  @js.native
  class TrackerStream ()
    extends Transform
       with TrackerObject {
    def this(name: String) = this()
    def this(name: String, size: Double) = this()
    def this(name: String, size: Double, options: TransformOptions) = this()
    /* InferMemberOverrides */
    override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    def addWork(work: Double): Unit = js.native
    def completed(): Double = js.native
    /* InferMemberOverrides */
    override def emit(event: String, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    /* InferMemberOverrides */
    override def eventNames(): js.Array[String | js.Symbol] = js.native
    /* InferMemberOverrides */
    override def getMaxListeners(): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: String): Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: js.Symbol): Double = js.native
    /* InferMemberOverrides */
    override def listeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
    // Added in Node 6...
    /* InferMemberOverrides */
    override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: String): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: js.Symbol): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def setMaxListeners(n: Double): this.type = js.native
  }
  
  type GenericEventListener = js.Function1[/* repeated */ js.Any, Unit]
  type TrackerEventListener = js.Function3[/* name */ String, /* completed */ Double, /* tracker */ TrackerObject, Unit]
}

