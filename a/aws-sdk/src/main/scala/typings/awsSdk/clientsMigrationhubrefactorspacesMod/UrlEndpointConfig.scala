package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlEndpointConfig extends StObject {
  
  /**
    * The health check URL of the URL endpoint type. 
    */
  var HealthUrl: js.UndefOr[Uri] = js.undefined
  
  /**
    * The HTTP URL endpoint. 
    */
  var Url: js.UndefOr[Uri] = js.undefined
}
object UrlEndpointConfig {
  
  inline def apply(): UrlEndpointConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlEndpointConfig]
  }
  
  extension [Self <: UrlEndpointConfig](x: Self) {
    
    inline def setHealthUrl(value: Uri): Self = StObject.set(x, "HealthUrl", value.asInstanceOf[js.Any])
    
    inline def setHealthUrlUndefined: Self = StObject.set(x, "HealthUrl", js.undefined)
    
    inline def setUrl(value: Uri): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
