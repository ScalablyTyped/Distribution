package typings.apolloServer.mod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "relocatedError")
@js.native
object relocatedError extends js.Object {
  def apply(originalError: GraphQLError): GraphQLError = js.native
  def apply(originalError: GraphQLError, path: js.Array[String | Double]): GraphQLError = js.native
}

