package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofed25519 extends js.Object {
  val INs: js.Any = js.native
  val privateKeyLength: scala.Double = js.native
  val publicKeyLength: scala.Double = js.native
  def generateKeyPair(seed: nodeLib.Buffer): adoneLib.adoneNs.cryptoNs.ed25519Ns.INs.KeyPair = js.native
  def sign(message: nodeLib.Buffer, seed: adoneLib.adoneNs.cryptoNs.ed25519Ns.INs.KeyPair): nodeLib.Buffer = js.native
  def sign(message: nodeLib.Buffer, seed: nodeLib.Buffer): nodeLib.Buffer = js.native
  def verify(message: nodeLib.Buffer, signature: nodeLib.Buffer, publicKey: nodeLib.Buffer): scala.Boolean = js.native
}

