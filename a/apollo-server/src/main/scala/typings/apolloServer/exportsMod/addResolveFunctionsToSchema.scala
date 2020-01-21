package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.IAddResolveFunctionsToSchemaOptions
import typings.graphqlTools.interfacesMod.IResolverValidationOptions
import typings.graphqlTools.interfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "addResolveFunctionsToSchema")
@js.native
object addResolveFunctionsToSchema extends js.Object {
  def apply(options: GraphQLSchema): GraphQLSchema = js.native
  def apply(options: GraphQLSchema, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def apply(
    options: GraphQLSchema,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def apply(options: IAddResolveFunctionsToSchemaOptions): GraphQLSchema = js.native
  def apply(options: IAddResolveFunctionsToSchemaOptions, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def apply(
    options: IAddResolveFunctionsToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
}

