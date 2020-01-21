package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    if (dataSourceArn != null) __obj.updateDynamic("dataSourceArn")(dataSourceArn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodbConfig != null) __obj.updateDynamic("dynamodbConfig")(dynamodbConfig.asInstanceOf[js.Any])
    if (elasticsearchConfig != null) __obj.updateDynamic("elasticsearchConfig")(elasticsearchConfig.asInstanceOf[js.Any])
    if (httpConfig != null) __obj.updateDynamic("httpConfig")(httpConfig.asInstanceOf[js.Any])
    if (lambdaConfig != null) __obj.updateDynamic("lambdaConfig")(lambdaConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (relationalDatabaseConfig != null) __obj.updateDynamic("relationalDatabaseConfig")(relationalDatabaseConfig.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

