package typings.apolloDashServer.distExportsMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.IMockServer
import typings.graphqlDashTools.distInterfacesMod.IMocks
import typings.graphqlDashTools.distInterfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "mockServer")
@js.native
object mockServer extends js.Object {
  def apply(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def apply(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def apply(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def apply(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
}

