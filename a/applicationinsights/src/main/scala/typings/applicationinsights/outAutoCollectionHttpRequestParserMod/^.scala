package typings.applicationinsights.outAutoCollectionHttpRequestParserMod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class to read data from the requst/response objects and convert them into the telemetry contract
  */
@JSImport("applicationinsights/out/AutoCollection/HttpRequestParser", JSImport.Namespace)
@js.native
class ^ protected () extends HttpRequestParser {
  def this(request: IncomingMessage) = this()
  def this(request: IncomingMessage, requestId: String) = this()
}

@JSImport("applicationinsights/out/AutoCollection/HttpRequestParser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var keys: js.Any = js.native
  def parseId(cookieValue: String): String = js.native
}

