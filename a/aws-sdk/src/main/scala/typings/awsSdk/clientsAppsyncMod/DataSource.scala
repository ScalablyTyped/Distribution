package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /**
    * The data source Amazon Resource Name (ARN).
    */
  var dataSourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the data source.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * DynamoDB settings.
    */
  var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined
  
  /**
    * Amazon OpenSearch Service settings.
    */
  var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined
  
  /**
    * Amazon EventBridge settings.
    */
  var eventBridgeConfig: js.UndefOr[EventBridgeDataSourceConfig] = js.undefined
  
  /**
    * HTTP endpoint settings.
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
    * Amazon OpenSearch Service settings.
    */
  var openSearchServiceConfig: js.UndefOr[OpenSearchServiceDataSourceConfig] = js.undefined
  
  /**
    * Relational database settings.
    */
  var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined
  
  /**
    * The Identity and Access Management (IAM) service role Amazon Resource Name (ARN) for the data source. The system assumes this role when accessing the data source.
    */
  var serviceRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the data source.    AWS_LAMBDA: The data source is an Lambda function.    AMAZON_DYNAMODB: The data source is an Amazon DynamoDB table.    AMAZON_ELASTICSEARCH: The data source is an Amazon OpenSearch Service domain.    AMAZON_OPENSEARCH_SERVICE: The data source is an Amazon OpenSearch Service domain.    AMAZON_EVENTBRIDGE: The data source is an Amazon EventBridge configuration.    NONE: There is no data source. Use this type when you want to invoke a GraphQL operation without connecting to a data source, such as when you're performing data transformation with resolvers or invoking a subscription from a mutation.    HTTP: The data source is an HTTP endpoint.    RELATIONAL_DATABASE: The data source is a relational database.  
    */
  var `type`: js.UndefOr[DataSourceType] = js.undefined
}
object DataSource {
  
  inline def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    inline def setDataSourceArn(value: String): Self = StObject.set(x, "dataSourceArn", value.asInstanceOf[js.Any])
    
    inline def setDataSourceArnUndefined: Self = StObject.set(x, "dataSourceArn", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDynamodbConfig(value: DynamodbDataSourceConfig): Self = StObject.set(x, "dynamodbConfig", value.asInstanceOf[js.Any])
    
    inline def setDynamodbConfigUndefined: Self = StObject.set(x, "dynamodbConfig", js.undefined)
    
    inline def setElasticsearchConfig(value: ElasticsearchDataSourceConfig): Self = StObject.set(x, "elasticsearchConfig", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchConfigUndefined: Self = StObject.set(x, "elasticsearchConfig", js.undefined)
    
    inline def setEventBridgeConfig(value: EventBridgeDataSourceConfig): Self = StObject.set(x, "eventBridgeConfig", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeConfigUndefined: Self = StObject.set(x, "eventBridgeConfig", js.undefined)
    
    inline def setHttpConfig(value: HttpDataSourceConfig): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
    
    inline def setHttpConfigUndefined: Self = StObject.set(x, "httpConfig", js.undefined)
    
    inline def setLambdaConfig(value: LambdaDataSourceConfig): Self = StObject.set(x, "lambdaConfig", value.asInstanceOf[js.Any])
    
    inline def setLambdaConfigUndefined: Self = StObject.set(x, "lambdaConfig", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpenSearchServiceConfig(value: OpenSearchServiceDataSourceConfig): Self = StObject.set(x, "openSearchServiceConfig", value.asInstanceOf[js.Any])
    
    inline def setOpenSearchServiceConfigUndefined: Self = StObject.set(x, "openSearchServiceConfig", js.undefined)
    
    inline def setRelationalDatabaseConfig(value: RelationalDatabaseDataSourceConfig): Self = StObject.set(x, "relationalDatabaseConfig", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseConfigUndefined: Self = StObject.set(x, "relationalDatabaseConfig", js.undefined)
    
    inline def setServiceRoleArn(value: String): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
    
    inline def setType(value: DataSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
