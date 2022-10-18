package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentAttributeCondition extends StObject {
  
  /**
    * The identifier of the document attribute used for the condition. For example, 'Source_URI' could be an identifier for the attribute or metadata field that contains source URIs associated with the documents. Amazon Kendra currently does not support _document_body as an attribute key used for the condition.
    */
  var ConditionDocumentAttributeKey: DocumentAttributeKey
  
  /**
    * The value used by the operator. For example, you can specify the value 'financial' for strings in the 'Source_URI' field that partially match or contain this value.
    */
  var ConditionOnValue: js.UndefOr[DocumentAttributeValue] = js.undefined
  
  /**
    * The condition operator. For example, you can use 'Contains' to partially match a string.
    */
  var Operator: ConditionOperator
}
object DocumentAttributeCondition {
  
  inline def apply(ConditionDocumentAttributeKey: DocumentAttributeKey, Operator: ConditionOperator): DocumentAttributeCondition = {
    val __obj = js.Dynamic.literal(ConditionDocumentAttributeKey = ConditionDocumentAttributeKey.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAttributeCondition]
  }
  
  extension [Self <: DocumentAttributeCondition](x: Self) {
    
    inline def setConditionDocumentAttributeKey(value: DocumentAttributeKey): Self = StObject.set(x, "ConditionDocumentAttributeKey", value.asInstanceOf[js.Any])
    
    inline def setConditionOnValue(value: DocumentAttributeValue): Self = StObject.set(x, "ConditionOnValue", value.asInstanceOf[js.Any])
    
    inline def setConditionOnValueUndefined: Self = StObject.set(x, "ConditionOnValue", js.undefined)
    
    inline def setOperator(value: ConditionOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
  }
}
