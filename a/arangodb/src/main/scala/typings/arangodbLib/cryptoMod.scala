package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/crypto", JSImport.Namespace)
@js.native
object cryptoMod extends js.Object {
  def checkAndMarkNonce(nonce: java.lang.String): scala.Unit = js.native
  def constantEquals(a: java.lang.String, b: java.lang.String): scala.Boolean = js.native
  def createNonce(): java.lang.String = js.native
  def genRandomAlphaNumbers(length: scala.Double): java.lang.String = js.native
  def genRandomNumbers(length: scala.Double): java.lang.String = js.native
  def genRandomSalt(length: scala.Double): java.lang.String = js.native
  def hmac(key: java.lang.String, message: java.lang.String, algorithm: arangodbLib.ArangoDBNs.HashAlgorithm): java.lang.String = js.native
  def jwtDecode(key: java.lang.String, token: java.lang.String): js.Object | scala.Null = js.native
  def jwtDecode(key: java.lang.String, token: java.lang.String, noVerify: scala.Boolean): js.Object | scala.Null = js.native
  def jwtDecode(key: scala.Null, token: java.lang.String): js.Object | scala.Null = js.native
  def jwtDecode(key: scala.Null, token: java.lang.String, noVerify: scala.Boolean): js.Object | scala.Null = js.native
  def jwtEncode(key: java.lang.String, message: java.lang.String, algorithm: arangodbLib.ArangoDBNs.JwtAlgorithm): java.lang.String = js.native
  @JSName("jwtEncode")
  def jwtEncode_none(key: scala.Null, message: java.lang.String, algorithm: arangodbLib.arangodbLibStrings.none): java.lang.String = js.native
  def md5(message: java.lang.String): java.lang.String = js.native
  def pbkdf2(
    salt: java.lang.String,
    password: java.lang.String,
    iterations: scala.Double,
    keyLength: scala.Double
  ): java.lang.String = js.native
  def rand(): scala.Double = js.native
  def sha1(message: java.lang.String): java.lang.String = js.native
  def sha224(message: java.lang.String): java.lang.String = js.native
  def sha256(message: java.lang.String): java.lang.String = js.native
  def sha384(message: java.lang.String): java.lang.String = js.native
  def sha512(message: java.lang.String): java.lang.String = js.native
}

