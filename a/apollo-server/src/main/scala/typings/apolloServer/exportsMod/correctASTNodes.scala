package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLEnumType
import typings.graphql.mod.GraphQLInputObjectType
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "correctASTNodes")
@js.native
object correctASTNodes extends js.Object {
  def apply(`type`: GraphQLEnumType): GraphQLEnumType = js.native
  def apply(`type`: GraphQLInputObjectType): GraphQLInputObjectType = js.native
  def apply(`type`: GraphQLInterfaceType): GraphQLInterfaceType = js.native
  def apply(`type`: GraphQLObjectType[_, _]): GraphQLObjectType[_, _] = js.native
}

