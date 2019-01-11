package typings
package adoneLib.adoneNs.dataNs.base32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.base32")
@js.native
object ^ extends js.Object {
  val base32hex: adoneLib.adoneNs.dataNs.base32Ns.INs.Spec = js.native
  val crockford: adoneLib.adoneNs.dataNs.base32Ns.INs.Spec = js.native
  val rfc4648: adoneLib.adoneNs.dataNs.base32Ns.INs.Spec = js.native
  def charmap[T](alphabet: java.lang.String): T = js.native
  def charmap[T](alphabet: java.lang.String, mappings: T): T = js.native
  def decode(str: java.lang.String): nodeLib.Buffer = js.native
  def decode(str: java.lang.String, options: adoneLib.adoneNs.dataNs.base32Ns.INs.DecoderOptions): nodeLib.Buffer = js.native
  def encode(buf: nodeLib.Buffer): java.lang.String = js.native
  def encode(buf: nodeLib.Buffer, options: adoneLib.adoneNs.dataNs.base32Ns.INs.EncoderOptions): java.lang.String = js.native
}

