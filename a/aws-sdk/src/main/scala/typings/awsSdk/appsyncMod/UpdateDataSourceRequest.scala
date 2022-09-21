package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataSourceRequest extends StObject {
  
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
    * The new OpenSearch configuration. As of September 2021, Amazon Elasticsearch service is Amazon OpenSearch Service. This configuration is deprecated. Instead, use UpdateDataSourceRequest$openSearchServiceConfig to update an OpenSearch data source.
    */
  var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined
  
  /**
    * The new HTTP endpoint configuration.
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
    * The new OpenSearch configuration.
    */
  var openSearchServiceConfig: js.UndefOr[OpenSearchServiceDataSourceConfig] = js.undefined
  
  /**
    * The new relational database configuration.
    */
  var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined
  
  /**
    * The new service role Amazon Resource Name (ARN) for the data source.
    */
  var serviceRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The new data source type.
    */
  var `type`: DataSourceType
}
object UpdateDataSourceRequest {
  
  inline def apply(apiId: String, name: ResourceName, `type`: DataSourceType): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
  
  extension [Self <: UpdateDataSourceRequest](x: Self) {
    
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
