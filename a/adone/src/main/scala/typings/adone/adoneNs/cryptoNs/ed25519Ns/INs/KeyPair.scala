package typings.adone.adoneNs.cryptoNs.ed25519Ns.INs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  var privateKey: Buffer
  var publicKey: Buffer
}

object KeyPair {
  @scala.inline
  def apply(privateKey: Buffer, publicKey: Buffer): KeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[KeyPair]
  }
}

