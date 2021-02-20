package typings.arangodb

import typings.arangodb.ArangoDB.HashAlgorithm
import typings.arangodb.ArangoDB.JwtAlgorithm
import typings.arangodb.arangodbStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arangodbCryptoMod {
  
  @JSImport("@arangodb/crypto", "checkAndMarkNonce")
  @js.native
  def checkAndMarkNonce(nonce: String): Unit = js.native
  
  @JSImport("@arangodb/crypto", "constantEquals")
  @js.native
  def constantEquals(a: String, b: String): Boolean = js.native
  
  @JSImport("@arangodb/crypto", "createNonce")
  @js.native
  def createNonce(): String = js.native
  
  @JSImport("@arangodb/crypto", "genRandomAlphaNumbers")
  @js.native
  def genRandomAlphaNumbers(length: Double): String = js.native
  
  @JSImport("@arangodb/crypto", "genRandomNumbers")
  @js.native
  def genRandomNumbers(length: Double): String = js.native
  
  @JSImport("@arangodb/crypto", "genRandomSalt")
  @js.native
  def genRandomSalt(length: Double): String = js.native
  
  @JSImport("@arangodb/crypto", "hmac")
  @js.native
  def hmac(key: String, message: String, algorithm: HashAlgorithm): String = js.native
  
  @JSImport("@arangodb/crypto", "jwtDecode")
  @js.native
  def jwtDecode(key: String, token: String): js.Object | Null = js.native
  @JSImport("@arangodb/crypto", "jwtDecode")
  @js.native
  def jwtDecode(key: String, token: String, noVerify: Boolean): js.Object | Null = js.native
  @JSImport("@arangodb/crypto", "jwtDecode")
  @js.native
  def jwtDecode(key: Null, token: String): js.Object | Null = js.native
  @JSImport("@arangodb/crypto", "jwtDecode")
  @js.native
  def jwtDecode(key: Null, token: String, noVerify: Boolean): js.Object | Null = js.native
  
  @JSImport("@arangodb/crypto", "jwtEncode")
  @js.native
  def jwtEncode(key: String, message: String, algorithm: JwtAlgorithm): String = js.native
  @JSImport("@arangodb/crypto", "jwtEncode")
  @js.native
  def jwtEncode_none(key: Null, message: String, algorithm: none): String = js.native
  
  @JSImport("@arangodb/crypto", "md5")
  @js.native
  def md5(message: String): String = js.native
  
  @JSImport("@arangodb/crypto", "pbkdf2")
  @js.native
  def pbkdf2(salt: String, password: String, iterations: Double, keyLength: Double): String = js.native
  
  @JSImport("@arangodb/crypto", "rand")
  @js.native
  def rand(): Double = js.native
  
  @JSImport("@arangodb/crypto", "sha1")
  @js.native
  def sha1(message: String): String = js.native
  
  @JSImport("@arangodb/crypto", "sha224")
  @js.native
  def sha224(message: String): String = js.native
  
  @JSImport("@arangodb/crypto", "sha256")
  @js.native
  def sha256(message: String): String = js.native
  
  @JSImport("@arangodb/crypto", "sha384")
  @js.native
  def sha384(message: String): String = js.native
  
  @JSImport("@arangodb/crypto", "sha512")
  @js.native
  def sha512(message: String): String = js.native
}
