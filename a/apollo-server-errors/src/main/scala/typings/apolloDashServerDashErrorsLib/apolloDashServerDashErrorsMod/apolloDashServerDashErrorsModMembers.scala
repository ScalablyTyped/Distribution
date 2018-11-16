package typings
package apolloDashServerDashErrorsLib.apolloDashServerDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-errors", JSImport.Namespace)
@js.native
object apolloDashServerDashErrorsModMembers extends js.Object {
  def formatApolloErrors(errors: js.Array[stdLib.Error]): js.Array[ApolloError] = js.native
  def formatApolloErrors(errors: js.Array[stdLib.Error], options: apolloDashServerDashErrorsLib.Anon_Formatter): js.Array[ApolloError] = js.native
  def fromGraphQLError(error: graphqlLib.graphqlMod.GraphQLError): ApolloError = js.native
  def fromGraphQLError(error: graphqlLib.graphqlMod.GraphQLError, options: ErrorOptions): ApolloError = js.native
  def toApolloError(error: stdLib.Error with apolloDashServerDashErrorsLib.Anon_Extensions): stdLib.Error with apolloDashServerDashErrorsLib.Anon_ExtensionsRecord = js.native
  def toApolloError(error: stdLib.Error with apolloDashServerDashErrorsLib.Anon_Extensions, code: java.lang.String): stdLib.Error with apolloDashServerDashErrorsLib.Anon_ExtensionsRecord = js.native
}

