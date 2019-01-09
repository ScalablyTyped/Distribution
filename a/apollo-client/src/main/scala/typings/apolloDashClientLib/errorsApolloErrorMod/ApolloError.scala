package typings
package apolloDashClientLib.errorsApolloErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/errors/ApolloError", "ApolloError")
@js.native
class ApolloError protected ()
  extends stdLib.Error {
  def this(hasGraphQLErrorsNetworkErrorErrorMessageExtraInfo: apolloDashClientLib.Anon_ErrorMessage) = this()
  var extraInfo: js.Any = js.native
  var graphQLErrors: js.Array[graphqlLib.graphqlMod.GraphQLError] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var networkError: stdLib.Error | scala.Null = js.native
}

