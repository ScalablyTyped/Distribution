package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuipConfiguration extends StObject {
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Quip attachments to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Quip fields. For more information, see Mapping data source fields. The Quip field names must exist in your Quip custom metadata.
    */
  var AttachmentFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    *  TRUE to index attachments.
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to index the contents of chat rooms.
    */
  var CrawlChatRooms: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to index file comments.
    */
  var CrawlFileComments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Quip site domain. For example, https://quip-company.quipdomain.com/browse. The domain in this example is "quipdomain".
    */
  var Domain: typings.awsSdk.clientsKendraMod.Domain
  
  /**
    * A list of regular expression patterns to exclude certain files in your Quip file system. Files that match the patterns are excluded from the index. Files that don’t match the patterns are included in the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file isn't included in the index.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * The identifiers of the Quip folders you want to index. You can find the folder ID in your browser URL when you access your folder in Quip. For example, https://quip-company.quipdomain.com/zlLuOVNSarTL/folder-name. The folder ID in this example is "zlLuOVNSarTL".
    */
  var FolderIds: js.UndefOr[FolderIdList] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain files in your Quip file system. Files that match the patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file matches both an inclusion pattern and an exclusion pattern, the exclusion pattern takes precedence, and the file isn't included in the index.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Quip messages to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Quip fields. For more information, see Mapping data source fields. The Quip field names must exist in your Quip custom metadata.
    */
  var MessageFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs that are required to connect to your Quip. The secret must contain a JSON structure with the following keys:   accessToken—The token created in Quip. For more information, see Authentication for a Quip data source.  
    */
  var SecretArn: typings.awsSdk.clientsKendraMod.SecretArn
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Quip threads to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Quip fields. For more information, see Mapping data source fields. The Quip field names must exist in your Quip custom metadata.
    */
  var ThreadFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * Configuration information for an Amazon Virtual Private Cloud (VPC) to connect to your Quip. For more information, see Configuring a VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
}
object QuipConfiguration {
  
  inline def apply(Domain: Domain, SecretArn: SecretArn): QuipConfiguration = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuipConfiguration]
  }
  
  extension [Self <: QuipConfiguration](x: Self) {
    
    inline def setAttachmentFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "AttachmentFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setAttachmentFieldMappingsUndefined: Self = StObject.set(x, "AttachmentFieldMappings", js.undefined)
    
    inline def setAttachmentFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "AttachmentFieldMappings", js.Array(value*))
    
    inline def setCrawlAttachments(value: Boolean): Self = StObject.set(x, "CrawlAttachments", value.asInstanceOf[js.Any])
    
    inline def setCrawlAttachmentsUndefined: Self = StObject.set(x, "CrawlAttachments", js.undefined)
    
    inline def setCrawlChatRooms(value: Boolean): Self = StObject.set(x, "CrawlChatRooms", value.asInstanceOf[js.Any])
    
    inline def setCrawlChatRoomsUndefined: Self = StObject.set(x, "CrawlChatRooms", js.undefined)
    
    inline def setCrawlFileComments(value: Boolean): Self = StObject.set(x, "CrawlFileComments", value.asInstanceOf[js.Any])
    
    inline def setCrawlFileCommentsUndefined: Self = StObject.set(x, "CrawlFileComments", js.undefined)
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setFolderIds(value: FolderIdList): Self = StObject.set(x, "FolderIds", value.asInstanceOf[js.Any])
    
    inline def setFolderIdsUndefined: Self = StObject.set(x, "FolderIds", js.undefined)
    
    inline def setFolderIdsVarargs(value: FolderId*): Self = StObject.set(x, "FolderIds", js.Array(value*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setMessageFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "MessageFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setMessageFieldMappingsUndefined: Self = StObject.set(x, "MessageFieldMappings", js.undefined)
    
    inline def setMessageFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "MessageFieldMappings", js.Array(value*))
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setThreadFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "ThreadFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setThreadFieldMappingsUndefined: Self = StObject.set(x, "ThreadFieldMappings", js.undefined)
    
    inline def setThreadFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "ThreadFieldMappings", js.Array(value*))
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
