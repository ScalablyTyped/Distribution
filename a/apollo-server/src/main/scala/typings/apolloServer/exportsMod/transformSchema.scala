package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.GraphQLSchematransformsAr
import typings.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "transformSchema")
@js.native
object transformSchema extends js.Object {
  def apply(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchematransformsAr = js.native
}

