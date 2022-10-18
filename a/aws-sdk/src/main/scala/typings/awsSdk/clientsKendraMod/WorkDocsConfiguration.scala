package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkDocsConfiguration extends StObject {
  
  /**
    *  TRUE to include comments on documents in your index. Including comments in your index means each comment is a document that can be searched on. The default is set to FALSE.
    */
  var CrawlComments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain files in your Amazon WorkDocs site repository. Files that match the patterns are excluded from the index. Files that don’t match the patterns are included in the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map Amazon WorkDocs data source attributes or field names to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Amazon WorkDocs fields. For more information, see Mapping data source fields. The Amazon WorkDocs data source field names must exist in your Amazon WorkDocs custom metadata.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain files in your Amazon WorkDocs site repository. Files that match the patterns are included in the index. Files that don't match the patterns are excluded from the index. If a file matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file isn't included in the index.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * The identifier of the directory corresponding to your Amazon WorkDocs site repository. You can find the organization ID in the Directory Service by going to Active Directory, then Directories. Your Amazon WorkDocs site directory has an ID, which is the organization ID. You can also set up a new Amazon WorkDocs directory in the Directory Service console and enable a Amazon WorkDocs site for the directory in the Amazon WorkDocs console.
    */
  var OrganizationId: typings.awsSdk.clientsKendraMod.OrganizationId
  
  /**
    *  TRUE to use the Amazon WorkDocs change log to determine which documents require updating in the index. Depending on the change log's size, it may take longer for Amazon Kendra to use the change log than to scan all of your documents in Amazon WorkDocs.
    */
  var UseChangeLog: js.UndefOr[Boolean] = js.undefined
}
object WorkDocsConfiguration {
  
  inline def apply(OrganizationId: OrganizationId): WorkDocsConfiguration = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDocsConfiguration]
  }
  
  extension [Self <: WorkDocsConfiguration](x: Self) {
    
    inline def setCrawlComments(value: Boolean): Self = StObject.set(x, "CrawlComments", value.asInstanceOf[js.Any])
    
    inline def setCrawlCommentsUndefined: Self = StObject.set(x, "CrawlComments", js.undefined)
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    inline def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    inline def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setUseChangeLog(value: Boolean): Self = StObject.set(x, "UseChangeLog", value.asInstanceOf[js.Any])
    
    inline def setUseChangeLogUndefined: Self = StObject.set(x, "UseChangeLog", js.undefined)
  }
}
