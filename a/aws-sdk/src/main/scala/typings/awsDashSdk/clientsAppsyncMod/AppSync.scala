package typings.awsDashSdk.clientsAppsyncMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSync extends Service {
  @JSName("config")
  var config_AppSync: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a cache for the GraphQL API.
    */
  def createApiCache(): Request[CreateApiCacheResponse, AWSError] = js.native
  def createApiCache(callback: js.Function2[/* err */ AWSError, /* data */ CreateApiCacheResponse, Unit]): Request[CreateApiCacheResponse, AWSError] = js.native
  /**
    * Creates a cache for the GraphQL API.
    */
  def createApiCache(params: CreateApiCacheRequest): Request[CreateApiCacheResponse, AWSError] = js.native
  def createApiCache(
    params: CreateApiCacheRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApiCacheResponse, Unit]
  ): Request[CreateApiCacheResponse, AWSError] = js.native
  /**
    * Creates a unique key that you can distribute to clients who are executing your API.
    */
  def createApiKey(): Request[CreateApiKeyResponse, AWSError] = js.native
  def createApiKey(callback: js.Function2[/* err */ AWSError, /* data */ CreateApiKeyResponse, Unit]): Request[CreateApiKeyResponse, AWSError] = js.native
  /**
    * Creates a unique key that you can distribute to clients who are executing your API.
    */
  def createApiKey(params: CreateApiKeyRequest): Request[CreateApiKeyResponse, AWSError] = js.native
  def createApiKey(
    params: CreateApiKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApiKeyResponse, Unit]
  ): Request[CreateApiKeyResponse, AWSError] = js.native
  /**
    * Creates a DataSource object.
    */
  def createDataSource(): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]): Request[CreateDataSourceResponse, AWSError] = js.native
  /**
    * Creates a DataSource object.
    */
  def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(
    params: CreateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]
  ): Request[CreateDataSourceResponse, AWSError] = js.native
  /**
    * Creates a Function object. A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
    */
  def createFunction(): Request[CreateFunctionResponse, AWSError] = js.native
  def createFunction(callback: js.Function2[/* err */ AWSError, /* data */ CreateFunctionResponse, Unit]): Request[CreateFunctionResponse, AWSError] = js.native
  /**
    * Creates a Function object. A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
    */
  def createFunction(params: CreateFunctionRequest): Request[CreateFunctionResponse, AWSError] = js.native
  def createFunction(
    params: CreateFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFunctionResponse, Unit]
  ): Request[CreateFunctionResponse, AWSError] = js.native
  /**
    * Creates a GraphqlApi object.
    */
  def createGraphqlApi(): Request[CreateGraphqlApiResponse, AWSError] = js.native
  def createGraphqlApi(callback: js.Function2[/* err */ AWSError, /* data */ CreateGraphqlApiResponse, Unit]): Request[CreateGraphqlApiResponse, AWSError] = js.native
  /**
    * Creates a GraphqlApi object.
    */
  def createGraphqlApi(params: CreateGraphqlApiRequest): Request[CreateGraphqlApiResponse, AWSError] = js.native
  def createGraphqlApi(
    params: CreateGraphqlApiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGraphqlApiResponse, Unit]
  ): Request[CreateGraphqlApiResponse, AWSError] = js.native
  /**
    * Creates a Resolver object. A resolver converts incoming requests into a format that a data source can understand and converts the data source's responses into GraphQL.
    */
  def createResolver(): Request[CreateResolverResponse, AWSError] = js.native
  def createResolver(callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverResponse, Unit]): Request[CreateResolverResponse, AWSError] = js.native
  /**
    * Creates a Resolver object. A resolver converts incoming requests into a format that a data source can understand and converts the data source's responses into GraphQL.
    */
  def createResolver(params: CreateResolverRequest): Request[CreateResolverResponse, AWSError] = js.native
  def createResolver(
    params: CreateResolverRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResolverResponse, Unit]
  ): Request[CreateResolverResponse, AWSError] = js.native
  /**
    * Creates a Type object.
    */
  def createType(): Request[CreateTypeResponse, AWSError] = js.native
  def createType(callback: js.Function2[/* err */ AWSError, /* data */ CreateTypeResponse, Unit]): Request[CreateTypeResponse, AWSError] = js.native
  /**
    * Creates a Type object.
    */
  def createType(params: CreateTypeRequest): Request[CreateTypeResponse, AWSError] = js.native
  def createType(
    params: CreateTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTypeResponse, Unit]
  ): Request[CreateTypeResponse, AWSError] = js.native
  /**
    * Deletes an ApiCache object.
    */
  def deleteApiCache(): Request[DeleteApiCacheResponse, AWSError] = js.native
  def deleteApiCache(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApiCacheResponse, Unit]): Request[DeleteApiCacheResponse, AWSError] = js.native
  /**
    * Deletes an ApiCache object.
    */
  def deleteApiCache(params: DeleteApiCacheRequest): Request[DeleteApiCacheResponse, AWSError] = js.native
  def deleteApiCache(
    params: DeleteApiCacheRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApiCacheResponse, Unit]
  ): Request[DeleteApiCacheResponse, AWSError] = js.native
  /**
    * Deletes an API key.
    */
  def deleteApiKey(): Request[DeleteApiKeyResponse, AWSError] = js.native
  def deleteApiKey(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApiKeyResponse, Unit]): Request[DeleteApiKeyResponse, AWSError] = js.native
  /**
    * Deletes an API key.
    */
  def deleteApiKey(params: DeleteApiKeyRequest): Request[DeleteApiKeyResponse, AWSError] = js.native
  def deleteApiKey(
    params: DeleteApiKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApiKeyResponse, Unit]
  ): Request[DeleteApiKeyResponse, AWSError] = js.native
  /**
    * Deletes a DataSource object.
    */
  def deleteDataSource(): Request[DeleteDataSourceResponse, AWSError] = js.native
  def deleteDataSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSourceResponse, Unit]): Request[DeleteDataSourceResponse, AWSError] = js.native
  /**
    * Deletes a DataSource object.
    */
  def deleteDataSource(params: DeleteDataSourceRequest): Request[DeleteDataSourceResponse, AWSError] = js.native
  def deleteDataSource(
    params: DeleteDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSourceResponse, Unit]
  ): Request[DeleteDataSourceResponse, AWSError] = js.native
  /**
    * Deletes a Function.
    */
  def deleteFunction(): Request[DeleteFunctionResponse, AWSError] = js.native
  def deleteFunction(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFunctionResponse, Unit]): Request[DeleteFunctionResponse, AWSError] = js.native
  /**
    * Deletes a Function.
    */
  def deleteFunction(params: DeleteFunctionRequest): Request[DeleteFunctionResponse, AWSError] = js.native
  def deleteFunction(
    params: DeleteFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFunctionResponse, Unit]
  ): Request[DeleteFunctionResponse, AWSError] = js.native
  /**
    * Deletes a GraphqlApi object.
    */
  def deleteGraphqlApi(): Request[DeleteGraphqlApiResponse, AWSError] = js.native
  def deleteGraphqlApi(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGraphqlApiResponse, Unit]): Request[DeleteGraphqlApiResponse, AWSError] = js.native
  /**
    * Deletes a GraphqlApi object.
    */
  def deleteGraphqlApi(params: DeleteGraphqlApiRequest): Request[DeleteGraphqlApiResponse, AWSError] = js.native
  def deleteGraphqlApi(
    params: DeleteGraphqlApiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGraphqlApiResponse, Unit]
  ): Request[DeleteGraphqlApiResponse, AWSError] = js.native
  /**
    * Deletes a Resolver object.
    */
  def deleteResolver(): Request[DeleteResolverResponse, AWSError] = js.native
  def deleteResolver(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverResponse, Unit]): Request[DeleteResolverResponse, AWSError] = js.native
  /**
    * Deletes a Resolver object.
    */
  def deleteResolver(params: DeleteResolverRequest): Request[DeleteResolverResponse, AWSError] = js.native
  def deleteResolver(
    params: DeleteResolverRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResolverResponse, Unit]
  ): Request[DeleteResolverResponse, AWSError] = js.native
  /**
    * Deletes a Type object.
    */
  def deleteType(): Request[DeleteTypeResponse, AWSError] = js.native
  def deleteType(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTypeResponse, Unit]): Request[DeleteTypeResponse, AWSError] = js.native
  /**
    * Deletes a Type object.
    */
  def deleteType(params: DeleteTypeRequest): Request[DeleteTypeResponse, AWSError] = js.native
  def deleteType(
    params: DeleteTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTypeResponse, Unit]
  ): Request[DeleteTypeResponse, AWSError] = js.native
  /**
    * Flushes an ApiCache object.
    */
  def flushApiCache(): Request[FlushApiCacheResponse, AWSError] = js.native
  def flushApiCache(callback: js.Function2[/* err */ AWSError, /* data */ FlushApiCacheResponse, Unit]): Request[FlushApiCacheResponse, AWSError] = js.native
  /**
    * Flushes an ApiCache object.
    */
  def flushApiCache(params: FlushApiCacheRequest): Request[FlushApiCacheResponse, AWSError] = js.native
  def flushApiCache(
    params: FlushApiCacheRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FlushApiCacheResponse, Unit]
  ): Request[FlushApiCacheResponse, AWSError] = js.native
  /**
    * Retrieves an ApiCache object.
    */
  def getApiCache(): Request[GetApiCacheResponse, AWSError] = js.native
  def getApiCache(callback: js.Function2[/* err */ AWSError, /* data */ GetApiCacheResponse, Unit]): Request[GetApiCacheResponse, AWSError] = js.native
  /**
    * Retrieves an ApiCache object.
    */
  def getApiCache(params: GetApiCacheRequest): Request[GetApiCacheResponse, AWSError] = js.native
  def getApiCache(
    params: GetApiCacheRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApiCacheResponse, Unit]
  ): Request[GetApiCacheResponse, AWSError] = js.native
  /**
    * Retrieves a DataSource object.
    */
  def getDataSource(): Request[GetDataSourceResponse, AWSError] = js.native
  def getDataSource(callback: js.Function2[/* err */ AWSError, /* data */ GetDataSourceResponse, Unit]): Request[GetDataSourceResponse, AWSError] = js.native
  /**
    * Retrieves a DataSource object.
    */
  def getDataSource(params: GetDataSourceRequest): Request[GetDataSourceResponse, AWSError] = js.native
  def getDataSource(
    params: GetDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataSourceResponse, Unit]
  ): Request[GetDataSourceResponse, AWSError] = js.native
  /**
    * Get a Function.
    */
  def getFunction(): Request[GetFunctionResponse, AWSError] = js.native
  def getFunction(callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionResponse, Unit]): Request[GetFunctionResponse, AWSError] = js.native
  /**
    * Get a Function.
    */
  def getFunction(params: GetFunctionRequest): Request[GetFunctionResponse, AWSError] = js.native
  def getFunction(
    params: GetFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFunctionResponse, Unit]
  ): Request[GetFunctionResponse, AWSError] = js.native
  /**
    * Retrieves a GraphqlApi object.
    */
  def getGraphqlApi(): Request[GetGraphqlApiResponse, AWSError] = js.native
  def getGraphqlApi(callback: js.Function2[/* err */ AWSError, /* data */ GetGraphqlApiResponse, Unit]): Request[GetGraphqlApiResponse, AWSError] = js.native
  /**
    * Retrieves a GraphqlApi object.
    */
  def getGraphqlApi(params: GetGraphqlApiRequest): Request[GetGraphqlApiResponse, AWSError] = js.native
  def getGraphqlApi(
    params: GetGraphqlApiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGraphqlApiResponse, Unit]
  ): Request[GetGraphqlApiResponse, AWSError] = js.native
  /**
    * Retrieves the introspection schema for a GraphQL API.
    */
  def getIntrospectionSchema(): Request[GetIntrospectionSchemaResponse, AWSError] = js.native
  def getIntrospectionSchema(callback: js.Function2[/* err */ AWSError, /* data */ GetIntrospectionSchemaResponse, Unit]): Request[GetIntrospectionSchemaResponse, AWSError] = js.native
  /**
    * Retrieves the introspection schema for a GraphQL API.
    */
  def getIntrospectionSchema(params: GetIntrospectionSchemaRequest): Request[GetIntrospectionSchemaResponse, AWSError] = js.native
  def getIntrospectionSchema(
    params: GetIntrospectionSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIntrospectionSchemaResponse, Unit]
  ): Request[GetIntrospectionSchemaResponse, AWSError] = js.native
  /**
    * Retrieves a Resolver object.
    */
  def getResolver(): Request[GetResolverResponse, AWSError] = js.native
  def getResolver(callback: js.Function2[/* err */ AWSError, /* data */ GetResolverResponse, Unit]): Request[GetResolverResponse, AWSError] = js.native
  /**
    * Retrieves a Resolver object.
    */
  def getResolver(params: GetResolverRequest): Request[GetResolverResponse, AWSError] = js.native
  def getResolver(
    params: GetResolverRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResolverResponse, Unit]
  ): Request[GetResolverResponse, AWSError] = js.native
  /**
    * Retrieves the current status of a schema creation operation.
    */
  def getSchemaCreationStatus(): Request[GetSchemaCreationStatusResponse, AWSError] = js.native
  def getSchemaCreationStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetSchemaCreationStatusResponse, Unit]): Request[GetSchemaCreationStatusResponse, AWSError] = js.native
  /**
    * Retrieves the current status of a schema creation operation.
    */
  def getSchemaCreationStatus(params: GetSchemaCreationStatusRequest): Request[GetSchemaCreationStatusResponse, AWSError] = js.native
  def getSchemaCreationStatus(
    params: GetSchemaCreationStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSchemaCreationStatusResponse, Unit]
  ): Request[GetSchemaCreationStatusResponse, AWSError] = js.native
  /**
    * Retrieves a Type object.
    */
  def getType(): Request[GetTypeResponse, AWSError] = js.native
  def getType(callback: js.Function2[/* err */ AWSError, /* data */ GetTypeResponse, Unit]): Request[GetTypeResponse, AWSError] = js.native
  /**
    * Retrieves a Type object.
    */
  def getType(params: GetTypeRequest): Request[GetTypeResponse, AWSError] = js.native
  def getType(
    params: GetTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTypeResponse, Unit]
  ): Request[GetTypeResponse, AWSError] = js.native
  /**
    * Lists the API keys for a given API.  API keys are deleted automatically sometime after they expire. However, they may still be included in the response until they have actually been deleted. You can safely call DeleteApiKey to manually delete a key before it's automatically deleted. 
    */
  def listApiKeys(): Request[ListApiKeysResponse, AWSError] = js.native
  def listApiKeys(callback: js.Function2[/* err */ AWSError, /* data */ ListApiKeysResponse, Unit]): Request[ListApiKeysResponse, AWSError] = js.native
  /**
    * Lists the API keys for a given API.  API keys are deleted automatically sometime after they expire. However, they may still be included in the response until they have actually been deleted. You can safely call DeleteApiKey to manually delete a key before it's automatically deleted. 
    */
  def listApiKeys(params: ListApiKeysRequest): Request[ListApiKeysResponse, AWSError] = js.native
  def listApiKeys(
    params: ListApiKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApiKeysResponse, Unit]
  ): Request[ListApiKeysResponse, AWSError] = js.native
  /**
    * Lists the data sources for a given API.
    */
  def listDataSources(): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]): Request[ListDataSourcesResponse, AWSError] = js.native
  /**
    * Lists the data sources for a given API.
    */
  def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(
    params: ListDataSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]
  ): Request[ListDataSourcesResponse, AWSError] = js.native
  /**
    * List multiple functions.
    */
  def listFunctions(): Request[ListFunctionsResponse, AWSError] = js.native
  def listFunctions(callback: js.Function2[/* err */ AWSError, /* data */ ListFunctionsResponse, Unit]): Request[ListFunctionsResponse, AWSError] = js.native
  /**
    * List multiple functions.
    */
  def listFunctions(params: ListFunctionsRequest): Request[ListFunctionsResponse, AWSError] = js.native
  def listFunctions(
    params: ListFunctionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFunctionsResponse, Unit]
  ): Request[ListFunctionsResponse, AWSError] = js.native
  /**
    * Lists your GraphQL APIs.
    */
  def listGraphqlApis(): Request[ListGraphqlApisResponse, AWSError] = js.native
  def listGraphqlApis(callback: js.Function2[/* err */ AWSError, /* data */ ListGraphqlApisResponse, Unit]): Request[ListGraphqlApisResponse, AWSError] = js.native
  /**
    * Lists your GraphQL APIs.
    */
  def listGraphqlApis(params: ListGraphqlApisRequest): Request[ListGraphqlApisResponse, AWSError] = js.native
  def listGraphqlApis(
    params: ListGraphqlApisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGraphqlApisResponse, Unit]
  ): Request[ListGraphqlApisResponse, AWSError] = js.native
  /**
    * Lists the resolvers for a given API and type.
    */
  def listResolvers(): Request[ListResolversResponse, AWSError] = js.native
  def listResolvers(callback: js.Function2[/* err */ AWSError, /* data */ ListResolversResponse, Unit]): Request[ListResolversResponse, AWSError] = js.native
  /**
    * Lists the resolvers for a given API and type.
    */
  def listResolvers(params: ListResolversRequest): Request[ListResolversResponse, AWSError] = js.native
  def listResolvers(
    params: ListResolversRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolversResponse, Unit]
  ): Request[ListResolversResponse, AWSError] = js.native
  /**
    * List the resolvers that are associated with a specific function.
    */
  def listResolversByFunction(): Request[ListResolversByFunctionResponse, AWSError] = js.native
  def listResolversByFunction(callback: js.Function2[/* err */ AWSError, /* data */ ListResolversByFunctionResponse, Unit]): Request[ListResolversByFunctionResponse, AWSError] = js.native
  /**
    * List the resolvers that are associated with a specific function.
    */
  def listResolversByFunction(params: ListResolversByFunctionRequest): Request[ListResolversByFunctionResponse, AWSError] = js.native
  def listResolversByFunction(
    params: ListResolversByFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResolversByFunctionResponse, Unit]
  ): Request[ListResolversByFunctionResponse, AWSError] = js.native
  /**
    * Lists the tags for a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the types for a given API.
    */
  def listTypes(): Request[ListTypesResponse, AWSError] = js.native
  def listTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListTypesResponse, Unit]): Request[ListTypesResponse, AWSError] = js.native
  /**
    * Lists the types for a given API.
    */
  def listTypes(params: ListTypesRequest): Request[ListTypesResponse, AWSError] = js.native
  def listTypes(
    params: ListTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTypesResponse, Unit]
  ): Request[ListTypesResponse, AWSError] = js.native
  /**
    * Adds a new schema to your GraphQL API. This operation is asynchronous. Use to determine when it has completed.
    */
  def startSchemaCreation(): Request[StartSchemaCreationResponse, AWSError] = js.native
  def startSchemaCreation(callback: js.Function2[/* err */ AWSError, /* data */ StartSchemaCreationResponse, Unit]): Request[StartSchemaCreationResponse, AWSError] = js.native
  /**
    * Adds a new schema to your GraphQL API. This operation is asynchronous. Use to determine when it has completed.
    */
  def startSchemaCreation(params: StartSchemaCreationRequest): Request[StartSchemaCreationResponse, AWSError] = js.native
  def startSchemaCreation(
    params: StartSchemaCreationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSchemaCreationResponse, Unit]
  ): Request[StartSchemaCreationResponse, AWSError] = js.native
  /**
    * Tags a resource with user-supplied tags.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Tags a resource with user-supplied tags.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Untags a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Untags a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates the cache for the GraphQL API.
    */
  def updateApiCache(): Request[UpdateApiCacheResponse, AWSError] = js.native
  def updateApiCache(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApiCacheResponse, Unit]): Request[UpdateApiCacheResponse, AWSError] = js.native
  /**
    * Updates the cache for the GraphQL API.
    */
  def updateApiCache(params: UpdateApiCacheRequest): Request[UpdateApiCacheResponse, AWSError] = js.native
  def updateApiCache(
    params: UpdateApiCacheRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApiCacheResponse, Unit]
  ): Request[UpdateApiCacheResponse, AWSError] = js.native
  /**
    * Updates an API key.
    */
  def updateApiKey(): Request[UpdateApiKeyResponse, AWSError] = js.native
  def updateApiKey(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApiKeyResponse, Unit]): Request[UpdateApiKeyResponse, AWSError] = js.native
  /**
    * Updates an API key.
    */
  def updateApiKey(params: UpdateApiKeyRequest): Request[UpdateApiKeyResponse, AWSError] = js.native
  def updateApiKey(
    params: UpdateApiKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApiKeyResponse, Unit]
  ): Request[UpdateApiKeyResponse, AWSError] = js.native
  /**
    * Updates a DataSource object.
    */
  def updateDataSource(): Request[UpdateDataSourceResponse, AWSError] = js.native
  def updateDataSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourceResponse, Unit]): Request[UpdateDataSourceResponse, AWSError] = js.native
  /**
    * Updates a DataSource object.
    */
  def updateDataSource(params: UpdateDataSourceRequest): Request[UpdateDataSourceResponse, AWSError] = js.native
  def updateDataSource(
    params: UpdateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourceResponse, Unit]
  ): Request[UpdateDataSourceResponse, AWSError] = js.native
  /**
    * Updates a Function object.
    */
  def updateFunction(): Request[UpdateFunctionResponse, AWSError] = js.native
  def updateFunction(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFunctionResponse, Unit]): Request[UpdateFunctionResponse, AWSError] = js.native
  /**
    * Updates a Function object.
    */
  def updateFunction(params: UpdateFunctionRequest): Request[UpdateFunctionResponse, AWSError] = js.native
  def updateFunction(
    params: UpdateFunctionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFunctionResponse, Unit]
  ): Request[UpdateFunctionResponse, AWSError] = js.native
  /**
    * Updates a GraphqlApi object.
    */
  def updateGraphqlApi(): Request[UpdateGraphqlApiResponse, AWSError] = js.native
  def updateGraphqlApi(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGraphqlApiResponse, Unit]): Request[UpdateGraphqlApiResponse, AWSError] = js.native
  /**
    * Updates a GraphqlApi object.
    */
  def updateGraphqlApi(params: UpdateGraphqlApiRequest): Request[UpdateGraphqlApiResponse, AWSError] = js.native
  def updateGraphqlApi(
    params: UpdateGraphqlApiRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGraphqlApiResponse, Unit]
  ): Request[UpdateGraphqlApiResponse, AWSError] = js.native
  /**
    * Updates a Resolver object.
    */
  def updateResolver(): Request[UpdateResolverResponse, AWSError] = js.native
  def updateResolver(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResolverResponse, Unit]): Request[UpdateResolverResponse, AWSError] = js.native
  /**
    * Updates a Resolver object.
    */
  def updateResolver(params: UpdateResolverRequest): Request[UpdateResolverResponse, AWSError] = js.native
  def updateResolver(
    params: UpdateResolverRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResolverResponse, Unit]
  ): Request[UpdateResolverResponse, AWSError] = js.native
  /**
    * Updates a Type object.
    */
  def updateType(): Request[UpdateTypeResponse, AWSError] = js.native
  def updateType(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTypeResponse, Unit]): Request[UpdateTypeResponse, AWSError] = js.native
  /**
    * Updates a Type object.
    */
  def updateType(params: UpdateTypeRequest): Request[UpdateTypeResponse, AWSError] = js.native
  def updateType(
    params: UpdateTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTypeResponse, Unit]
  ): Request[UpdateTypeResponse, AWSError] = js.native
}

