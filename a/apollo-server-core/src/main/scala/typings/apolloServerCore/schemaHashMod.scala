package typings.apolloServerCore

import typings.apolloServerTypes.mod.SchemaHash
import typings.graphql.typeMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/utils/schemaHash", JSImport.Namespace)
@js.native
object schemaHashMod extends js.Object {
  def generateSchemaHash(schema: GraphQLSchema): SchemaHash = js.native
}

