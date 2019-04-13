package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDataSourceRequest extends js.Object {
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
    * Amazon Elasticsearch Service settings.
    */
  var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined
  /**
    * HTTP endpoint settings.
    */
  var httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined
  /**
    * AWS Lambda settings.
    */
  var lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined
  /**
    * A user-supplied name for the DataSource.
    */
  var name: ResourceName
  /**
    * Relational database settings.
    */
  var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined
  /**
    * The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data source.
    */
  var serviceRoleArn: js.UndefOr[String] = js.undefined
  /**
    * The type of the DataSource.
    */
  var `type`: DataSourceType
}

object CreateDataSourceRequest {
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
  ): CreateDataSourceRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (dynamodbConfig != null) __obj.updateDynamic("dynamodbConfig")(dynamodbConfig)
    if (elasticsearchConfig != null) __obj.updateDynamic("elasticsearchConfig")(elasticsearchConfig)
    if (httpConfig != null) __obj.updateDynamic("httpConfig")(httpConfig)
    if (lambdaConfig != null) __obj.updateDynamic("lambdaConfig")(lambdaConfig)
    if (relationalDatabaseConfig != null) __obj.updateDynamic("relationalDatabaseConfig")(relationalDatabaseConfig)
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn)
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
}

