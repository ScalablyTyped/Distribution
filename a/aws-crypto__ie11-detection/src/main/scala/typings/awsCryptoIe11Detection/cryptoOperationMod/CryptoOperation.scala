package typings.awsCryptoIe11Detection.cryptoOperationMod

import typings.awsCryptoIe11Detection.keyMod.Key
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoOperation extends js.Object {
  val algorithm: String = js.native
  val key: Key = js.native
  val result: js.UndefOr[ArrayBuffer] = js.native
  def abort(): Unit = js.native
  def finish(): Unit = js.native
  def onabort(event: Event): Unit = js.native
  def oncomplete(event: Event): Unit = js.native
  def onerror(event: Event): Unit = js.native
  def onprogress(event: Event): Unit = js.native
  def process(buffer: ArrayBufferView): Unit = js.native
}

object CryptoOperation {
  @scala.inline
  def apply(
    abort: () => Unit,
    algorithm: String,
    finish: () => Unit,
    key: Key,
    onabort: Event => Unit,
    oncomplete: Event => Unit,
    onerror: Event => Unit,
    onprogress: Event => Unit,
    process: ArrayBufferView => Unit
  ): CryptoOperation = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), algorithm = algorithm.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), key = key.asInstanceOf[js.Any], onabort = js.Any.fromFunction1(onabort), oncomplete = js.Any.fromFunction1(oncomplete), onerror = js.Any.fromFunction1(onerror), onprogress = js.Any.fromFunction1(onprogress), process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[CryptoOperation]
  }
  @scala.inline
  implicit class CryptoOperationOps[Self <: CryptoOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinish(value: () => Unit): Self = this.set("finish", js.Any.fromFunction0(value))
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnabort(value: Event => Unit): Self = this.set("onabort", js.Any.fromFunction1(value))
    @scala.inline
    def setOncomplete(value: Event => Unit): Self = this.set("oncomplete", js.Any.fromFunction1(value))
    @scala.inline
    def setOnerror(value: Event => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    @scala.inline
    def setOnprogress(value: Event => Unit): Self = this.set("onprogress", js.Any.fromFunction1(value))
    @scala.inline
    def setProcess(value: ArrayBufferView => Unit): Self = this.set("process", js.Any.fromFunction1(value))
    @scala.inline
    def setResult(value: ArrayBuffer): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

