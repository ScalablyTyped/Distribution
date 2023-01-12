package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationConfiguration extends StObject {
  
  /**
    * The list of configuration information that's required to connect to and crawl a website host using basic authentication credentials. The list includes the name and port number of the website host.
    */
  var BasicAuthentication: js.UndefOr[BasicAuthenticationConfigurationList] = js.undefined
}
object AuthenticationConfiguration {
  
  inline def apply(): AuthenticationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBasicAuthentication(value: BasicAuthenticationConfigurationList): Self = StObject.set(x, "BasicAuthentication", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthenticationUndefined: Self = StObject.set(x, "BasicAuthentication", js.undefined)
    
    inline def setBasicAuthenticationVarargs(value: BasicAuthenticationConfiguration*): Self = StObject.set(x, "BasicAuthentication", js.Array(value*))
  }
}
