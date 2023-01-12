package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Facet extends StObject {
  
  /**
    * The unique key for the document attribute.
    */
  var DocumentAttributeKey: js.UndefOr[typings.awsSdk.clientsKendraMod.DocumentAttributeKey] = js.undefined
  
  /**
    * An array of document attributes that are nested facets within a facet. For example, the document attribute or facet "Department" includes a value called "Engineering". In addition, the document attribute or facet "SubDepartment" includes the values "Frontend" and "Backend" for documents assigned to "Engineering". You can display nested facets in the search results so that documents can be searched not only by department but also by a sub department within a department. This helps your users further narrow their search. You can only have one nested facet within a facet. If you want to increase this limit, contact Support.
    */
  var Facets: js.UndefOr[FacetList] = js.undefined
  
  /**
    * Maximum number of facet values per facet. The default is 10. You can use this to limit the number of facet values to less than 10. If you want to increase the default, contact Support.
    */
  var MaxResults: js.UndefOr[TopDocumentAttributeValueCountPairsSize] = js.undefined
}
object Facet {
  
  inline def apply(): Facet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Facet] (val x: Self) extends AnyVal {
    
    inline def setDocumentAttributeKey(value: DocumentAttributeKey): Self = StObject.set(x, "DocumentAttributeKey", value.asInstanceOf[js.Any])
    
    inline def setDocumentAttributeKeyUndefined: Self = StObject.set(x, "DocumentAttributeKey", js.undefined)
    
    inline def setFacets(value: FacetList): Self = StObject.set(x, "Facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "Facets", js.undefined)
    
    inline def setFacetsVarargs(value: Facet*): Self = StObject.set(x, "Facets", js.Array(value*))
    
    inline def setMaxResults(value: TopDocumentAttributeValueCountPairsSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
  }
}
