package typings.arangodb

import typings.arangodb.ArangoDB.HashAlgorithm
import typings.arangodb.Foxx.SessionTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foxxSessionsTransportsCookieMod {
  
  inline def apply(): SessionTransport = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[SessionTransport]
  inline def apply(name: String): SessionTransport = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[SessionTransport]
  inline def apply(options: CookieTransportOptions): SessionTransport = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[SessionTransport]
  
  @JSImport("@arangodb/foxx/sessions/transports/cookie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CookieTransportOptions extends StObject {
    
    var algorithm: js.UndefOr[HashAlgorithm] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var httpOnly: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var secret: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[String] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object CookieTransportOptions {
    
    inline def apply(): CookieTransportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieTransportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CookieTransportOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: HashAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setHttpOnly(value: String): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      inline def setSecure(value: String): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
