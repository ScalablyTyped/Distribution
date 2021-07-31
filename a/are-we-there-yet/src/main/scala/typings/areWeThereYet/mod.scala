package typings.areWeThereYet

import typings.areWeThereYet.areWeThereYetStrings.change
import typings.areWeThereYet.areWeThereYetStrings.close
import typings.areWeThereYet.areWeThereYetStrings.data
import typings.areWeThereYet.areWeThereYetStrings.end
import typings.areWeThereYet.areWeThereYetStrings.error
import typings.areWeThereYet.areWeThereYetStrings.readable
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("are-we-there-yet", "Tracker")
  @js.native
  class Tracker ()
    extends TrackerBase
       with TrackerObject {
    def this(name: String) = this()
    def this(name: String, todo: Double) = this()
    def this(name: Unit, todo: Double) = this()
    
    def addWork(work: Double): Unit = js.native
    
    def completeWork(completed: Double): Unit = js.native
    
    def completed(): Double = js.native
    
    def finish(): Unit = js.native
  }
  
  @JSImport("are-we-there-yet", "TrackerBase")
  @js.native
  class TrackerBase () extends EventEmitter {
    def this(name: String) = this()
    
    def addListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("addListener")
    def addListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    
    def on(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("on")
    def on_change(event: change, listener: TrackerEventListener): this.type = js.native
    
    def once(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("once")
    def once_change(event: change, listener: TrackerEventListener): this.type = js.native
    
    def prependListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    
    def prependOnceListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    
    def removeListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_change(event: change, listener: TrackerEventListener): this.type = js.native
  }
  
  @JSImport("are-we-there-yet", "TrackerGroup")
  @js.native
  class TrackerGroup ()
    extends TrackerBase
       with TrackerObject {
    def this(name: String) = this()
    
    def addUnit(tracker: TrackerBase): TrackerObject = js.native
    def addUnit(tracker: TrackerBase, weight: Double): TrackerObject = js.native
    
    def completed(): Double = js.native
    
    def debug(): String = js.native
    
    def finish(): Unit = js.native
    
    def newGroup(): TrackerGroup = js.native
    def newGroup(name: String): TrackerGroup = js.native
    def newGroup(name: String, weight: Double): TrackerGroup = js.native
    def newGroup(name: Unit, weight: Double): TrackerGroup = js.native
    
    def newItem(): Tracker = js.native
    def newItem(name: String): Tracker = js.native
    def newItem(name: String, todo: Double): Tracker = js.native
    def newItem(name: String, todo: Double, weight: Double): Tracker = js.native
    def newItem(name: String, todo: Unit, weight: Double): Tracker = js.native
    def newItem(name: Unit, todo: Double): Tracker = js.native
    def newItem(name: Unit, todo: Double, weight: Double): Tracker = js.native
    def newItem(name: Unit, todo: Unit, weight: Double): Tracker = js.native
    
    def newStream(): TrackerStream = js.native
    def newStream(name: String): TrackerStream = js.native
    def newStream(name: String, todo: Double): TrackerStream = js.native
    def newStream(name: String, todo: Double, weight: Double): TrackerStream = js.native
    def newStream(name: String, todo: Unit, weight: Double): TrackerStream = js.native
    def newStream(name: Unit, todo: Double): TrackerStream = js.native
    def newStream(name: Unit, todo: Double, weight: Double): TrackerStream = js.native
    def newStream(name: Unit, todo: Unit, weight: Double): TrackerStream = js.native
  }
  
  @JSImport("are-we-there-yet", "TrackerStream")
  @js.native
  class TrackerStream ()
    extends Transform
       with TrackerObject {
    def this(name: String) = this()
    def this(name: String, size: Double) = this()
    def this(name: Unit, size: Double) = this()
    def this(name: String, size: Double, options: TransformOptions) = this()
    def this(name: String, size: Unit, options: TransformOptions) = this()
    def this(name: Unit, size: Double, options: TransformOptions) = this()
    def this(name: Unit, size: Unit, options: TransformOptions) = this()
    
    def addListener(event: String, listener: GenericEventListener): this.type = js.native
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
    
    def on(event: String, listener: GenericEventListener): this.type = js.native
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
    
    def once(event: String, listener: GenericEventListener): this.type = js.native
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
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def prependListener(event: String, listener: GenericEventListener): this.type = js.native
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
    
    def prependOnceListener(event: String, listener: GenericEventListener): this.type = js.native
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
    
    def removeListener(event: String, listener: GenericEventListener): this.type = js.native
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
  }
  
  @js.native
  trait GenericEventListener extends StObject {
    
    def apply(args: js.Any*): Unit = js.native
  }
  
  type TrackerEventListener = js.Function3[/* name */ String, /* completed */ Double, /* tracker */ TrackerObject, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.areWeThereYet.mod.Tracker
    - typings.areWeThereYet.mod.TrackerGroup
    - typings.areWeThereYet.mod.TrackerStream
  */
  trait TrackerObject extends StObject
}
