package typings
package apolloDashGraphqlLib.libSchemaGraphQLSchemaValidationErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/schema/GraphQLSchemaValidationError", "GraphQLSchemaValidationError")
@js.native
class GraphQLSchemaValidationError protected ()
  extends stdLib.Error {
  def this(errors: js.Array[graphqlLib.graphqlMod.GraphQLError]) = this()
  var errors: js.Array[graphqlLib.graphqlMod.GraphQLError] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

