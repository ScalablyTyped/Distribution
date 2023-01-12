package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceStandardObjectAttachmentConfiguration extends StObject {
  
  /**
    * The name of the field used for the document title.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined
  
  /**
    * One or more objects that map fields in attachments to Amazon Kendra index fields.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
}
object SalesforceStandardObjectAttachmentConfiguration {
  
  inline def apply(): SalesforceStandardObjectAttachmentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SalesforceStandardObjectAttachmentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SalesforceStandardObjectAttachmentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDocumentTitleFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleFieldNameUndefined: Self = StObject.set(x, "DocumentTitleFieldName", js.undefined)
    
    inline def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    inline def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    inline def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value*))
  }
}
