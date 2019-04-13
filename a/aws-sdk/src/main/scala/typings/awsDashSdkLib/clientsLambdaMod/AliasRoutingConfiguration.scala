package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasRoutingConfiguration extends js.Object {
  /**
    * The name of the second alias, and the percentage of traffic that's routed to it.
    */
  var AdditionalVersionWeights: js.UndefOr[AdditionalVersionWeights] = js.undefined
}

object AliasRoutingConfiguration {
  @scala.inline
  def apply(AdditionalVersionWeights: AdditionalVersionWeights = null): AliasRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AdditionalVersionWeights != null) __obj.updateDynamic("AdditionalVersionWeights")(AdditionalVersionWeights)
    __obj.asInstanceOf[AliasRoutingConfiguration]
  }
}

