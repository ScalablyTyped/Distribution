package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends StObject {
  
  /**
    * The data source ARN.
    */
  var dataSourceArn: js.UndefOr[String] = js.native
  
  /**
    * The description of the data source.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Amazon DynamoDB settings.
    */
  var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.native
  
  /**
    * Amazon Elasticsearch Service settings.
    */
  var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.native
  
  /**
    * HTTP endpoint settings.
    */
  var httpConfig: js.UndefOr[HttpDataSourceConfig] = js.native
  
  /**
    * AWS Lambda settings.
    */
  var lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.native
  
  /**
    * The name of the data source.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * Relational database settings.
    */
  var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.native
  
  /**
    * The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data source.
    */
  var serviceRoleArn: js.UndefOr[String] = js.native
  
  /**
    * The type of the data source.    AMAZON_DYNAMODB: The data source is an Amazon DynamoDB table.    AMAZON_ELASTICSEARCH: The data source is an Amazon Elasticsearch Service domain.    AWS_LAMBDA: The data source is an AWS Lambda function.    NONE: There is no data source. This type is used when you wish to invoke a GraphQL operation without connecting to a data source, such as performing data transformation with resolvers or triggering a subscription to be invoked from a mutation.    HTTP: The data source is an HTTP endpoint.    RELATIONAL_DATABASE: The data source is a relational database.  
    */
  var `type`: js.UndefOr[DataSourceType] = js.native
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceArn(value: String): Self = StObject.set(x, "dataSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceArnUndefined: Self = StObject.set(x, "dataSourceArn", js.undefined)
    
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
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
