package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "setErrors")
@js.native
object setErrors extends js.Object {
  def apply(result: js.Any, errors: js.Array[GraphQLError]): Unit = js.native
}

