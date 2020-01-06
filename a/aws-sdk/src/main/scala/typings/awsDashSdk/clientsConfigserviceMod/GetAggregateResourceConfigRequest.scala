package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateResourceConfigRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsDashSdk.clientsConfigserviceMod.ConfigurationAggregatorName = js.native
  /**
    * An object that identifies aggregate resource.
    */
  var ResourceIdentifier: AggregateResourceIdentifier = js.native
}

object GetAggregateResourceConfigRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ResourceIdentifier: AggregateResourceIdentifier
  ): GetAggregateResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any], ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAggregateResourceConfigRequest]
  }
}

