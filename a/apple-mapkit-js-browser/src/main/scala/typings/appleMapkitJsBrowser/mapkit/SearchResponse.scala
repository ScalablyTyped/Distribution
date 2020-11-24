package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a search, including the original search query, the bounding
  * region, and a list of places that match the query.
  */
@js.native
trait SearchResponse extends js.Object {
  
  /**
    * The region that encloses the places included in the search results.
    */
  var boundingRegion: CoordinateRegion = js.native
  
  /**
    * A list of places that match the search query.
    */
  var places: js.Array[Place] = js.native
  
  /**
    * The query string used to perform the search.
    */
  var query: String = js.native
}
object SearchResponse {
  
  @scala.inline
  def apply(boundingRegion: CoordinateRegion, places: js.Array[Place], query: String): SearchResponse = {
    val __obj = js.Dynamic.literal(boundingRegion = boundingRegion.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse]
  }
  
  @scala.inline
  implicit class SearchResponseOps[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoundingRegion(value: CoordinateRegion): Self = this.set("boundingRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacesVarargs(value: Place*): Self = this.set("places", js.Array(value :_*))
    
    @scala.inline
    def setPlaces(value: js.Array[Place]): Self = this.set("places", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
