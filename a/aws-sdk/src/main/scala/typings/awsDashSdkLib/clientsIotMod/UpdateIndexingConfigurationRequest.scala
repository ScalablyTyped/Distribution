package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateIndexingConfigurationRequest extends js.Object {
  /**
    * Thing group indexing configuration.
    */
  var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.undefined
  /**
    * Thing indexing configuration.
    */
  var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.undefined
}

object UpdateIndexingConfigurationRequest {
  @scala.inline
  def apply(
    thingGroupIndexingConfiguration: ThingGroupIndexingConfiguration = null,
    thingIndexingConfiguration: ThingIndexingConfiguration = null
  ): UpdateIndexingConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (thingGroupIndexingConfiguration != null) __obj.updateDynamic("thingGroupIndexingConfiguration")(thingGroupIndexingConfiguration)
    if (thingIndexingConfiguration != null) __obj.updateDynamic("thingIndexingConfiguration")(thingIndexingConfiguration)
    __obj.asInstanceOf[UpdateIndexingConfigurationRequest]
  }
}

