package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceUser extends js.Object {
  /**
    * Services that the user's request hit.
    */
  var ServiceIds: js.UndefOr[ServiceIds] = js.undefined
  /**
    * The user's name.
    */
  var UserName: js.UndefOr[String] = js.undefined
}

object TraceUser {
  @scala.inline
  def apply(ServiceIds: ServiceIds = null, UserName: String = null): TraceUser = {
    val __obj = js.Dynamic.literal()
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[TraceUser]
  }
}

