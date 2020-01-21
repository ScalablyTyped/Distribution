package typings.arangodb.graphqlMod

import typings.arangodb.Foxx.Router
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@arangodb/foxx/graphql", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: GraphQLOptions): Router = js.native
  def apply(options: GraphQLSchema): Router = js.native
}

