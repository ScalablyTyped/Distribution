package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoginProfileRequest extends js.Object {
  /**
    * The name of the user whose login profile you want to retrieve. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType
}

object GetLoginProfileRequest {
  @scala.inline
  def apply(UserName: userNameType): GetLoginProfileRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName)
  
    __obj.asInstanceOf[GetLoginProfileRequest]
  }
}

