package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharePointConfiguration extends StObject {
  
  /**
    * Whether you want to connect to SharePoint Online using basic authentication of user name and password, or OAuth authentication of user name, password, client ID, and client secret, or AD App-only authentication of client secret.
    */
  var AuthenticationType: js.UndefOr[SharePointOnlineAuthenticationType] = js.undefined
  
  /**
    *  TRUE to index document attachments.
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to disable local groups information.
    */
  var DisableLocalGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Microsoft SharePoint attribute field that contains the title of the document.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain documents in your SharePoint. Documents that match the patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document isn't included in the index. The regex applies to the display URL of the SharePoint document.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map SharePoint data source attributes or field names to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to SharePoint fields. For more information, see Mapping data source fields. The SharePoint data source field names must exist in your SharePoint custom metadata.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain documents in your SharePoint. Documents that match the patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document isn't included in the index. The regex applies to the display URL of the SharePoint document.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * Configuration information to connect to your Microsoft SharePoint site URLs via instance via a web proxy. You can use this option for SharePoint Server. You must provide the website host name and port number. For example, the host name of https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS. Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic authentication of user name and password. To store web proxy credentials, you use a secret in Secrets Manager. It is recommended that you follow best security practices when configuring your web proxy. This includes setting up throttling, setting up logging and monitoring, and applying security patches on a regular basis. If you use your web proxy with multiple data sources, sync jobs that occur at the same time could strain the load on your proxy. It is recommended you prepare your proxy beforehand for any security and load requirements.
    */
  var ProxyConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.ProxyConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the user name and password required to connect to the SharePoint instance. For more information, see Microsoft SharePoint.
    */
  var SecretArn: typings.awsSdk.clientsKendraMod.SecretArn
  
  /**
    * The version of Microsoft SharePoint that you use.
    */
  var SharePointVersion: typings.awsSdk.clientsKendraMod.SharePointVersion
  
  /**
    * The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to SharePoint Server if you require a secure SSL connection. You can generate a self-signed X509 certificate on any computer using OpenSSL. For an example of using OpenSSL to create an X509 certificate, see Create and sign an X509 certificate.
    */
  var SslCertificateS3Path: js.UndefOr[S3Path] = js.undefined
  
  /**
    * The Microsoft SharePoint site URLs for the documents you want to index.
    */
  var Urls: SharePointUrlList
  
  /**
    *  TRUE to use the SharePoint change log to determine which documents require updating in the index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all of your documents in SharePoint.
    */
  var UseChangeLog: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configuration information for an Amazon Virtual Private Cloud to connect to your Microsoft SharePoint. For more information, see Configuring a VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
}
object SharePointConfiguration {
  
  inline def apply(SecretArn: SecretArn, SharePointVersion: SharePointVersion, Urls: SharePointUrlList): SharePointConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], SharePointVersion = SharePointVersion.asInstanceOf[js.Any], Urls = Urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePointConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharePointConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationType(value: SharePointOnlineAuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "AuthenticationType", js.undefined)
    
    inline def setCrawlAttachments(value: Boolean): Self = StObject.set(x, "CrawlAttachments", value.asInstanceOf[js.Any])
    
    inline def setCrawlAttachmentsUndefined: Self = StObject.set(x, "CrawlAttachments", js.undefined)
    
    inline def setDisableLocalGroups(value: Boolean): Self = StObject.set(x, "DisableLocalGroups", value.asInstanceOf[js.Any])
    
    inline def setDisableLocalGroupsUndefined: Self = StObject.set(x, "DisableLocalGroups", js.undefined)
    
    inline def setDocumentTitleFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleFieldNameUndefined: Self = StObject.set(x, "DocumentTitleFieldName", js.undefined)
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    inline def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    inline def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setProxyConfiguration(value: ProxyConfiguration): Self = StObject.set(x, "ProxyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProxyConfigurationUndefined: Self = StObject.set(x, "ProxyConfiguration", js.undefined)
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSharePointVersion(value: SharePointVersion): Self = StObject.set(x, "SharePointVersion", value.asInstanceOf[js.Any])
    
    inline def setSslCertificateS3Path(value: S3Path): Self = StObject.set(x, "SslCertificateS3Path", value.asInstanceOf[js.Any])
    
    inline def setSslCertificateS3PathUndefined: Self = StObject.set(x, "SslCertificateS3Path", js.undefined)
    
    inline def setUrls(value: SharePointUrlList): Self = StObject.set(x, "Urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: Url*): Self = StObject.set(x, "Urls", js.Array(value*))
    
    inline def setUseChangeLog(value: Boolean): Self = StObject.set(x, "UseChangeLog", value.asInstanceOf[js.Any])
    
    inline def setUseChangeLogUndefined: Self = StObject.set(x, "UseChangeLog", js.undefined)
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
