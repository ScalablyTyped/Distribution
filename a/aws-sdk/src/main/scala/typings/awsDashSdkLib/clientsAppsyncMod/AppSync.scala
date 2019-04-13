package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSync
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_AppSync: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a unique key that you can distribute to clients who are executing your API.
    */
  def createApiKey(): awsDashSdkLib.libRequestMod.Request[CreateApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApiKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a unique key that you can distribute to clients who are executing your API.
    */
  def createApiKey(params: CreateApiKeyRequest): awsDashSdkLib.libRequestMod.Request[CreateApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createApiKey(
    params: CreateApiKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a DataSource object.
    */
  def createDataSource(): awsDashSdkLib.libRequestMod.Request[CreateDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a DataSource object.
    */
  def createDataSource(params: CreateDataSourceRequest): awsDashSdkLib.libRequestMod.Request[CreateDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDataSource(
    params: CreateDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Function object. A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
    */
  def createFunction(): awsDashSdkLib.libRequestMod.Request[CreateFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Function object. A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
    */
  def createFunction(params: CreateFunctionRequest): awsDashSdkLib.libRequestMod.Request[CreateFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFunction(
    params: CreateFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a GraphqlApi object.
    */
  def createGraphqlApi(): awsDashSdkLib.libRequestMod.Request[CreateGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGraphqlApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a GraphqlApi object.
    */
  def createGraphqlApi(params: CreateGraphqlApiRequest): awsDashSdkLib.libRequestMod.Request[CreateGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGraphqlApi(
    params: CreateGraphqlApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Resolver object. A resolver converts incoming requests into a format that a data source can understand and converts the data source's responses into GraphQL.
    */
  def createResolver(): awsDashSdkLib.libRequestMod.Request[CreateResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResolver(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Resolver object. A resolver converts incoming requests into a format that a data source can understand and converts the data source's responses into GraphQL.
    */
  def createResolver(params: CreateResolverRequest): awsDashSdkLib.libRequestMod.Request[CreateResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResolver(
    params: CreateResolverRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Type object.
    */
  def createType(): awsDashSdkLib.libRequestMod.Request[CreateTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Type object.
    */
  def createType(params: CreateTypeRequest): awsDashSdkLib.libRequestMod.Request[CreateTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createType(
    params: CreateTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an API key.
    */
  def deleteApiKey(): awsDashSdkLib.libRequestMod.Request[DeleteApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApiKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an API key.
    */
  def deleteApiKey(params: DeleteApiKeyRequest): awsDashSdkLib.libRequestMod.Request[DeleteApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteApiKey(
    params: DeleteApiKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DataSource object.
    */
  def deleteDataSource(): awsDashSdkLib.libRequestMod.Request[DeleteDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a DataSource object.
    */
  def deleteDataSource(params: DeleteDataSourceRequest): awsDashSdkLib.libRequestMod.Request[DeleteDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDataSource(
    params: DeleteDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Function.
    */
  def deleteFunction(): awsDashSdkLib.libRequestMod.Request[DeleteFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Function.
    */
  def deleteFunction(params: DeleteFunctionRequest): awsDashSdkLib.libRequestMod.Request[DeleteFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFunction(
    params: DeleteFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a GraphqlApi object.
    */
  def deleteGraphqlApi(): awsDashSdkLib.libRequestMod.Request[DeleteGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGraphqlApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a GraphqlApi object.
    */
  def deleteGraphqlApi(params: DeleteGraphqlApiRequest): awsDashSdkLib.libRequestMod.Request[DeleteGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGraphqlApi(
    params: DeleteGraphqlApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Resolver object.
    */
  def deleteResolver(): awsDashSdkLib.libRequestMod.Request[DeleteResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResolver(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Resolver object.
    */
  def deleteResolver(params: DeleteResolverRequest): awsDashSdkLib.libRequestMod.Request[DeleteResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResolver(
    params: DeleteResolverRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Type object.
    */
  def deleteType(): awsDashSdkLib.libRequestMod.Request[DeleteTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Type object.
    */
  def deleteType(params: DeleteTypeRequest): awsDashSdkLib.libRequestMod.Request[DeleteTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteType(
    params: DeleteTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a DataSource object.
    */
  def getDataSource(): awsDashSdkLib.libRequestMod.Request[GetDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a DataSource object.
    */
  def getDataSource(params: GetDataSourceRequest): awsDashSdkLib.libRequestMod.Request[GetDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDataSource(
    params: GetDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get a Function.
    */
  def getFunction(): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Get a Function.
    */
  def getFunction(params: GetFunctionRequest): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFunction(
    params: GetFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a GraphqlApi object.
    */
  def getGraphqlApi(): awsDashSdkLib.libRequestMod.Request[GetGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGraphqlApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a GraphqlApi object.
    */
  def getGraphqlApi(params: GetGraphqlApiRequest): awsDashSdkLib.libRequestMod.Request[GetGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGraphqlApi(
    params: GetGraphqlApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the introspection schema for a GraphQL API.
    */
  def getIntrospectionSchema(): awsDashSdkLib.libRequestMod.Request[GetIntrospectionSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntrospectionSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIntrospectionSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIntrospectionSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the introspection schema for a GraphQL API.
    */
  def getIntrospectionSchema(params: GetIntrospectionSchemaRequest): awsDashSdkLib.libRequestMod.Request[GetIntrospectionSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIntrospectionSchema(
    params: GetIntrospectionSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIntrospectionSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIntrospectionSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a Resolver object.
    */
  def getResolver(): awsDashSdkLib.libRequestMod.Request[GetResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResolver(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a Resolver object.
    */
  def getResolver(params: GetResolverRequest): awsDashSdkLib.libRequestMod.Request[GetResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResolver(
    params: GetResolverRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current status of a schema creation operation.
    */
  def getSchemaCreationStatus(): awsDashSdkLib.libRequestMod.Request[GetSchemaCreationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSchemaCreationStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSchemaCreationStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSchemaCreationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current status of a schema creation operation.
    */
  def getSchemaCreationStatus(params: GetSchemaCreationStatusRequest): awsDashSdkLib.libRequestMod.Request[GetSchemaCreationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSchemaCreationStatus(
    params: GetSchemaCreationStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSchemaCreationStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSchemaCreationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a Type object.
    */
  def getType(): awsDashSdkLib.libRequestMod.Request[GetTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getType(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTypeResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a Type object.
    */
  def getType(params: GetTypeRequest): awsDashSdkLib.libRequestMod.Request[GetTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getType(
    params: GetTypeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTypeResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the API keys for a given API.  API keys are deleted automatically sometime after they expire. However, they may still be included in the response until they have actually been deleted. You can safely call DeleteApiKey to manually delete a key before it's automatically deleted. 
    */
  def listApiKeys(): awsDashSdkLib.libRequestMod.Request[ListApiKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApiKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApiKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApiKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the API keys for a given API.  API keys are deleted automatically sometime after they expire. However, they may still be included in the response until they have actually been deleted. You can safely call DeleteApiKey to manually delete a key before it's automatically deleted. 
    */
  def listApiKeys(params: ListApiKeysRequest): awsDashSdkLib.libRequestMod.Request[ListApiKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listApiKeys(
    params: ListApiKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListApiKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListApiKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the data sources for a given API.
    */
  def listDataSources(): awsDashSdkLib.libRequestMod.Request[ListDataSourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDataSources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDataSourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDataSourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the data sources for a given API.
    */
  def listDataSources(params: ListDataSourcesRequest): awsDashSdkLib.libRequestMod.Request[ListDataSourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDataSources(
    params: ListDataSourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDataSourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDataSourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List multiple functions.
    */
  def listFunctions(): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFunctions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFunctionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List multiple functions.
    */
  def listFunctions(params: ListFunctionsRequest): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFunctions(
    params: ListFunctionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFunctionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists your GraphQL APIs.
    */
  def listGraphqlApis(): awsDashSdkLib.libRequestMod.Request[ListGraphqlApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGraphqlApis(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGraphqlApisResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGraphqlApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists your GraphQL APIs.
    */
  def listGraphqlApis(params: ListGraphqlApisRequest): awsDashSdkLib.libRequestMod.Request[ListGraphqlApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGraphqlApis(
    params: ListGraphqlApisRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGraphqlApisResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGraphqlApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the resolvers for a given API and type.
    */
  def listResolvers(): awsDashSdkLib.libRequestMod.Request[ListResolversResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResolvers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResolversResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResolversResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the resolvers for a given API and type.
    */
  def listResolvers(params: ListResolversRequest): awsDashSdkLib.libRequestMod.Request[ListResolversResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResolvers(
    params: ListResolversRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResolversResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResolversResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the resolvers that are associated with a specific function.
    */
  def listResolversByFunction(): awsDashSdkLib.libRequestMod.Request[ListResolversByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResolversByFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResolversByFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResolversByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List the resolvers that are associated with a specific function.
    */
  def listResolversByFunction(params: ListResolversByFunctionRequest): awsDashSdkLib.libRequestMod.Request[ListResolversByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResolversByFunction(
    params: ListResolversByFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResolversByFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResolversByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the types for a given API.
    */
  def listTypes(): awsDashSdkLib.libRequestMod.Request[ListTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the types for a given API.
    */
  def listTypes(params: ListTypesRequest): awsDashSdkLib.libRequestMod.Request[ListTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTypes(
    params: ListTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a new schema to your GraphQL API. This operation is asynchronous. Use to determine when it has completed.
    */
  def startSchemaCreation(): awsDashSdkLib.libRequestMod.Request[StartSchemaCreationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSchemaCreation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSchemaCreationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSchemaCreationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a new schema to your GraphQL API. This operation is asynchronous. Use to determine when it has completed.
    */
  def startSchemaCreation(params: StartSchemaCreationRequest): awsDashSdkLib.libRequestMod.Request[StartSchemaCreationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startSchemaCreation(
    params: StartSchemaCreationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartSchemaCreationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartSchemaCreationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an API key.
    */
  def updateApiKey(): awsDashSdkLib.libRequestMod.Request[UpdateApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApiKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an API key.
    */
  def updateApiKey(params: UpdateApiKeyRequest): awsDashSdkLib.libRequestMod.Request[UpdateApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateApiKey(
    params: UpdateApiKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a DataSource object.
    */
  def updateDataSource(): awsDashSdkLib.libRequestMod.Request[UpdateDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a DataSource object.
    */
  def updateDataSource(params: UpdateDataSourceRequest): awsDashSdkLib.libRequestMod.Request[UpdateDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDataSource(
    params: UpdateDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Function object.
    */
  def updateFunction(): awsDashSdkLib.libRequestMod.Request[UpdateFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Function object.
    */
  def updateFunction(params: UpdateFunctionRequest): awsDashSdkLib.libRequestMod.Request[UpdateFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFunction(
    params: UpdateFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a GraphqlApi object.
    */
  def updateGraphqlApi(): awsDashSdkLib.libRequestMod.Request[UpdateGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGraphqlApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a GraphqlApi object.
    */
  def updateGraphqlApi(params: UpdateGraphqlApiRequest): awsDashSdkLib.libRequestMod.Request[UpdateGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGraphqlApi(
    params: UpdateGraphqlApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Resolver object.
    */
  def updateResolver(): awsDashSdkLib.libRequestMod.Request[UpdateResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResolver(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Resolver object.
    */
  def updateResolver(params: UpdateResolverRequest): awsDashSdkLib.libRequestMod.Request[UpdateResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResolver(
    params: UpdateResolverRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateResolverResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Type object.
    */
  def updateType(): awsDashSdkLib.libRequestMod.Request[UpdateTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Type object.
    */
  def updateType(params: UpdateTypeRequest): awsDashSdkLib.libRequestMod.Request[UpdateTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateType(
    params: UpdateTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

