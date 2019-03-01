package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphabetBase32 extends js.Object {
  val INs: js.Any
  val base32Ns: Anon_Alphabet
  val base58: adoneLib.adoneNs.dataNs.INs.BaseX
  /**
    * Base64 encoder
    */
  val base64Ns: Anon_C
  val base64urlNs: Anon_DecodeEncode
  /**
    * BSON encoder
    */
  val bsonNs: Anon_ArgsBSON
  /**
    * JSON5 encoder
    */
  val json5Ns: Anon_BufDecodeEncode
  /**
    * JSON encoder
    */
  val jsonNs: Anon_BufDecode
  /**
    * MessagePack encoder
    */
  val mpakNs: Anon_BufDecodeDecoder
  val protobufNs: Anon_CreateOpts
  val varintNs: Anon_BufDecodeEncodeEncodingLength
  val varintSignedNs: Anon_BufDecodeEncodeEncodingLength
  /**
    * YAML encoder
    */
  val yamlNs: Anon_BufBuffer
  def basex(alphabet: java.lang.String): adoneLib.adoneNs.dataNs.INs.BaseX
}

object Anon_AlphabetBase32 {
  @scala.inline
  def apply(
    INs: js.Any,
    base32Ns: Anon_Alphabet,
    base58: adoneLib.adoneNs.dataNs.INs.BaseX,
    base64Ns: Anon_C,
    base64urlNs: Anon_DecodeEncode,
    basex: js.Function1[java.lang.String, adoneLib.adoneNs.dataNs.INs.BaseX],
    bsonNs: Anon_ArgsBSON,
    json5Ns: Anon_BufDecodeEncode,
    jsonNs: Anon_BufDecode,
    mpakNs: Anon_BufDecodeDecoder,
    protobufNs: Anon_CreateOpts,
    varintNs: Anon_BufDecodeEncodeEncodingLength,
    varintSignedNs: Anon_BufDecodeEncodeEncodingLength,
    yamlNs: Anon_BufBuffer
  ): Anon_AlphabetBase32 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("INs")(INs)
    __obj.updateDynamic("base32Ns")(base32Ns)
    __obj.updateDynamic("base58")(base58)
    __obj.updateDynamic("base64Ns")(base64Ns)
    __obj.updateDynamic("base64urlNs")(base64urlNs)
    __obj.updateDynamic("basex")(basex)
    __obj.updateDynamic("bsonNs")(bsonNs)
    __obj.updateDynamic("json5Ns")(json5Ns)
    __obj.updateDynamic("jsonNs")(jsonNs)
    __obj.updateDynamic("mpakNs")(mpakNs)
    __obj.updateDynamic("protobufNs")(protobufNs)
    __obj.updateDynamic("varintNs")(varintNs)
    __obj.updateDynamic("varintSignedNs")(varintSignedNs)
    __obj.updateDynamic("yamlNs")(yamlNs)
    __obj.asInstanceOf[Anon_AlphabetBase32]
  }
}

