package typings.apolloDashServerDashExpress.apolloDashServerDashExpressMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.IAddResolveFunctionsToSchemaOptions
import typings.graphqlDashTools.distInterfacesMod.IResolverValidationOptions
import typings.graphqlDashTools.distInterfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "addResolveFunctionsToSchema")
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

