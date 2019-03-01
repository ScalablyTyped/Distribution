package typings
package adoneLib.adoneNs.cryptoNs.secp256k1Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignResult extends js.Object {
  var recovery: scala.Double
  var signature: nodeLib.Buffer
}

object SignResult {
  @scala.inline
  def apply(recovery: scala.Double, signature: nodeLib.Buffer): SignResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("recovery")(recovery)
    __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[SignResult]
  }
}

