package typings.arangodb

import typings.arangodb.ArangoDB.HashAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  @JSImport("@arangodb/foxx/auth", JSImport.Namespace)
  @js.native
  def apply(): Authenticator = js.native
  @JSImport("@arangodb/foxx/auth", JSImport.Namespace)
  @js.native
  def apply(options: AuthOptions): Authenticator = js.native
  
  @js.native
  trait AuthData extends StObject {
    
    var hash: String = js.native
    
    var method: String = js.native
    
    var salt: String = js.native
  }
  object AuthData {
    
    @scala.inline
    def apply(hash: String, method: String, salt: String): AuthData = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthData]
    }
    
    @scala.inline
    implicit class AuthDataMutableBuilder[Self <: AuthData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthOptions extends StObject {
    
    var method: js.UndefOr[HashAlgorithm] = js.native
    
    var saltLength: js.UndefOr[Double] = js.native
  }
  object AuthOptions {
    
    @scala.inline
    def apply(): AuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthOptions]
    }
    
    @scala.inline
    implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: HashAlgorithm): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
    }
  }
  
  @js.native
  trait Authenticator extends StObject {
    
    def create(password: String): AuthData = js.native
    
    def verify(): Boolean = js.native
    def verify(hash: js.UndefOr[scala.Nothing], password: String): Boolean = js.native
    def verify(hash: AuthData): Boolean = js.native
    def verify(hash: AuthData, password: String): Boolean = js.native
  }
}
