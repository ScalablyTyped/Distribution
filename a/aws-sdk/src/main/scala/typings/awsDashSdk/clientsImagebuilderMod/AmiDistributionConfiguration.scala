package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiDistributionConfiguration extends js.Object {
  /**
    *  The tags to apply to AMIs distributed to this region. 
    */
  var amiTags: js.UndefOr[TagMap] = js.native
  /**
    *  The description of the distribution configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances. 
    */
  var launchPermission: js.UndefOr[LaunchPermissionConfiguration] = js.native
  /**
    *  The name of the distribution configuration. 
    */
  var name: js.UndefOr[NonEmptyString] = js.native
}

object AmiDistributionConfiguration {
  @scala.inline
  def apply(
    amiTags: TagMap = null,
    description: NonEmptyString = null,
    launchPermission: LaunchPermissionConfiguration = null,
    name: NonEmptyString = null
  ): AmiDistributionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (amiTags != null) __obj.updateDynamic("amiTags")(amiTags.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (launchPermission != null) __obj.updateDynamic("launchPermission")(launchPermission.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiDistributionConfiguration]
  }
}

