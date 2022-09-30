package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmutableRequest
  extends StObject
     with ReadsHeaders
     with ReadsVariables
     with Request
object ImmutableRequest {
  
  inline def apply(
    body: ReadableStreamEW[Any],
    cpCode: Double,
    getHeader: String => js.Array[String] | Null,
    getVariable: String => js.UndefOr[String],
    host: String,
    method: String,
    path: String,
    query: String,
    scheme: String,
    url: String
  ): ImmutableRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cpCode = cpCode.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getVariable = js.Any.fromFunction1(getVariable), host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmutableRequest]
  }
}
