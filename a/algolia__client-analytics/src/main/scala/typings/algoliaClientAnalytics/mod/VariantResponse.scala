package typings.algoliaClientAnalytics.mod

import typings.algoliaClientSearch.mod.SearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @algolia/client-analytics.@algolia/client-analytics.Variant & { readonly averageClickPostion ? :number,  readonly clickCount ? :number,  readonly clickThroughRate ? :number,  readonly conversionCount ? :number,  readonly conversionRate ? :number,  readonly noResultCount ? :number,  readonly searchCount ? :number,  readonly userCount ? :number,  readonly customSearchParameters ? :@algolia/client-search.@algolia/client-search.SearchOptions} */
trait VariantResponse extends js.Object {
  /**
    * Average click position for the variant.
    */
  val averageClickPostion: js.UndefOr[Double] = js.undefined
  /**
    * Distinct click count for the variant.
    */
  val clickCount: js.UndefOr[Double] = js.undefined
  /**
    * Click through rate for the variant.
    */
  val clickThroughRate: js.UndefOr[Double] = js.undefined
  /**
    * Click through rate for the variant.
    */
  val conversionCount: js.UndefOr[Double] = js.undefined
  /**
    * Distinct conversion count for the variant.
    */
  val conversionRate: js.UndefOr[Double] = js.undefined
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
  val noResultCount: js.UndefOr[Double] = js.undefined
  /**
    * Search count.
    */
  val searchCount: js.UndefOr[Double] = js.undefined
  /**
    * Percentage of the traffic that should be going to the variant. The sum of the percentage should be equal to 100.
    */
  val trafficPercentage: Double
  /**
    * User count.
    */
  val userCount: js.UndefOr[Double] = js.undefined
}

object VariantResponse {
  @scala.inline
  def apply(
    index: String,
    trafficPercentage: Double,
    averageClickPostion: Int | Double = null,
    clickCount: Int | Double = null,
    clickThroughRate: Int | Double = null,
    conversionCount: Int | Double = null,
    conversionRate: Int | Double = null,
    customSearchParameters: SearchOptions = null,
    description: String = null,
    noResultCount: Int | Double = null,
    searchCount: Int | Double = null,
    userCount: Int | Double = null
  ): VariantResponse = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], trafficPercentage = trafficPercentage.asInstanceOf[js.Any])
    if (averageClickPostion != null) __obj.updateDynamic("averageClickPostion")(averageClickPostion.asInstanceOf[js.Any])
    if (clickCount != null) __obj.updateDynamic("clickCount")(clickCount.asInstanceOf[js.Any])
    if (clickThroughRate != null) __obj.updateDynamic("clickThroughRate")(clickThroughRate.asInstanceOf[js.Any])
    if (conversionCount != null) __obj.updateDynamic("conversionCount")(conversionCount.asInstanceOf[js.Any])
    if (conversionRate != null) __obj.updateDynamic("conversionRate")(conversionRate.asInstanceOf[js.Any])
    if (customSearchParameters != null) __obj.updateDynamic("customSearchParameters")(customSearchParameters.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (noResultCount != null) __obj.updateDynamic("noResultCount")(noResultCount.asInstanceOf[js.Any])
    if (searchCount != null) __obj.updateDynamic("searchCount")(searchCount.asInstanceOf[js.Any])
    if (userCount != null) __obj.updateDynamic("userCount")(userCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantResponse]
  }
}

