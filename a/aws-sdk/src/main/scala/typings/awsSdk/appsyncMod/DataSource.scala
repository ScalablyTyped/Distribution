package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends js.Object {
  
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
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSourceArn(value: String): Self = this.set("dataSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceArn: Self = this.set("dataSourceArn", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDynamodbConfig(value: DynamodbDataSourceConfig): Self = this.set("dynamodbConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamodbConfig: Self = this.set("dynamodbConfig", js.undefined)
    
    @scala.inline
    def setElasticsearchConfig(value: ElasticsearchDataSourceConfig): Self = this.set("elasticsearchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticsearchConfig: Self = this.set("elasticsearchConfig", js.undefined)
    
    @scala.inline
    def setHttpConfig(value: HttpDataSourceConfig): Self = this.set("httpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpConfig: Self = this.set("httpConfig", js.undefined)
    
    @scala.inline
    def setLambdaConfig(value: LambdaDataSourceConfig): Self = this.set("lambdaConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaConfig: Self = this.set("lambdaConfig", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseConfig(value: RelationalDatabaseDataSourceConfig): Self = this.set("relationalDatabaseConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationalDatabaseConfig: Self = this.set("relationalDatabaseConfig", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: String): Self = this.set("serviceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("serviceRoleArn", js.undefined)
    
    @scala.inline
    def setType(value: DataSourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
