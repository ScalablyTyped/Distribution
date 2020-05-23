package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetABTestResponse extends js.Object {
  /**
    * The ab test unique identifier.
    */
  var abTestID: Double
  /**
    * The ab test significance based on click data. Should be > 0.95 to be considered significant - no matter which variant is winning.
    */
  var clickSignificance: Double
  /**
    *
    * The ab test significance based on conversion data. Should be > 0.95 to be considered significant - no matter which variant is winning.
    */
  var conversionSignificance: Double
  /**
    * The ab test created date, if any.
    */
  var createdAt: String
  /**
    * The ab test end date, if any.
    */
  var endAt: String
  /**
    * The ab test name.
    */
  var name: String
  /**
    * The ab test status.
    */
  var status: String
  /**
    * The ab test list of variants.
    */
  var variants: js.Array[VariantResponse]
}

object GetABTestResponse {
  @scala.inline
  def apply(
    abTestID: Double,
    clickSignificance: Double,
    conversionSignificance: Double,
    createdAt: String,
    endAt: String,
    name: String,
    status: String,
    variants: js.Array[VariantResponse]
  ): GetABTestResponse = {
    val __obj = js.Dynamic.literal(abTestID = abTestID.asInstanceOf[js.Any], clickSignificance = clickSignificance.asInstanceOf[js.Any], conversionSignificance = conversionSignificance.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], endAt = endAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetABTestResponse]
  }
}

