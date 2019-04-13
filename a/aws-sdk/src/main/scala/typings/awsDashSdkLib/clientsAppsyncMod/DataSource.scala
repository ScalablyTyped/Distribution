package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /**
    * The data source ARN.
    */
  var dataSourceArn: js.UndefOr[String] = js.undefined
  /**
    * The description of the data source.
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
    * The name of the data source.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * Relational database settings.
    */
  var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined
  /**
    * The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data source.
    */
  var serviceRoleArn: js.UndefOr[String] = js.undefined
  /**
    * The type of the data source.    AMAZON_DYNAMODB: The data source is an Amazon DynamoDB table.    AMAZON_ELASTICSEARCH: The data source is an Amazon Elasticsearch Service domain.    AWS_LAMBDA: The data source is an AWS Lambda function.    NONE: There is no data source. This type is used when you wish to invoke a GraphQL operation without connecting to a data source, such as performing data transformation with resolvers or triggering a subscription to be invoked from a mutation.    HTTP: The data source is an HTTP endpoint.    RELATIONAL_DATABASE: The data source is a relational database.  
    */
  var `type`: js.UndefOr[DataSourceType] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(
    dataSourceArn: String = null,
    description: String = null,
    dynamodbConfig: DynamodbDataSourceConfig = null,
    elasticsearchConfig: ElasticsearchDataSourceConfig = null,
    httpConfig: HttpDataSourceConfig = null,
    lambdaConfig: LambdaDataSourceConfig = null,
    name: ResourceName = null,
    relationalDatabaseConfig: RelationalDatabaseDataSourceConfig = null,
    serviceRoleArn: String = null,
    `type`: DataSourceType = null
  ): DataSource = {
    val __obj = js.Dynamic.literal()
    if (dataSourceArn != null) __obj.updateDynamic("dataSourceArn")(dataSourceArn)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dynamodbConfig != null) __obj.updateDynamic("dynamodbConfig")(dynamodbConfig)
    if (elasticsearchConfig != null) __obj.updateDynamic("elasticsearchConfig")(elasticsearchConfig)
    if (httpConfig != null) __obj.updateDynamic("httpConfig")(httpConfig)
    if (lambdaConfig != null) __obj.updateDynamic("lambdaConfig")(lambdaConfig)
    if (name != null) __obj.updateDynamic("name")(name)
    if (relationalDatabaseConfig != null) __obj.updateDynamic("relationalDatabaseConfig")(relationalDatabaseConfig)
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

