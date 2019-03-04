package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crypto extends js.Object {
  def generateRandomKey(callback: js.Function2[/* error */ ErrorInfo, /* key */ java.lang.String, scala.Unit]): scala.Unit
}

object Crypto {
  @scala.inline
  def apply(
    generateRandomKey: js.Function1[
      js.Function2[/* error */ ErrorInfo, /* key */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ): Crypto = {
    val __obj = js.Dynamic.literal(generateRandomKey = generateRandomKey)
  
    __obj.asInstanceOf[Crypto]
  }
}

