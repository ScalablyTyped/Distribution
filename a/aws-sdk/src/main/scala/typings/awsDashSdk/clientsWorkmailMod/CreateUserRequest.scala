package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserRequest extends js.Object {
  /**
    * The display name for the new user.
    */
  var DisplayName: String
  /**
    * The name for the new user. Simple AD or AD Connector user names have a maximum length of 20. All others have a maximum length of 64.
    */
  var Name: UserName
  /**
    * The identifier of the organization for which the user is created.
    */
  var OrganizationId: typings.awsDashSdk.clientsWorkmailMod.OrganizationId
  /**
    * The password for the new user.
    */
  var Password: typings.awsDashSdk.clientsWorkmailMod.Password
}

object CreateUserRequest {
  @scala.inline
  def apply(DisplayName: String, Name: UserName, OrganizationId: OrganizationId, Password: Password): CreateUserRequest = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName, Name = Name, OrganizationId = OrganizationId, Password = Password)
  
    __obj.asInstanceOf[CreateUserRequest]
  }
}

