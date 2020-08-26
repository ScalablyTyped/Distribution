package typings.apolloServer.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IAddResolversToSchemaOptions
import typings.graphqlToolsUtils.interfacesMod.IResolverValidationOptions
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "addResolversToSchema")
@js.native
object addResolversToSchema extends js.Object {
  def apply(schemaOrOptions: GraphQLSchema): GraphQLSchema = js.native
  def apply(
    schemaOrOptions: GraphQLSchema,
    legacyInputResolvers: js.UndefOr[scala.Nothing],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def apply(schemaOrOptions: GraphQLSchema, legacyInputResolvers: IResolvers[_, _, Record[String, _], _]): GraphQLSchema = js.native
  def apply(
    schemaOrOptions: GraphQLSchema,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def apply(schemaOrOptions: IAddResolversToSchemaOptions): GraphQLSchema = js.native
  def apply(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: js.UndefOr[scala.Nothing],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def apply(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _]
  ): GraphQLSchema = js.native
  def apply(
    schemaOrOptions: IAddResolversToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _, Record[String, _], _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
}

