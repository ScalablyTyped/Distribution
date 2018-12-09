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
    var description: js.UndefOr[String] = js.undefined
    /**
         * The time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the nearest hour.
         */
    var expires: js.UndefOr[Long] = js.undefined
    /**
         * The API key ID.
         */
    var id: js.UndefOr[String] = js.undefined
  }
  
  
  trait AuthorizationConfig extends js.Object {
    /**
         * The authorization type required by the HTTP endpoint.    AWS_IAM: The authorization type is Sigv4.  
         */
    var authorizationType: AuthorizationType
    /**
         * The AWS IAM settings.
         */
    var awsIamConfig: js.UndefOr[AwsIamConfig] = js.undefined
  }
  
  
  trait AwsIamConfig extends js.Object {
    /**
         * The signing region for AWS IAM authorization.
         */
    var signingRegion: js.UndefOr[String] = js.undefined
    /**
         * The signing service name for AWS IAM authorization.
         */
    var signingServiceName: js.UndefOr[String] = js.undefined
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
    var apiId: String
    /**
         * A description of the purpose of the API key.
         */
    var description: js.UndefOr[String] = js.undefined
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
    var apiId: String
    /**
         * A description of the DataSource.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * Amazon DynamoDB settings.
         */
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined
    /**
         * Amazon Elasticsearch Service settings.
         */
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined
    /**
         * HTTP endpoint settings.
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
         * Relational database settings.
         */
    var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined
    /**
         * The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data source.
         */
    var serviceRoleArn: js.UndefOr[String] = js.undefined
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
  
  
  trait CreateFunctionRequest extends js.Object {
    /**
         * The GraphQL API ID.
         */
    var apiId: String
    /**
         * The Function DataSource name.
         */
    var dataSourceName: ResourceName
    /**
         * The Function description.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The version of the request mapping template. Currently the supported value is 2018-05-29. 
         */
    var functionVersion: String
    /**
         * The Function name. The function name does not have to be unique.
         */
    var name: ResourceName
    /**
         * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
         */
    var requestMappingTemplate: MappingTemplate
    /**
         * The Function response mapping template. 
         */
    var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  }
  
  
  trait CreateFunctionResponse extends js.Object {
    /**
         * The Function object.
         */
    var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
  }
  
  
  trait CreateGraphqlApiRequest extends js.Object {
    /**
         * The authentication type: API key, AWS IAM, or Amazon Cognito user pools.
         */
    var authenticationType: AuthenticationType
    /**
         * The Amazon CloudWatch Logs configuration.
         */
    var logConfig: js.UndefOr[LogConfig] = js.undefined
    /**
         * A user-supplied name for the GraphqlApi.
         */
    var name: String
    /**
         * The OpenID Connect configuration.
         */
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
    /**
         * The Amazon Cognito user pool configuration.
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
    var apiId: String
    /**
         * The name of the data source for which the resolver is being created.
         */
    var dataSourceName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The name of the field to attach the resolver to.
         */
    var fieldName: ResourceName
    /**
         * The resolver type.    UNIT: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to execute a GraphQL query against a single data source.    PIPELINE: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of Function in a serial manner. You can use a pipeline resolver to execute a GraphQL query against multiple data sources.  
         */
    var kind: js.UndefOr[ResolverKind] = js.undefined
    /**
         * The PipelineConfig.
         */
    var pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined
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
    var apiId: String
    /**
         * The type definition, in GraphQL Schema Definition Language (SDL) format. For more information, see the GraphQL SDL documentation.
         */
    var definition: String
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
    var dataSourceArn: js.UndefOr[String] = js.undefined
    /**
         * The description of the data source.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * Amazon DynamoDB settings.
         */
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined
    /**
         * Amazon Elasticsearch Service settings.
         */
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined
    /**
         * HTTP endpoint settings.
         */
    var httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined
    /**
         * AWS Lambda settings.
         */
    var lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined
    /**
         * The name of the data source.
         */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
         * Relational database settings.
         */
    var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined
    /**
         * The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data source.
         */
    var serviceRoleArn: js.UndefOr[String] = js.undefined
    /**
         * The type of the data source.    AMAZON_DYNAMODB: The data source is an Amazon DynamoDB table.    AMAZON_ELASTICSEARCH: The data source is an Amazon Elasticsearch Service domain.    AWS_LAMBDA: The data source is an AWS Lambda function.    NONE: There is no data source. This type is used when you wish to invoke a GraphQL operation without connecting to a data source, such as performing data transformation with resolvers or triggering a subscription to be invoked from a mutation.    HTTP: The data source is an HTTP endpoint.    RELATIONAL_DATABASE: The data source is a relational database.  
         */
    var `type`: js.UndefOr[DataSourceType] = js.undefined
  }
  
  
  trait DeleteApiKeyRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: String
    /**
         * The ID for the API key.
         */
    var id: String
  }
  
  
  trait DeleteApiKeyResponse extends js.Object
  
  
  trait DeleteDataSourceRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: String
    /**
         * The name of the data source.
         */
    var name: ResourceName
  }
  
  
  trait DeleteDataSourceResponse extends js.Object
  
  
  trait DeleteFunctionRequest extends js.Object {
    /**
         * The GraphQL API ID.
         */
    var apiId: String
    /**
         * The Function ID.
         */
    var functionId: ResourceName
  }
  
  
  trait DeleteFunctionResponse extends js.Object
  
  
  trait DeleteGraphqlApiRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: String
  }
  
  
  trait DeleteGraphqlApiResponse extends js.Object
  
  
  trait DeleteResolverRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: String
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
    var apiId: String
    /**
         * The type name.
         */
    var typeName: ResourceName
  }
  
  
  trait DeleteTypeResponse extends js.Object
  
  
  trait DynamodbDataSourceConfig extends js.Object {
    /**
         * The AWS Region.
         */
    var awsRegion: String
    /**
         * The table name.
         */
    var tableName: String
    /**
         * Set to TRUE to use Amazon Cognito credentials with this data source.
         */
    var useCallerCredentials: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait ElasticsearchDataSourceConfig extends js.Object {
    /**
         * The AWS Region.
         */
    var awsRegion: String
    /**
         * The endpoint.
         */
    var endpoint: String
  }
  
  
  trait FunctionConfiguration extends js.Object {
    /**
         * The name of the DataSource.
         */
    var dataSourceName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The Function description.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The ARN of the Function object.
         */
    var functionArn: js.UndefOr[String] = js.undefined
    /**
         * A unique ID representing the Function object.
         */
    var functionId: js.UndefOr[String] = js.undefined
    /**
         * The version of the request mapping template. Currently only the 2018-05-29 version of the template is supported.
         */
    var functionVersion: js.UndefOr[String] = js.undefined
    /**
         * The name of the Function object.
         */
    var name: js.UndefOr[ResourceName] = js.undefined
    /**
         * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
         */
    var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    /**
         * The Function response mapping template.
         */
    var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  }
  
  
  trait GetDataSourceRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: String
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
  
  
  trait GetFunctionRequest extends js.Object {
    /**
         * The GraphQL API ID.
         */
    var apiId: String
    /**
         * The Function ID.
         */
    var functionId: ResourceName
  }
  
  
  trait GetFunctionResponse extends js.Object {
    /**
         * The Function object.
         */
    var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
  }
  
  
  trait GetGraphqlApiRequest extends js.Object {
    /**
         * The API ID for the GraphQL API.
         */
    var apiId: String
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
    var apiId: String
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
    var apiId: String
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
    var apiId: String
  }
  
  
  trait GetSchemaCreationStatusResponse extends js.Object {
    /**
         * Detailed information about the status of the schema creation operation.
         */
    var details: js.UndefOr[String] = js.undefined
    /**
         * The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE state, you can add data.
         */
    var status: js.UndefOr[SchemaStatus] = js.undefined
  }
  
  
  trait GetTypeRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: String
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
    var apiId: js.UndefOr[String] = js.undefined
    /**
         * The ARN.
         */
    var arn: js.UndefOr[String] = js.undefined
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
         * The OpenID Connect configuration.
         */
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
    /**
         * The URIs.
         */
    var uris: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * The Amazon Cognito user pool configuration.
         */
    var userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
  }
  
  
  trait HttpDataSourceConfig extends js.Object {
    /**
         * The authorization config in case the HTTP endpoint requires authorization.
         */
    var authorizationConfig: js.UndefOr[AuthorizationConfig] = js.undefined
    /**
         * The HTTP URL endpoint. You can either specify the domain name or IP, and port combination, and the URL scheme must be HTTP or HTTPS. If the port is not specified, AWS AppSync uses the default port 80 for the HTTP endpoint and port 443 for HTTPS endpoints.
         */
    var endpoint: js.UndefOr[String] = js.undefined
  }
  
  
  trait LambdaDataSourceConfig extends js.Object {
    /**
         * The ARN for the Lambda function.
         */
    var lambdaFunctionArn: String
  }
  
  
  trait ListApiKeysRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: String
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
    var apiId: String
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
  
  
  trait ListFunctionsRequest extends js.Object {
    /**
         * The GraphQL API ID.
         */
    var apiId: String
    /**
         * The maximum number of results you want the request to return.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListFunctionsResponse extends js.Object {
    /**
         * A list of Function objects.
         */
    var functions: js.UndefOr[Functions] = js.undefined
    /**
         * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
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
  
  
  trait ListResolversByFunctionRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: String
    /**
         * The Function ID.
         */
    var functionId: String
    /**
         * The maximum number of results you want the request to return.
         */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * An identifier that was returned from the previous call to this operation, which you can use to return the next set of items in the list.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  
  trait ListResolversByFunctionResponse extends js.Object {
    /**
         * An identifier that can be used to return the next set of items in the list.
         */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
         * The list of resolvers.
         */
    var resolvers: js.UndefOr[Resolvers] = js.undefined
  }
  
  
  trait ListResolversRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: String
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
    var typeName: String
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
    var apiId: String
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
    var cloudWatchLogsRoleArn: String
    /**
         * The field logging level. Values can be NONE, ERROR, or ALL.     NONE: No field-level logs are captured.    ERROR: Logs the following information only for the fields that are in error:   The error section in the server response.   Field-level errors.   The generated request/response functions that got resolved for error fields.      ALL: The following information is logged for all fields in the query:   Field-level tracing information.   The generated request/response functions that got resolved for each field.    
         */
    var fieldLogLevel: FieldLogLevel
  }
  
  
  trait MapOfStringToString
    extends /* key */ ScalablyTyped.runtime.StringDictionary[String]
  
  
  trait OpenIDConnectConfig extends js.Object {
    /**
         * The number of milliseconds a token is valid after being authenticated.
         */
    var authTTL: js.UndefOr[Long] = js.undefined
    /**
         * The client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
         */
    var clientId: js.UndefOr[String] = js.undefined
    /**
         * The number of milliseconds a token is valid after being issued to a user.
         */
    var iatTTL: js.UndefOr[Long] = js.undefined
    /**
         * The issuer for the OpenID Connect configuration. The issuer returned by discovery must exactly match the value of iss in the ID token.
         */
    var issuer: String
  }
  
  
  trait PipelineConfig extends js.Object {
    /**
         * A list of Function objects.
         */
    var functions: js.UndefOr[FunctionsIds] = js.undefined
  }
  
  
  trait RdsHttpEndpointConfig extends js.Object {
    /**
         * AWS Region for RDS HTTP endpoint.
         */
    var awsRegion: js.UndefOr[String] = js.undefined
    /**
         * AWS secret store ARN for database credentials.
         */
    var awsSecretStoreArn: js.UndefOr[String] = js.undefined
    /**
         * Logical database name.
         */
    var databaseName: js.UndefOr[String] = js.undefined
    /**
         * Amazon RDS cluster identifier.
         */
    var dbClusterIdentifier: js.UndefOr[String] = js.undefined
    /**
         * Logical schema name.
         */
    var schema: js.UndefOr[String] = js.undefined
  }
  
  
  trait RelationalDatabaseDataSourceConfig extends js.Object {
    /**
         * Amazon RDS HTTP endpoint settings.
         */
    var rdsHttpEndpointConfig: js.UndefOr[RdsHttpEndpointConfig] = js.undefined
    /**
         * Source type for the relational database.    RDS_HTTP_ENDPOINT: The relational database source type is an Amazon RDS HTTP endpoint.  
         */
    var relationalDatabaseSourceType: js.UndefOr[RelationalDatabaseSourceType] = js.undefined
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
         * The resolver type.    UNIT: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to execute a GraphQL query against a single data source.    PIPELINE: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of Function in a serial manner. You can use a pipeline resolver to execute a GraphQL query against multiple data sources.  
         */
    var kind: js.UndefOr[ResolverKind] = js.undefined
    /**
         * The PipelineConfig.
         */
    var pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined
    /**
         * The request mapping template.
         */
    var requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    /**
         * The resolver ARN.
         */
    var resolverArn: js.UndefOr[String] = js.undefined
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
    var apiId: String
    /**
         * The schema definition, in GraphQL schema language format.
         */
    var definition: _Blob
  }
  
  
  trait StartSchemaCreationResponse extends js.Object {
    /**
         * The current state of the schema (PROCESSING, ACTIVE, or DELETING). When the schema is in the ACTIVE state, you can add data.
         */
    var status: js.UndefOr[SchemaStatus] = js.undefined
  }
  
  
  trait Type extends js.Object {
    /**
         * The type ARN.
         */
    var arn: js.UndefOr[String] = js.undefined
    /**
         * The type definition.
         */
    var definition: js.UndefOr[String] = js.undefined
    /**
         * The type description.
         */
    var description: js.UndefOr[String] = js.undefined
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
       * Creates a Function object. A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
       */
    def createFunction(): awsDashSdkLib.libRequestMod.Request[CreateFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Function object. A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
       */
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
    /**
       * Creates a Function object. A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
       */
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
       * Deletes a Function.
       */
    def deleteFunction(): awsDashSdkLib.libRequestMod.Request[DeleteFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a Function.
       */
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
    /**
       * Deletes a Function.
       */
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
       * Get a Function.
       */
    def getFunction(): awsDashSdkLib.libRequestMod.Request[GetFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Get a Function.
       */
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
    /**
       * Get a Function.
       */
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
       * List multiple functions.
       */
    def listFunctions(): awsDashSdkLib.libRequestMod.Request[ListFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List multiple functions.
       */
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
    /**
       * List multiple functions.
       */
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
       * List the resolvers that are associated with a specific function.
       */
    def listResolversByFunction(): awsDashSdkLib.libRequestMod.Request[ListResolversByFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * List the resolvers that are associated with a specific function.
       */
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
    /**
       * List the resolvers that are associated with a specific function.
       */
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
       * Updates a Function object.
       */
    def updateFunction(): awsDashSdkLib.libRequestMod.Request[UpdateFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a Function object.
       */
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
    /**
       * Updates a Function object.
       */
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
         * The ID for the GraphQL API.
         */
    var apiId: String
    /**
         * A description of the purpose of the API key.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The time from update time after which the API key expires. The date is represented as seconds since the epoch. For more information, see .
         */
    var expires: js.UndefOr[Long] = js.undefined
    /**
         * The API key ID.
         */
    var id: String
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
    var apiId: String
    /**
         * The new description for the data source.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The new Amazon DynamoDB configuration.
         */
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined
    /**
         * The new Elasticsearch Service configuration.
         */
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined
    /**
         * The new HTTP endpoint configuration.
         */
    var httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined
    /**
         * The new AWS Lambda configuration.
         */
    var lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined
    /**
         * The new name for the data source.
         */
    var name: ResourceName
    /**
         * The new relational database configuration.
         */
    var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined
    /**
         * The new service role ARN for the data source.
         */
    var serviceRoleArn: js.UndefOr[String] = js.undefined
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
  
  
  trait UpdateFunctionRequest extends js.Object {
    /**
         * The GraphQL API ID.
         */
    var apiId: String
    /**
         * The Function DataSource name.
         */
    var dataSourceName: ResourceName
    /**
         * The Function description.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The function ID.
         */
    var functionId: ResourceName
    /**
         * The version of the request mapping template. Currently the supported value is 2018-05-29. 
         */
    var functionVersion: String
    /**
         * The Function name.
         */
    var name: ResourceName
    /**
         * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
         */
    var requestMappingTemplate: MappingTemplate
    /**
         * The Function request mapping template. 
         */
    var responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
  }
  
  
  trait UpdateFunctionResponse extends js.Object {
    /**
         * The Function object.
         */
    var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
  }
  
  
  trait UpdateGraphqlApiRequest extends js.Object {
    /**
         * The API ID.
         */
    var apiId: String
    /**
         * The new authentication type for the GraphqlApi object.
         */
    var authenticationType: js.UndefOr[AuthenticationType] = js.undefined
    /**
         * The Amazon CloudWatch Logs configuration for the GraphqlApi object.
         */
    var logConfig: js.UndefOr[LogConfig] = js.undefined
    /**
         * The new name for the GraphqlApi object.
         */
    var name: String
    /**
         * The OpenID Connect configuration for the GraphqlApi object.
         */
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined
    /**
         * The new Amazon Cognito user pool configuration for the GraphqlApi object.
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
    var apiId: String
    /**
         * The new data source name.
         */
    var dataSourceName: js.UndefOr[ResourceName] = js.undefined
    /**
         * The new field name.
         */
    var fieldName: ResourceName
    /**
         * The resolver type.    UNIT: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to execute a GraphQL query against a single data source.    PIPELINE: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of Function in a serial manner. You can use a pipeline resolver to execute a GraphQL query against multiple data sources.  
         */
    var kind: js.UndefOr[ResolverKind] = js.undefined
    /**
         * The PipelineConfig.
         */
    var pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined
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
    var apiId: String
    /**
         * The new definition.
         */
    var definition: js.UndefOr[String] = js.undefined
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
         * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
         */
    var appIdClientRegex: js.UndefOr[String] = js.undefined
    /**
         * The AWS Region in which the user pool was created.
         */
    var awsRegion: String
    /**
         * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool authentication doesn't match the Amazon Cognito user pool configuration.
         */
    var defaultAction: DefaultAction
    /**
         * The user pool ID.
         */
    var userPoolId: String
  }
  
  val TypesNs: this.type = js.native
  type ApiKeys = js.Array[ApiKey]
  type AuthenticationType = awsDashSdkLib.awsDashSdkLibStrings.API_KEY | awsDashSdkLib.awsDashSdkLibStrings.AWS_IAM | awsDashSdkLib.awsDashSdkLibStrings.AMAZON_COGNITO_USER_POOLS | awsDashSdkLib.awsDashSdkLibStrings.OPENID_CONNECT | java.lang.String
  type AuthorizationType = awsDashSdkLib.awsDashSdkLibStrings.AWS_IAM | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DataSourceType = awsDashSdkLib.awsDashSdkLibStrings.AWS_LAMBDA | awsDashSdkLib.awsDashSdkLibStrings.AMAZON_DYNAMODB | awsDashSdkLib.awsDashSdkLibStrings.AMAZON_ELASTICSEARCH | awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.HTTP | awsDashSdkLib.awsDashSdkLibStrings.RELATIONAL_DATABASE | java.lang.String
  type DataSources = js.Array[DataSource]
  type DefaultAction = awsDashSdkLib.awsDashSdkLibStrings.ALLOW | awsDashSdkLib.awsDashSdkLibStrings.DENY | java.lang.String
  type FieldLogLevel = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.ERROR | awsDashSdkLib.awsDashSdkLibStrings.ALL | java.lang.String
  type Functions = js.Array[FunctionConfiguration]
  type FunctionsIds = js.Array[String]
  type GraphqlApis = js.Array[GraphqlApi]
  type Long = scala.Double
  type MappingTemplate = java.lang.String
  type MaxResults = scala.Double
  type OutputType = awsDashSdkLib.awsDashSdkLibStrings.SDL | awsDashSdkLib.awsDashSdkLibStrings.JSON | java.lang.String
  type PaginationToken = java.lang.String
  type RelationalDatabaseSourceType = awsDashSdkLib.awsDashSdkLibStrings.RDS_HTTP_ENDPOINT | java.lang.String
  type ResolverKind = awsDashSdkLib.awsDashSdkLibStrings.UNIT | awsDashSdkLib.awsDashSdkLibStrings.PIPELINE | java.lang.String
  type Resolvers = js.Array[Resolver]
  type ResourceName = java.lang.String
  type SchemaStatus = awsDashSdkLib.awsDashSdkLibStrings.PROCESSING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETING | java.lang.String
  type String = java.lang.String
  type TypeDefinitionFormat = awsDashSdkLib.awsDashSdkLibStrings.SDL | awsDashSdkLib.awsDashSdkLibStrings.JSON | java.lang.String
  type TypeList = js.Array[Type]
  type _Blob = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsAppsyncMod.Blob | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-07-25` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

