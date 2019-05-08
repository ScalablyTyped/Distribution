package typings
package apolloDashServerDashCoreLib.distRunHttpQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def processHTTPRequest[TContext](
    options: (apolloDashServerDashEnvLib.distTypescriptDashUtilityDashTypesMod.WithRequired[
      apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[TContext, _], 
      apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.cache | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.plugins
    ]) with apolloDashServerDashCoreLib.Anon_Context[TContext],
    httpRequest: HttpQueryRequest
  ): js.Promise[HttpQueryResponse] = js.native
  def runHttpQuery(handlerArguments: js.Array[_], request: HttpQueryRequest): js.Promise[HttpQueryResponse] = js.native
  def throwHttpGraphQLError[E /* <: stdLib.Error */](statusCode: scala.Double, errors: js.Array[E]): scala.Nothing = js.native
  def throwHttpGraphQLError[E /* <: stdLib.Error */](
    statusCode: scala.Double,
    errors: js.Array[E],
    options: stdLib.Pick[
      apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _], 
      apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.debug | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.formatError
    ]
  ): scala.Nothing = js.native
}

