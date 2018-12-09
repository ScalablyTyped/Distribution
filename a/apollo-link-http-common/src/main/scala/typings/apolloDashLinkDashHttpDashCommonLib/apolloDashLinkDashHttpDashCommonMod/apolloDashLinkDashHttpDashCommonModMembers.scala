package typings
package apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-http-common", JSImport.Namespace)
@js.native
object apolloDashLinkDashHttpDashCommonModMembers extends js.Object {
  val checkFetcher: js.Function1[
    /* fetcher */ js.Function2[
      /* input */ js.UndefOr[java.lang.String | stdLib.Request], 
      /* init */ js.UndefOr[stdLib.RequestInit], 
      js.Promise[stdLib.Response]
    ], 
    scala.Unit
  ] = js.native
  val createSignalIfSupported: js.Function0[apolloDashLinkDashHttpDashCommonLib.Anon_Controller] = js.native
  val fallbackHttpConfig: apolloDashLinkDashHttpDashCommonLib.Anon_Options = js.native
  val parseAndCheckHttpResponse: js.Function1[
    /* operations */ js.Any, 
    js.Function1[/* response */ stdLib.Response, js.Promise[js.Any]]
  ] = js.native
  val selectHttpOptionsAndBody: js.Function3[
    /* operation */ apolloDashLinkLib.libTypesMod.Operation, 
    /* fallbackConfig */ HttpConfig, 
    /* repeated */HttpConfig, 
    apolloDashLinkDashHttpDashCommonLib.Anon_OptionsBody
  ] = js.native
  val selectURI: js.Function2[
    /* operation */ js.Any, 
    /* fallbackURI */ js.UndefOr[
      java.lang.String | (js.Function1[/* operation */ apolloDashLinkLib.libTypesMod.Operation, java.lang.String])
    ], 
    js.Any
  ] = js.native
  val serializeFetchParameter: js.Function2[/* p */ js.Any, /* label */ js.Any, js.Any] = js.native
  val throwServerError: js.Function3[/* response */ js.Any, /* result */ js.Any, /* message */ js.Any, scala.Nothing] = js.native
}

