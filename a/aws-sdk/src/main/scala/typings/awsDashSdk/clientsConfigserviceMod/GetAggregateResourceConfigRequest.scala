package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAggregateResourceConfigRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsDashSdk.clientsConfigserviceMod.ConfigurationAggregatorName
  /**
    * An object that identifies aggregate resource.
    */
  var ResourceIdentifier: AggregateResourceIdentifier
}

object GetAggregateResourceConfigRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ResourceIdentifier: AggregateResourceIdentifier
  ): GetAggregateResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName, ResourceIdentifier = ResourceIdentifier)
  
    __obj.asInstanceOf[GetAggregateResourceConfigRequest]
  }
}

