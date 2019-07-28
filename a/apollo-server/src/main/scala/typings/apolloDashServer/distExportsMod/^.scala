package typings.apolloDashServer.distExportsMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import typings.apolloDashServerDashErrors.Anon_Extensions
import typings.apolloDashServerDashErrors.Anon_ExtensionsAny
import typings.graphql.graphqlMod.GraphQLScalarType
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashSubscriptions.distWithDashFilterMod.FilterFn
import typings.graphqlDashSubscriptions.distWithDashFilterMod.ResolverFn
import typings.graphqlDashTools.Anon_ArgName
import typings.graphqlDashTools.Anon_Definitions
import typings.graphqlDashTools.Anon_InheritResolversFromInterfaces
import typings.graphqlDashTools.Anon_Transforms
import typings.graphqlDashTools.distInterfacesMod.GraphQLParseOptions
import typings.graphqlDashTools.distInterfacesMod.IAddResolveFunctionsToSchemaOptions
import typings.graphqlDashTools.distInterfacesMod.IDelegateToSchemaOptions
import typings.graphqlDashTools.distInterfacesMod.IDirectiveResolvers
import typings.graphqlDashTools.distInterfacesMod.IExecutableSchemaDefinition
import typings.graphqlDashTools.distInterfacesMod.IFieldIteratorFn
import typings.graphqlDashTools.distInterfacesMod.ILogger
import typings.graphqlDashTools.distInterfacesMod.IMockOptions
import typings.graphqlDashTools.distInterfacesMod.IMockServer
import typings.graphqlDashTools.distInterfacesMod.IMocks
import typings.graphqlDashTools.distInterfacesMod.IResolverValidationOptions
import typings.graphqlDashTools.distInterfacesMod.IResolvers
import typings.graphqlDashTools.distInterfacesMod.ITypeDefinitions
import typings.graphqlDashTools.distInterfacesMod.ITypedef
import typings.graphqlDashTools.distInterfacesMod.Transform
import typings.graphqlDashTools.distStitchingMakeRemoteExecutableSchemaMod.Fetcher
import typings.std.Error
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val GraphQLUpload: js.UndefOr[GraphQLScalarType] = js.native
  val attachConnectorsToContext: js.Function = js.native
  val defaultMergedResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  def addCatchUndefinedToSchema(schema: GraphQLSchema): Unit = js.native
  def addErrorLoggingToSchema(schema: GraphQLSchema, logger: ILogger): Unit = js.native
  def addMockFunctionsToSchema(hasSchemaMocksPreserveResolvers: IMockOptions): Unit = js.native
  def addResolveFunctionsToSchema(options: GraphQLSchema): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(options: GraphQLSchema, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: GraphQLSchema,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(options: IAddResolveFunctionsToSchemaOptions): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(options: IAddResolveFunctionsToSchemaOptions, legacyInputResolvers: IResolvers[_, _]): GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: IAddResolveFunctionsToSchemaOptions,
    legacyInputResolvers: IResolvers[_, _],
    legacyInputValidationOptions: IResolverValidationOptions
  ): GraphQLSchema = js.native
  def addSchemaLevelResolveFunction(schema: GraphQLSchema, fn: GraphQLFieldResolver[_, _, StringDictionary[_]]): Unit = js.native
  def assertResolveFunctionsPresent(schema: GraphQLSchema): Unit = js.native
  def assertResolveFunctionsPresent(schema: GraphQLSchema, resolverValidationOptions: IResolverValidationOptions): Unit = js.native
  def attachDirectiveResolvers(schema: GraphQLSchema, directiveResolvers: IDirectiveResolvers[_, _]): Unit = js.native
  def buildSchemaFromTypeDefinitions(typeDefinitions: ITypeDefinitions): GraphQLSchema = js.native
  def buildSchemaFromTypeDefinitions(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): GraphQLSchema = js.native
  def chainResolvers(resolvers: js.Array[GraphQLFieldResolver[_, _, StringDictionary[_]]]): js.Function4[
    /* root */ js.Any, 
    /* args */ StringDictionary[js.Any], 
    /* ctx */ js.Any, 
    /* info */ GraphQLResolveInfo, 
    _
  ] = js.native
  def checkForResolveTypeResolver(schema: GraphQLSchema): Unit = js.native
  def checkForResolveTypeResolver(schema: GraphQLSchema, requireResolversForResolveType: Boolean): Unit = js.native
  def concatenateTypeDefs(typeDefinitionsAry: js.Array[ITypedef]): String = js.native
  def concatenateTypeDefs(typeDefinitionsAry: js.Array[ITypedef], calledFunctionRefs: js.Any): String = js.native
  def decorateWithLogger(fn: js.UndefOr[scala.Nothing], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def decorateWithLogger(fn: GraphQLFieldResolver[_, _, StringDictionary[_]], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def defaultCreateRemoteResolver(fetcher: Fetcher): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def delegateToSchema(options: GraphQLSchema, args: js.Any*): js.Promise[_] = js.native
  def delegateToSchema(options: IDelegateToSchemaOptions[StringDictionary[_]], args: js.Any*): js.Promise[_] = js.native
  def extendResolversFromInterfaces(schema: GraphQLSchema, resolvers: IResolvers[_, _]): IResolvers[_, _] = js.native
  def extractExtensionDefinitions(ast: DocumentNode): DocumentNode with Anon_Definitions = js.native
  def forEachField(schema: GraphQLSchema, fn: IFieldIteratorFn): Unit = js.native
  def gql(template: String, substitutions: js.Any*): DocumentNode = js.native
  def gql(template: TemplateStringsArray, substitutions: js.Any*): DocumentNode = js.native
  def introspectSchema(fetcher: ApolloLink): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: ApolloLink, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: Fetcher): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(fetcher: Fetcher, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def makeExecutableSchema[TContext](
    hasTypeDefsResolversConnectorsLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesParseOptionsInheritResolversFromInterfaces: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
  def makeRemoteExecutableSchema(hasSchemaLinkFetcherCreateResolverBuildSchemaOptionsPrintSchemaOptions: Anon_ArgName): GraphQLSchema = js.native
  def mergeSchemas(
    hasSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeDirectives: Anon_InheritResolversFromInterfaces
  ): GraphQLSchema = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: GraphQLSchema, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks): IMockServer = js.native
  def mockServer(schema: ITypeDefinitions, mocks: IMocks, preserveResolvers: Boolean): IMockServer = js.native
  def toApolloError(error: Error with Anon_Extensions): Error with Anon_ExtensionsAny = js.native
  def toApolloError(error: Error with Anon_Extensions, code: String): Error with Anon_ExtensionsAny = js.native
  def transformSchema(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema with Anon_Transforms = js.native
  def withFilter(asyncIteratorFn: ResolverFn, filterFn: FilterFn): ResolverFn = js.native
}

