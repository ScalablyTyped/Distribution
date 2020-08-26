package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "getImplementingTypes")
@js.native
object getImplementingTypes extends js.Object {
  def apply(interfaceName: String, schema: GraphQLSchema): js.Array[String] = js.native
}

