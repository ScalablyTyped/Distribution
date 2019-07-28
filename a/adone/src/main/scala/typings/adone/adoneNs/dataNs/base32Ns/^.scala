package typings.adone.adoneNs.dataNs.base32Ns

import typings.adone.adoneNs.dataNs.base32Ns.INs.DecoderOptions
import typings.adone.adoneNs.dataNs.base32Ns.INs.EncoderOptions
import typings.adone.adoneNs.dataNs.base32Ns.INs.Spec
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.base32")
@js.native
object ^ extends js.Object {
  val base32hex: Spec = js.native
  val crockford: Spec = js.native
  val rfc4648: Spec = js.native
  def charmap[T](alphabet: String): T = js.native
  def charmap[T](alphabet: String, mappings: T): T = js.native
  def decode(str: String): Buffer = js.native
  def decode(str: String, options: DecoderOptions): Buffer = js.native
  def encode(buf: Buffer): String = js.native
  def encode(buf: Buffer, options: EncoderOptions): String = js.native
}

