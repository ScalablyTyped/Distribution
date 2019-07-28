package typings.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod

import typings.apolloDashLink.libTypesMod.Operation
import typings.apolloDashLinkDashHttpDashCommon.Anon_Body
import typings.apolloDashLinkDashHttpDashCommon.Anon_Controller
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-http-common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkFetcher(
    fetcher: js.Function2[
      /* input */ js.UndefOr[String | Request], 
      /* init */ js.UndefOr[RequestInit], 
      js.Promise[Response]
    ]
  ): Unit = js.native
  def createSignalIfSupported(): Anon_Controller = js.native
  def parseAndCheckHttpResponse(operations: js.Any): js.Function1[/* response */ Response, js.Promise[_]] = js.native
  def selectHttpOptionsAndBody(operation: Operation, fallbackConfig: HttpConfig, configs: HttpConfig*): Anon_Body = js.native
  def selectURI(operation: js.Any): js.Any = js.native
  def selectURI(operation: js.Any, fallbackURI: String): js.Any = js.native
  def selectURI(operation: js.Any, fallbackURI: js.Function1[/* operation */ Operation, String]): js.Any = js.native
  def serializeFetchParameter(p: js.Any, label: js.Any): js.Any = js.native
  def throwServerError(response: js.Any, result: js.Any, message: js.Any): scala.Nothing = js.native
}

