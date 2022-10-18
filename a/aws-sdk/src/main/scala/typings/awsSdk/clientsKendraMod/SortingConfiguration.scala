package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortingConfiguration extends StObject {
  
  /**
    * The name of the document attribute used to sort the response. You can use any field that has the Sortable flag set to true. You can also sort by any of the following built-in attributes:   _category   _created_at   _last_updated_at   _version   _view_count  
    */
  var DocumentAttributeKey: typings.awsSdk.clientsKendraMod.DocumentAttributeKey
  
  /**
    * The order that the results should be returned in. In case of ties, the relevance assigned to the result by Amazon Kendra is used as the tie-breaker.
    */
  var SortOrder: typings.awsSdk.clientsKendraMod.SortOrder
}
object SortingConfiguration {
  
  inline def apply(DocumentAttributeKey: DocumentAttributeKey, SortOrder: SortOrder): SortingConfiguration = {
    val __obj = js.Dynamic.literal(DocumentAttributeKey = DocumentAttributeKey.asInstanceOf[js.Any], SortOrder = SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortingConfiguration]
  }
  
  extension [Self <: SortingConfiguration](x: Self) {
    
    inline def setDocumentAttributeKey(value: DocumentAttributeKey): Self = StObject.set(x, "DocumentAttributeKey", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
  }
}
