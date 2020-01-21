package typings.apolloGraphql.mod

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql", "GraphQLSchemaValidationError")
@js.native
class GraphQLSchemaValidationError protected ()
  extends typings.apolloGraphql.schemaMod.GraphQLSchemaValidationError {
  def this(errors: js.Array[GraphQLError]) = this()
}

