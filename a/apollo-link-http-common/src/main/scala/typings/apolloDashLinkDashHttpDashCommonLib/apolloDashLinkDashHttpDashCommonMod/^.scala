package typings
package apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-http-common", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val fallbackHttpConfig: apolloDashLinkDashHttpDashCommonLib.Anon_Headers = js.native
  def checkFetcher(
    fetcher: js.Function2[
      /* input */ js.UndefOr[java.lang.String | stdLib.Request], 
      /* init */ js.UndefOr[stdLib.RequestInit], 
      js.Promise[stdLib.Response]
    ]
  ): scala.Unit = js.native
  def createSignalIfSupported(): apolloDashLinkDashHttpDashCommonLib.Anon_Controller = js.native
  def parseAndCheckHttpResponse(operations: js.Any): js.Function1[/* response */ stdLib.Response, js.Promise[_]] = js.native
  def selectHttpOptionsAndBody(
    operation: apolloDashLinkLib.libTypesMod.Operation,
    fallbackConfig: apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod.HttpConfig,
    configs: apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod.HttpConfig*
  ): apolloDashLinkDashHttpDashCommonLib.Anon_Body = js.native
  def selectURI(operation: js.Any): js.Any = js.native
  def selectURI(operation: js.Any, fallbackURI: java.lang.String): js.Any = js.native
  def selectURI(
    operation: js.Any,
    fallbackURI: js.Function1[/* operation */ apolloDashLinkLib.libTypesMod.Operation, java.lang.String]
  ): js.Any = js.native
  def serializeFetchParameter(p: js.Any, label: js.Any): js.Any = js.native
  def throwServerError(response: js.Any, result: js.Any, message: js.Any): scala.Nothing = js.native
}

