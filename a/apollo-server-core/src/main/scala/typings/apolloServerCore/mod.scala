package typings.apolloServerCore

import org.scalablytyped.runtime.StringDictionary
import typings.apolloServerCore.anon.EditorcursorShape
import typings.apolloServerCore.anon.FnCall
import typings.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typings.apolloServerCore.playgroundMod.PlaygroundConfig
import typings.apolloServerCore.runHttpQueryMod.HttpQueryRequest
import typings.apolloServerCore.runHttpQueryMod.HttpQueryResponse
import typings.apolloServerCore.typesMod.Config
import typings.apolloServerEnv.mod.Request
import typings.apolloServerErrors.anon.Debug
import typings.apolloServerErrors.anon.ErrorextensionsRecordstri
import typings.apolloServerErrors.anon.ErrorextensionsRecordstriExtensions
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod.RenderPageOptions
import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLScalarType
import typings.node.httpMod.IncomingMessage
import typings.std.Error
import typings.std.Record
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ApolloError protected ()
    extends typings.apolloServerErrors.mod.ApolloError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: String, code: js.UndefOr[scala.Nothing], extensions: Record[String, _]) = this()
    def this(message: String, code: String, extensions: Record[String, _]) = this()
  }
  
  @js.native
  class ApolloServerBase protected ()
    extends typings.apolloServerCore.apolloServerMod.ApolloServerBase {
    def this(config: Config) = this()
  }
  
  @js.native
  class AuthenticationError protected ()
    extends typings.apolloServerErrors.mod.AuthenticationError {
    def this(message: String) = this()
  }
  
  @js.native
  class ForbiddenError protected ()
    extends typings.apolloServerErrors.mod.ForbiddenError {
    def this(message: String) = this()
  }
  
  @js.native
  class GraphQLExtension[TContext] ()
    extends typings.graphqlExtensions.mod.GraphQLExtension[TContext]
  
  @js.native
  class HttpQueryError protected ()
    extends typings.apolloServerCore.runHttpQueryMod.HttpQueryError {
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, isGraphQLError: Boolean) = this()
    def this(
      statusCode: Double,
      message: String,
      isGraphQLError: js.UndefOr[scala.Nothing],
      headers: StringDictionary[String]
    ) = this()
    def this(statusCode: Double, message: String, isGraphQLError: Boolean, headers: StringDictionary[String]) = this()
  }
  
  @js.native
  class InvalidGraphQLRequestError () extends GraphQLError
  
  @js.native
  class SyntaxError protected ()
    extends typings.apolloServerErrors.mod.SyntaxError {
    def this(message: String) = this()
  }
  
  @js.native
  class UserInputError protected ()
    extends typings.apolloServerErrors.mod.UserInputError {
    def this(message: String) = this()
    def this(message: String, properties: Record[String, _]) = this()
  }
  
  @js.native
  class ValidationError protected ()
    extends typings.apolloServerErrors.mod.ValidationError {
    def this(message: String) = this()
  }
  
  val GraphQLUpload: js.UndefOr[GraphQLScalarType] = js.native
  val processFileUploads: js.UndefOr[FnCall] = js.native
  def convertNodeHttpToRequest(req: IncomingMessage): Request = js.native
  def createPlaygroundOptions(): js.UndefOr[RenderPageOptions] = js.native
  def createPlaygroundOptions(playground: PlaygroundConfig): js.UndefOr[RenderPageOptions] = js.native
  def formatApolloErrors(errors: js.Array[Error]): js.Array[typings.apolloServerErrors.mod.ApolloError] = js.native
  def formatApolloErrors(errors: js.Array[Error], options: Debug): js.Array[typings.apolloServerErrors.mod.ApolloError] = js.native
  def gql(template: String, substitutions: js.Any*): DocumentNode = js.native
  def gql(template: TemplateStringsArray, substitutions: js.Any*): DocumentNode = js.native
  def resolveGraphqlOptions(
    options: js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]],
    args: js.Any*
  ): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def resolveGraphqlOptions(options: GraphQLServerOptions[Record[String, _], _], args: js.Any*): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  def runHttpQuery(handlerArguments: js.Array[_], request: HttpQueryRequest): js.Promise[HttpQueryResponse] = js.native
  def toApolloError(error: ErrorextensionsRecordstri): ErrorextensionsRecordstriExtensions = js.native
  def toApolloError(error: ErrorextensionsRecordstri, code: String): ErrorextensionsRecordstriExtensions = js.native
  @js.native
  object defaultPlaygroundOptions extends js.Object {
    var settings: EditorcursorShape = js.native
    var version: String = js.native
  }
  
}

