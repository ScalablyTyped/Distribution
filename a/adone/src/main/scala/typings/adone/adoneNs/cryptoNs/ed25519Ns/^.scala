package typings.adone.adoneNs.cryptoNs.ed25519Ns

import typings.adone.adoneNs.cryptoNs.ed25519Ns.INs.KeyPair
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.ed25519")
@js.native
object ^ extends js.Object {
  val privateKeyLength: Double = js.native
  val publicKeyLength: Double = js.native
  def generateKeyPair(seed: Buffer): KeyPair = js.native
  def sign(message: Buffer, seed: KeyPair): Buffer = js.native
  def sign(message: Buffer, seed: Buffer): Buffer = js.native
  def verify(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = js.native
}

