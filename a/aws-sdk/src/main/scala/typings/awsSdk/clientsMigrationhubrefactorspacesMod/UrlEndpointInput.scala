package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlEndpointInput extends StObject {
  
  /**
    * The health check URL of the URL endpoint type. If the URL is a public endpoint, the HealthUrl must also be a public endpoint. If the URL is a private endpoint inside a virtual private cloud (VPC), the health URL must also be a private endpoint, and the host must be the same as the URL. 
    */
  var HealthUrl: js.UndefOr[Uri] = js.undefined
  
  /**
    * The URL to route traffic to. The URL must be an rfc3986-formatted URL. If the host is a domain name, the name must be resolvable over the public internet. If the scheme is https, the top level domain of the host must be listed in the IANA root zone database. 
    */
  var Url: Uri
}
object UrlEndpointInput {
  
  inline def apply(Url: Uri): UrlEndpointInput = {
    val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlEndpointInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlEndpointInput] (val x: Self) extends AnyVal {
    
    inline def setHealthUrl(value: Uri): Self = StObject.set(x, "HealthUrl", value.asInstanceOf[js.Any])
    
    inline def setHealthUrlUndefined: Self = StObject.set(x, "HealthUrl", js.undefined)
    
    inline def setUrl(value: Uri): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
