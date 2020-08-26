package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// onClientResponse
@js.native
trait EgressClientRequest
  extends ReadsHeaders
     with ReadsVariables
     with Request
     with MutatesVariables

object EgressClientRequest {
  @scala.inline
  def apply(
    cpCode: Double,
    getHeader: String => js.Array[String] | Null,
    getVariable: String => js.UndefOr[String],
    host: String,
    method: String,
    path: String,
    query: String,
    scheme: String,
    setVariable: (String, String) => Unit,
    url: String
  ): EgressClientRequest = {
    val __obj = js.Dynamic.literal(cpCode = cpCode.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getVariable = js.Any.fromFunction1(getVariable), host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], setVariable = js.Any.fromFunction2(setVariable), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EgressClientRequest]
  }
}

