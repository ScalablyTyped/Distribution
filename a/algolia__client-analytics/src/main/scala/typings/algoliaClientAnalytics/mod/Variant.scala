package typings.algoliaClientAnalytics.mod

import typings.algoliaClientSearch.mod.SearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variant extends js.Object {
  /**
    * The search parameters.
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
    * Percentage of the traffic that should be going to the variant. The sum of the percentage should be equal to 100.
    */
  val trafficPercentage: Double
}

object Variant {
  @scala.inline
  def apply(
    index: String,
    trafficPercentage: Double,
    customSearchParameters: SearchOptions = null,
    description: String = null
  ): Variant = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], trafficPercentage = trafficPercentage.asInstanceOf[js.Any])
    if (customSearchParameters != null) __obj.updateDynamic("customSearchParameters")(customSearchParameters.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variant]
  }
}

