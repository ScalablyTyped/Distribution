package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// responseProvider
trait ResponseProviderRequest
  extends StObject
     with Request
     with ReadsHeaders
object ResponseProviderRequest {
  
  inline def apply(
    cpCode: Double,
    getHeader: String => js.Array[String] | Null,
    host: String,
    method: String,
    path: String,
    query: String,
    scheme: String,
    url: String
  ): ResponseProviderRequest = {
    val __obj = js.Dynamic.literal(cpCode = cpCode.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseProviderRequest]
  }
}
