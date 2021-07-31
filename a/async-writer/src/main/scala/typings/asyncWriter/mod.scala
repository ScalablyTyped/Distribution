package typings.asyncWriter

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Stream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-writer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("async-writer", "AsyncWriter")
  @js.native
  class AsyncWriter () extends StObject {
    def this(writer: js.Any) = this()
    def this(writer: js.Any, global: StringDictionary[js.Any]) = this()
    def this(writer: Unit, global: StringDictionary[js.Any]) = this()
    def this(writer: js.Any, global: StringDictionary[js.Any], async: Boolean) = this()
    def this(writer: js.Any, global: Unit, async: Boolean) = this()
    def this(writer: Unit, global: StringDictionary[js.Any], async: Boolean) = this()
    def this(writer: Unit, global: Unit, async: Boolean) = this()
    def this(writer: js.Any, global: StringDictionary[js.Any], async: Boolean, buffer: Boolean) = this()
    def this(writer: js.Any, global: StringDictionary[js.Any], async: Unit, buffer: Boolean) = this()
    def this(writer: js.Any, global: Unit, async: Boolean, buffer: Boolean) = this()
    def this(writer: js.Any, global: Unit, async: Unit, buffer: Boolean) = this()
    def this(writer: Unit, global: StringDictionary[js.Any], async: Boolean, buffer: Boolean) = this()
    def this(writer: Unit, global: StringDictionary[js.Any], async: Unit, buffer: Boolean) = this()
    def this(writer: Unit, global: Unit, async: Boolean, buffer: Boolean) = this()
    def this(writer: Unit, global: Unit, async: Unit, buffer: Boolean) = this()
    
    def _finish(): Unit = js.native
    
    def beginAsync(): AsyncWriter = js.native
    def beginAsync(options: Double): AsyncWriter = js.native
    def beginAsync(options: BeginAsyncOptions): AsyncWriter = js.native
    
    def captureString(func: js.Function, thisObj: js.Object): String = js.native
    
    def createNestedWriter(writer: BufferedWriter): AsyncWriter = js.native
    def createNestedWriter(writer: StringWriter): AsyncWriter = js.native
    
    def emit(arg: js.Any): AsyncWriter = js.native
    
    def end(): AsyncWriter = js.native
    def end(data: js.Any): AsyncWriter = js.native
    
    def error(e: Error): Unit = js.native
    
    def flush(): Unit = js.native
    
    def getAttribute(): js.Any = js.native
    
    def getAttributes(): StringDictionary[js.Any] = js.native
    
    def getOutput(): String = js.native
    
    def handleBeginAsync(options: Double, parent: AsyncWriter): Unit = js.native
    def handleBeginAsync(options: BeginAsyncOptions, parent: AsyncWriter): Unit = js.native
    
    def handleEnd(isAsync: Boolean): Unit = js.native
    
    var isAsyncWriter: AsyncWriter = js.native
    
    def on(event: String, callback: js.Function): AsyncWriter = js.native
    
    def onLast(callback: js.Function): AsyncWriter = js.native
    
    def once(event: String, callback: js.Function): AsyncWriter = js.native
    
    def pipe(stream: Stream): AsyncWriter = js.native
    
    def removeListener(): AsyncWriter = js.native
    
    def swapWriter(newWriter: BufferedWriter, func: js.Function, thisObj: js.Object): Unit = js.native
    def swapWriter(newWriter: StringWriter, func: js.Function, thisObj: js.Object): Unit = js.native
    
    def sync(): Unit = js.native
    
    def write(str: String): AsyncWriter = js.native
  }
  object AsyncWriter {
    
    @JSImport("async-writer", "AsyncWriter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def enableAsyncStackTrace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAsyncStackTrace")().asInstanceOf[Unit]
  }
  
  @JSImport("async-writer", "BufferedWriter")
  @js.native
  class BufferedWriter protected () extends StObject {
    def this(wrappedStream: Stream) = this()
    
    def clear(): Unit = js.native
    
    def end(): Unit = js.native
    
    def flush(): Unit = js.native
    
    def on(event: String, callback: js.Function): BufferedWriter = js.native
    
    def once(event: String, callback: js.Function): BufferedWriter = js.native
    
    def write(what: String): BufferedWriter = js.native
  }
  
  @JSImport("async-writer", "StringWriter")
  @js.native
  class StringWriter protected () extends StObject {
    def this(events: EventEmitter) = this()
    
    def end(): Unit = js.native
    
    def write(what: String): StringWriter = js.native
  }
  
  @scala.inline
  def create(): AsyncWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AsyncWriter]
  @scala.inline
  def create(writer: js.Any): AsyncWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(writer.asInstanceOf[js.Any]).asInstanceOf[AsyncWriter]
  @scala.inline
  def create(writer: js.Any, options: AsyncWriterOptions): AsyncWriter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(writer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncWriter]
  @scala.inline
  def create(writer: Unit, options: AsyncWriterOptions): AsyncWriter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(writer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncWriter]
  
  @scala.inline
  def enableAsyncStackTrace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAsyncStackTrace")().asInstanceOf[Unit]
  
  trait AsyncWriterOptions extends StObject {
    
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object AsyncWriterOptions {
    
    @scala.inline
    def apply(): AsyncWriterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncWriterOptions]
    }
    
    @scala.inline
    implicit class AsyncWriterOptionsMutableBuilder[Self <: AsyncWriterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setGlobal(value: StringDictionary[js.Any]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    }
  }
  
  trait BeginAsyncOptions extends StObject {
    
    var last: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object BeginAsyncOptions {
    
    @scala.inline
    def apply(): BeginAsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeginAsyncOptions]
    }
    
    @scala.inline
    implicit class BeginAsyncOptionsMutableBuilder[Self <: BeginAsyncOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type EventFunction = js.Function2[/* event */ String, /* callback */ js.Function, Unit]
}
