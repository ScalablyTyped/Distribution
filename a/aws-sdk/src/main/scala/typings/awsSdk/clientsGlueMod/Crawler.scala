package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Crawler extends StObject {
  
  /**
    * A list of UTF-8 strings that specify the custom classifiers that are associated with the crawler.
    */
  var Classifiers: js.UndefOr[ClassifierNameList] = js.undefined
  
  /**
    * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Setting crawler configuration options.
    */
  var Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined
  
  /**
    * If the crawler is running, contains the total time elapsed since the last crawl began.
    */
  var CrawlElapsedTime: js.UndefOr[MillisecondsCount] = js.undefined
  
  /**
    * The name of the SecurityConfiguration structure to be used by this crawler.
    */
  var CrawlerSecurityConfiguration: js.UndefOr[typings.awsSdk.clientsGlueMod.CrawlerSecurityConfiguration] = js.undefined
  
  /**
    * The time that the crawler was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the database in which the crawler's output is stored.
    */
  var DatabaseName: js.UndefOr[typings.awsSdk.clientsGlueMod.DatabaseName] = js.undefined
  
  /**
    * A description of the crawler.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * Specifies whether the crawler should use Lake Formation credentials for the crawler instead of the IAM role credentials.
    */
  var LakeFormationConfiguration: js.UndefOr[typings.awsSdk.clientsGlueMod.LakeFormationConfiguration] = js.undefined
  
  /**
    * The status of the last crawl, and potentially error information if an error occurred.
    */
  var LastCrawl: js.UndefOr[LastCrawlInfo] = js.undefined
  
  /**
    * The time that the crawler was last updated.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A configuration that specifies whether data lineage is enabled for the crawler.
    */
  var LineageConfiguration: js.UndefOr[typings.awsSdk.clientsGlueMod.LineageConfiguration] = js.undefined
  
  /**
    * The name of the crawler.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.
    */
  var RecrawlPolicy: js.UndefOr[typings.awsSdk.clientsGlueMod.RecrawlPolicy] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such as Amazon Simple Storage Service (Amazon S3) data.
    */
  var Role: js.UndefOr[typings.awsSdk.clientsGlueMod.Role] = js.undefined
  
  /**
    * For scheduled crawlers, the schedule when the crawler runs.
    */
  var Schedule: js.UndefOr[typings.awsSdk.clientsGlueMod.Schedule] = js.undefined
  
  /**
    * The policy that specifies update and delete behaviors for the crawler.
    */
  var SchemaChangePolicy: js.UndefOr[typings.awsSdk.clientsGlueMod.SchemaChangePolicy] = js.undefined
  
  /**
    * Indicates whether the crawler is running, or whether a run is pending.
    */
  var State: js.UndefOr[CrawlerState] = js.undefined
  
  /**
    * The prefix added to the names of tables that are created.
    */
  var TablePrefix: js.UndefOr[typings.awsSdk.clientsGlueMod.TablePrefix] = js.undefined
  
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
  
  inline def apply(): Crawler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crawler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Crawler] (val x: Self) extends AnyVal {
    
    inline def setClassifiers(value: ClassifierNameList): Self = StObject.set(x, "Classifiers", value.asInstanceOf[js.Any])
    
    inline def setClassifiersUndefined: Self = StObject.set(x, "Classifiers", js.undefined)
    
    inline def setClassifiersVarargs(value: NameString*): Self = StObject.set(x, "Classifiers", js.Array(value*))
    
    inline def setConfiguration(value: CrawlerConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setCrawlElapsedTime(value: MillisecondsCount): Self = StObject.set(x, "CrawlElapsedTime", value.asInstanceOf[js.Any])
    
    inline def setCrawlElapsedTimeUndefined: Self = StObject.set(x, "CrawlElapsedTime", js.undefined)
    
    inline def setCrawlerSecurityConfiguration(value: CrawlerSecurityConfiguration): Self = StObject.set(x, "CrawlerSecurityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCrawlerSecurityConfigurationUndefined: Self = StObject.set(x, "CrawlerSecurityConfiguration", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDatabaseName(value: DatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLakeFormationConfiguration(value: LakeFormationConfiguration): Self = StObject.set(x, "LakeFormationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLakeFormationConfigurationUndefined: Self = StObject.set(x, "LakeFormationConfiguration", js.undefined)
    
    inline def setLastCrawl(value: LastCrawlInfo): Self = StObject.set(x, "LastCrawl", value.asInstanceOf[js.Any])
    
    inline def setLastCrawlUndefined: Self = StObject.set(x, "LastCrawl", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setLineageConfiguration(value: LineageConfiguration): Self = StObject.set(x, "LineageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLineageConfigurationUndefined: Self = StObject.set(x, "LineageConfiguration", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRecrawlPolicy(value: RecrawlPolicy): Self = StObject.set(x, "RecrawlPolicy", value.asInstanceOf[js.Any])
    
    inline def setRecrawlPolicyUndefined: Self = StObject.set(x, "RecrawlPolicy", js.undefined)
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setSchedule(value: Schedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setSchemaChangePolicy(value: SchemaChangePolicy): Self = StObject.set(x, "SchemaChangePolicy", value.asInstanceOf[js.Any])
    
    inline def setSchemaChangePolicyUndefined: Self = StObject.set(x, "SchemaChangePolicy", js.undefined)
    
    inline def setState(value: CrawlerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTablePrefix(value: TablePrefix): Self = StObject.set(x, "TablePrefix", value.asInstanceOf[js.Any])
    
    inline def setTablePrefixUndefined: Self = StObject.set(x, "TablePrefix", js.undefined)
    
    inline def setTargets(value: CrawlerTargets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setVersion(value: VersionId): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
