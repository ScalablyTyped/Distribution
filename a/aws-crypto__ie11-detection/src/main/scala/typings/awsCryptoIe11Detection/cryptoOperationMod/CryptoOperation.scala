package typings.awsCryptoIe11Detection.cryptoOperationMod

import typings.awsCryptoIe11Detection.keyMod.Key
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoOperation extends js.Object {
  val algorithm: String
  val key: Key
  val result: js.UndefOr[ArrayBuffer] = js.undefined
  def abort(): Unit
  def finish(): Unit
  def onabort(event: Event_): Unit
  def oncomplete(event: Event_): Unit
  def onerror(event: Event_): Unit
  def onprogress(event: Event_): Unit
  def process(buffer: ArrayBufferView): Unit
}

object CryptoOperation {
  @scala.inline
  def apply(
    abort: () => Unit,
    algorithm: String,
    finish: () => Unit,
    key: Key,
    onabort: Event_ => Unit,
    oncomplete: Event_ => Unit,
    onerror: Event_ => Unit,
    onprogress: Event_ => Unit,
    process: ArrayBufferView => Unit,
    result: ArrayBuffer = null
  ): CryptoOperation = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), algorithm = algorithm.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), key = key.asInstanceOf[js.Any], onabort = js.Any.fromFunction1(onabort), oncomplete = js.Any.fromFunction1(oncomplete), onerror = js.Any.fromFunction1(onerror), onprogress = js.Any.fromFunction1(onprogress), process = js.Any.fromFunction1(process))
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoOperation]
  }
}

