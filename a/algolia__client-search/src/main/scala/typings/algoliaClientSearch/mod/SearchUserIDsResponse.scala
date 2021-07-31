package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchUserIDsResponse extends StObject {
  
  /**
    * List of userID matching the query.
    */
  var hits: js.Array[UserIDResponse]
  
  /**
    * Number of hits retrieved per page.
    */
  var hitsPerPage: Double
  
  /**
    * Number of userIDs matching the query.
    */
  var nbHits: Double
  
  /**
    * Current page.
    */
  var page: Double
  
  /**
    * Timestamp of the last update of the index.
    */
  var updatedAt: Double
}
object SearchUserIDsResponse {
  
  @scala.inline
  def apply(
    hits: js.Array[UserIDResponse],
    hitsPerPage: Double,
    nbHits: Double,
    page: Double,
    updatedAt: Double
  ): SearchUserIDsResponse = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserIDsResponse]
  }
  
  @scala.inline
  implicit class SearchUserIDsResponseMutableBuilder[Self <: SearchUserIDsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHits(value: js.Array[UserIDResponse]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsVarargs(value: UserIDResponse*): Self = StObject.set(x, "hits", js.Array(value :_*))
    
    @scala.inline
    def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: Double): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
