package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.adone.adoneNs.dataNs.base32Ns.INs.DecoderOptions
import typings.adone.adoneNs.dataNs.base32Ns.INs.EncoderOptions
import typings.adone.adoneNs.dataNs.base32Ns.INs.Spec
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofbase32 extends js.Object {
  var Decoder: Instantiable1[
    js.UndefOr[/* options */ DecoderOptions], 
    typings.adone.adoneNs.dataNs.base32Ns.Decoder
  ] = js.native
  var Encoder: Instantiable1[
    js.UndefOr[/* options */ EncoderOptions], 
    typings.adone.adoneNs.dataNs.base32Ns.Encoder
  ] = js.native
  val INs: js.Any = js.native
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

