package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLoggingConfigurationsRequest extends js.Object {
  /**
    * Specifies the number of LoggingConfigurations that you want AWS WAF to return for this request. If you have more LoggingConfigurations than the number that you specify for Limit, the response includes a NextMarker value that you can use to get another batch of LoggingConfigurations.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  /**
    * If you specify a value for Limit and you have more LoggingConfigurations than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of LoggingConfigurations. For the second and subsequent ListLoggingConfigurations requests, specify the value of NextMarker from the previous response to get information about another batch of ListLoggingConfigurations.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.NextMarker] = js.undefined
}

object ListLoggingConfigurationsRequest {
  @scala.inline
  def apply(Limit: Int | Double = null, NextMarker: NextMarker = null): ListLoggingConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListLoggingConfigurationsRequest]
  }
}

