package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentAttributeTarget extends StObject {
  
  /**
    * The identifier of the target document attribute or metadata field. For example, 'Department' could be an identifier for the target attribute or metadata field that includes the department names associated with the documents.
    */
  var TargetDocumentAttributeKey: js.UndefOr[DocumentAttributeKey] = js.undefined
  
  /**
    * The target value you want to create for the target attribute. For example, 'Finance' could be the target value for the target attribute key 'Department'.
    */
  var TargetDocumentAttributeValue: js.UndefOr[DocumentAttributeValue] = js.undefined
  
  /**
    *  TRUE to delete the existing target value for your specified target attribute key. You cannot create a target value and set this to TRUE. To create a target value (TargetDocumentAttributeValue), set this to FALSE.
    */
  var TargetDocumentAttributeValueDeletion: js.UndefOr[Boolean] = js.undefined
}
object DocumentAttributeTarget {
  
  inline def apply(): DocumentAttributeTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAttributeTarget]
  }
  
  extension [Self <: DocumentAttributeTarget](x: Self) {
    
    inline def setTargetDocumentAttributeKey(value: DocumentAttributeKey): Self = StObject.set(x, "TargetDocumentAttributeKey", value.asInstanceOf[js.Any])
    
    inline def setTargetDocumentAttributeKeyUndefined: Self = StObject.set(x, "TargetDocumentAttributeKey", js.undefined)
    
    inline def setTargetDocumentAttributeValue(value: DocumentAttributeValue): Self = StObject.set(x, "TargetDocumentAttributeValue", value.asInstanceOf[js.Any])
    
    inline def setTargetDocumentAttributeValueDeletion(value: Boolean): Self = StObject.set(x, "TargetDocumentAttributeValueDeletion", value.asInstanceOf[js.Any])
    
    inline def setTargetDocumentAttributeValueDeletionUndefined: Self = StObject.set(x, "TargetDocumentAttributeValueDeletion", js.undefined)
    
    inline def setTargetDocumentAttributeValueUndefined: Self = StObject.set(x, "TargetDocumentAttributeValue", js.undefined)
  }
}
