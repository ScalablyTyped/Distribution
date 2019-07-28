package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeEnvironmentsMessage extends js.Object {
  /**
    * The name of the application to which the specified source bundles belong.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    * The name of the group to which the target environments belong. Specify a group name only if the environment name defined in each target environment's manifest ends with a + (plus) character. See Environment Manifest (env.yaml) for details.
    */
  var GroupName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.GroupName] = js.undefined
  /**
    * A list of version labels, specifying one or more application source bundles that belong to the target application. Each source bundle must include an environment manifest that specifies the name of the environment and the name of the solution stack to use, and optionally can specify environment links to create.
    */
  var VersionLabels: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.VersionLabels] = js.undefined
}

object ComposeEnvironmentsMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    GroupName: GroupName = null,
    VersionLabels: VersionLabels = null
  ): ComposeEnvironmentsMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (VersionLabels != null) __obj.updateDynamic("VersionLabels")(VersionLabels)
    __obj.asInstanceOf[ComposeEnvironmentsMessage]
  }
}

