package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfluenceAttachmentConfiguration extends StObject {
  
  /**
    * Maps attributes or field names of Confluence attachments to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Confluence fields. For more information, see Mapping data source fields. The Confluence data source field names must exist in your Confluence custom metadata. If you specify the AttachentFieldMappings parameter, you must specify at least one field mapping.
    */
  var AttachmentFieldMappings: js.UndefOr[ConfluenceAttachmentFieldMappingsList] = js.undefined
  
  /**
    *  TRUE to index attachments of pages and blogs in Confluence.
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.undefined
}
object ConfluenceAttachmentConfiguration {
  
  inline def apply(): ConfluenceAttachmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluenceAttachmentConfiguration]
  }
  
  extension [Self <: ConfluenceAttachmentConfiguration](x: Self) {
    
    inline def setAttachmentFieldMappings(value: ConfluenceAttachmentFieldMappingsList): Self = StObject.set(x, "AttachmentFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setAttachmentFieldMappingsUndefined: Self = StObject.set(x, "AttachmentFieldMappings", js.undefined)
    
    inline def setAttachmentFieldMappingsVarargs(value: ConfluenceAttachmentToIndexFieldMapping*): Self = StObject.set(x, "AttachmentFieldMappings", js.Array(value*))
    
    inline def setCrawlAttachments(value: Boolean): Self = StObject.set(x, "CrawlAttachments", value.asInstanceOf[js.Any])
    
    inline def setCrawlAttachmentsUndefined: Self = StObject.set(x, "CrawlAttachments", js.undefined)
  }
}
