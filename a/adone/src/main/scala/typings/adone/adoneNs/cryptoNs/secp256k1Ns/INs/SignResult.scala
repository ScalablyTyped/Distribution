package typings.adone.adoneNs.cryptoNs.secp256k1Ns.INs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignResult extends js.Object {
  var recovery: Double
  var signature: Buffer
}

object SignResult {
  @scala.inline
  def apply(recovery: Double, signature: Buffer): SignResult = {
    val __obj = js.Dynamic.literal(recovery = recovery, signature = signature)
  
    __obj.asInstanceOf[SignResult]
  }
}

