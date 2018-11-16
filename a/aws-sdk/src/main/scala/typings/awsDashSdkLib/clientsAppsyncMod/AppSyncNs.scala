package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/appsync", "AppSync")
@js.native
object AppSyncNs extends js.Object {
  
  trait ApiKey extends js.Object {
    /**
         * A description of the purpose of the API key.
         */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the nearest hour.
         */
    var expires: js.UndefOr[Long] = js.undefined
    /**
         * The API key ID.
         */
    var id: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateApiKeyRequest extends js.Object {
    /**
         * The ID for your GraphQL API.
         */
    var apiId: java.lang.String
    /**
         * A description of the purpose of the API key.
         */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The time from creation time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the nearest hour. The default value for this parameter is 7 days from creation time. For more information, see .
         */
    var expires: js.UndefOr[Long] = js.undefined
  }
  
  
  trait CreateApiKeyResponse extends js.Object {
    /**
         * The API key.
         */
    var apiKey: js.UndefOr[ApiKey] = js.undefined
  }
  
  
  trait CreateDataSourceRequest extends js.Object {
    /**
         * The API ID for the GraphQL API for the DataSource.
         */
    var apiId: java.lang.String
    /**
         * A description of the DataSource.
         */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * DynamoDB settings.
         */
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined
    /**
         * Amazon Elasticsearch settings.
         */
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined
    /**
         * Http endpoint settings.
         */
    var httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined
    /**
         * AWS Lambda settings.
         */
    var lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined
    /**
         * A user-supplied name for the DataSource.
         */
    var name: ResourceName
    /**
         * The IAM service role ARN for the data source. The system assumes this role when accessing the data source.
         */
    var serviceRoleArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The type of the DataSource.
         */
    var `type`: DataSourceType
  }
  
  
  trait CreateDataSourceResponse extends js.Object {
    /**
         * The DataSource object.
         */
    var dataSource: js.UndefOr[DataSource] = js.undefined
  }
  
  
  trait CreateGraphqlApiRequest extends js.Object {
    /**
         * The authentication type: API key, IAM, or Amazon Cognito User Pools.
         */
    var authenticationType: AuthenticationType
    /**
         * The Amazon CloudWatch logs configuration.
         */
    var logConfig: js.UndefOr[LogConfig] = js.undefined
    /**
         * A user-supplied name for the GraphqlApi.
         */
    var name: java.lang.String
    /**
         * The Open Id Connect configuration configuration.
         */
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
    /**
         * The Amazon Cognito User Pool configuration.
         */
    var userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
  }
  
  
  trait CreateGraphqlApiResponse extends js.Object {
    /**
         * The GraphqlApi.
         */
    var graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
  }
  
  
  trait CreateResolverRequest extends js.Object {
    /**
         * The ID for the GraphQL API for which the resolver is being created.
         */
    var apiId: java.lang.String
    /**
         * The name of the data source for which the resolver is being created.
         */
    var dataSourceName: ResourceName
    /**
         * The name of the field to attach the resolver to.
         */
    var fieldName: ResourceName
    /**
         * The mapping template to be used for requests. A resolver uses a request mapping template to convert a GraphQL expression into a format that a data source can understand. Mapping templates are written in Apache Velocity Template Language (VTL).
         */
    var requestMappingTemplate: MappingTemplate
    /**
         * The mapping template to be used for responses from the data source.
         */
    var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    /**
         * The name of the Type.
         */
    var typeName: ResourceName
  }
  
  
  trait CreateResolverResponse extends js.Object {
    /**
         * The Resolver object.
         */
    var resolver: js.UndefOr[Resolver] = js.undefined
  }
  
  
  trait CreateTypeRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The type definition, in GraphQL Schema Definition Language (SDL) format. For more information, see the GraphQL SDL documentation.
         */
    var definition: java.lang.String
    /**
         * The type format: SDL or JSON.
         */
    var format: TypeDefinitionFormat
  }
  
  
  trait CreateTypeResponse extends js.Object {
    /**
         * The Type object.
         */
    var `type`: js.UndefOr[Type] = js.undefined
  }
  
  
  trait DataSource extends js.Object {
    /**
         * The data source ARN.
         */
    var dataSourceArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The description of the data source.
         */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * DynamoDB settings.
         */
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined
    /**
         * Amazon Elasticsearch settings.
         */
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined
    /**
         * Http endpoint settings.
         */
    var httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined
    /**
         * Lambda settings.
         */
    var lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined
    /**
         * The name of the data source.
         */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The IAM service role ARN for the data source. The system assumes this role when accessing the data source.
         */
    var serviceRoleArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The type of the data source.    AMAZON_DYNAMODB: The data source is an Amazon DynamoDB table.    AMAZON_ELASTICSEARCH: The data source is an Amazon Elasticsearch Service domain.    AWS_LAMBDA: The data source is an AWS Lambda function.    NONE: There is no data source. This type is used when when you wish to invoke a GraphQL operation without connecting to a data source, such as performing data transformation with resolvers or triggering a subscription to be invoked from a mutation.    HTTP: The data source is an HTTP endpoint.  
         */
    var `type`: js.UndefOr[DataSourceType] = js.undefined
  }
  
  
  trait DeleteApiKeyRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The ID for the API key.
         */
    var id: java.lang.String
  }
  
  
  trait DeleteApiKeyResponse extends js.Object
  
  
  trait DeleteDataSourceRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The name of the data source.
         */
    var name: ResourceName
  }
  
  
  trait DeleteDataSourceResponse extends js.Object
  
  
  trait DeleteGraphqlApiRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
  }
  
  
  trait DeleteGraphqlApiResponse extends js.Object
  
  
  trait DeleteResolverRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The resolver field name.
         */
    var fieldName: ResourceName
    /**
         * The name of the resolver type.
         */
    var typeName: ResourceName
  }
  
  
  trait DeleteResolverResponse extends js.Object
  
  
  trait DeleteTypeRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The type name.
         */
    var typeName: ResourceName
  }
  
  
  trait DeleteTypeResponse extends js.Object
  
  
  trait DynamodbDataSourceConfig extends js.Object {
    /**
         * The AWS region.
         */
    var awsRegion: java.lang.String
    /**
         * The table name.
         */
    var tableName: java.lang.String
    /**
         * Set to TRUE to use Amazon Cognito credentials with this data source.
         */
    var useCallerCredentials: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  
  trait ElasticsearchDataSourceConfig extends js.Object {
    /**
         * The AWS region.
         */
    var awsRegion: java.lang.String
    /**
         * The endpoint.
         */
    var endpoint: java.lang.String
  }
  
  
  trait GetDataSourceRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The name of the data source.
         */
    var name: ResourceName
  }
  
  
  trait GetDataSourceResponse extends js.Object {
    /**
         * The DataSource object.
         */
    var dataSource: js.UndefOr[DataSource] = js.undefined
  }
  
  
  trait GetGraphqlApiRequest extends js.Object {
    /**
         * The API ID for the GraphQL API.
         */
    var apiId: java.lang.String
  }
  
  
  trait GetGraphqlApiResponse extends js.Object {
    /**
         * The GraphqlApi object.
         */
    var graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
  }
  
  
  trait GetIntrospectionSchemaRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The schema format: SDL or JSON.
         */
    var format: OutputType
  }
  
  
  trait GetIntrospectionSchemaResponse extends js.Object {
    /**
         * The schema, in GraphQL Schema Definition Language (SDL) format. For more information, see the GraphQL SDL documentation.
         */
    var schema: js.UndefOr[_Blob] = js.undefined
  }
  
  
  trait GetResolverRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The resolver field name.
         */
    var fieldName: ResourceName
    /**
         * The resolver type name.
         */
    var typeName: ResourceName
  }
  
  
  trait GetResolverResponse extends js.Object {
    /**
         * The Resolver object.
         */
    var resolver: js.UndefOr[Resolver] = js.undefined
  }
  
  
  trait GetSchemaCreationStatusRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
  }
  
  
  trait GetSchemaCreationStatusResponse extends js.Object {
    /**
         * Detailed information about the status of the schema creation operation.
         */
    var details: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE state, you can add data.
         */
    var status: js.UndefOr[SchemaStatus] = js.undefined
  }
  
  
  trait GetTypeRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The type format: SDL or JSON.
         */
    var format: TypeDefinitionFormat
    /**
         * The type name.
         */
    var typeName: ResourceName
  }
  
  
  trait GetTypeResponse extends js.Object {
    /**
         * The Type object.
         */
    var `type`: js.UndefOr[Type] = js.undefined
  }
  
  
  trait GraphqlApi extends js.Object {
    /**
         * The API ID.
         */
    var apiId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The ARN.
         */
    var arn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The authentication type.
         */
    var authenticationType: js.UndefOr[AuthenticationType] = js.undefined
    /**
         * The Amazon CloudWatch Logs configuration.
         */
    var logConfig: js.UndefOr[LogConfig] = js.undefined
    /**
         * The API name.
         */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The Open Id Connect configuration.
         */
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
    /**
         * The URIs.
         */
    var uris: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * The Amazon Cognito User Pool configuration.
         */
    var userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
  }
  
  
  trait HttpDataSourceConfig extends js.Object {
    /**
         * The Http url endpoint. You can either specify the domain name or ip and port combination and the url scheme must be http(s). If the port is not specified, AWS AppSync will use the default port 80 for http endpoint and port 443 for https endpoints.
         */
    var endpoint: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait LambdaDataSourceConfig extends js.Object {
    /**
         * The ARN for the Lambda function.
         */
    var lambdaFunctionArn: java.lang.String
  }
  
  
  trait ListApiKeysRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The maximum number of results you want the request to return.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListApiKeysResponse extends js.Object {
    /**
         * The ApiKey objects.
         */
    var apiKeys: js.UndefOr[ApiKeys] = js.undefined
    /**
         * An identifier to be passed in the next request to this operation to return the next set of items in the list.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListDataSourcesRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The maximum number of results you want the request to return.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list. 
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListDataSourcesResponse extends js.Object {
    /**
         * The DataSource objects.
         */
    var dataSources: js.UndefOr[DataSources] = js.undefined
    /**
         * An identifier to be passed in the next request to this operation to return the next set of items in the list.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListGraphqlApisRequest extends js.Object {
    /**
         * The maximum number of results you want the request to return.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list. 
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListGraphqlApisResponse extends js.Object {
    /**
         * The GraphqlApi objects.
         */
    var graphqlApis: js.UndefOr[GraphqlApis] = js.undefined
    /**
         * An identifier to be passed in the next request to this operation to return the next set of items in the list.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListResolversRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The maximum number of results you want the request to return.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list. 
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The type name.
         */
    var typeName: java.lang.String
  }
  
  
  trait ListResolversResponse extends js.Object {
    /**
         * An identifier to be passed in the next request to this operation to return the next set of items in the list.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The Resolver objects.
         */
    var resolvers: js.UndefOr[Resolvers] = js.undefined
  }
  
  
  trait ListTypesRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The type format: SDL or JSON.
         */
    var format: TypeDefinitionFormat
    /**
         * The maximum number of results you want the request to return.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list. 
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListTypesResponse extends js.Object {
    /**
         * An identifier to be passed in the next request to this operation to return the next set of items in the list.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The Type objects.
         */
    var types: js.UndefOr[TypeList] = js.undefined
  }
  
  
  trait LogConfig extends js.Object {
    /**
         * The service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account. 
         */
    var cloudWatchLogsRoleArn: java.lang.String
    /**
         * The field logging level. Values can be NONE, ERROR, ALL.     NONE: No field-level logs are captured.    ERROR: Logs the following information only for the fields that are in error:   The error section in the server response.   Field-level errors.   The generated request/response functions that got resolved for error fields.      ALL: The following information is logged for all fields in the query:   Field-level tracing information.   The generated request/response functions that got resolved for each field.    
         */
    var fieldLogLevel: FieldLogLevel
  }
  
  
  trait MapOfStringToString
    extends /* key */ ScalablyTyped.runtime.StringDictionary[java.lang.String]
  
  
  trait OpenIDConnectConfig extends js.Object {
    /**
         * The number of milliseconds a token is valid after being authenticated.
         */
    var authTTL: js.UndefOr[Long] = js.undefined
    /**
         * The client identifier of the Relying party at the OpenID Provider. This identifier is typically obtained when the Relying party is registered with the OpenID Provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time
         */
    var clientId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The number of milliseconds a token is valid after being issued to a user.
         */
    var iatTTL: js.UndefOr[Long] = js.undefined
    /**
         * The issuer for the open id connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
         */
    var issuer: java.lang.String
  }
  
  
  trait Resolver extends js.Object {
    /**
         * The resolver data source name.
         */
    var dataSourceName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The resolver field name.
         */
    var fieldName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The request mapping template.
         */
    var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    /**
         * The resolver ARN.
         */
    var resolverArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The response mapping template.
         */
    var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    /**
         * The resolver type name.
         */
    var typeName: js.UndefOr[ResourceName] = js.undefined
  }
  
  
  trait StartSchemaCreationRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The schema definition, in GraphQL schema language format.
         */
    var definition: _Blob
  }
  
  
  trait StartSchemaCreationResponse extends js.Object {
    /**
         * The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE state, you can add data.
         */
    var status: js.UndefOr[SchemaStatus] = js.undefined
  }
  
  
  trait Type extends js.Object {
    /**
         * The type ARN.
         */
    var arn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The type definition.
         */
    var definition: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The type description.
         */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The type format: SDL or JSON.
         */
    var format: js.UndefOr[TypeDefinitionFormat] = js.undefined
    /**
         * The type name.
         */
    var name: js.UndefOr[ResourceName] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates a unique key that you can distribute to clients who are executing your API.
       */
    def createApiKey(): awsDashSdkLib.libRequestMod.Request[CreateApiKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a unique key that you can distribute to clients who are executing your API.
       */
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
    /**
       * Creates a unique key that you can distribute to clients who are executing your API.
       */
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
    /**
       * Creates a DataSource object.
       */
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
    /**
       * Creates a DataSource object.
       */
    def createDataSource(
      params: CreateDataSourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDataSourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a GraphqlApi object.
       */
    def createGraphqlApi(): awsDashSdkLib.libRequestMod.Request[CreateGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a GraphqlApi object.
       */
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
    /**
       * Creates a GraphqlApi object.
       */
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
    /**
       * Creates a Resolver object. A resolver converts incoming requests into a format that a data source can understand and converts the data source's responses into GraphQL.
       */
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
    /**
       * Creates a Resolver object. A resolver converts incoming requests into a format that a data source can understand and converts the data source's responses into GraphQL.
       */
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
    /**
       * Creates a Type object.
       */
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
    /**
       * Creates a Type object.
       */
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
    /**
       * Deletes an API key.
       */
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
    /**
       * Deletes an API key.
       */
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
    /**
       * Deletes a DataSource object.
       */
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
    /**
       * Deletes a DataSource object.
       */
    def deleteDataSource(
      params: DeleteDataSourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDataSourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a GraphqlApi object.
       */
    def deleteGraphqlApi(): awsDashSdkLib.libRequestMod.Request[DeleteGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a GraphqlApi object.
       */
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
    /**
       * Deletes a GraphqlApi object.
       */
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
    /**
       * Deletes a Resolver object.
       */
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
    /**
       * Deletes a Resolver object.
       */
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
    /**
       * Deletes a Type object.
       */
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
    /**
       * Deletes a Type object.
       */
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
    /**
       * Retrieves a DataSource object.
       */
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
    /**
       * Retrieves a DataSource object.
       */
    def getDataSource(
      params: GetDataSourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDataSourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a GraphqlApi object.
       */
    def getGraphqlApi(): awsDashSdkLib.libRequestMod.Request[GetGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a GraphqlApi object.
       */
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
    /**
       * Retrieves a GraphqlApi object.
       */
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
    /**
       * Retrieves the introspection schema for a GraphQL API.
       */
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
    /**
       * Retrieves the introspection schema for a GraphQL API.
       */
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
    /**
       * Retrieves a Resolver object.
       */
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
    /**
       * Retrieves a Resolver object.
       */
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
    /**
       * Retrieves the current status of a schema creation operation.
       */
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
    /**
       * Retrieves the current status of a schema creation operation.
       */
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
    /**
       * Retrieves a Type object.
       */
    def getType(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTypeResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a Type object.
       */
    def getType(params: GetTypeRequest): awsDashSdkLib.libRequestMod.Request[GetTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a Type object.
       */
    def getType(
      params: GetTypeRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTypeResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the API keys for a given API.  API keys are deleted automatically sometime after they expire. However, they may still be included in the response until they have actually been deleted. You can safely call DeleteApiKey to manually delete a key before it's automatically deleted. 
       */
    def listApiKeys(): awsDashSdkLib.libRequestMod.Request[ListApiKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the API keys for a given API.  API keys are deleted automatically sometime after they expire. However, they may still be included in the response until they have actually been deleted. You can safely call DeleteApiKey to manually delete a key before it's automatically deleted. 
       */
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
    /**
       * Lists the API keys for a given API.  API keys are deleted automatically sometime after they expire. However, they may still be included in the response until they have actually been deleted. You can safely call DeleteApiKey to manually delete a key before it's automatically deleted. 
       */
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
    /**
       * Lists the data sources for a given API.
       */
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
    /**
       * Lists the data sources for a given API.
       */
    def listDataSources(
      params: ListDataSourcesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDataSourcesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDataSourcesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists your GraphQL APIs.
       */
    def listGraphqlApis(): awsDashSdkLib.libRequestMod.Request[ListGraphqlApisResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists your GraphQL APIs.
       */
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
    /**
       * Lists your GraphQL APIs.
       */
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
    /**
       * Lists the resolvers for a given API and type.
       */
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
    /**
       * Lists the resolvers for a given API and type.
       */
    def listResolvers(
      params: ListResolversRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResolversResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResolversResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the types for a given API.
       */
    def listTypes(): awsDashSdkLib.libRequestMod.Request[ListTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the types for a given API.
       */
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
    /**
       * Lists the types for a given API.
       */
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
    /**
       * Adds a new schema to your GraphQL API. This operation is asynchronous. Use to determine when it has completed.
       */
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
    /**
       * Adds a new schema to your GraphQL API. This operation is asynchronous. Use to determine when it has completed.
       */
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
    /**
       * Updates an API key.
       */
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
    /**
       * Updates an API key.
       */
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
    /**
       * Updates a DataSource object.
       */
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
    /**
       * Updates a DataSource object.
       */
    def updateDataSource(
      params: UpdateDataSourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDataSourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDataSourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a GraphqlApi object.
       */
    def updateGraphqlApi(): awsDashSdkLib.libRequestMod.Request[UpdateGraphqlApiResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a GraphqlApi object.
       */
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
    /**
       * Updates a GraphqlApi object.
       */
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
    /**
       * Updates a Resolver object.
       */
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
    /**
       * Updates a Resolver object.
       */
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
    /**
       * Updates a Type object.
       */
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
    /**
       * Updates a Type object.
       */
    def updateType(
      params: UpdateTypeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTypeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTypeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateApiKeyRequest extends js.Object {
    /**
         * The ID for the GraphQL API
         */
    var apiId: java.lang.String
    /**
         * A description of the purpose of the API key.
         */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The time from update time after which the API key expires. The date is represented as seconds since the epoch. For more information, see .
         */
    var expires: js.UndefOr[Long] = js.undefined
    /**
         * The API key ID.
         */
    var id: java.lang.String
  }
  
  
  trait UpdateApiKeyResponse extends js.Object {
    /**
         * The API key.
         */
    var apiKey: js.UndefOr[ApiKey] = js.undefined
  }
  
  
  trait UpdateDataSourceRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The new description for the data source.
         */
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The new DynamoDB configuration.
         */
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined
    /**
         * The new Elasticsearch configuration.
         */
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined
    /**
         * The new http endpoint configuration
         */
    var httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined
    /**
         * The new Lambda configuration.
         */
    var lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined
    /**
         * The new name for the data source.
         */
    var name: ResourceName
    /**
         * The new service role ARN for the data source.
         */
    var serviceRoleArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The new data source type.
         */
    var `type`: DataSourceType
  }
  
  
  trait UpdateDataSourceResponse extends js.Object {
    /**
         * The updated DataSource object.
         */
    var dataSource: js.UndefOr[DataSource] = js.undefined
  }
  
  
  trait UpdateGraphqlApiRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The new authentication type for the GraphqlApi object.
         */
    var authenticationType: js.UndefOr[AuthenticationType] = js.undefined
    /**
         * The Amazon CloudWatch logs configuration for the GraphqlApi object.
         */
    var logConfig: js.UndefOr[LogConfig] = js.undefined
    /**
         * The new name for the GraphqlApi object.
         */
    var name: java.lang.String
    /**
         * The Open Id Connect configuration configuration for the GraphqlApi object.
         */
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
    /**
         * The new Amazon Cognito User Pool configuration for the GraphqlApi object.
         */
    var userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
  }
  
  
  trait UpdateGraphqlApiResponse extends js.Object {
    /**
         * The updated GraphqlApi object.
         */
    var graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
  }
  
  
  trait UpdateResolverRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The new data source name.
         */
    var dataSourceName: ResourceName
    /**
         * The new field name.
         */
    var fieldName: ResourceName
    /**
         * The new request mapping template.
         */
    var requestMappingTemplate: MappingTemplate
    /**
         * The new response mapping template.
         */
    var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    /**
         * The new type name.
         */
    var typeName: ResourceName
  }
  
  
  trait UpdateResolverResponse extends js.Object {
    /**
         * The updated Resolver object.
         */
    var resolver: js.UndefOr[Resolver] = js.undefined
  }
  
  
  trait UpdateTypeRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: java.lang.String
    /**
         * The new definition.
         */
    var definition: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The new type format: SDL or JSON.
         */
    var format: TypeDefinitionFormat
    /**
         * The new type name.
         */
    var typeName: ResourceName
  }
  
  
  trait UpdateTypeResponse extends js.Object {
    /**
         * The updated Type object.
         */
    var `type`: js.UndefOr[Type] = js.undefined
  }
  
  
  trait UserPoolConfig extends js.Object {
    /**
         * A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
         */
    var appIdClientRegex: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The AWS region in which the user pool was created.
         */
    var awsRegion: java.lang.String
    /**
         * The action that you want your GraphQL API to take when a request that uses Amazon Cognito User Pool authentication doesn't match the Amazon Cognito User Pool configuration.
         */
    var defaultAction: DefaultAction
    /**
         * The user pool ID.
         */
    var userPoolId: java.lang.String
  }
  
  val TypesNs: this.type = js.native
  type ApiKeys = js.Array[ApiKey]
  type AuthenticationType = awsDashSdkLib.awsDashSdkLibStrings.API_KEY | awsDashSdkLib.awsDashSdkLibStrings.AWS_IAM | awsDashSdkLib.awsDashSdkLibStrings.AMAZON_COGNITO_USER_POOLS | awsDashSdkLib.awsDashSdkLibStrings.OPENID_CONNECT | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DataSourceType = awsDashSdkLib.awsDashSdkLibStrings.AWS_LAMBDA | awsDashSdkLib.awsDashSdkLibStrings.AMAZON_DYNAMODB | awsDashSdkLib.awsDashSdkLibStrings.AMAZON_ELASTICSEARCH | awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.HTTP | java.lang.String
  type DataSources = js.Array[DataSource]
  type DefaultAction = awsDashSdkLib.awsDashSdkLibStrings.ALLOW | awsDashSdkLib.awsDashSdkLibStrings.DENY | java.lang.String
  type FieldLogLevel = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.ERROR | awsDashSdkLib.awsDashSdkLibStrings.ALL | java.lang.String
  type GraphqlApis = js.Array[GraphqlApi]
  type Long = scala.Double
  type MappingTemplate = java.lang.String
  type MaxResults = scala.Double
  type OutputType = awsDashSdkLib.awsDashSdkLibStrings.SDL | awsDashSdkLib.awsDashSdkLibStrings.JSON | java.lang.String
  type PaginationToken = java.lang.String
  type Resolvers = js.Array[Resolver]
  type ResourceName = java.lang.String
  type SchemaStatus = awsDashSdkLib.awsDashSdkLibStrings.PROCESSING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETING | java.lang.String
  type String = java.lang.String
  type TypeDefinitionFormat = awsDashSdkLib.awsDashSdkLibStrings.SDL | awsDashSdkLib.awsDashSdkLibStrings.JSON | java.lang.String
  type TypeList = js.Array[Type]
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAppsyncMod.Blob | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-07-25` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

