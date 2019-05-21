package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConfigurationsResponse extends js.Object {
  /**
    * An array of MSK configurations.
    */
  var Configurations: js.UndefOr[__listOfConfiguration] = js.undefined
  /**
    * The paginated results marker. When the result of a ListConfigurations operation is truncated, the call returns NextToken in the response. 
    To get another batch of configurations, provide this token in your next request.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListConfigurationsResponse {
  @scala.inline
  def apply(Configurations: __listOfConfiguration = null, NextToken: __string = null): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
}

