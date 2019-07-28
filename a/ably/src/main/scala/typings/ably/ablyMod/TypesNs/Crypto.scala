package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crypto extends js.Object {
  def generateRandomKey(callback: js.Function2[/* error */ ErrorInfo, /* key */ String, Unit]): Unit
}

object Crypto {
  @scala.inline
  def apply(generateRandomKey: js.Function2[/* error */ ErrorInfo, /* key */ String, Unit] => Unit): Crypto = {
    val __obj = js.Dynamic.literal(generateRandomKey = js.Any.fromFunction1(generateRandomKey))
  
    __obj.asInstanceOf[Crypto]
  }
}

