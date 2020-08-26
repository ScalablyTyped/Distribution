package typings.apolloServerExpress.mod

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.mod.GraphQLObjectType
import typings.graphqlToolsUtils.interfacesMod.GraphQLExecutionContext
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "collectFields")
@js.native
object collectFields extends js.Object {
  def apply(
    exeContext: GraphQLExecutionContext,
    runtimeType: GraphQLObjectType[_, _],
    selectionSet: SelectionSetNode,
    fields: Record[String, js.Array[FieldNode]],
    visitedFragmentNames: Record[String, Boolean]
  ): Record[String, js.Array[FieldNode]] = js.native
}

