package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryTriggersOutput extends js.Object {
  /**
    * The system-generated unique ID for the trigger.
    */
  var configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.undefined
  /**
    * The JSON block of configuration information for each trigger.
    */
  var triggers: js.UndefOr[RepositoryTriggersList] = js.undefined
}

object GetRepositoryTriggersOutput {
  @scala.inline
  def apply(configurationId: RepositoryTriggersConfigurationId = null, triggers: RepositoryTriggersList = null): GetRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal()
    if (configurationId != null) __obj.updateDynamic("configurationId")(configurationId)
    if (triggers != null) __obj.updateDynamic("triggers")(triggers)
    __obj.asInstanceOf[GetRepositoryTriggersOutput]
  }
}

