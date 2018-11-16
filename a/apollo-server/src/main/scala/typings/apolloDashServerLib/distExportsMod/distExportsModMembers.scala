package typings
package apolloDashServerLib.distExportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", JSImport.Namespace)
@js.native
object distExportsModMembers extends js.Object {
  val GraphQLUpload: graphqlLib.graphqlMod.GraphQLScalarType = js.native
  val attachConnectorsToContext: js.Function = js.native
  val defaultMergedResolver: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[js.Any, js.Any, ScalablyTyped.runtime.StringDictionary[js.Any]] = js.native
  val defaultPlaygroundOptions: apolloDashServerDashCoreLib.Anon_Settings = js.native
  val gql: js.Function2[
    /* template */ stdLib.TemplateStringsArray | java.lang.String, 
    /* repeated */js.Any, 
    graphqlLib.languageAstMod.DocumentNode
  ] = js.native
  val withFilter: js.Function2[
    /* asyncIteratorFn */ graphqlDashSubscriptionsLib.distWithDashFilterMod.ResolverFn, 
    /* filterFn */ graphqlDashSubscriptionsLib.distWithDashFilterMod.FilterFn, 
    graphqlDashSubscriptionsLib.distWithDashFilterMod.ResolverFn
  ] = js.native
  def addCatchUndefinedToSchema(schema: graphqlLib.graphqlMod.GraphQLSchema): scala.Unit = js.native
  def addErrorLoggingToSchema(schema: graphqlLib.graphqlMod.GraphQLSchema, logger: graphqlDashToolsLib.distInterfacesMod.ILogger): scala.Unit = js.native
  def addMockFunctionsToSchema(hasSchemaMocksPreserveResolvers: graphqlDashToolsLib.distInterfacesMod.IMockOptions): scala.Unit = js.native
  def addResolveFunctionsToSchema(options: graphqlDashToolsLib.distInterfacesMod.IAddResolveFunctionsToSchemaOptions): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: graphqlDashToolsLib.distInterfacesMod.IAddResolveFunctionsToSchemaOptions,
    legacyInputResolvers: graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _]
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: graphqlDashToolsLib.distInterfacesMod.IAddResolveFunctionsToSchemaOptions,
    legacyInputResolvers: graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _],
    legacyInputValidationOptions: graphqlDashToolsLib.distInterfacesMod.IResolverValidationOptions
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addResolveFunctionsToSchema(options: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: graphqlLib.graphqlMod.GraphQLSchema,
    legacyInputResolvers: graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _]
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addResolveFunctionsToSchema(
    options: graphqlLib.graphqlMod.GraphQLSchema,
    legacyInputResolvers: graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _],
    legacyInputValidationOptions: graphqlDashToolsLib.distInterfacesMod.IResolverValidationOptions
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def addSchemaLevelResolveFunction(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    fn: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
  ): scala.Unit = js.native
  def assertResolveFunctionsPresent(schema: graphqlLib.graphqlMod.GraphQLSchema): scala.Unit = js.native
  def assertResolveFunctionsPresent(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    resolverValidationOptions: graphqlDashToolsLib.distInterfacesMod.IResolverValidationOptions
  ): scala.Unit = js.native
  def attachDirectiveResolvers(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    directiveResolvers: graphqlDashToolsLib.distInterfacesMod.IDirectiveResolvers[_, _]
  ): scala.Unit = js.native
  def buildSchemaFromTypeDefinitions(typeDefinitions: graphqlDashToolsLib.distInterfacesMod.ITypeDefinitions): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def buildSchemaFromTypeDefinitions(
    typeDefinitions: graphqlDashToolsLib.distInterfacesMod.ITypeDefinitions,
    parseOptions: graphqlDashToolsLib.distInterfacesMod.GraphQLParseOptions
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def chainResolvers(
    resolvers: js.Array[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
    ]
  ): js.Function4[
    /* root */ js.Any, 
    /* args */ ScalablyTyped.runtime.StringDictionary[js.Any], 
    /* ctx */ js.Any, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    _
  ] = js.native
  def checkForResolveTypeResolver(schema: graphqlLib.graphqlMod.GraphQLSchema): scala.Unit = js.native
  def checkForResolveTypeResolver(schema: graphqlLib.graphqlMod.GraphQLSchema, requireResolversForResolveType: scala.Boolean): scala.Unit = js.native
  def concatenateTypeDefs(typeDefinitionsAry: js.Array[graphqlDashToolsLib.distInterfacesMod.ITypedef]): java.lang.String = js.native
  def concatenateTypeDefs(
    typeDefinitionsAry: js.Array[graphqlDashToolsLib.distInterfacesMod.ITypedef],
    calledFunctionRefs: js.Any
  ): java.lang.String = js.native
  def decorateWithLogger(
    fn: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]],
    logger: graphqlDashToolsLib.distInterfacesMod.ILogger,
    hint: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def decorateWithLogger(
    fn: js.UndefOr[scala.Nothing],
    logger: graphqlDashToolsLib.distInterfacesMod.ILogger,
    hint: java.lang.String
  ): graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def defaultCreateRemoteResolver(fetcher: graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher): graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def delegateToSchema(
    options: graphqlDashToolsLib.distInterfacesMod.IDelegateToSchemaOptions[ScalablyTyped.runtime.StringDictionary[_]],
    args: js.Any*
  ): stdLib.Promise[_] = js.native
  def delegateToSchema(options: graphqlLib.graphqlMod.GraphQLSchema, args: js.Any*): stdLib.Promise[_] = js.native
  def extendResolversFromInterfaces(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    resolvers: graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _]
  ): graphqlDashToolsLib.distInterfacesMod.IResolvers[_, _] = js.native
  def extractExtensionDefinitions(ast: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode with graphqlDashToolsLib.Anon_Definitions = js.native
  def forEachField(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    fn: graphqlDashToolsLib.distInterfacesMod.IFieldIteratorFn
  ): scala.Unit = js.native
  def introspectSchema(fetcher: apolloDashLinkLib.apolloDashLinkMod.ApolloLink): stdLib.Promise[graphqlLib.graphqlMod.GraphQLSchema] = js.native
  def introspectSchema(
    fetcher: apolloDashLinkLib.apolloDashLinkMod.ApolloLink,
    linkContext: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): stdLib.Promise[graphqlLib.graphqlMod.GraphQLSchema] = js.native
  def introspectSchema(fetcher: graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher): stdLib.Promise[graphqlLib.graphqlMod.GraphQLSchema] = js.native
  def introspectSchema(
    fetcher: graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod.Fetcher,
    linkContext: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): stdLib.Promise[graphqlLib.graphqlMod.GraphQLSchema] = js.native
  def makeExecutableSchema[TContext](
    hasTypeDefsResolversConnectorsLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesParseOptionsInheritResolversFromInterfaces: graphqlDashToolsLib.distInterfacesMod.IExecutableSchemaDefinition[TContext]
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def makeRemoteExecutableSchema(hasSchemaLinkFetcherCreateResolver: graphqlDashToolsLib.Anon_Fetcher): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def mergeSchemas(
    hasSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfaces: graphqlDashToolsLib.Anon_Resolvers
  ): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def mockServer(
    schema: graphqlDashToolsLib.distInterfacesMod.ITypeDefinitions,
    mocks: graphqlDashToolsLib.distInterfacesMod.IMocks
  ): graphqlDashToolsLib.distInterfacesMod.IMockServer = js.native
  def mockServer(
    schema: graphqlDashToolsLib.distInterfacesMod.ITypeDefinitions,
    mocks: graphqlDashToolsLib.distInterfacesMod.IMocks,
    preserveResolvers: scala.Boolean
  ): graphqlDashToolsLib.distInterfacesMod.IMockServer = js.native
  def mockServer(schema: graphqlLib.graphqlMod.GraphQLSchema, mocks: graphqlDashToolsLib.distInterfacesMod.IMocks): graphqlDashToolsLib.distInterfacesMod.IMockServer = js.native
  def mockServer(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    mocks: graphqlDashToolsLib.distInterfacesMod.IMocks,
    preserveResolvers: scala.Boolean
  ): graphqlDashToolsLib.distInterfacesMod.IMockServer = js.native
  def toApolloError(error: stdLib.Error with apolloDashServerDashErrorsLib.Anon_Extensions): stdLib.Error with apolloDashServerDashErrorsLib.Anon_ExtensionsRecord = js.native
  def toApolloError(error: stdLib.Error with apolloDashServerDashErrorsLib.Anon_Extensions, code: java.lang.String): stdLib.Error with apolloDashServerDashErrorsLib.Anon_ExtensionsRecord = js.native
  def transformSchema(
    targetSchema: graphqlLib.graphqlMod.GraphQLSchema,
    transforms: js.Array[graphqlDashToolsLib.distInterfacesMod.Transform]
  ): graphqlLib.graphqlMod.GraphQLSchema with graphqlDashToolsLib.Anon_Transforms = js.native
}

