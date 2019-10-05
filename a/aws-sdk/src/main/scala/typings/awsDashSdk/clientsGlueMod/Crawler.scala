package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crawler extends js.Object {
  /**
    * A list of UTF-8 strings that specify the custom classifiers that are associated with the crawler.
    */
  var Classifiers: js.UndefOr[ClassifierNameList] = js.undefined
  /**
    * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.
    */
  var Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined
  /**
    * If the crawler is running, contains the total time elapsed since the last crawl began.
    */
  var CrawlElapsedTime: js.UndefOr[MillisecondsCount] = js.undefined
  /**
    * The name of the SecurityConfiguration structure to be used by this crawler.
    */
  var CrawlerSecurityConfiguration: js.UndefOr[typings.awsDashSdk.clientsGlueMod.CrawlerSecurityConfiguration] = js.undefined
  /**
    * The time that the crawler was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the database in which the crawler's output is stored.
    */
  var DatabaseName: js.UndefOr[typings.awsDashSdk.clientsGlueMod.DatabaseName] = js.undefined
  /**
    * A description of the crawler.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The status of the last crawl, and potentially error information if an error occurred.
    */
  var LastCrawl: js.UndefOr[LastCrawlInfo] = js.undefined
  /**
    * The time that the crawler was last updated.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the crawler.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such as Amazon Simple Storage Service (Amazon S3) data.
    */
  var Role: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Role] = js.undefined
  /**
    * For scheduled crawlers, the schedule when the crawler runs.
    */
  var Schedule: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Schedule] = js.undefined
  /**
    * The policy that specifies update and delete behaviors for the crawler.
    */
  var SchemaChangePolicy: js.UndefOr[typings.awsDashSdk.clientsGlueMod.SchemaChangePolicy] = js.undefined
  /**
    * Indicates whether the crawler is running, or whether a run is pending.
    */
  var State: js.UndefOr[CrawlerState] = js.undefined
  /**
    * The prefix added to the names of tables that are created.
    */
  var TablePrefix: js.UndefOr[typings.awsDashSdk.clientsGlueMod.TablePrefix] = js.undefined
  /**
    * A collection of targets to crawl.
    */
  var Targets: js.UndefOr[CrawlerTargets] = js.undefined
  /**
    * The version of the crawler.
    */
  var Version: js.UndefOr[VersionId] = js.undefined
}

object Crawler {
  @scala.inline
  def apply(
    Classifiers: ClassifierNameList = null,
    Configuration: CrawlerConfiguration = null,
    CrawlElapsedTime: Int | Double = null,
    CrawlerSecurityConfiguration: CrawlerSecurityConfiguration = null,
    CreationTime: Timestamp = null,
    DatabaseName: DatabaseName = null,
    Description: DescriptionString = null,
    LastCrawl: LastCrawlInfo = null,
    LastUpdated: Timestamp = null,
    Name: NameString = null,
    Role: Role = null,
    Schedule: Schedule = null,
    SchemaChangePolicy: SchemaChangePolicy = null,
    State: CrawlerState = null,
    TablePrefix: TablePrefix = null,
    Targets: CrawlerTargets = null,
    Version: Int | Double = null
  ): Crawler = {
    val __obj = js.Dynamic.literal()
    if (Classifiers != null) __obj.updateDynamic("Classifiers")(Classifiers)
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    if (CrawlElapsedTime != null) __obj.updateDynamic("CrawlElapsedTime")(CrawlElapsedTime.asInstanceOf[js.Any])
    if (CrawlerSecurityConfiguration != null) __obj.updateDynamic("CrawlerSecurityConfiguration")(CrawlerSecurityConfiguration)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LastCrawl != null) __obj.updateDynamic("LastCrawl")(LastCrawl)
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Role != null) __obj.updateDynamic("Role")(Role)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (SchemaChangePolicy != null) __obj.updateDynamic("SchemaChangePolicy")(SchemaChangePolicy)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TablePrefix != null) __obj.updateDynamic("TablePrefix")(TablePrefix)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crawler]
  }
}

