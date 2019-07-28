package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /**
    * Whether the user can use SSH.
    */
  var AllowSsh: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the user can use sudo.
    */
  var AllowSudo: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for an AWS Identity and Access Management (IAM) role. For more information about IAM ARNs, see Using Identifiers.
    */
  var IamUserArn: js.UndefOr[String] = js.undefined
  /**
    * The user's permission level, which must be the following:    deny     show     deploy     manage     iam_only    For more information on the permissions associated with these levels, see Managing User Permissions 
    */
  var Level: js.UndefOr[String] = js.undefined
  /**
    * A stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object Permission {
  @scala.inline
  def apply(
    AllowSsh: js.UndefOr[Boolean] = js.undefined,
    AllowSudo: js.UndefOr[Boolean] = js.undefined,
    IamUserArn: String = null,
    Level: String = null,
    StackId: String = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowSsh)) __obj.updateDynamic("AllowSsh")(AllowSsh)
    if (!js.isUndefined(AllowSudo)) __obj.updateDynamic("AllowSudo")(AllowSudo)
    if (IamUserArn != null) __obj.updateDynamic("IamUserArn")(IamUserArn)
    if (Level != null) __obj.updateDynamic("Level")(Level)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[Permission]
  }
}

