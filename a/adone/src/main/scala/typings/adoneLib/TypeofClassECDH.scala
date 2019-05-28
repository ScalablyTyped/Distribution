package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassECDH
  extends org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.cryptoNs.ECDH] {
  def convertKey(key: nodeLib.cryptoMod.BinaryLike, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.base64,
    format: adoneLib.adoneLibStrings.compressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.base64,
    format: adoneLib.adoneLibStrings.hybrid
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.base64,
    format: adoneLib.adoneLibStrings.uncompressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.hex,
    format: adoneLib.adoneLibStrings.compressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.hex,
    format: adoneLib.adoneLibStrings.hybrid
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.hex,
    format: adoneLib.adoneLibStrings.uncompressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.latin1,
    format: adoneLib.adoneLibStrings.compressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.latin1,
    format: adoneLib.adoneLibStrings.hybrid
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.latin1,
    format: adoneLib.adoneLibStrings.uncompressed
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_base64(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.base64
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_hex(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.hex
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_latin1(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: adoneLib.adoneLibStrings.latin1
  ): nodeLib.Buffer | java.lang.String = js.native
}

