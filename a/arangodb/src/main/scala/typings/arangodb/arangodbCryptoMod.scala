package typings.arangodb

import typings.arangodb.ArangoDB.HashAlgorithm
import typings.arangodb.ArangoDB.JwtAlgorithm
import typings.arangodb.arangodbStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@arangodb/crypto", JSImport.Namespace)
@js.native
object arangodbCryptoMod extends js.Object {
  
  def checkAndMarkNonce(nonce: String): Unit = js.native
  
  def constantEquals(a: String, b: String): Boolean = js.native
  
  def createNonce(): String = js.native
  
  def genRandomAlphaNumbers(length: Double): String = js.native
  
  def genRandomNumbers(length: Double): String = js.native
  
  def genRandomSalt(length: Double): String = js.native
  
  def hmac(key: String, message: String, algorithm: HashAlgorithm): String = js.native
  
  def jwtDecode(key: String, token: String): js.Object | Null = js.native
  def jwtDecode(key: String, token: String, noVerify: Boolean): js.Object | Null = js.native
  def jwtDecode(key: Null, token: String): js.Object | Null = js.native
  def jwtDecode(key: Null, token: String, noVerify: Boolean): js.Object | Null = js.native
  
  def jwtEncode(key: String, message: String, algorithm: JwtAlgorithm): String = js.native
  @JSName("jwtEncode")
  def jwtEncode_none(key: Null, message: String, algorithm: none): String = js.native
  
  def md5(message: String): String = js.native
  
  def pbkdf2(salt: String, password: String, iterations: Double, keyLength: Double): String = js.native
  
  def rand(): Double = js.native
  
  def sha1(message: String): String = js.native
  
  def sha224(message: String): String = js.native
  
  def sha256(message: String): String = js.native
  
  def sha384(message: String): String = js.native
  
  def sha512(message: String): String = js.native
}
