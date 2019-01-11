package typings
package apolloDashServerDashCoreLib.distRunHttpQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def processHTTPRequest[TContext](
    options: (apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod.WithRequired[
      apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[TContext, _], 
      apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.cache | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.plugins
    ]) with apolloDashServerDashCoreLib.Anon_Context[TContext],
    httpRequest: apolloDashServerDashCoreLib.distRunHttpQueryMod.HttpQueryRequest
  ): js.Promise[apolloDashServerDashCoreLib.distRunHttpQueryMod.HttpQueryResponse] = js.native
  def runHttpQuery(
    handlerArguments: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[_],
    request: apolloDashServerDashCoreLib.distRunHttpQueryMod.HttpQueryRequest
  ): js.Promise[apolloDashServerDashCoreLib.distRunHttpQueryMod.HttpQueryResponse] = js.native
}

