package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asn1 extends js.Object {
  val asn1Ns: Anon_Any
  val ed25519Ns: Anon_GenerateKeyPair
  val secp256k1Ns: Anon_Compressed
}

object Anon_Asn1 {
  @scala.inline
  def apply(asn1Ns: Anon_Any, ed25519Ns: Anon_GenerateKeyPair, secp256k1Ns: Anon_Compressed): Anon_Asn1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asn1Ns")(asn1Ns)
    __obj.updateDynamic("ed25519Ns")(ed25519Ns)
    __obj.updateDynamic("secp256k1Ns")(secp256k1Ns)
    __obj.asInstanceOf[Anon_Asn1]
  }
}

