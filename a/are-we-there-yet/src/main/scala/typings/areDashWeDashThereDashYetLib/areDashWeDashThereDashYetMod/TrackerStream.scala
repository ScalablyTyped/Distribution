package typings
package areDashWeDashThereDashYetLib.areDashWeDashThereDashYetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("are-we-there-yet", "TrackerStream")
@js.native
class TrackerStream ()
  extends nodeLib.streamMod.Transform
     with TrackerObject {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, size: scala.Double) = this()
  def this(name: java.lang.String, size: scala.Double, options: nodeLib.streamMod.TransformOptions) = this()
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
  @JSName("addListener")
  def addListener_close(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_data(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_end(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.end,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_readable(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  def addWork(work: scala.Double): scala.Unit = js.native
  def completed(): scala.Double = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
  @JSName("on")
  def on_close(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_data(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.end,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_readable(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
  @JSName("once")
  def once_close(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_data(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_end(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.end,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_readable(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_data(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.end,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_data(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.end,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_change(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.change,
    listener: TrackerEventListener
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.close,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_data(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.data,
    listener: js.Function1[/* chunk */ nodeLib.Buffer | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.end,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
}

