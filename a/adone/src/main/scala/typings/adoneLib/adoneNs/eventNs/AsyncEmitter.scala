package typings
package adoneLib.adoneNs.eventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.event.AsyncEmitter")
@js.native
class AsyncEmitter () extends Emitter {
  def this(concurrency: scala.Double) = this()
  def emitParallel(event: java.lang.String, args: js.Any*): js.Promise[js.Array[_]] = js.native
  def emitReduce(event: java.lang.String, args: js.Any*): js.Promise[_] = js.native
  def emitReduceRight(event: java.lang.String, args: js.Any*): js.Promise[_] = js.native
  def emitSerial(event: java.lang.String, args: js.Any*): js.Promise[js.Array[_]] = js.native
  def setConcurrency(): this.type = js.native
  def setConcurrency(max: scala.Double): this.type = js.native
  def subscribe(event: java.lang.String, listener: js.Function1[/* repeated */js.Any, scala.Unit]): js.Function0[scala.Unit] = js.native
  def subscribe(
    event: java.lang.String,
    listener: js.Function1[/* repeated */js.Any, scala.Unit],
    once: scala.Boolean
  ): js.Function0[scala.Unit] = js.native
}

