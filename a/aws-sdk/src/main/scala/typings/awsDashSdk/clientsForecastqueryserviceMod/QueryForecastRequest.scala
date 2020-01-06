package typings.awsDashSdk.clientsForecastqueryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryForecastRequest extends js.Object {
  /**
    * The end date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601 format). For example, "1970-01-01T00:00:00Z." 
    */
  var EndDate: js.UndefOr[DateTime] = js.native
  /**
    * The filtering criteria to apply when retrieving the forecast. For example:   To get a forecast for a specific item specify the following:  {"item_id" : "client_1"}      To get a forecast for a specific item sold in a specific location, specify the following:  {"item_id" : "client_1", "location" : "ny"}      To get a forecast for all blue items sold in a specific location, specify the following:  { "location" : "ny", "color":"blue"}    To get the full forecast, use the operation.
    */
  var Filters: typings.awsDashSdk.clientsForecastqueryserviceMod.Filters = js.native
  /**
    * The Amazon Resource Name (ARN) of the forecast to query.
    */
  var ForecastArn: Arn = js.native
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsForecastqueryserviceMod.NextToken] = js.native
  /**
    * The start date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601 format) For example, "1970-01-01T00:00:00Z."
    */
  var StartDate: js.UndefOr[DateTime] = js.native
}

object QueryForecastRequest {
  @scala.inline
  def apply(
    Filters: Filters,
    ForecastArn: Arn,
    EndDate: DateTime = null,
    NextToken: NextToken = null,
    StartDate: DateTime = null
  ): QueryForecastRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], ForecastArn = ForecastArn.asInstanceOf[js.Any])
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryForecastRequest]
  }
}

