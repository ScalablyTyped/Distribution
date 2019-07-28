package typings.adone

import typings.adone.adoneNs.cryptoNs.ed25519Ns.INs.KeyPair
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofed25519 extends js.Object {
  val INs: js.Any = js.native
  val privateKeyLength: Double = js.native
  val publicKeyLength: Double = js.native
  def generateKeyPair(seed: Buffer): KeyPair = js.native
  def sign(message: Buffer, seed: KeyPair): Buffer = js.native
  def sign(message: Buffer, seed: Buffer): Buffer = js.native
  def verify(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = js.native
}

