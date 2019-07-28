package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIndexingConfigurationResponse extends js.Object {
  /**
    * The index configuration.
    */
  var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.undefined
  /**
    * Thing indexing configuration.
    */
  var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.undefined
}

object GetIndexingConfigurationResponse {
  @scala.inline
  def apply(
    thingGroupIndexingConfiguration: ThingGroupIndexingConfiguration = null,
    thingIndexingConfiguration: ThingIndexingConfiguration = null
  ): GetIndexingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (thingGroupIndexingConfiguration != null) __obj.updateDynamic("thingGroupIndexingConfiguration")(thingGroupIndexingConfiguration)
    if (thingIndexingConfiguration != null) __obj.updateDynamic("thingIndexingConfiguration")(thingIndexingConfiguration)
    __obj.asInstanceOf[GetIndexingConfigurationResponse]
  }
}

