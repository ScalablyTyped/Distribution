package typings.awsSdk.clientsCloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResponse extends StObject {
  
  /**
    * The requested facet information.
    */
  var facets: js.UndefOr[Facets] = js.undefined
  
  /**
    * The documents that match the search criteria.
    */
  var hits: js.UndefOr[Hits] = js.undefined
  
  /**
    * The requested field statistics information.
    */
  var stats: js.UndefOr[Stats] = js.undefined
  
  /**
    * The status information returned for the search request.
    */
  var status: js.UndefOr[SearchStatus] = js.undefined
}
object SearchResponse {
  
  inline def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  
  extension [Self <: SearchResponse](x: Self) {
    
    inline def setFacets(value: Facets): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    inline def setHits(value: Hits): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsUndefined: Self = StObject.set(x, "hits", js.undefined)
    
    inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatus(value: SearchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
