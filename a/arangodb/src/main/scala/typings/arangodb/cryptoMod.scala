package typings.arangodb

import typings.arangodb.ArangoDB.HashAlgorithm
import typings.arangodb.ArangoDB.JwtAlgorithm
import typings.arangodb.arangodbStrings.none
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("@arangodb/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkAndMarkNonce(nonce: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkAndMarkNonce")(nonce.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def constantEquals(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("constantEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createNonce(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createNonce")().asInstanceOf[String]
  
  inline def genRandomAlphaNumbers(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genRandomAlphaNumbers")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def genRandomBytes(length: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("genRandomBytes")(length.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def genRandomNumbers(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genRandomNumbers")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def genRandomSalt(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genRandomSalt")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hmac(key: String, message: String, algorithm: HashAlgorithm): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def jwtDecode(key: String, token: String): js.Object | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecode")(key.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Object | Null]
  inline def jwtDecode(key: String, token: String, noVerify: Boolean): js.Object | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecode")(key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], noVerify.asInstanceOf[js.Any])).asInstanceOf[js.Object | Null]
  inline def jwtDecode(key: Null, token: String): js.Object | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecode")(key.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Object | Null]
  inline def jwtDecode(key: Null, token: String, noVerify: Boolean): js.Object | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtDecode")(key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], noVerify.asInstanceOf[js.Any])).asInstanceOf[js.Object | Null]
  
  inline def jwtEncode(key: String, message: String, algorithm: JwtAlgorithm): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtEncode")(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def jwtEncode_none(key: Null, message: String, algorithm: none): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jwtEncode")(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def md5(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("md5")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pbkdf2(salt: String, password: String, iterations: Double, keyLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(salt.asInstanceOf[js.Any], password.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keyLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def rand(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rand")().asInstanceOf[Double]
  
  inline def sha1(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sha224(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha224")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sha256(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sha384(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sha512(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def uuidv4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuidv4")().asInstanceOf[String]
}
