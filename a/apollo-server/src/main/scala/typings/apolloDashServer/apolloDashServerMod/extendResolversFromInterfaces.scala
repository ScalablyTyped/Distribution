package typings.apolloDashServer.apolloDashServerMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "extendResolversFromInterfaces")
@js.native
object extendResolversFromInterfaces extends js.Object {
  def apply(schema: GraphQLSchema, resolvers: IResolvers[_, _]): IResolvers[_, _] = js.native
}

