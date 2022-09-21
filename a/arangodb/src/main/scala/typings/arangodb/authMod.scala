package typings.arangodb

import typings.arangodb.ArangoDB.HashAlgorithm
import typings.arangodb.arangodbStrings.pbkdf2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  inline def apply(): Authenticator = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Authenticator]
  inline def apply(options: AuthOptions): Authenticator = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  inline def apply(options: Pbkdf2AuthOptions): Authenticator = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Authenticator]
  
  @JSImport("@arangodb/foxx/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AuthData extends StObject {
    
    var hash: String
    
    var iter: js.UndefOr[Double] = js.undefined
    
    var method: String
    
    var salt: String
  }
  object AuthData {
    
    inline def apply(hash: String, method: String, salt: String): AuthData = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthData]
    }
    
    extension [Self <: AuthData](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setIter(value: Double): Self = StObject.set(x, "iter", value.asInstanceOf[js.Any])
      
      inline def setIterUndefined: Self = StObject.set(x, "iter", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthOptions extends StObject {
    
    var method: js.UndefOr[HashAlgorithm] = js.undefined
    
    var saltLength: js.UndefOr[Double] = js.undefined
  }
  object AuthOptions {
    
    inline def apply(): AuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthOptions]
    }
    
    extension [Self <: AuthOptions](x: Self) {
      
      inline def setMethod(value: HashAlgorithm): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
    }
  }
  
  @js.native
  trait Authenticator extends StObject {
    
    def create(password: String): AuthData = js.native
    
    def verify(): Boolean = js.native
    def verify(hash: Unit, password: String): Boolean = js.native
    def verify(hash: AuthData): Boolean = js.native
    def verify(hash: AuthData, password: String): Boolean = js.native
  }
  
  trait Pbkdf2AuthOptions extends StObject {
    
    var method: pbkdf2
    
    var saltLength: js.UndefOr[Double] = js.undefined
    
    var workFactor: js.UndefOr[Double] = js.undefined
  }
  object Pbkdf2AuthOptions {
    
    inline def apply(): Pbkdf2AuthOptions = {
      val __obj = js.Dynamic.literal(method = "pbkdf2")
      __obj.asInstanceOf[Pbkdf2AuthOptions]
    }
    
    extension [Self <: Pbkdf2AuthOptions](x: Self) {
      
      inline def setMethod(value: pbkdf2): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
      
      inline def setWorkFactor(value: Double): Self = StObject.set(x, "workFactor", value.asInstanceOf[js.Any])
      
      inline def setWorkFactorUndefined: Self = StObject.set(x, "workFactor", js.undefined)
    }
  }
}
