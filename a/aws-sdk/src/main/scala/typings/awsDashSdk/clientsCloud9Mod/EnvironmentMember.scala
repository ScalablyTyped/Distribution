package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentMember extends js.Object {
  /**
    * The ID of the environment for the environment member.
    */
  var environmentId: js.UndefOr[EnvironmentId] = js.undefined
  /**
    * The time, expressed in epoch time format, when the environment member last opened the environment.
    */
  var lastAccess: js.UndefOr[Timestamp] = js.undefined
  /**
    * The type of environment member permissions associated with this environment member. Available values include:    owner: Owns the environment.    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
    */
  var permissions: js.UndefOr[Permissions] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the environment member.
    */
  var userArn: js.UndefOr[UserArn] = js.undefined
  /**
    * The user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
    */
  var userId: js.UndefOr[String] = js.undefined
}

object EnvironmentMember {
  @scala.inline
  def apply(
    environmentId: EnvironmentId = null,
    lastAccess: Timestamp = null,
    permissions: Permissions = null,
    userArn: UserArn = null,
    userId: String = null
  ): EnvironmentMember = {
    val __obj = js.Dynamic.literal()
    if (environmentId != null) __obj.updateDynamic("environmentId")(environmentId)
    if (lastAccess != null) __obj.updateDynamic("lastAccess")(lastAccess)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (userArn != null) __obj.updateDynamic("userArn")(userArn)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[EnvironmentMember]
  }
}

