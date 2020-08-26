package typings.apolloServer.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsMock.typesMod.IMockServer
import typings.graphqlToolsMock.typesMod.IMocks
import typings.graphqlToolsUtils.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "mockServer")
@js.native
object mockServer extends js.Object {
  def apply(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def apply(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def apply(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def apply(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
}

