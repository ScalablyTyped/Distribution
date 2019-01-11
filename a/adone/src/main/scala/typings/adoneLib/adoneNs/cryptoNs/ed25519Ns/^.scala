package typings
package adoneLib.adoneNs.cryptoNs.ed25519Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.ed25519")
@js.native
object ^ extends js.Object {
  val privateKeyLength: scala.Double = js.native
  val publicKeyLength: scala.Double = js.native
  def generateKeyPair(seed: nodeLib.Buffer): adoneLib.adoneNs.cryptoNs.ed25519Ns.INs.KeyPair = js.native
  def sign(message: nodeLib.Buffer, seed: adoneLib.adoneNs.cryptoNs.ed25519Ns.INs.KeyPair): nodeLib.Buffer = js.native
  def sign(message: nodeLib.Buffer, seed: nodeLib.Buffer): nodeLib.Buffer = js.native
  def verify(message: nodeLib.Buffer, signature: nodeLib.Buffer, publicKey: nodeLib.Buffer): scala.Boolean = js.native
}

