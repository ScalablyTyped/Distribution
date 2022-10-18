package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCliTokenResponse extends StObject {
  
  /**
    * An Airflow CLI login token.
    */
  var CliToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The Airflow web server hostname for the environment.
    */
  var WebServerHostname: js.UndefOr[Hostname] = js.undefined
}
object CreateCliTokenResponse {
  
  inline def apply(): CreateCliTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCliTokenResponse]
  }
  
  extension [Self <: CreateCliTokenResponse](x: Self) {
    
    inline def setCliToken(value: Token): Self = StObject.set(x, "CliToken", value.asInstanceOf[js.Any])
    
    inline def setCliTokenUndefined: Self = StObject.set(x, "CliToken", js.undefined)
    
    inline def setWebServerHostname(value: Hostname): Self = StObject.set(x, "WebServerHostname", value.asInstanceOf[js.Any])
    
    inline def setWebServerHostnameUndefined: Self = StObject.set(x, "WebServerHostname", js.undefined)
  }
}
