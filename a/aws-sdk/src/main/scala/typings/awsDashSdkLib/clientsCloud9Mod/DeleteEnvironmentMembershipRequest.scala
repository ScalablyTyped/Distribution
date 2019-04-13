package typings
package awsDashSdkLib.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEnvironmentMembershipRequest extends js.Object {
  /**
    * The ID of the environment to delete the environment member from.
    */
  var environmentId: EnvironmentId
  /**
    * The Amazon Resource Name (ARN) of the environment member to delete from the environment.
    */
  var userArn: UserArn
}

object DeleteEnvironmentMembershipRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId, userArn: UserArn): DeleteEnvironmentMembershipRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId, userArn = userArn)
  
    __obj.asInstanceOf[DeleteEnvironmentMembershipRequest]
  }
}

