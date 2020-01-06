package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grant extends js.Object {
  /**
    * The person being granted permissions.
    */
  var Grantee: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Grantee] = js.native
  /**
    * Specifies the permission given to the grantee.
    */
  var Permission: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Permission] = js.native
}

object Grant {
  @scala.inline
  def apply(Grantee: Grantee = null, Permission: Permission = null): Grant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grant]
  }
}

