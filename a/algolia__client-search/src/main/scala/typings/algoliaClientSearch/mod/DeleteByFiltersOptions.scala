package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteByFiltersOptions extends js.Object {
  /**
    * Search for entries around a central geolocation, enabling a geo search within a circular area.
    */
  val aroundLatLng: js.UndefOr[String] = js.native
  /**
    * Search for entries around a given location automatically computed from the requester’s IP address.
    */
  val aroundLatLngViaIP: js.UndefOr[Boolean] = js.native
  /**
    *  Filter hits by facet value.
    */
  val facetFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  /**
    * Filter the query with numeric, facet and/or tag filters.
    */
  val filters: js.UndefOr[String] = js.native
  /**
    * Search inside a rectangular area (in geo coordinates).
    */
  val insideBoundingBox: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  /**
    * Search inside a polygon (in geo coordinates).
    */
  val insidePolygon: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  /**
    * Filter on numeric attributes.
    */
  val numericFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  /**
    * Filter hits by tags. tagFilters is a different way of filtering, which relies on the _tags
    * attribute. It uses a simpler syntax than filters. You can use it when you want to do
    * simple filtering based on tags.
    */
  val tagFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
}

object DeleteByFiltersOptions {
  @scala.inline
  def apply(): DeleteByFiltersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteByFiltersOptions]
  }
  @scala.inline
  implicit class DeleteByFiltersOptionsOps[Self <: DeleteByFiltersOptions] (val x: Self) extends AnyVal {
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
    def setAroundLatLng(value: String): Self = this.set("aroundLatLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAroundLatLng: Self = this.set("aroundLatLng", js.undefined)
    @scala.inline
    def setAroundLatLngViaIP(value: Boolean): Self = this.set("aroundLatLngViaIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAroundLatLngViaIP: Self = this.set("aroundLatLngViaIP", js.undefined)
    @scala.inline
    def setFacetFiltersVarargs(value: (js.Array[String] | String)*): Self = this.set("facetFilters", js.Array(value :_*))
    @scala.inline
    def setFacetFilters(value: String | (js.Array[js.Array[String] | String])): Self = this.set("facetFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacetFilters: Self = this.set("facetFilters", js.undefined)
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setInsideBoundingBoxVarargs(value: js.Array[Double]*): Self = this.set("insideBoundingBox", js.Array(value :_*))
    @scala.inline
    def setInsideBoundingBox(value: js.Array[js.Array[Double]]): Self = this.set("insideBoundingBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsideBoundingBox: Self = this.set("insideBoundingBox", js.undefined)
    @scala.inline
    def setInsidePolygonVarargs(value: js.Array[Double]*): Self = this.set("insidePolygon", js.Array(value :_*))
    @scala.inline
    def setInsidePolygon(value: js.Array[js.Array[Double]]): Self = this.set("insidePolygon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsidePolygon: Self = this.set("insidePolygon", js.undefined)
    @scala.inline
    def setNumericFiltersVarargs(value: (js.Array[String] | String)*): Self = this.set("numericFilters", js.Array(value :_*))
    @scala.inline
    def setNumericFilters(value: String | (js.Array[js.Array[String] | String])): Self = this.set("numericFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericFilters: Self = this.set("numericFilters", js.undefined)
    @scala.inline
    def setTagFiltersVarargs(value: (js.Array[String] | String)*): Self = this.set("tagFilters", js.Array(value :_*))
    @scala.inline
    def setTagFilters(value: String | (js.Array[js.Array[String] | String])): Self = this.set("tagFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagFilters: Self = this.set("tagFilters", js.undefined)
  }
  
}

