package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdata extends js.Object {
  val INs: js.Any
  val base32Ns: Typeofbase32
  val base58: adoneLib.adoneNs.dataNs.INs.BaseX
  /**
    * Base64 encoder
    */
  val base64Ns: Typeofbase64
  val base64urlNs: Typeofbase64url
  /**
    * BSON encoder
    */
  val bsonNs: Typeofbson
  /**
    * JSON5 encoder
    */
  val json5Ns: Typeofjson5
  /**
    * JSON encoder
    */
  val jsonNs: Typeofjson
  /**
    * MessagePack encoder
    */
  val mpakNs: Typeofmpak
  val protobufNs: Typeofprotobuf
  val varintNs: Typeofvarint
  val varintSignedNs: TypeofvarintSigned
  /**
    * YAML encoder
    */
  val yamlNs: Typeofyaml
  def basex(alphabet: java.lang.String): adoneLib.adoneNs.dataNs.INs.BaseX
}

object Typeofdata {
  @scala.inline
  def apply(
    INs: js.Any,
    base32Ns: Typeofbase32,
    base58: adoneLib.adoneNs.dataNs.INs.BaseX,
    base64Ns: Typeofbase64,
    base64urlNs: Typeofbase64url,
    basex: java.lang.String => adoneLib.adoneNs.dataNs.INs.BaseX,
    bsonNs: Typeofbson,
    json5Ns: Typeofjson5,
    jsonNs: Typeofjson,
    mpakNs: Typeofmpak,
    protobufNs: Typeofprotobuf,
    varintNs: Typeofvarint,
    varintSignedNs: TypeofvarintSigned,
    yamlNs: Typeofyaml
  ): Typeofdata = {
    val __obj = js.Dynamic.literal(INs = INs, base32Ns = base32Ns, base58 = base58, base64Ns = base64Ns, base64urlNs = base64urlNs, basex = js.Any.fromFunction1(basex), bsonNs = bsonNs, json5Ns = json5Ns, jsonNs = jsonNs, mpakNs = mpakNs, protobufNs = protobufNs, varintNs = varintNs, varintSignedNs = varintSignedNs, yamlNs = yamlNs)
  
    __obj.asInstanceOf[Typeofdata]
  }
}

