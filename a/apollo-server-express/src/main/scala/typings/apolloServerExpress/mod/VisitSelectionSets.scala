package typings.apolloServerExpress.mod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.TypeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "VisitSelectionSets")
@js.native
class VisitSelectionSets protected ()
  extends typings.graphqlTools.mod.VisitSelectionSets {
  def this(
    schema: GraphQLSchema,
    initialType: GraphQLOutputType,
    visitor: js.Function2[/* node */ SelectionSetNode, /* typeInfo */ TypeInfo, SelectionSetNode]
  ) = this()
}

