package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetResult extends StObject {
  
  /**
    * The key for the facet values. This is the same as the DocumentAttributeKey provided in the query.
    */
  var DocumentAttributeKey: js.UndefOr[typings.awsSdk.clientsKendraMod.DocumentAttributeKey] = js.undefined
  
  /**
    * An array of key/value pairs, where the key is the value of the attribute and the count is the number of documents that share the key value.
    */
  var DocumentAttributeValueCountPairs: js.UndefOr[DocumentAttributeValueCountPairList] = js.undefined
  
  /**
    * The data type of the facet value. This is the same as the type defined for the index field when it was created.
    */
  var DocumentAttributeValueType: js.UndefOr[typings.awsSdk.clientsKendraMod.DocumentAttributeValueType] = js.undefined
}
object FacetResult {
  
  inline def apply(): FacetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetResult]
  }
  
  extension [Self <: FacetResult](x: Self) {
    
    inline def setDocumentAttributeKey(value: DocumentAttributeKey): Self = StObject.set(x, "DocumentAttributeKey", value.asInstanceOf[js.Any])
    
    inline def setDocumentAttributeKeyUndefined: Self = StObject.set(x, "DocumentAttributeKey", js.undefined)
    
    inline def setDocumentAttributeValueCountPairs(value: DocumentAttributeValueCountPairList): Self = StObject.set(x, "DocumentAttributeValueCountPairs", value.asInstanceOf[js.Any])
    
    inline def setDocumentAttributeValueCountPairsUndefined: Self = StObject.set(x, "DocumentAttributeValueCountPairs", js.undefined)
    
    inline def setDocumentAttributeValueCountPairsVarargs(value: DocumentAttributeValueCountPair*): Self = StObject.set(x, "DocumentAttributeValueCountPairs", js.Array(value*))
    
    inline def setDocumentAttributeValueType(value: DocumentAttributeValueType): Self = StObject.set(x, "DocumentAttributeValueType", value.asInstanceOf[js.Any])
    
    inline def setDocumentAttributeValueTypeUndefined: Self = StObject.set(x, "DocumentAttributeValueType", js.undefined)
  }
}
