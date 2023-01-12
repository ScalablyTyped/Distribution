package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentAttributeValueCountPair extends StObject {
  
  /**
    * The number of documents in the response that have the attribute value for the key.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The value of the attribute. For example, "HR".
    */
  var DocumentAttributeValue: js.UndefOr[typings.awsSdk.clientsKendraMod.DocumentAttributeValue] = js.undefined
  
  /**
    * Contains the results of a document attribute that is a nested facet. A FacetResult contains the counts for each facet nested within a facet. For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned to "Engineering". You can display nested facets in the search results so that documents can be searched not only by department but also by a sub department within a department. The counts for documents that belong to "Frontend" and "Backend" within "Engineering" are returned for a query.
    */
  var FacetResults: js.UndefOr[FacetResultList] = js.undefined
}
object DocumentAttributeValueCountPair {
  
  inline def apply(): DocumentAttributeValueCountPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAttributeValueCountPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentAttributeValueCountPair] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setDocumentAttributeValue(value: DocumentAttributeValue): Self = StObject.set(x, "DocumentAttributeValue", value.asInstanceOf[js.Any])
    
    inline def setDocumentAttributeValueUndefined: Self = StObject.set(x, "DocumentAttributeValue", js.undefined)
    
    inline def setFacetResults(value: FacetResultList): Self = StObject.set(x, "FacetResults", value.asInstanceOf[js.Any])
    
    inline def setFacetResultsUndefined: Self = StObject.set(x, "FacetResults", js.undefined)
    
    inline def setFacetResultsVarargs(value: FacetResult*): Self = StObject.set(x, "FacetResults", js.Array(value*))
  }
}
