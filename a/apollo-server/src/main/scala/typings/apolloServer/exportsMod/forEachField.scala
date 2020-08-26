package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IFieldIteratorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "forEachField")
@js.native
object forEachField extends js.Object {
  def apply(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
}

