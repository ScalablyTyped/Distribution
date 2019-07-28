package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the environment.
    */
  var arn: js.UndefOr[String] = js.undefined
  /**
    * The description for the environment.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.undefined
  /**
    * The ID of the environment.
    */
  var id: js.UndefOr[EnvironmentId] = js.undefined
  /**
    * The state of the environment in its creation or deletion lifecycle.
    */
  var lifecycle: js.UndefOr[EnvironmentLifecycle] = js.undefined
  /**
    * The name of the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the environment owner.
    */
  var ownerArn: js.UndefOr[String] = js.undefined
  /**
    * The type of environment. Valid values include the following:    ec2: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.    ssh: Your own server connects to the environment.  
    */
  var `type`: js.UndefOr[EnvironmentType] = js.undefined
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
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lifecycle != null) __obj.updateDynamic("lifecycle")(lifecycle)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ownerArn != null) __obj.updateDynamic("ownerArn")(ownerArn)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
}

