package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    val __obj = js.Dynamic.literal(apiId = apiId, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (dynamodbConfig != null) __obj.updateDynamic("dynamodbConfig")(dynamodbConfig)
    if (elasticsearchConfig != null) __obj.updateDynamic("elasticsearchConfig")(elasticsearchConfig)
    if (httpConfig != null) __obj.updateDynamic("httpConfig")(httpConfig)
    if (lambdaConfig != null) __obj.updateDynamic("lambdaConfig")(lambdaConfig)
    if (relationalDatabaseConfig != null) __obj.updateDynamic("relationalDatabaseConfig")(relationalDatabaseConfig)
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn)
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
}

