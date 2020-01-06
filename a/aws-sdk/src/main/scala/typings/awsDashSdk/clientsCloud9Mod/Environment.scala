package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the environment.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The description for the environment.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.native
  /**
    * The ID of the environment.
    */
  var id: js.UndefOr[EnvironmentId] = js.native
  /**
    * The state of the environment in its creation or deletion lifecycle.
    */
  var lifecycle: js.UndefOr[EnvironmentLifecycle] = js.native
  /**
    * The name of the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the environment owner.
    */
  var ownerArn: js.UndefOr[String] = js.native
  /**
    * The type of environment. Valid values include the following:    ec2: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.    ssh: Your own server connects to the environment.  
    */
  var `type`: js.UndefOr[EnvironmentType] = js.native
}

object Environment {
  @scala.inline
  def apply(
    arn: String = null,
    description: EnvironmentDescription = null,
    id: EnvironmentId = null,
    lifecycle: EnvironmentLifecycle = null,
    name: EnvironmentName = null,
    ownerArn: String = null,
    `type`: EnvironmentType = null
  ): Environment = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerArn != null) __obj.updateDynamic("ownerArn")(ownerArn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
}

