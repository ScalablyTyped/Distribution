package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIndexingConfigurationResponse extends js.Object {
  /**
    * The index configuration.
    */
  var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.native
  /**
    * Thing indexing configuration.
    */
  var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.native
}

object GetIndexingConfigurationResponse {
  @scala.inline
  def apply(
    thingGroupIndexingConfiguration: ThingGroupIndexingConfiguration = null,
    thingIndexingConfiguration: ThingIndexingConfiguration = null
  ): GetIndexingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (thingGroupIndexingConfiguration != null) __obj.updateDynamic("thingGroupIndexingConfiguration")(thingGroupIndexingConfiguration.asInstanceOf[js.Any])
    if (thingIndexingConfiguration != null) __obj.updateDynamic("thingIndexingConfiguration")(thingIndexingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIndexingConfigurationResponse]
  }
}

