package typings.adone.adoneNs.eventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.event.AsyncEmitter")
@js.native
class AsyncEmitter () extends Emitter {
  def this(concurrency: Double) = this()
  def emitParallel(event: String, args: js.Any*): js.Promise[js.Array[_]] = js.native
  def emitReduce(event: String, args: js.Any*): js.Promise[_] = js.native
  def emitReduceRight(event: String, args: js.Any*): js.Promise[_] = js.native
  def emitSerial(event: String, args: js.Any*): js.Promise[js.Array[_]] = js.native
  def setConcurrency(): this.type = js.native
  def setConcurrency(max: Double): this.type = js.native
  def subscribe(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Function0[Unit] = js.native
  def subscribe(event: String, listener: js.Function1[/* repeated */ js.Any, Unit], once: Boolean): js.Function0[Unit] = js.native
}

