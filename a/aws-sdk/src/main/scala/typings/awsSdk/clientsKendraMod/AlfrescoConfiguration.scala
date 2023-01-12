package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlfrescoConfiguration extends StObject {
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Alfresco blogs to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Alfresco fields. For more information, see  Mapping data source fields. The Alfresco data source field names must exist in your Alfresco custom metadata.
    */
  var BlogFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    *  TRUE to index comments of blogs and other content.
    */
  var CrawlComments: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to index shared files.
    */
  var CrawlSystemFolders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Alfresco document libraries to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Alfresco fields. For more information, see  Mapping data source fields. The Alfresco data source field names must exist in your Alfresco custom metadata.
    */
  var DocumentLibraryFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * Specify whether to index document libraries, wikis, or blogs. You can specify one or more of these options.
    */
  var EntityFilter: js.UndefOr[typings.awsSdk.clientsKendraMod.EntityFilter] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain files in your Alfresco data source. Files that match the patterns are excluded from the index. Files that don't match the patterns are included in the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain files in your Alfresco data source. Files that match the patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect to your Alfresco data source. The secret must contain a JSON structure with the following keys:   username—The user name of the Alfresco account.   password—The password of the Alfresco account.  
    */
  var SecretArn: typings.awsSdk.clientsKendraMod.SecretArn
  
  /**
    * The identifier of the Alfresco site. For example, my-site.
    */
  var SiteId: typings.awsSdk.clientsKendraMod.SiteId
  
  /**
    * The URL of the Alfresco site. For example, https://hostname:8080.
    */
  var SiteUrl: typings.awsSdk.clientsKendraMod.SiteUrl
  
  /**
    * The path to the SSL certificate stored in an Amazon S3 bucket. You use this to connect to Alfresco if you require a secure SSL connection. You can simply generate a self-signed X509 certificate on any computer using OpenSSL. For an example of using OpenSSL to create an X509 certificate, see Create and sign an X509 certificate.
    */
  var SslCertificateS3Path: S3Path
  
  /**
    * Configuration information for an Amazon Virtual Private Cloud to connect to your Alfresco. For more information, see Configuring a VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Alfresco wikis to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Alfresco fields. For more information, see  Mapping data source fields. The Alfresco data source field names must exist in your Alfresco custom metadata.
    */
  var WikiFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
}
object AlfrescoConfiguration {
  
  inline def apply(SecretArn: SecretArn, SiteId: SiteId, SiteUrl: SiteUrl, SslCertificateS3Path: S3Path): AlfrescoConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any], SiteUrl = SiteUrl.asInstanceOf[js.Any], SslCertificateS3Path = SslCertificateS3Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlfrescoConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlfrescoConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBlogFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "BlogFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setBlogFieldMappingsUndefined: Self = StObject.set(x, "BlogFieldMappings", js.undefined)
    
    inline def setBlogFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "BlogFieldMappings", js.Array(value*))
    
    inline def setCrawlComments(value: Boolean): Self = StObject.set(x, "CrawlComments", value.asInstanceOf[js.Any])
    
    inline def setCrawlCommentsUndefined: Self = StObject.set(x, "CrawlComments", js.undefined)
    
    inline def setCrawlSystemFolders(value: Boolean): Self = StObject.set(x, "CrawlSystemFolders", value.asInstanceOf[js.Any])
    
    inline def setCrawlSystemFoldersUndefined: Self = StObject.set(x, "CrawlSystemFolders", js.undefined)
    
    inline def setDocumentLibraryFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "DocumentLibraryFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setDocumentLibraryFieldMappingsUndefined: Self = StObject.set(x, "DocumentLibraryFieldMappings", js.undefined)
    
    inline def setDocumentLibraryFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "DocumentLibraryFieldMappings", js.Array(value*))
    
    inline def setEntityFilter(value: EntityFilter): Self = StObject.set(x, "EntityFilter", value.asInstanceOf[js.Any])
    
    inline def setEntityFilterUndefined: Self = StObject.set(x, "EntityFilter", js.undefined)
    
    inline def setEntityFilterVarargs(value: AlfrescoEntity*): Self = StObject.set(x, "EntityFilter", js.Array(value*))
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteUrl(value: SiteUrl): Self = StObject.set(x, "SiteUrl", value.asInstanceOf[js.Any])
    
    inline def setSslCertificateS3Path(value: S3Path): Self = StObject.set(x, "SslCertificateS3Path", value.asInstanceOf[js.Any])
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
    
    inline def setWikiFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "WikiFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setWikiFieldMappingsUndefined: Self = StObject.set(x, "WikiFieldMappings", js.undefined)
    
    inline def setWikiFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "WikiFieldMappings", js.Array(value*))
  }
}
