package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCrawlerRequest extends js.Object {
  /**
    * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  var Classifiers: js.UndefOr[ClassifierNameList] = js.native
  /**
    * The crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.
    */
  var Configuration: js.UndefOr[CrawlerConfiguration] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used by this crawler.
    */
  var CrawlerSecurityConfiguration: js.UndefOr[typings.awsDashSdk.clientsGlueMod.CrawlerSecurityConfiguration] = js.native
  /**
    * The AWS Glue database where results are stored, such as: arn:aws:daylight:us-east-1::database/sometable/ *.
    */
  var DatabaseName: js.UndefOr[typings.awsDashSdk.clientsGlueMod.DatabaseName] = js.native
  /**
    * A description of the new crawler.
    */
  var Description: js.UndefOr[DescriptionStringRemovable] = js.native
  /**
    * Name of the new crawler.
    */
  var Name: NameString = js.native
  /**
    * The IAM role or Amazon Resource Name (ARN) of an IAM role that is used by the new crawler to access customer resources.
    */
  var Role: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Role] = js.native
  /**
    * A cron expression used to specify the schedule. For more information, see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, specify cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[CronExpression] = js.native
  /**
    * The policy for the crawler's update and deletion behavior.
    */
  var SchemaChangePolicy: js.UndefOr[typings.awsDashSdk.clientsGlueMod.SchemaChangePolicy] = js.native
  /**
    * The table prefix used for catalog tables that are created.
    */
  var TablePrefix: js.UndefOr[typings.awsDashSdk.clientsGlueMod.TablePrefix] = js.native
  /**
    * A list of targets to crawl.
    */
  var Targets: js.UndefOr[CrawlerTargets] = js.native
}

object UpdateCrawlerRequest {
  @scala.inline
  def apply(
    Name: NameString,
    Classifiers: ClassifierNameList = null,
    Configuration: CrawlerConfiguration = null,
    CrawlerSecurityConfiguration: CrawlerSecurityConfiguration = null,
    DatabaseName: DatabaseName = null,
    Description: DescriptionStringRemovable = null,
    Role: Role = null,
    Schedule: CronExpression = null,
    SchemaChangePolicy: SchemaChangePolicy = null,
    TablePrefix: TablePrefix = null,
    Targets: CrawlerTargets = null
  ): UpdateCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Classifiers != null) __obj.updateDynamic("Classifiers")(Classifiers.asInstanceOf[js.Any])
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (CrawlerSecurityConfiguration != null) __obj.updateDynamic("CrawlerSecurityConfiguration")(CrawlerSecurityConfiguration.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SchemaChangePolicy != null) __obj.updateDynamic("SchemaChangePolicy")(SchemaChangePolicy.asInstanceOf[js.Any])
    if (TablePrefix != null) __obj.updateDynamic("TablePrefix")(TablePrefix.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCrawlerRequest]
  }
}

