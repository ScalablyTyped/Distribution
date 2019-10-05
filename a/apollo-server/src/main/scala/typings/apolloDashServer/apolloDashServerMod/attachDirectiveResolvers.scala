package typings.apolloDashServer.apolloDashServerMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.IDirectiveResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "attachDirectiveResolvers")
@js.native
object attachDirectiveResolvers extends js.Object {
  def apply(schema: GraphQLSchema, directiveResolvers: IDirectiveResolvers[_, _]): Unit = js.native
}

