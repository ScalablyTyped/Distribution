package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterOnPremisesInstanceInput extends js.Object {
  /**
    * The ARN of the IAM session to associate with the on-premises instance.
    */
  var iamSessionArn: js.UndefOr[IamSessionArn] = js.native
  /**
    * The ARN of the IAM user to associate with the on-premises instance.
    */
  var iamUserArn: js.UndefOr[IamUserArn] = js.native
  /**
    * The name of the on-premises instance to register.
    */
  var instanceName: InstanceName = js.native
}

object RegisterOnPremisesInstanceInput {
  @scala.inline
  def apply(instanceName: InstanceName, iamSessionArn: IamSessionArn = null, iamUserArn: IamUserArn = null): RegisterOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    if (iamSessionArn != null) __obj.updateDynamic("iamSessionArn")(iamSessionArn.asInstanceOf[js.Any])
    if (iamUserArn != null) __obj.updateDynamic("iamUserArn")(iamUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterOnPremisesInstanceInput]
  }
}

