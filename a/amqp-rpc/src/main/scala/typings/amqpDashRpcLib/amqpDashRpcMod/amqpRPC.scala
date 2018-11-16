package typings
package amqpDashRpcLib.amqpDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amqp-rpc", "amqpRPC")
@js.native
class amqpRPC () extends js.Object {
  def this(opt: Options) = this()
  def call[T](cmd: java.lang.String, params: T): java.lang.String = js.native
  def call[T](cmd: java.lang.String, params: T, cb: Callback): java.lang.String = js.native
  def call[T](cmd: java.lang.String, params: T, cb: Callback, context: js.Any): java.lang.String = js.native
  def call[T](cmd: java.lang.String, params: T, cb: Callback, context: js.Any, options: CallOptions): java.lang.String = js.native
  def callBroadcast[T](cmd: java.lang.String, params: T): scala.Unit = js.native
  def callBroadcast[T](cmd: java.lang.String, params: T, options: BroadcastOptions): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def generateQueueName(`type`: java.lang.String): java.lang.String = js.native
  def off(cmd: java.lang.String): scala.Boolean = js.native
  def offBroadcast(cmd: java.lang.String): scala.Boolean = js.native
  def on[T](
    cmd: java.lang.String,
    cb: js.Function3[
      /* param */ js.UndefOr[T], 
      /* cb */ js.UndefOr[Callback], 
      /* info */ js.UndefOr[CommandInfo], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def on[T](
    cmd: java.lang.String,
    cb: js.Function3[
      /* param */ js.UndefOr[T], 
      /* cb */ js.UndefOr[Callback], 
      /* info */ js.UndefOr[CommandInfo], 
      scala.Unit
    ],
    context: js.Any
  ): scala.Boolean = js.native
  def on[T](
    cmd: java.lang.String,
    cb: js.Function3[
      /* param */ js.UndefOr[T], 
      /* cb */ js.UndefOr[Callback], 
      /* info */ js.UndefOr[CommandInfo], 
      scala.Unit
    ],
    context: js.Any,
    options: HandlerOptions
  ): scala.Boolean = js.native
  def onBroadcast[T](cmd: java.lang.String): scala.Boolean = js.native
  def onBroadcast[T](
    cmd: java.lang.String,
    cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], scala.Unit]
  ): scala.Boolean = js.native
  def onBroadcast[T](
    cmd: java.lang.String,
    cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], scala.Unit],
    context: js.Any
  ): scala.Boolean = js.native
  def onBroadcast[T](
    cmd: java.lang.String,
    cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], scala.Unit],
    context: js.Any,
    options: js.Any
  ): scala.Boolean = js.native
}

