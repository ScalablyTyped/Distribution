package typings.awsLambda.anon

import typings.awsLambda.triggerAppsyncResolverMod.AppSyncResolverEventHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainName extends StObject {
  
  /** The API's custom domain if used for the request. */
  var domainName: String | Null
  
  var headers: AppSyncResolverEventHeaders
}
object DomainName {
  
  inline def apply(headers: AppSyncResolverEventHeaders): DomainName = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], domainName = null)
    __obj.asInstanceOf[DomainName]
  }
  
  extension [Self <: DomainName](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setHeaders(value: AppSyncResolverEventHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
