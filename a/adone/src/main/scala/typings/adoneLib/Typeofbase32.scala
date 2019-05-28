package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofbase32 extends js.Object {
  var Decoder: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ adoneLib.adoneNs.dataNs.base32Ns.INs.DecoderOptions], 
    adoneLib.adoneNs.dataNs.base32Ns.Decoder
  ] = js.native
  var Encoder: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ adoneLib.adoneNs.dataNs.base32Ns.INs.EncoderOptions], 
    adoneLib.adoneNs.dataNs.base32Ns.Encoder
  ] = js.native
  val INs: js.Any = js.native
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

