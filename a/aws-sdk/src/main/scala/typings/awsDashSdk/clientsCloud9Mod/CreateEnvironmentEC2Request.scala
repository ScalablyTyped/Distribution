package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEnvironmentEC2Request extends js.Object {
  /**
    * The number of minutes until the running instance is shut down after the environment has last been used.
    */
  var automaticStopTimeMinutes: js.UndefOr[AutomaticStopTimeMinutes] = js.undefined
  /**
    * A unique, case-sensitive string that helps AWS Cloud9 to ensure this operation completes no more than one time. For more information, see Client Tokens in the Amazon EC2 API Reference.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The description of the environment to create.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.undefined
  /**
    * The type of instance to connect to the environment (for example, t2.micro).
    */
  var instanceType: InstanceType
  /**
    * The name of the environment to create. This name is visible to other AWS IAM users in the same AWS account.
    */
  var name: EnvironmentName
  /**
    * The Amazon Resource Name (ARN) of the environment owner. This ARN can be the ARN of any AWS IAM principal. If this value is not specified, the ARN defaults to this environment's creator.
    */
  var ownerArn: js.UndefOr[UserArn] = js.undefined
  /**
    * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
    */
  var subnetId: js.UndefOr[SubnetId] = js.undefined
}

object CreateEnvironmentEC2Request {
  @scala.inline
  def apply(
    instanceType: InstanceType,
    name: EnvironmentName,
    automaticStopTimeMinutes: js.UndefOr[AutomaticStopTimeMinutes] = js.undefined,
    clientRequestToken: ClientRequestToken = null,
    description: EnvironmentDescription = null,
    ownerArn: UserArn = null,
    subnetId: SubnetId = null
  ): CreateEnvironmentEC2Request = {
    val __obj = js.Dynamic.literal(instanceType = instanceType, name = name)
    if (!js.isUndefined(automaticStopTimeMinutes)) __obj.updateDynamic("automaticStopTimeMinutes")(automaticStopTimeMinutes)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (description != null) __obj.updateDynamic("description")(description)
    if (ownerArn != null) __obj.updateDynamic("ownerArn")(ownerArn)
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId)
    __obj.asInstanceOf[CreateEnvironmentEC2Request]
  }
}

