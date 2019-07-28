package typings.apolloDashClient.errorsApolloErrorMod

import typings.apolloDashClient.Anon_ErrorMessage
import typings.graphql.graphqlMod.GraphQLError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/errors/ApolloError", "ApolloError")
@js.native
class ApolloError protected () extends Error {
  def this(hasGraphQLErrorsNetworkErrorErrorMessageExtraInfo: Anon_ErrorMessage) = this()
  var extraInfo: js.Any = js.native
  var graphQLErrors: js.Array[GraphQLError] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var networkError: Error | Null = js.native
}

