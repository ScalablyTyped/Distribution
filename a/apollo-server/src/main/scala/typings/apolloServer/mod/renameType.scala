package typings.apolloServer.mod

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLEnumType
import typings.graphql.mod.GraphQLInputObjectType
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLScalarType
import typings.graphql.mod.GraphQLUnionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "renameType")
@js.native
object renameType extends js.Object {
  def apply(`type`: GraphQLNamedType, newTypeName: String): GraphQLNamedType = js.native
  def apply(`type`: GraphQLEnumType, newTypeName: String): GraphQLEnumType = js.native
  def apply(`type`: GraphQLInputObjectType, newTypeName: String): GraphQLInputObjectType = js.native
  def apply(`type`: GraphQLInterfaceType, newTypeName: String): GraphQLInterfaceType = js.native
  def apply(`type`: GraphQLObjectType[_, _], newTypeName: String): GraphQLObjectType[_, _] = js.native
  def apply(`type`: GraphQLScalarType, newTypeName: String): GraphQLScalarType = js.native
  def apply(`type`: GraphQLUnionType, newTypeName: String): GraphQLUnionType = js.native
}

