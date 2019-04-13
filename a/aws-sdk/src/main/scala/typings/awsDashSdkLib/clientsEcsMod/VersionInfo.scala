package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionInfo extends js.Object {
  /**
    * The Git commit hash for the Amazon ECS container agent build on the amazon-ecs-agent  GitHub repository.
    */
  var agentHash: js.UndefOr[String] = js.undefined
  /**
    * The version number of the Amazon ECS container agent.
    */
  var agentVersion: js.UndefOr[String] = js.undefined
  /**
    * The Docker version running on the container instance.
    */
  var dockerVersion: js.UndefOr[String] = js.undefined
}

object VersionInfo {
  @scala.inline
  def apply(agentHash: String = null, agentVersion: String = null, dockerVersion: String = null): VersionInfo = {
    val __obj = js.Dynamic.literal()
    if (agentHash != null) __obj.updateDynamic("agentHash")(agentHash)
    if (agentVersion != null) __obj.updateDynamic("agentVersion")(agentVersion)
    if (dockerVersion != null) __obj.updateDynamic("dockerVersion")(dockerVersion)
    __obj.asInstanceOf[VersionInfo]
  }
}

