package typings.apolloDashServerDashCore.apolloDashServerDashCoreMod

import typings.apolloDashServerDashCore.Fn_Request
import typings.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typings.apolloDashServerDashCore.distPlaygroundMod.PlaygroundConfig
import typings.apolloDashServerDashCore.distRunHttpQueryMod.HttpQueryRequest
import typings.apolloDashServerDashCore.distRunHttpQueryMod.HttpQueryResponse
import typings.apolloDashServerDashEnv.apolloDashServerDashEnvMod.Request
import typings.apolloDashServerDashErrors.Anon_Debug
import typings.apolloDashServerDashErrors.Anon_Extensions
import typings.apolloDashServerDashErrors.Anon_ExtensionsAny
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
import typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.RenderPageOptions
import typings.graphql.graphqlMod.GraphQLScalarType
import typings.graphql.languageAstMod.DocumentNode
import typings.node.httpMod.IncomingMessage
import typings.std.Error
import typings.std.Record
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GraphQLUpload: js.UndefOr[GraphQLScalarType] = js.native
  val processFileUploads: js.UndefOr[Fn_Request] = js.native
  def convertNodeHttpToRequest(req: IncomingMessage): Request = js.native
  def createPlaygroundOptions(): js.UndefOr[RenderPageOptions] = js.native
  def createPlaygroundOptions(playground: PlaygroundConfig): js.UndefOr[RenderPageOptions] = js.native
  def formatApolloErrors(errors: js.Array[Error]): js.Array[typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.ApolloError] = js.native
  def formatApolloErrors(errors: js.Array[Error], options: Anon_Debug): js.Array[typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.ApolloError] = js.native
  def gql(template: String, substitutions: js.Any*): DocumentNode = js.native
  def gql(template: TemplateStringsArray, substitutions: js.Any*): DocumentNode = js.native
  def resolveGraphqlOptions(
    options: js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]],
    args: js.Any*
  ): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def resolveGraphqlOptions(options: GraphQLServerOptions[Record[String, _], _], args: js.Any*): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def runHttpQuery(handlerArguments: js.Array[_], request: HttpQueryRequest): js.Promise[HttpQueryResponse] = js.native
  def toApolloError(error: Error with Anon_Extensions): Error with Anon_ExtensionsAny = js.native
  def toApolloError(error: Error with Anon_Extensions, code: String): Error with Anon_ExtensionsAny = js.native
}

