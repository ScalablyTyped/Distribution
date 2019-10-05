package typings.apolloDashServer.distExportsMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.IExecutableSchemaDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "makeExecutableSchema")
@js.native
object makeExecutableSchema extends js.Object {
  def apply[TContext](
    hasTypeDefsResolversConnectorsLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesParseOptionsInheritResolversFromInterfaces: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
}

