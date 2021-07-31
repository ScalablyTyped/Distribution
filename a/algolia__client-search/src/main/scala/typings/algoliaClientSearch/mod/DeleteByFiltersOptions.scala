package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteByFiltersOptions extends StObject {
  
  /**
    * Search for entries around a central geolocation, enabling a geo search within a circular area.
    */
  val aroundLatLng: js.UndefOr[String] = js.undefined
  
  /**
    * Search for entries around a given location automatically computed from the requester’s IP address.
    */
  val aroundLatLngViaIP: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Filter hits by facet value.
    */
  val facetFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  
  /**
    * Filter the query with numeric, facet and/or tag filters.
    */
  val filters: js.UndefOr[String] = js.undefined
  
  /**
    * Search inside a rectangular area (in geo coordinates).
    */
  val insideBoundingBox: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  /**
    * Search inside a polygon (in geo coordinates).
    */
  val insidePolygon: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  /**
    * Filter on numeric attributes.
    */
  val numericFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  
  /**
    * Filter hits by tags. tagFilters is a different way of filtering, which relies on the _tags
    * attribute. It uses a simpler syntax than filters. You can use it when you want to do
    * simple filtering based on tags.
    */
  val tagFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
}
object DeleteByFiltersOptions {
  
  @scala.inline
  def apply(): DeleteByFiltersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteByFiltersOptions]
  }
  
  @scala.inline
  implicit class DeleteByFiltersOptionsMutableBuilder[Self <: DeleteByFiltersOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAroundLatLng(value: String): Self = StObject.set(x, "aroundLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroundLatLngUndefined: Self = StObject.set(x, "aroundLatLng", js.undefined)
    
    @scala.inline
    def setAroundLatLngViaIP(value: Boolean): Self = StObject.set(x, "aroundLatLngViaIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroundLatLngViaIPUndefined: Self = StObject.set(x, "aroundLatLngViaIP", js.undefined)
    
    @scala.inline
    def setFacetFilters(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "facetFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetFiltersUndefined: Self = StObject.set(x, "facetFilters", js.undefined)
    
    @scala.inline
    def setFacetFiltersVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "facetFilters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setInsideBoundingBox(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "insideBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideBoundingBoxUndefined: Self = StObject.set(x, "insideBoundingBox", js.undefined)
    
    @scala.inline
    def setInsideBoundingBoxVarargs(value: js.Array[Double]*): Self = StObject.set(x, "insideBoundingBox", js.Array(value :_*))
    
    @scala.inline
    def setInsidePolygon(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "insidePolygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsidePolygonUndefined: Self = StObject.set(x, "insidePolygon", js.undefined)
    
    @scala.inline
    def setInsidePolygonVarargs(value: js.Array[Double]*): Self = StObject.set(x, "insidePolygon", js.Array(value :_*))
    
    @scala.inline
    def setNumericFilters(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "numericFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericFiltersUndefined: Self = StObject.set(x, "numericFilters", js.undefined)
    
    @scala.inline
    def setNumericFiltersVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "numericFilters", js.Array(value :_*))
    
    @scala.inline
    def setTagFilters(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "tagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagFiltersUndefined: Self = StObject.set(x, "tagFilters", js.undefined)
    
    @scala.inline
    def setTagFiltersVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "tagFilters", js.Array(value :_*))
  }
}
