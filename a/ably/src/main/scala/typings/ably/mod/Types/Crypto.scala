package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crypto extends js.Object {
  def generateRandomKey(callback: js.Function2[/* error */ ErrorInfo, /* key */ String, Unit]): Unit = js.native
}

object Crypto {
  @scala.inline
  def apply(generateRandomKey: js.Function2[/* error */ ErrorInfo, /* key */ String, Unit] => Unit): Crypto = {
    val __obj = js.Dynamic.literal(generateRandomKey = js.Any.fromFunction1(generateRandomKey))
    __obj.asInstanceOf[Crypto]
  }
  @scala.inline
  implicit class CryptoOps[Self <: Crypto] (val x: Self) extends AnyVal {
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
    def setGenerateRandomKey(value: js.Function2[/* error */ ErrorInfo, /* key */ String, Unit] => Unit): Self = this.set("generateRandomKey", js.Any.fromFunction1(value))
  }
  
}

