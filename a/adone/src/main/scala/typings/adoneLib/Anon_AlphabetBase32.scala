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

