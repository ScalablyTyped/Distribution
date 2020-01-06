package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetAggregateResourceConfigRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsDashSdk.clientsConfigserviceMod.ConfigurationAggregatorName = js.native
  /**
    * A list of aggregate ResourceIdentifiers objects. 
    */
  var ResourceIdentifiers: ResourceIdentifiersList = js.native
}

object BatchGetAggregateResourceConfigRequest {
  @scala.inline
  def apply(
    ConfigurationAggregatorName: ConfigurationAggregatorName,
    ResourceIdentifiers: ResourceIdentifiersList
  ): BatchGetAggregateResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any], ResourceIdentifiers = ResourceIdentifiers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetAggregateResourceConfigRequest]
  }
}

