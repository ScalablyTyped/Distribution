package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationSetsRequest extends js.Object {
  /**
    * The number of configuration sets to return.
    */
  var MaxItems: js.UndefOr[typings.awsDashSdk.clientsSesMod.MaxItems] = js.native
  /**
    * A token returned from a previous call to ListConfigurationSets to indicate the position of the configuration set in the configuration set list.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSesMod.NextToken] = js.native
}

object ListConfigurationSetsRequest {
  @scala.inline
  def apply(MaxItems: Int | Double = null, NextToken: NextToken = null): ListConfigurationSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationSetsRequest]
  }
}

