package typings.apolloGraphql

import typings.graphql.mod.GraphQLError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema/GraphQLSchemaValidationError", JSImport.Namespace)
@js.native
object graphQLSchemaValidationErrorMod extends js.Object {
  @js.native
  class GraphQLSchemaValidationError protected () extends Error {
    def this(errors: js.Array[GraphQLError]) = this()
    var errors: js.Array[GraphQLError] = js.native
  }
  
}

