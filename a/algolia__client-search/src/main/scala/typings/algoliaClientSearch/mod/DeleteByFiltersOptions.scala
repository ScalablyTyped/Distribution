package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteByFiltersOptions extends js.Object {
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
  def apply(
    aroundLatLng: String = null,
    aroundLatLngViaIP: js.UndefOr[Boolean] = js.undefined,
    facetFilters: String | (js.Array[js.Array[String] | String]) = null,
    filters: String = null,
    insideBoundingBox: js.Array[js.Array[Double]] = null,
    insidePolygon: js.Array[js.Array[Double]] = null,
    numericFilters: String | (js.Array[js.Array[String] | String]) = null,
    tagFilters: String | (js.Array[js.Array[String] | String]) = null
  ): DeleteByFiltersOptions = {
    val __obj = js.Dynamic.literal()
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng.asInstanceOf[js.Any])
    if (!js.isUndefined(aroundLatLngViaIP)) __obj.updateDynamic("aroundLatLngViaIP")(aroundLatLngViaIP.asInstanceOf[js.Any])
    if (facetFilters != null) __obj.updateDynamic("facetFilters")(facetFilters.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (insideBoundingBox != null) __obj.updateDynamic("insideBoundingBox")(insideBoundingBox.asInstanceOf[js.Any])
    if (insidePolygon != null) __obj.updateDynamic("insidePolygon")(insidePolygon.asInstanceOf[js.Any])
    if (numericFilters != null) __obj.updateDynamic("numericFilters")(numericFilters.asInstanceOf[js.Any])
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteByFiltersOptions]
  }
}

