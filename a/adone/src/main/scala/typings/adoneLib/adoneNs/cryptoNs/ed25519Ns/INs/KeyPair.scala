package typings
package adoneLib.adoneNs.cryptoNs.ed25519Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  var privateKey: nodeLib.Buffer
  var publicKey: nodeLib.Buffer
}

object KeyPair {
  @scala.inline
  def apply(privateKey: nodeLib.Buffer, publicKey: nodeLib.Buffer): KeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[KeyPair]
  }
}

