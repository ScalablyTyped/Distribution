package typings.apolloServerExpress.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import typings.graphqlToolsLoad.schemaMod.LoadSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "loadSchemaSync")
@js.native
object loadSchemaSync extends js.Object {
  def apply(schemaPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadSchemaOptions): GraphQLSchema = js.native
  def apply(schemaPointers: UnnormalizedTypeDefPointer, options: LoadSchemaOptions): GraphQLSchema = js.native
}

