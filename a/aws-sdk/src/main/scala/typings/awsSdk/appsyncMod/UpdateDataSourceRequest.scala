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
  def apply(
    apiId: String,
    name: ResourceName,
    `type`: DataSourceType,
    description: String = null,
    dynamodbConfig: DynamodbDataSourceConfig = null,
    elasticsearchConfig: ElasticsearchDataSourceConfig = null,
    httpConfig: HttpDataSourceConfig = null,
    lambdaConfig: LambdaDataSourceConfig = null,
    relationalDatabaseConfig: RelationalDatabaseDataSourceConfig = null,
    serviceRoleArn: String = null
  ): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodbConfig != null) __obj.updateDynamic("dynamodbConfig")(dynamodbConfig.asInstanceOf[js.Any])
    if (elasticsearchConfig != null) __obj.updateDynamic("elasticsearchConfig")(elasticsearchConfig.asInstanceOf[js.Any])
    if (httpConfig != null) __obj.updateDynamic("httpConfig")(httpConfig.asInstanceOf[js.Any])
    if (lambdaConfig != null) __obj.updateDynamic("lambdaConfig")(lambdaConfig.asInstanceOf[js.Any])
    if (relationalDatabaseConfig != null) __obj.updateDynamic("relationalDatabaseConfig")(relationalDatabaseConfig.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
}

