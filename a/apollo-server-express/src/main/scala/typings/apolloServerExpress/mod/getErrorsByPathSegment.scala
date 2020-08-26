package typings.apolloServerExpress.mod

import typings.graphql.mod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "getErrorsByPathSegment")
@js.native
object getErrorsByPathSegment extends js.Object {
  def apply(errors: js.Array[GraphQLError]): Record[String, js.Array[GraphQLError]] = js.native
}

