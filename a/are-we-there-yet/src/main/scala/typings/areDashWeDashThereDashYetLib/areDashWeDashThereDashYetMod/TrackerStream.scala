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
  def this(name: java.lang.String, size: scala.Double, options: nodeLib.streamMod.internalNs.TransformOptions) = this()
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def _destroy(error: nodeLib.Error, callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def _destroy(error: scala.Null, callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
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
  /**
    * Event emitter
    * The defined events on documents including:
    * 1. close
    * 2. drain
    * 3. error
    * 4. finish
    * 5. pipe
    * 6. unpipe
    */
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("addListener")
  override def addListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
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
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("addListener")
  override def addListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_readable(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  def addWork(work: scala.Double): scala.Unit = js.native
  def completed(): scala.Double = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def destroy(): scala.Unit = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def destroy(error: nodeLib.Error): scala.Unit = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("emit")
  override def emit_close(event: nodeLib.nodeLibStrings.close): scala.Boolean = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("emit")
  override def emit_error(event: nodeLib.nodeLibStrings.error, err: nodeLib.Error): scala.Boolean = js.native
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
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("on")
  override def on_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
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
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("on")
  override def on_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_readable(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
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
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("once")
  override def once_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
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
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("once")
  override def once_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
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
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("prependListener")
  override def prependListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
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
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("prependListener")
  override def prependListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_readable(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
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
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("prependOnceListener")
  override def prependOnceListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
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
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("prependOnceListener")
  override def prependOnceListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_readable(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
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
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("removeListener")
  override def removeListener_close(event: nodeLib.nodeLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
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
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  @JSName("removeListener")
  override def removeListener_error(event: nodeLib.nodeLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_readable(
    event: areDashWeDashThereDashYetLib.areDashWeDashThereDashYetLibStrings.readable,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
}

