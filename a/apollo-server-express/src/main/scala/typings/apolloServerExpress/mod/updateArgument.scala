package typings.apolloServerExpress.mod

import typings.graphql.astMod.ArgumentNode
import typings.graphql.astMod.VariableDefinitionNode
import typings.graphql.definitionMod.GraphQLInputType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "updateArgument")
@js.native
object updateArgument extends js.Object {
  def apply(
    argName: String,
    argType: GraphQLInputType,
    argumentNodes: Record[String, ArgumentNode],
    variableDefinitionsMap: Record[String, VariableDefinitionNode],
    variableValues: Record[String, _],
    newArg: js.Any
  ): Unit = js.native
}

