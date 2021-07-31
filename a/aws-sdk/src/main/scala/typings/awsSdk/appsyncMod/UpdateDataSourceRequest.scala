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
object UpdateDataSourceRequest {
  
  @scala.inline
  def apply(apiId: String, name: ResourceName, `type`: DataSourceType): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
  
  @scala.inline
  implicit class UpdateDataSourceRequestMutableBuilder[Self <: UpdateDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDynamodbConfig(value: DynamodbDataSourceConfig): Self = StObject.set(x, "dynamodbConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbConfigUndefined: Self = StObject.set(x, "dynamodbConfig", js.undefined)
    
    @scala.inline
    def setElasticsearchConfig(value: ElasticsearchDataSourceConfig): Self = StObject.set(x, "elasticsearchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchConfigUndefined: Self = StObject.set(x, "elasticsearchConfig", js.undefined)
    
    @scala.inline
    def setHttpConfig(value: HttpDataSourceConfig): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpConfigUndefined: Self = StObject.set(x, "httpConfig", js.undefined)
    
    @scala.inline
    def setLambdaConfig(value: LambdaDataSourceConfig): Self = StObject.set(x, "lambdaConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaConfigUndefined: Self = StObject.set(x, "lambdaConfig", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseConfig(value: RelationalDatabaseDataSourceConfig): Self = StObject.set(x, "relationalDatabaseConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseConfigUndefined: Self = StObject.set(x, "relationalDatabaseConfig", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: String): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
    
    @scala.inline
    def setType(value: DataSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
