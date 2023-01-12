package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceConfiguration extends StObject {
  
  /**
    * Provides the configuration information to connect to Alfresco as your data source.
    */
  var AlfrescoConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.AlfrescoConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to Box as your data source.
    */
  var BoxConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.BoxConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to Confluence as your data source.
    */
  var ConfluenceConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.ConfluenceConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to a database as your data source.
    */
  var DatabaseConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.DatabaseConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to Amazon FSx as your data source.
    */
  var FsxConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.FsxConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to GitHub as your data source.
    */
  var GitHubConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.GitHubConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to Google Drive as your data source.
    */
  var GoogleDriveConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.GoogleDriveConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to Jira as your data source.
    */
  var JiraConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.JiraConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to Microsoft OneDrive as your data source.
    */
  var OneDriveConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.OneDriveConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to Quip as your data source.
    */
  var QuipConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.QuipConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to an Amazon S3 bucket as your data source.
    */
  var S3Configuration: js.UndefOr[S3DataSourceConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to Salesforce as your data source.
    */
  var SalesforceConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.SalesforceConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to ServiceNow as your data source.
    */
  var ServiceNowConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.ServiceNowConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to Microsoft SharePoint as your data source.
    */
  var SharePointConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.SharePointConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to Slack as your data source.
    */
  var SlackConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.SlackConfiguration] = js.undefined
  
  /**
    * Provides a template for the configuration information to connect to your data source.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.TemplateConfiguration] = js.undefined
  
  var WebCrawlerConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.WebCrawlerConfiguration] = js.undefined
  
  /**
    * Provides the configuration information to connect to Amazon WorkDocs as your data source.
    */
  var WorkDocsConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.WorkDocsConfiguration] = js.undefined
}
object DataSourceConfiguration {
  
  inline def apply(): DataSourceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAlfrescoConfiguration(value: AlfrescoConfiguration): Self = StObject.set(x, "AlfrescoConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAlfrescoConfigurationUndefined: Self = StObject.set(x, "AlfrescoConfiguration", js.undefined)
    
    inline def setBoxConfiguration(value: BoxConfiguration): Self = StObject.set(x, "BoxConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBoxConfigurationUndefined: Self = StObject.set(x, "BoxConfiguration", js.undefined)
    
    inline def setConfluenceConfiguration(value: ConfluenceConfiguration): Self = StObject.set(x, "ConfluenceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setConfluenceConfigurationUndefined: Self = StObject.set(x, "ConfluenceConfiguration", js.undefined)
    
    inline def setDatabaseConfiguration(value: DatabaseConfiguration): Self = StObject.set(x, "DatabaseConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDatabaseConfigurationUndefined: Self = StObject.set(x, "DatabaseConfiguration", js.undefined)
    
    inline def setFsxConfiguration(value: FsxConfiguration): Self = StObject.set(x, "FsxConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFsxConfigurationUndefined: Self = StObject.set(x, "FsxConfiguration", js.undefined)
    
    inline def setGitHubConfiguration(value: GitHubConfiguration): Self = StObject.set(x, "GitHubConfiguration", value.asInstanceOf[js.Any])
    
    inline def setGitHubConfigurationUndefined: Self = StObject.set(x, "GitHubConfiguration", js.undefined)
    
    inline def setGoogleDriveConfiguration(value: GoogleDriveConfiguration): Self = StObject.set(x, "GoogleDriveConfiguration", value.asInstanceOf[js.Any])
    
    inline def setGoogleDriveConfigurationUndefined: Self = StObject.set(x, "GoogleDriveConfiguration", js.undefined)
    
    inline def setJiraConfiguration(value: JiraConfiguration): Self = StObject.set(x, "JiraConfiguration", value.asInstanceOf[js.Any])
    
    inline def setJiraConfigurationUndefined: Self = StObject.set(x, "JiraConfiguration", js.undefined)
    
    inline def setOneDriveConfiguration(value: OneDriveConfiguration): Self = StObject.set(x, "OneDriveConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOneDriveConfigurationUndefined: Self = StObject.set(x, "OneDriveConfiguration", js.undefined)
    
    inline def setQuipConfiguration(value: QuipConfiguration): Self = StObject.set(x, "QuipConfiguration", value.asInstanceOf[js.Any])
    
    inline def setQuipConfigurationUndefined: Self = StObject.set(x, "QuipConfiguration", js.undefined)
    
    inline def setS3Configuration(value: S3DataSourceConfiguration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigurationUndefined: Self = StObject.set(x, "S3Configuration", js.undefined)
    
    inline def setSalesforceConfiguration(value: SalesforceConfiguration): Self = StObject.set(x, "SalesforceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSalesforceConfigurationUndefined: Self = StObject.set(x, "SalesforceConfiguration", js.undefined)
    
    inline def setServiceNowConfiguration(value: ServiceNowConfiguration): Self = StObject.set(x, "ServiceNowConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServiceNowConfigurationUndefined: Self = StObject.set(x, "ServiceNowConfiguration", js.undefined)
    
    inline def setSharePointConfiguration(value: SharePointConfiguration): Self = StObject.set(x, "SharePointConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSharePointConfigurationUndefined: Self = StObject.set(x, "SharePointConfiguration", js.undefined)
    
    inline def setSlackConfiguration(value: SlackConfiguration): Self = StObject.set(x, "SlackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSlackConfigurationUndefined: Self = StObject.set(x, "SlackConfiguration", js.undefined)
    
    inline def setTemplateConfiguration(value: TemplateConfiguration): Self = StObject.set(x, "TemplateConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTemplateConfigurationUndefined: Self = StObject.set(x, "TemplateConfiguration", js.undefined)
    
    inline def setWebCrawlerConfiguration(value: WebCrawlerConfiguration): Self = StObject.set(x, "WebCrawlerConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWebCrawlerConfigurationUndefined: Self = StObject.set(x, "WebCrawlerConfiguration", js.undefined)
    
    inline def setWorkDocsConfiguration(value: WorkDocsConfiguration): Self = StObject.set(x, "WorkDocsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWorkDocsConfigurationUndefined: Self = StObject.set(x, "WorkDocsConfiguration", js.undefined)
  }
}
