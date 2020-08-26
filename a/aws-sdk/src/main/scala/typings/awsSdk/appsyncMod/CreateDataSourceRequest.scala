package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSourceRequest extends js.Object {
  /**
    * The API ID for the GraphQL API for the DataSource.
    */
  var apiId: String = js.native
  /**
    * A description of the DataSource.
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
    * A user-supplied name for the DataSource.
    */
  var name: ResourceName = js.native
  /**
    * Relational database settings.
    */
  var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.native
  /**
    * The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data source.
    */
  var serviceRoleArn: js.UndefOr[String] = js.native
  /**
    * The type of the DataSource.
    */
  var `type`: DataSourceType = js.native
}

object CreateDataSourceRequest {
  @scala.inline
  def apply(apiId: String, name: ResourceName, `type`: DataSourceType): CreateDataSourceRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
  @scala.inline
  implicit class CreateDataSourceRequestOps[Self <: CreateDataSourceRequest] (val x: Self) extends AnyVal {
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
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DataSourceType): Self = this.set("type", value.asInstanceOf[js.Any])
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
    def setRelationalDatabaseConfig(value: RelationalDatabaseDataSourceConfig): Self = this.set("relationalDatabaseConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationalDatabaseConfig: Self = this.set("relationalDatabaseConfig", js.undefined)
    @scala.inline
    def setServiceRoleArn(value: String): Self = this.set("serviceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("serviceRoleArn", js.undefined)
  }
  
}

