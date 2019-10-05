package typings.apolloDashServerDashExpress.apolloDashServerDashExpressMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.Anon_Transforms
import typings.graphqlDashTools.distInterfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "transformSchema")
@js.native
object transformSchema extends js.Object {
  def apply(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema with Anon_Transforms = js.native
}

