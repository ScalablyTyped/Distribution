package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceConfiguration extends StObject {
  
  /**
    * Configuration information for Salesforce chatter feeds.
    */
  var ChatterFeedConfiguration: js.UndefOr[SalesforceChatterFeedConfiguration] = js.undefined
  
  /**
    * Indicates whether Amazon Kendra should index attachments to Salesforce objects.
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain documents in your Salesforce. Documents that match the patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document isn't included in the index. The pattern is applied to the name of the attached file.
    */
  var ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain documents in your Salesforce. Documents that match the patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document isn't included in the index. The pattern is applied to the name of the attached file.
    */
  var IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * Configuration information for the knowledge article types that Amazon Kendra indexes. Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge articles, or the custom fields of custom knowledge articles, but not both.
    */
  var KnowledgeArticleConfiguration: js.UndefOr[SalesforceKnowledgeArticleConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the key/value pairs required to connect to your Salesforce instance. The secret must contain a JSON structure with the following keys:   authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.    consumerKey - The application public key generated when you created your Salesforce application.   consumerSecret - The application private key generated when you created your Salesforce application.   password - The password associated with the user logging in to the Salesforce instance.   securityToken - The token associated with the user account logging in to the Salesforce instance.   username - The user name of the user logging in to the Salesforce instance.  
    */
  var SecretArn: typings.awsSdk.clientsKendraMod.SecretArn
  
  /**
    * The instance URL for the Salesforce site that you want to index.
    */
  var ServerUrl: Url
  
  /**
    * Configuration information for processing attachments to Salesforce standard objects. 
    */
  var StandardObjectAttachmentConfiguration: js.UndefOr[SalesforceStandardObjectAttachmentConfiguration] = js.undefined
  
  /**
    * Configuration of the Salesforce standard objects that Amazon Kendra indexes.
    */
  var StandardObjectConfigurations: js.UndefOr[SalesforceStandardObjectConfigurationList] = js.undefined
}
object SalesforceConfiguration {
  
  inline def apply(SecretArn: SecretArn, ServerUrl: Url): SalesforceConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], ServerUrl = ServerUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SalesforceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setChatterFeedConfiguration(value: SalesforceChatterFeedConfiguration): Self = StObject.set(x, "ChatterFeedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setChatterFeedConfigurationUndefined: Self = StObject.set(x, "ChatterFeedConfiguration", js.undefined)
    
    inline def setCrawlAttachments(value: Boolean): Self = StObject.set(x, "CrawlAttachments", value.asInstanceOf[js.Any])
    
    inline def setCrawlAttachmentsUndefined: Self = StObject.set(x, "CrawlAttachments", js.undefined)
    
    inline def setExcludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExcludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    
    inline def setExcludeAttachmentFilePatternsUndefined: Self = StObject.set(x, "ExcludeAttachmentFilePatterns", js.undefined)
    
    inline def setExcludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExcludeAttachmentFilePatterns", js.Array(value*))
    
    inline def setIncludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "IncludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    
    inline def setIncludeAttachmentFilePatternsUndefined: Self = StObject.set(x, "IncludeAttachmentFilePatterns", js.undefined)
    
    inline def setIncludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "IncludeAttachmentFilePatterns", js.Array(value*))
    
    inline def setKnowledgeArticleConfiguration(value: SalesforceKnowledgeArticleConfiguration): Self = StObject.set(x, "KnowledgeArticleConfiguration", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeArticleConfigurationUndefined: Self = StObject.set(x, "KnowledgeArticleConfiguration", js.undefined)
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setServerUrl(value: Url): Self = StObject.set(x, "ServerUrl", value.asInstanceOf[js.Any])
    
    inline def setStandardObjectAttachmentConfiguration(value: SalesforceStandardObjectAttachmentConfiguration): Self = StObject.set(x, "StandardObjectAttachmentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStandardObjectAttachmentConfigurationUndefined: Self = StObject.set(x, "StandardObjectAttachmentConfiguration", js.undefined)
    
    inline def setStandardObjectConfigurations(value: SalesforceStandardObjectConfigurationList): Self = StObject.set(x, "StandardObjectConfigurations", value.asInstanceOf[js.Any])
    
    inline def setStandardObjectConfigurationsUndefined: Self = StObject.set(x, "StandardObjectConfigurations", js.undefined)
    
    inline def setStandardObjectConfigurationsVarargs(value: SalesforceStandardObjectConfiguration*): Self = StObject.set(x, "StandardObjectConfigurations", js.Array(value*))
  }
}
