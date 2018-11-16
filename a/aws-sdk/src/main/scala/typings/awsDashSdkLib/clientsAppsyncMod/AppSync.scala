package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSync
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_AppSync: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ClientConfiguration = js.native
  /**
     * Creates a unique key that you can distribute to clients who are executing your API.
     */
  def createApiKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a unique key that you can distribute to clients who are executing your API.
     */
  def createApiKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a unique key that you can distribute to clients who are executing your API.
     */
  def createApiKey(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateApiKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a unique key that you can distribute to clients who are executing your API.
     */
  def createApiKey(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateApiKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a DataSource object.
     */
  def createDataSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a DataSource object.
     */
  def createDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a DataSource object.
     */
  def createDataSource(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateDataSourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a DataSource object.
     */
  def createDataSource(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a GraphqlApi object.
     */
  def createGraphqlApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a GraphqlApi object.
     */
  def createGraphqlApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a GraphqlApi object.
     */
  def createGraphqlApi(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateGraphqlApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a GraphqlApi object.
     */
  def createGraphqlApi(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateGraphqlApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Resolver object. A resolver converts incoming requests into a format that a data source can understand and converts the data source's responses into GraphQL.
     */
  def createResolver(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Resolver object. A resolver converts incoming requests into a format that a data source can understand and converts the data source's responses into GraphQL.
     */
  def createResolver(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Resolver object. A resolver converts incoming requests into a format that a data source can understand and converts the data source's responses into GraphQL.
     */
  def createResolver(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateResolverRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Resolver object. A resolver converts incoming requests into a format that a data source can understand and converts the data source's responses into GraphQL.
     */
  def createResolver(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateResolverRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Type object.
     */
  def createType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Type object.
     */
  def createType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Type object.
     */
  def createType(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Type object.
     */
  def createType(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.CreateTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an API key.
     */
  def deleteApiKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an API key.
     */
  def deleteApiKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an API key.
     */
  def deleteApiKey(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteApiKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an API key.
     */
  def deleteApiKey(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteApiKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a DataSource object.
     */
  def deleteDataSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a DataSource object.
     */
  def deleteDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a DataSource object.
     */
  def deleteDataSource(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteDataSourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a DataSource object.
     */
  def deleteDataSource(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a GraphqlApi object.
     */
  def deleteGraphqlApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a GraphqlApi object.
     */
  def deleteGraphqlApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a GraphqlApi object.
     */
  def deleteGraphqlApi(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteGraphqlApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a GraphqlApi object.
     */
  def deleteGraphqlApi(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteGraphqlApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Resolver object.
     */
  def deleteResolver(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Resolver object.
     */
  def deleteResolver(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Resolver object.
     */
  def deleteResolver(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteResolverRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Resolver object.
     */
  def deleteResolver(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteResolverRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Type object.
     */
  def deleteType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Type object.
     */
  def deleteType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Type object.
     */
  def deleteType(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Type object.
     */
  def deleteType(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.DeleteTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a DataSource object.
     */
  def getDataSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a DataSource object.
     */
  def getDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a DataSource object.
     */
  def getDataSource(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetDataSourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a DataSource object.
     */
  def getDataSource(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a GraphqlApi object.
     */
  def getGraphqlApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a GraphqlApi object.
     */
  def getGraphqlApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a GraphqlApi object.
     */
  def getGraphqlApi(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetGraphqlApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a GraphqlApi object.
     */
  def getGraphqlApi(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetGraphqlApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the introspection schema for a GraphQL API.
     */
  def getIntrospectionSchema(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetIntrospectionSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the introspection schema for a GraphQL API.
     */
  def getIntrospectionSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetIntrospectionSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetIntrospectionSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the introspection schema for a GraphQL API.
     */
  def getIntrospectionSchema(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetIntrospectionSchemaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetIntrospectionSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the introspection schema for a GraphQL API.
     */
  def getIntrospectionSchema(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetIntrospectionSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetIntrospectionSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetIntrospectionSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a Resolver object.
     */
  def getResolver(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a Resolver object.
     */
  def getResolver(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a Resolver object.
     */
  def getResolver(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetResolverRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a Resolver object.
     */
  def getResolver(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetResolverRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current status of a schema creation operation.
     */
  def getSchemaCreationStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetSchemaCreationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current status of a schema creation operation.
     */
  def getSchemaCreationStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetSchemaCreationStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetSchemaCreationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current status of a schema creation operation.
     */
  def getSchemaCreationStatus(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetSchemaCreationStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetSchemaCreationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current status of a schema creation operation.
     */
  def getSchemaCreationStatus(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetSchemaCreationStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetSchemaCreationStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetSchemaCreationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a Type object.
     */
  def getType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a Type object.
     */
  def getType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a Type object.
     */
  def getType(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a Type object.
     */
  def getType(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.GetTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the API keys for a given API.  API keys are deleted automatically sometime after they expire. However, they may still be included in the response until they have actually been deleted. You can safely call DeleteApiKey to manually delete a key before it's automatically deleted. 
     */
  def listApiKeys(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListApiKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the API keys for a given API.  API keys are deleted automatically sometime after they expire. However, they may still be included in the response until they have actually been deleted. You can safely call DeleteApiKey to manually delete a key before it's automatically deleted. 
     */
  def listApiKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListApiKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListApiKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the API keys for a given API.  API keys are deleted automatically sometime after they expire. However, they may still be included in the response until they have actually been deleted. You can safely call DeleteApiKey to manually delete a key before it's automatically deleted. 
     */
  def listApiKeys(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListApiKeysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListApiKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the API keys for a given API.  API keys are deleted automatically sometime after they expire. However, they may still be included in the response until they have actually been deleted. You can safely call DeleteApiKey to manually delete a key before it's automatically deleted. 
     */
  def listApiKeys(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListApiKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListApiKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListApiKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the data sources for a given API.
     */
  def listDataSources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListDataSourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the data sources for a given API.
     */
  def listDataSources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListDataSourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListDataSourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the data sources for a given API.
     */
  def listDataSources(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListDataSourcesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListDataSourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the data sources for a given API.
     */
  def listDataSources(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListDataSourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListDataSourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListDataSourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your GraphQL APIs.
     */
  def listGraphqlApis(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListGraphqlApisResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your GraphQL APIs.
     */
  def listGraphqlApis(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListGraphqlApisResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListGraphqlApisResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your GraphQL APIs.
     */
  def listGraphqlApis(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListGraphqlApisRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListGraphqlApisResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists your GraphQL APIs.
     */
  def listGraphqlApis(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListGraphqlApisRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListGraphqlApisResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListGraphqlApisResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resolvers for a given API and type.
     */
  def listResolvers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListResolversResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resolvers for a given API and type.
     */
  def listResolvers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListResolversResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListResolversResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resolvers for a given API and type.
     */
  def listResolvers(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListResolversRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListResolversResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the resolvers for a given API and type.
     */
  def listResolvers(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListResolversRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListResolversResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListResolversResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the types for a given API.
     */
  def listTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the types for a given API.
     */
  def listTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the types for a given API.
     */
  def listTypes(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListTypesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the types for a given API.
     */
  def listTypes(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.ListTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new schema to your GraphQL API. This operation is asynchronous. Use to determine when it has completed.
     */
  def startSchemaCreation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.StartSchemaCreationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new schema to your GraphQL API. This operation is asynchronous. Use to determine when it has completed.
     */
  def startSchemaCreation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.StartSchemaCreationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.StartSchemaCreationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new schema to your GraphQL API. This operation is asynchronous. Use to determine when it has completed.
     */
  def startSchemaCreation(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.StartSchemaCreationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.StartSchemaCreationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new schema to your GraphQL API. This operation is asynchronous. Use to determine when it has completed.
     */
  def startSchemaCreation(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.StartSchemaCreationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.StartSchemaCreationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.StartSchemaCreationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an API key.
     */
  def updateApiKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an API key.
     */
  def updateApiKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an API key.
     */
  def updateApiKey(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateApiKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an API key.
     */
  def updateApiKey(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateApiKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateApiKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateApiKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a DataSource object.
     */
  def updateDataSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a DataSource object.
     */
  def updateDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a DataSource object.
     */
  def updateDataSource(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateDataSourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a DataSource object.
     */
  def updateDataSource(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateDataSourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateDataSourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateDataSourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a GraphqlApi object.
     */
  def updateGraphqlApi(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a GraphqlApi object.
     */
  def updateGraphqlApi(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a GraphqlApi object.
     */
  def updateGraphqlApi(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateGraphqlApiRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a GraphqlApi object.
     */
  def updateGraphqlApi(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateGraphqlApiRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateGraphqlApiResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateGraphqlApiResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Resolver object.
     */
  def updateResolver(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Resolver object.
     */
  def updateResolver(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Resolver object.
     */
  def updateResolver(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateResolverRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Resolver object.
     */
  def updateResolver(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateResolverRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateResolverResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateResolverResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Type object.
     */
  def updateType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Type object.
     */
  def updateType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Type object.
     */
  def updateType(params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateTypeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Type object.
     */
  def updateType(
    params: awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAppsyncMod.AppSyncNs.UpdateTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

