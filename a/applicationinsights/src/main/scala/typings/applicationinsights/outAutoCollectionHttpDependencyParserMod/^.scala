package typings.applicationinsights.outAutoCollectionHttpDependencyParserMod

import typings.node.httpMod.ClientRequest
import typings.node.httpsMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class to read data from the requst/response objects and convert them into the telemetry contract
  */
@JSImport("applicationinsights/out/AutoCollection/HttpDependencyParser", JSImport.Namespace)
@js.native
class ^ protected () extends HttpDependencyParser {
  def this(requestOptions: RequestOptions | typings.node.httpMod.RequestOptions, request: ClientRequest) = this()
  def this(requestOptions: String, request: ClientRequest) = this()
}

@JSImport("applicationinsights/out/AutoCollection/HttpDependencyParser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Builds a URL from request options, using the same logic as http.request(). This is
    * necessary because a ClientRequest object does not expose a url property.
    */
  /* private */ def _getUrlFromRequestOptions(options: js.Any, request: js.Any): js.Any = js.native
}

