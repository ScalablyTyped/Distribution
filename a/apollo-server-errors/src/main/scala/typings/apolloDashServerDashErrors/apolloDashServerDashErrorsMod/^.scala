package typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod

import typings.apolloDashServerDashErrors.Anon_Debug
import typings.apolloDashServerDashErrors.Anon_Extensions
import typings.apolloDashServerDashErrors.Anon_ExtensionsAny
import typings.graphql.graphqlMod.GraphQLError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-errors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatApolloErrors(errors: js.Array[Error]): js.Array[ApolloError] = js.native
  def formatApolloErrors(errors: js.Array[Error], options: Anon_Debug): js.Array[ApolloError] = js.native
  def fromGraphQLError(error: GraphQLError): ApolloError = js.native
  def fromGraphQLError(error: GraphQLError, options: ErrorOptions): ApolloError = js.native
  def hasPersistedQueryError(errors: js.Array[Error]): Boolean = js.native
  def toApolloError(error: Error with Anon_Extensions): Error with Anon_ExtensionsAny = js.native
  def toApolloError(error: Error with Anon_Extensions, code: String): Error with Anon_ExtensionsAny = js.native
}

