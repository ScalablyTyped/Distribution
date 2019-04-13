package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentVersion extends js.Object {
  /**
    * The configuration manager.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.undefined
  /**
    * The agent version.
    */
  var Version: js.UndefOr[String] = js.undefined
}

object AgentVersion {
  @scala.inline
  def apply(ConfigurationManager: StackConfigurationManager = null, Version: String = null): AgentVersion = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationManager != null) __obj.updateDynamic("ConfigurationManager")(ConfigurationManager)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[AgentVersion]
  }
}

