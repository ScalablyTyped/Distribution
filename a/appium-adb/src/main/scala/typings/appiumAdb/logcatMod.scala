package typings.appiumAdb

import typings.appiumAdb.anon.Adb
import typings.appiumAdb.appiumAdbStrings.brief
import typings.appiumAdb.appiumAdbStrings.long
import typings.appiumAdb.appiumAdbStrings.output
import typings.appiumAdb.appiumAdbStrings.process
import typings.appiumAdb.appiumAdbStrings.raw
import typings.appiumAdb.appiumAdbStrings.tag
import typings.appiumAdb.appiumAdbStrings.thread
import typings.appiumAdb.appiumAdbStrings.threadtime
import typings.appiumAdb.appiumAdbStrings.time
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logcatMod {
  
  @JSImport("appium-adb/lib/logcat", JSImport.Default)
  @js.native
  open class default protected () extends Logcat {
    def this(opts: Adb) = this()
  }
  
  trait Log extends StObject {
    
    var level: String
    
    var message: String
    
    var timestamp: Double
  }
  object Log {
    
    inline def apply(level: String, message: String, timestamp: Double): Log = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Log]
    }
    
    extension [Self <: Log](x: Self) {
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Logcat extends EventEmitter {
    
    @JSName("addListener")
    def addListener_output(event: output, listener: js.Function1[/* output */ Log, Unit]): this.type = js.native
    
    def clear(): js.Promise[Unit] = js.native
    
    @JSName("emit")
    def emit_output(event: output, output: Log): Boolean = js.native
    
    def getAllLogs(): js.Array[Log] = js.native
    
    def getLogs(): js.Array[Log] = js.native
    
    @JSName("on")
    def on_output(event: output, listener: js.Function1[/* output */ Log, Unit]): this.type = js.native
    
    @JSName("once")
    def once_output(event: output, listener: js.Function1[/* output */ Log, Unit]): this.type = js.native
    
    def outputHandler(output: String): Unit = js.native
    def outputHandler(output: String, prefix: String): Unit = js.native
    
    @JSName("prependListener")
    def prependListener_output(event: output, listener: js.Function1[/* output */ Log, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_output(event: output, listener: js.Function1[/* output */ Log, Unit]): this.type = js.native
    
    def startCapture(): js.Promise[Unit] = js.native
    def startCapture(opts: LogcatOpts): js.Promise[Unit] = js.native
    
    def stopCapture(): js.Promise[Unit] = js.native
  }
  
  trait LogcatOpts extends StObject {
    
    /**
      * Series of <tag>[:priority]
      * where <tag> is a log component tag (or * for all) and priority is:
      *  V    Verbose
      *  D    Debug
      *  I    Info
      *  W    Warn
      *  E    Error
      *  F    Fatal
      *  S    Silent (suppress all output)
      *
      * '*' means '*:d' and <tag> by itself means <tag>:v
      *
      * If not specified on the commandline, filterspec is set from ANDROID_LOG_TAGS.
      * If no filterspec is found, filter defaults to '*:I'
      */
    var filterSpecs: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The log print format
      * @default `threadtime`
      */
    var format: js.UndefOr[brief | process | tag | thread | raw | time | threadtime | long] = js.undefined
  }
  object LogcatOpts {
    
    inline def apply(): LogcatOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogcatOpts]
    }
    
    extension [Self <: LogcatOpts](x: Self) {
      
      inline def setFilterSpecs(value: String | js.Array[String]): Self = StObject.set(x, "filterSpecs", value.asInstanceOf[js.Any])
      
      inline def setFilterSpecsUndefined: Self = StObject.set(x, "filterSpecs", js.undefined)
      
      inline def setFilterSpecsVarargs(value: String*): Self = StObject.set(x, "filterSpecs", js.Array(value*))
      
      inline def setFormat(value: brief | process | tag | thread | raw | time | threadtime | long): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
}
