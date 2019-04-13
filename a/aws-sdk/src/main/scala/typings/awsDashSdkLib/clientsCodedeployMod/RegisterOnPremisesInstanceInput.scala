package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOnPremisesInstanceInput extends js.Object {
  /**
    * The ARN of the IAM session to associate with the on-premises instance.
    */
  var iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined
  /**
    * The ARN of the IAM user to associate with the on-premises instance.
    */
  var iamUserArn: js.UndefOr[IamUserArn] = js.undefined
  /**
    * The name of the on-premises instance to register.
    */
  var instanceName: InstanceName
}

object RegisterOnPremisesInstanceInput {
  @scala.inline
  def apply(instanceName: InstanceName, iamSessionArn: IamSessionArn = null, iamUserArn: IamUserArn = null): RegisterOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
    if (iamSessionArn != null) __obj.updateDynamic("iamSessionArn")(iamSessionArn)
    if (iamUserArn != null) __obj.updateDynamic("iamUserArn")(iamUserArn)
    __obj.asInstanceOf[RegisterOnPremisesInstanceInput]
  }
}

