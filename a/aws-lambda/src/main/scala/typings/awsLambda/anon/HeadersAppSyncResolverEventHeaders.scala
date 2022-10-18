package typings.awsLambda.anon

import typings.awsLambda.triggerAppsyncResolverMod.AppSyncResolverEventHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersAppSyncResolverEventHeaders extends StObject {
  
  var headers: AppSyncResolverEventHeaders
}
object HeadersAppSyncResolverEventHeaders {
  
  inline def apply(headers: AppSyncResolverEventHeaders): HeadersAppSyncResolverEventHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersAppSyncResolverEventHeaders]
  }
  
  extension [Self <: HeadersAppSyncResolverEventHeaders](x: Self) {
    
    inline def setHeaders(value: AppSyncResolverEventHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
