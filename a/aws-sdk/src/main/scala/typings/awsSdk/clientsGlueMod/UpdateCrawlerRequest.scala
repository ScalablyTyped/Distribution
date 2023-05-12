package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCrawlerRequest extends StObject {
  
  /**
    * A list of custom classifiers that the user has registered. By default, all built-in classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
    */
  var Classifiers: js.UndefOr[ClassifierNameList] = js.undefined
  
  /**
    * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Setting crawler configuration options.
    */
  var Configuration: js.UndefOr[CrawlerConfiguration] = js.undefined
  
  /**
    * The name of the SecurityConfiguration structure to be used by this crawler.
    */
  var CrawlerSecurityConfiguration: js.UndefOr[typings.awsSdk.clientsGlueMod.CrawlerSecurityConfiguration] = js.undefined
  
  /**
    * The Glue database where results are stored, such as: arn:aws:daylight:us-east-1::database/sometable/ *.
    */
  var DatabaseName: js.UndefOr[typings.awsSdk.clientsGlueMod.DatabaseName] = js.undefined
  
  /**
    * A description of the new crawler.
    */
  var Description: js.UndefOr[DescriptionStringRemovable] = js.undefined
  
  /**
    * Specifies Lake Formation configuration settings for the crawler.
    */
  var LakeFormationConfiguration: js.UndefOr[typings.awsSdk.clientsGlueMod.LakeFormationConfiguration] = js.undefined
  
  /**
    * Specifies data lineage configuration settings for the crawler.
    */
  var LineageConfiguration: js.UndefOr[typings.awsSdk.clientsGlueMod.LineageConfiguration] = js.undefined
  
  /**
    * Name of the new crawler.
    */
  var Name: NameString
  
  /**
    * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.
    */
  var RecrawlPolicy: js.UndefOr[typings.awsSdk.clientsGlueMod.RecrawlPolicy] = js.undefined
  
  /**
    * The IAM role or Amazon Resource Name (ARN) of an IAM role that is used by the new crawler to access customer resources.
    */
  var Role: js.UndefOr[typings.awsSdk.clientsGlueMod.Role] = js.undefined
  
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[CronExpression] = js.undefined
  
  /**
    * The policy for the crawler's update and deletion behavior.
    */
  var SchemaChangePolicy: js.UndefOr[typings.awsSdk.clientsGlueMod.SchemaChangePolicy] = js.undefined
  
  /**
    * The table prefix used for catalog tables that are created.
    */
  var TablePrefix: js.UndefOr[typings.awsSdk.clientsGlueMod.TablePrefix] = js.undefined
  
  /**
    * A list of targets to crawl.
    */
  var Targets: js.UndefOr[CrawlerTargets] = js.undefined
}
object UpdateCrawlerRequest {
  
  inline def apply(Name: NameString): UpdateCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCrawlerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCrawlerRequest] (val x: Self) extends AnyVal {
    
    inline def setClassifiers(value: ClassifierNameList): Self = StObject.set(x, "Classifiers", value.asInstanceOf[js.Any])
    
    inline def setClassifiersUndefined: Self = StObject.set(x, "Classifiers", js.undefined)
    
    inline def setClassifiersVarargs(value: NameString*): Self = StObject.set(x, "Classifiers", js.Array(value*))
    
    inline def setConfiguration(value: CrawlerConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setCrawlerSecurityConfiguration(value: CrawlerSecurityConfiguration): Self = StObject.set(x, "CrawlerSecurityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCrawlerSecurityConfigurationUndefined: Self = StObject.set(x, "CrawlerSecurityConfiguration", js.undefined)
    
    inline def setDatabaseName(value: DatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setDescription(value: DescriptionStringRemovable): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLakeFormationConfiguration(value: LakeFormationConfiguration): Self = StObject.set(x, "LakeFormationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLakeFormationConfigurationUndefined: Self = StObject.set(x, "LakeFormationConfiguration", js.undefined)
    
    inline def setLineageConfiguration(value: LineageConfiguration): Self = StObject.set(x, "LineageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLineageConfigurationUndefined: Self = StObject.set(x, "LineageConfiguration", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRecrawlPolicy(value: RecrawlPolicy): Self = StObject.set(x, "RecrawlPolicy", value.asInstanceOf[js.Any])
    
    inline def setRecrawlPolicyUndefined: Self = StObject.set(x, "RecrawlPolicy", js.undefined)
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setSchedule(value: CronExpression): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setSchemaChangePolicy(value: SchemaChangePolicy): Self = StObject.set(x, "SchemaChangePolicy", value.asInstanceOf[js.Any])
    
    inline def setSchemaChangePolicyUndefined: Self = StObject.set(x, "SchemaChangePolicy", js.undefined)
    
    inline def setTablePrefix(value: TablePrefix): Self = StObject.set(x, "TablePrefix", value.asInstanceOf[js.Any])
    
    inline def setTablePrefixUndefined: Self = StObject.set(x, "TablePrefix", js.undefined)
    
    inline def setTargets(value: CrawlerTargets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
  }
}
