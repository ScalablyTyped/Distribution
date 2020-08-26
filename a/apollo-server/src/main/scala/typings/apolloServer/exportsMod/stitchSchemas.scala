package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsStitch.typesMod.IStitchSchemasOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "stitchSchemas")
@js.native
object stitchSchemas extends js.Object {
  def apply(
    hasSubschemasTypesTypeDefsSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeTypesMergeDirectivesLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaTransformsParseOptionsPruningOptions: IStitchSchemasOptions[_]
  ): GraphQLSchema = js.native
}

