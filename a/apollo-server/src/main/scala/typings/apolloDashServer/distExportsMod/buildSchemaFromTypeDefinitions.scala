package typings.apolloDashServer.distExportsMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.GraphQLParseOptions
import typings.graphqlDashTools.distInterfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "buildSchemaFromTypeDefinitions")
@js.native
object buildSchemaFromTypeDefinitions extends js.Object {
  def apply(typeDefinitions: ITypeDefinitions): GraphQLSchema = js.native
  def apply(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): GraphQLSchema = js.native
}

