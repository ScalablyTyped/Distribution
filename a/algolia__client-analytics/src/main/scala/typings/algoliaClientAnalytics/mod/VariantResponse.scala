package typings.algoliaClientAnalytics.mod

import typings.algoliaClientSearch.mod.SearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @algolia/client-analytics.@algolia/client-analytics.Variant & {  averageClickPostion ? :number,   clickCount ? :number,   clickThroughRate ? :number,   conversionCount ? :number,   conversionRate ? :number,   noResultCount ? :number,   searchCount ? :number,   userCount ? :number,   customSearchParameters ? :@algolia/client-search.@algolia/client-search.SearchOptions} */
trait VariantResponse extends js.Object {
  /**
    * Average click position for the variant.
    */
  var averageClickPostion: js.UndefOr[Double] = js.undefined
  /**
    * Distinct click count for the variant.
    */
  var clickCount: js.UndefOr[Double] = js.undefined
  /**
    * Click through rate for the variant.
    */
  var clickThroughRate: js.UndefOr[Double] = js.undefined
  /**
    * Click through rate for the variant.
    */
  var conversionCount: js.UndefOr[Double] = js.undefined
  /**
    * Distinct conversion count for the variant.
    */
  var conversionRate: js.UndefOr[Double] = js.undefined
  /**
    * The search parameters.
    *
    * @todo Handle this search options type.
    */
  val customSearchParameters: js.UndefOr[SearchOptions] = js.undefined
  /**
    * Description of the variant. Useful when seing the results in the dashboard or via the API.
    */
  val description: js.UndefOr[String] = js.undefined
  /**
    * The index name.
    */
  val index: String
  /**
    * No result count.
    */
  var noResultCount: js.UndefOr[Double] = js.undefined
  /**
    * Search count.
    */
  var searchCount: js.UndefOr[Double] = js.undefined
  /**
    * Percentage of the traffic that should be going to the variant. The sum of the percentage should be equal to 100.
    */
  val trafficPercentage: Double
  /**
    * User count.
    */
  var userCount: js.UndefOr[Double] = js.undefined
}

object VariantResponse {
  @scala.inline
  def apply(
    index: String,
    trafficPercentage: Double,
    averageClickPostion: js.UndefOr[Double] = js.undefined,
    clickCount: js.UndefOr[Double] = js.undefined,
    clickThroughRate: js.UndefOr[Double] = js.undefined,
    conversionCount: js.UndefOr[Double] = js.undefined,
    conversionRate: js.UndefOr[Double] = js.undefined,
    customSearchParameters: SearchOptions = null,
    description: String = null,
    noResultCount: js.UndefOr[Double] = js.undefined,
    searchCount: js.UndefOr[Double] = js.undefined,
    userCount: js.UndefOr[Double] = js.undefined
  ): VariantResponse = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], trafficPercentage = trafficPercentage.asInstanceOf[js.Any])
    if (!js.isUndefined(averageClickPostion)) __obj.updateDynamic("averageClickPostion")(averageClickPostion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickCount)) __obj.updateDynamic("clickCount")(clickCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickThroughRate)) __obj.updateDynamic("clickThroughRate")(clickThroughRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(conversionCount)) __obj.updateDynamic("conversionCount")(conversionCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(conversionRate)) __obj.updateDynamic("conversionRate")(conversionRate.get.asInstanceOf[js.Any])
    if (customSearchParameters != null) __obj.updateDynamic("customSearchParameters")(customSearchParameters.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(noResultCount)) __obj.updateDynamic("noResultCount")(noResultCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(searchCount)) __obj.updateDynamic("searchCount")(searchCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userCount)) __obj.updateDynamic("userCount")(userCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantResponse]
  }
}

