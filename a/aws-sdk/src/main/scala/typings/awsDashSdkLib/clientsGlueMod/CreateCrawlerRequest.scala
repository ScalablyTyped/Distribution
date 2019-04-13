package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCrawlerRequest extends js.Object {
  /**
    * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  var Classifiers: js.UndefOr[ClassifierNameList] = js.undefined
  /**
    * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.
    */
  var Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined
  /**
    * The name of the SecurityConfiguration structure to be used by this Crawler.
    */
  var CrawlerSecurityConfiguration: js.UndefOr[CrawlerSecurityConfiguration] = js.undefined
  /**
    * The AWS Glue database where results are written, such as: arn:aws:daylight:us-east-1::database/sometable/ *.
    */
  var DatabaseName: awsDashSdkLib.clientsGlueMod.DatabaseName
  /**
    * A description of the new crawler.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * Name of the new crawler.
    */
  var Name: NameString
  /**
    * The IAM role (or ARN of an IAM role) used by the new crawler to access customer resources.
    */
  var Role: awsDashSdkLib.clientsGlueMod.Role
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[CronExpression] = js.undefined
  /**
    * Policy for the crawler's update and deletion behavior.
    */
  var SchemaChangePolicy: js.UndefOr[SchemaChangePolicy] = js.undefined
  /**
    * The table prefix used for catalog tables that are created.
    */
  var TablePrefix: js.UndefOr[TablePrefix] = js.undefined
  /**
    * The tags to use with this crawler request. You may use tags to limit access to the crawler. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
  /**
    * A list of collection of targets to crawl.
    */
  var Targets: CrawlerTargets
}

object CreateCrawlerRequest {
  @scala.inline
  def apply(
    DatabaseName: DatabaseName,
    Name: NameString,
    Role: Role,
    Targets: CrawlerTargets,
    Classifiers: ClassifierNameList = null,
    Configuration: CrawlerConfiguration = null,
    CrawlerSecurityConfiguration: CrawlerSecurityConfiguration = null,
    Description: DescriptionString = null,
    Schedule: CronExpression = null,
    SchemaChangePolicy: SchemaChangePolicy = null,
    TablePrefix: TablePrefix = null,
    Tags: TagsMap = null
  ): CreateCrawlerRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, Name = Name, Role = Role, Targets = Targets)
    if (Classifiers != null) __obj.updateDynamic("Classifiers")(Classifiers)
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    if (CrawlerSecurityConfiguration != null) __obj.updateDynamic("CrawlerSecurityConfiguration")(CrawlerSecurityConfiguration)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (SchemaChangePolicy != null) __obj.updateDynamic("SchemaChangePolicy")(SchemaChangePolicy)
    if (TablePrefix != null) __obj.updateDynamic("TablePrefix")(TablePrefix)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateCrawlerRequest]
  }
}

