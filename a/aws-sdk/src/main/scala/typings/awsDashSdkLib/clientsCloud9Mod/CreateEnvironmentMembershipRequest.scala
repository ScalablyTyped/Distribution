package typings
package awsDashSdkLib.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEnvironmentMembershipRequest extends js.Object {
  /**
    * The ID of the environment that contains the environment member you want to add.
    */
  var environmentId: EnvironmentId
  /**
    * The type of environment member permissions you want to associate with this environment member. Available values include:    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.  
    */
  var permissions: MemberPermissions
  /**
    * The Amazon Resource Name (ARN) of the environment member you want to add.
    */
  var userArn: UserArn
}

object CreateEnvironmentMembershipRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId, permissions: MemberPermissions, userArn: UserArn): CreateEnvironmentMembershipRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId, permissions = permissions.asInstanceOf[js.Any], userArn = userArn)
  
    __obj.asInstanceOf[CreateEnvironmentMembershipRequest]
  }
}

