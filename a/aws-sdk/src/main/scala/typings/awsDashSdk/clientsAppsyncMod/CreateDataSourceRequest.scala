package typings.awsDashSdk.clientsAppsyncMod

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
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodbConfig != null) __obj.updateDynamic("dynamodbConfig")(dynamodbConfig.asInstanceOf[js.Any])
    if (elasticsearchConfig != null) __obj.updateDynamic("elasticsearchConfig")(elasticsearchConfig.asInstanceOf[js.Any])
    if (httpConfig != null) __obj.updateDynamic("httpConfig")(httpConfig.asInstanceOf[js.Any])
    if (lambdaConfig != null) __obj.updateDynamic("lambdaConfig")(lambdaConfig.asInstanceOf[js.Any])
    if (relationalDatabaseConfig != null) __obj.updateDynamic("relationalDatabaseConfig")(relationalDatabaseConfig.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceRequest]
  }
}

