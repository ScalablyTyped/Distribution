package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourceRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The new description for the data source.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The new Amazon DynamoDB configuration.
    */
  var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.native
  /**
    * The new Elasticsearch Service configuration.
    */
  var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.native
  /**
    * The new HTTP endpoint configuration.
    */
  var httpConfig: js.UndefOr[HttpDataSourceConfig] = js.native
  /**
    * The new AWS Lambda configuration.
    */
  var lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.native
  /**
    * The new name for the data source.
    */
  var name: ResourceName = js.native
  /**
    * The new relational database configuration.
    */
  var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.native
  /**
    * The new service role ARN for the data source.
    */
  var serviceRoleArn: js.UndefOr[String] = js.native
  /**
    * The new data source type.
    */
  var `type`: DataSourceType = js.native
}

object UpdateDataSourceRequest {
  @scala.inline
  def apply(apiId: String, name: ResourceName, `type`: DataSourceType): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
  @scala.inline
  implicit class UpdateDataSourceRequestOps[Self <: UpdateDataSourceRequest] (val x: Self) extends AnyVal {
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

