package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEnvironmentMembershipRequest extends js.Object {
  /**
    * The ID of the environment to delete the environment member from.
    */
  var environmentId: EnvironmentId = js.native
  /**
    * The Amazon Resource Name (ARN) of the environment member to delete from the environment.
    */
  var userArn: UserArn = js.native
}

object DeleteEnvironmentMembershipRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId, userArn: UserArn): DeleteEnvironmentMembershipRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], userArn = userArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEnvironmentMembershipRequest]
  }
}

