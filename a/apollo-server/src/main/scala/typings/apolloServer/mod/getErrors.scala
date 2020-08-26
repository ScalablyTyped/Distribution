package typings.apolloServer.mod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "getErrors")
@js.native
object getErrors extends js.Object {
  def apply(result: js.Any, pathSegment: String): js.Array[GraphQLError] = js.native
}

