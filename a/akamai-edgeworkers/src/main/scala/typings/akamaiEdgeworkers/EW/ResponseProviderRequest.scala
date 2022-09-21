package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// responseProvider
trait ResponseProviderRequest
  extends StObject
     with Request
     with ReadsHeaders
     with ReadAllHeader
     with ReadsBody
     with ReadsVariables
object ResponseProviderRequest {
  
  inline def apply(
    cpCode: Double,
    getHeader: String => js.Array[String] | Null,
    getHeaders: () => Headers,
    getVariable: String => js.UndefOr[String],
    host: String,
    json: () => js.Promise[Any],
    method: String,
    path: String,
    query: String,
    scheme: String,
    text: () => js.Promise[String],
    url: String
  ): ResponseProviderRequest = {
    val __obj = js.Dynamic.literal(cpCode = cpCode.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), getVariable = js.Any.fromFunction1(getVariable), host = host.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseProviderRequest]
  }
}
