package typings.arangodb

import typings.arangodb.ArangoDB.HashAlgorithm
import typings.arangodb.Foxx.SessionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cookieMod {
  
  @JSImport("@arangodb/foxx/sessions/transports/cookie", JSImport.Namespace)
  @js.native
  def apply(): SessionTransport = js.native
  @JSImport("@arangodb/foxx/sessions/transports/cookie", JSImport.Namespace)
  @js.native
  def apply(name: String): SessionTransport = js.native
  @JSImport("@arangodb/foxx/sessions/transports/cookie", JSImport.Namespace)
  @js.native
  def apply(options: CookieTransportOptions): SessionTransport = js.native
  
  @js.native
  trait CookieTransportOptions extends StObject {
    
    var algorithm: js.UndefOr[HashAlgorithm] = js.native
    
    var domain: js.UndefOr[String] = js.native
    
    var httpOnly: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var secret: js.UndefOr[String] = js.native
    
    var secure: js.UndefOr[String] = js.native
    
    var ttl: js.UndefOr[Double] = js.native
  }
  object CookieTransportOptions {
    
    @scala.inline
    def apply(): CookieTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieTransportOptions]
    }
    
    @scala.inline
    implicit class CookieTransportOptionsMutableBuilder[Self <: CookieTransportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: HashAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setHttpOnly(value: String): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setSecure(value: String): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
