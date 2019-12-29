package typings.apolloDashServerDashCore

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typings.apolloDashServerDashCore.distPlaygroundMod.PlaygroundConfig
import typings.apolloDashServerDashCore.distRunHttpQueryMod.HttpQueryRequest
import typings.apolloDashServerDashCore.distRunHttpQueryMod.HttpQueryResponse
import typings.apolloDashServerDashCore.distTypesMod.Config
import typings.apolloDashServerDashEnv.apolloDashServerDashEnvMod.Request
import typings.apolloDashServerDashErrors.Anon_Debug
import typings.apolloDashServerDashErrors.Anon_Extensions
import typings.apolloDashServerDashErrors.Anon_ExtensionsAny
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
import typings.atApollographqlGraphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.RenderPageOptions
import typings.graphql.graphqlMod.GraphQLError
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
object apolloDashServerDashCoreMod extends js.Object {
  @js.native
  class ApolloError protected ()
    extends typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.ApolloError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: String, code: String, extensions: Record[String, _]) = this()
  }
  
  @js.native
  class ApolloServerBase protected ()
    extends typings.apolloDashServerDashCore.distApolloServerMod.ApolloServerBase {
    def this(config: Config) = this()
  }
  
  @js.native
  class AuthenticationError protected ()
    extends typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.AuthenticationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ForbiddenError protected ()
    extends typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.ForbiddenError {
    def this(message: String) = this()
  }
  
  @js.native
  class GraphQLExtension[TContext] ()
    extends typings.graphqlDashExtensions.graphqlDashExtensionsMod.GraphQLExtension[TContext]
  
  @js.native
  class HttpQueryError protected ()
    extends typings.apolloDashServerDashCore.distRunHttpQueryMod.HttpQueryError {
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, isGraphQLError: Boolean) = this()
    def this(statusCode: Double, message: String, isGraphQLError: Boolean, headers: StringDictionary[String]) = this()
  }
  
  @js.native
  class InvalidGraphQLRequestError () extends GraphQLError
  
  @js.native
  class SyntaxError protected ()
    extends typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.SyntaxError {
    def this(message: String) = this()
  }
  
  @js.native
  class UserInputError protected ()
    extends typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.UserInputError {
    def this(message: String) = this()
    def this(message: String, properties: Record[String, _]) = this()
  }
  
  @js.native
  class ValidationError protected ()
    extends typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.ValidationError {
    def this(message: String) = this()
  }
  
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
  @js.native
  object defaultPlaygroundOptions extends js.Object {
    var settings: Anon_EditorcursorShape = js.native
    var version: String = js.native
  }
  
}

