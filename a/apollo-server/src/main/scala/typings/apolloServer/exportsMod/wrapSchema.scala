package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "wrapSchema")
@js.native
object wrapSchema extends js.Object {
  def apply(subschemaOrSubschemaConfig: GraphQLSchema): GraphQLSchema = js.native
  def apply(subschemaOrSubschemaConfig: GraphQLSchema, transforms: js.Array[Transform[Record[String, _]]]): GraphQLSchema = js.native
  def apply(subschemaOrSubschemaConfig: SubschemaConfig): GraphQLSchema = js.native
  def apply(subschemaOrSubschemaConfig: SubschemaConfig, transforms: js.Array[Transform[Record[String, _]]]): GraphQLSchema = js.native
}

