package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceRequest extends StObject {
  
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
    * Amazon OpenSearch Service settings. As of September 2021, Amazon Elasticsearch service is Amazon OpenSearch Service. This configuration is deprecated. For new data sources, use CreateDataSourceRequest$openSearchServiceConfig to create an OpenSearch data source.
    */
  var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined
  
  /**
    * HTTP endpoint settings.
    */
  var httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined
  
  /**
    * Lambda settings.
    */
  var lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined
  
  /**
    * A user-supplied name for the DataSource.
    */
  var name: ResourceName
  
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
    * The type of the DataSource.
    */
  var `type`: DataSourceType
}
object CreateDataSourceRequest {
  
  inline def apply(apiId: String, name: ResourceName, `type`: DataSourceType): CreateDataSourceRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
  
  extension [Self <: CreateDataSourceRequest](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDynamodbConfig(value: DynamodbDataSourceConfig): Self = StObject.set(x, "dynamodbConfig", value.asInstanceOf[js.Any])
    
    inline def setDynamodbConfigUndefined: Self = StObject.set(x, "dynamodbConfig", js.undefined)
    
    inline def setElasticsearchConfig(value: ElasticsearchDataSourceConfig): Self = StObject.set(x, "elasticsearchConfig", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchConfigUndefined: Self = StObject.set(x, "elasticsearchConfig", js.undefined)
    
    inline def setHttpConfig(value: HttpDataSourceConfig): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
    
    inline def setHttpConfigUndefined: Self = StObject.set(x, "httpConfig", js.undefined)
    
    inline def setLambdaConfig(value: LambdaDataSourceConfig): Self = StObject.set(x, "lambdaConfig", value.asInstanceOf[js.Any])
    
    inline def setLambdaConfigUndefined: Self = StObject.set(x, "lambdaConfig", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpenSearchServiceConfig(value: OpenSearchServiceDataSourceConfig): Self = StObject.set(x, "openSearchServiceConfig", value.asInstanceOf[js.Any])
    
    inline def setOpenSearchServiceConfigUndefined: Self = StObject.set(x, "openSearchServiceConfig", js.undefined)
    
    inline def setRelationalDatabaseConfig(value: RelationalDatabaseDataSourceConfig): Self = StObject.set(x, "relationalDatabaseConfig", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseConfigUndefined: Self = StObject.set(x, "relationalDatabaseConfig", js.undefined)
    
    inline def setServiceRoleArn(value: String): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
    
    inline def setType(value: DataSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
